package org.java.versions.java16.other_changes;

import static java.lang.System.out;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class InvocationHandlerClass {

    // If you work with dynamic proxies, you'll find this enhancement interesting.
    // The best way to explain it is with an example. Let's take the following
    // interface:

    public static interface GreetingInterface {
        String getName();

        default String greet() {
            return "Hello, " + getName();
        }
    }

    // old way
    // We use the following code to create a dynamic proxy for this interface (this
    // is not a new feature – dynamic proxies have been around since Java 1.3):
    public static void test01() {

        GreetingInterface greetingProxy = (GreetingInterface) Proxy.newProxyInstance(
                InvocationHandlerClass.class.getClassLoader(),
                new Class[] { GreetingInterface.class },
                (proxy, method, args) -> {
                    if (method.getName().equals("getName")) {
                        return "Sven";
                    } else if (method.getName().equals("greet")) {
                        return "Hello, " + ((GreetingInterface) proxy).getName();
                    } else {
                        throw new IllegalStateException(
                                "Method not implemented: " + method);
                    }
                });

        // We can then use the dynamic proxy via the GreetingInterface methods:
        out.println("name  = " + greetingProxy.getName());
        out.println("greet = " + greetingProxy.greet());
    }

    // In Java 16, the InvocationHandler class has been extended with the static
    // invokeDefault() method, which allows us to eliminate the duplicated code and
    // call the interface's default method instead (line 57):
    public static void test02() {
        GreetingInterface greetingProxy = (GreetingInterface) Proxy.newProxyInstance(
                InvocationHandlerClass.class.getClassLoader(),
                new Class[] { GreetingInterface.class },
                (proxy, method, args) -> {
                    if (method.getName().equals("getName")) {
                        return "Sven";
                    } else if (method.isDefault()) {
                        return InvocationHandler.invokeDefault(proxy, method, args);
                    } else {
                        throw new IllegalStateException(
                                "Method not implemented: " + method);
                    }
                });

        // We can then use the dynamic proxy via the GreetingInterface methods:
        out.println("name  = " + greetingProxy.getName());
        out.println("greet = " + greetingProxy.greet());
    }

    public static void main(String[] args) {
        test02();
    }
}
