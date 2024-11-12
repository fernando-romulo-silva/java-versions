package org.java.versions.java22.foreign_function_and_memory_api;

import static java.lang.System.out;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public class Main {

    // The Foreign Function & Memory API (or FFM API for short) makes it possible to
    // access code outside the JVM (e.g., functions in libraries implemented in
    // other programming languages) and native memory (i.e., memory not managed by
    // the JVM in the heap) from Java.

    public static void main(String[] args) throws Throwable {
        // 1. Get a lookup object for commonly used libraries
        SymbolLookup stdlib = Linker.nativeLinker().defaultLookup();

        // 2. Get a handle to the "strlen" function in the C standard library
        MethodHandle strlen = Linker.nativeLinker()
                .downcallHandle(
                        stdlib.find("strlen").orElseThrow(),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));

        // 3. Get a confined memory area (one that we can close explicitly)
        try (Arena offHeap = Arena.ofConfined()) {

            // 4. Convert the Java String to a C string and store it in off-heap memory
            MemorySegment str = offHeap.allocateFrom("Happy Coding!");

            // 5. Invoke the foreign function
            long len = (long) strlen.invoke(str);
            out.println("len = " + len);
        }
        // 6. Off-heap memory is deallocated at end of try-with-resources
    }
}
