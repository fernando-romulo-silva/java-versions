package org.java.versions.java15.hidden_classes;

import static java.lang.System.out;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Base64;

public class HiddenClassExample {

    static final String CLASS_IN_BASE64 = "yv66vgAAAD0AEQoAAgADBwAEDAAFAAYBABBqYXZhL2xhbmcvT2JqZWN0AQAGPGluaXQ+AQADKClWCAAIAQAFaGVsbG8HAAoBAAxqYXZhMTUvSGVsbG8BAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQAFZ3JlZXQBABQoKUxqYXZhL2xhbmcvU3RyaW5nOwEAClNvdXJjZUZpbGUBAApIZWxsby5qYXZhACEACQACAAAAAAACAAEABQAGAAEACwAAAB0AAQABAAAABSq3AAGxAAAAAQAMAAAABgABAAAAAwAJAA0ADgABAAsAAAAbAAEAAAAAAAMSB7AAAAABAAwAAAAGAAEAAAAGAAEADwAAAAIAEA==";

    public static void main(String[] args) throws Throwable {
        testHiddenClass();
    }

    // create a hidden class and run its static method
    public static void testHiddenClass() throws Throwable {

        byte[] classInBytes = Base64.getDecoder().decode(CLASS_IN_BASE64);

        Class<?> proxy = MethodHandles.lookup()
                .defineHiddenClass(classInBytes,
                        true, MethodHandles.Lookup.ClassOption.NESTMATE)
                .lookupClass();

        out.println(proxy.getName());

        MethodHandle mh = MethodHandles.lookup()
                .findStatic(proxy, "greet", MethodType.methodType(String.class));

        String status = (String) mh.invokeExact();
        out.println(status);
    }

}
