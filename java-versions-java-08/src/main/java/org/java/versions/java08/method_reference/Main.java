package org.java.versions.java08.method_reference;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
	final List<Employee> list = new ArrayList<>();

        list.add(new Employee("Vikram", 25, 10000L, true));
        list.add(new Employee("Dan", 24, 12000L, false));
        list.add(new Employee("John", 26, 9000L, false));

        list.stream()
            .filter(e -> e.getSalary() > 10000L)
            .map(employee -> employee.getName())
            .collect(toList())
            .forEach(e -> out.println(e));
        
        list.stream()
            .filter(e -> e.getSalary() > 10000L)
            .map(Employee::new)
            .map(Employee::getName)
            .collect(toList())
            .stream()
            .collect(toList())
            .forEach(out::println);     
    }
    
}
