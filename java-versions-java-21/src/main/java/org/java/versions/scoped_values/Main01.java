package org.java.versions.scoped_values;

import static java.lang.System.out;

class Main01 {

    // Child Threads do not have access to Parent’s ThreadLocal!

    // public static ThreadLocal<String> CONTEXT = ThreadLocal.withInitial(() ->
    // null);

    // The InheritableThreadLocal class does the same thing as ThreadLocal,
    // but it also allows child thread to access the thread-local values from the
    // parent thread.
    public static InheritableThreadLocal<String> CONTEXT = new InheritableThreadLocal();
    //
    // So if we create a million threads, we must create a million ThreadLocal
    // instances also.
    // Such a large number of instances can lead to degraded performance in
    // resource-intensive applications.
    // Scoped values intend to solve this issue.

    public static void main(String[] args) {

        final var parentThread = new Thread(() -> {

            CONTEXT.set("TestValue");
            insideParentThread_1();

            final var childThread = new Thread(Main01::insideChildThread);

            childThread.start();
            insideParentThread_2();
        });

        parentThread.start();
    }

    static void insideParentThread_1() {
        out.println("ThreadLocal Value in insideParentThread_1(): " + CONTEXT.get());
    }

    static void insideParentThread_2() {
        out.println("ThreadLocal Value in insideParentThread_2(): " + CONTEXT.get());
    }

    static void insideChildThread() {
        out.println("ThreadLocal Value in insideChildThread(): " + CONTEXT.get());
    }
}
