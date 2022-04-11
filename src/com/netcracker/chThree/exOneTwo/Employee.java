package com.netcracker.chThree.exOneTwo;

public class Employee implements Measurable{

    private  int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + ' ' + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static double average(Measurable[] objects){
        int n = objects.length;
        double sum = 0;
        for (Measurable obj: objects){
            sum+= obj.getMeasure();
        }
        return sum/n;
    }

    public static Measurable largest(Measurable[] objects){
        Measurable measurable = objects[0];
        for (Measurable obj: objects){
            if(Double.compare(obj.getMeasure(),measurable.getMeasure())>0){
                measurable = obj;
            }
        }
        return measurable;
    }

    public static String nameEmployeeWithLargestSalary(Employee... employees){
        Employee employee = (Employee)largest(employees);
        return employee.getFirstName() + " " + employee.getLastName();
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", Name=" + firstName  + " " +
                lastName +
                ", salary=" + salary +
                ']';
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
