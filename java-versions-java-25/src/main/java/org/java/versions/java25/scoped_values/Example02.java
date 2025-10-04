package org.java.versions.java25.scoped_values;

class Example02 {
    private static final ScopedValue<String> X = ScopedValue.newInstance();

    void main() {
        ScopedValue.where(X, "hello").run(this::bar);
    }

    void bar() {
        IO.println(X.get()); // prints hello
        ScopedValue.where(X, "goodbye").run(this::baz);
        IO.println(X.get()); // prints hello
    }

    void baz() {
        IO.println(X.get()); // prints goodbye
    }
}
