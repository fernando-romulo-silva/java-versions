
// The new IO class provides the three most important input and output methods with print(), println(), and readln(). 
// It is located in the java.lang package and is thus automatically available in all Java files without an import statement.

// Main allow main methods to omit the infamous boilerplate of public
// static void main(String[] args), which simplifies the Hello,
// World! program to:

void main() {
    // These innovations make getting started with Java noticeably easier. Compact
    // programs like this can be executed directly:
    IO.println(greet("world"));
}

String greet(String name) {
    return "Hello " + name + "!";
}