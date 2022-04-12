package com.netcracker.chThree.exOneTwo;


public class Main {
    public static void main(String[] args) {
     /*   1. Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee implement Measurable. Provide
        a method double average(Measurable[] objects) that computes the average
        measure. Use it to compute the average salary of an array of employees.
        2. Continue with the preceding exercise and provide a method Measurable
        largest(Measurable[] objects). Use it to find the name of the employee with
        the largest salary. Why do you need a cast?*/

        Employee emp1 = new Employee(1, "Harry", "Potter", 2020);
        Employee emp2 = new Employee(2, "Peter", "Parker", 2000);
        Employee emp3 = new Employee(3, "Tom", "Riddle", 2010);
        Employee emp4 = new Employee(4, "Stephen", "Strange", 2005);

        Employee[] employees = {emp1, emp2, emp3, emp4};

        System.out.println(Employee.average(employees));
        System.out.println(Employee.nameEmployeeWithLargestSalary(employees));

    }
}
