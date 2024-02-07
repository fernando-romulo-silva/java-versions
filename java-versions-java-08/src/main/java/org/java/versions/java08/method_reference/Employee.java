package org.java.versions.java08.method_reference;

class Employee {
    
    private String name;
    
    private int age;
    
    private long salary;
    
    private boolean hasCar;
    
    Employee(String name, int age, long salary, boolean hasCar) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.hasCar = hasCar;
    }
    
    Employee(Employee employee) {
	super();
	this.name = "New " + employee.name;
	this.age = employee.age;
	this.salary = employee.salary;
	this.hasCar = employee.hasCar;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected long getSalary() {
        return salary;
    }

    protected boolean isHasCar() {
        return hasCar;
    }
}
