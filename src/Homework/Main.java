package Homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee ben = new Employee("Ben",200,4);
        Employee mary = new Employee("Mary",600,15);
        Employee mark = new Employee("Mark",250,10);


        System.out.println(ben.getName());
        System.out.println(ben.getSalary());
        System.out.println(ben.getHour());
        System.out.println();

        System.out.println(mary.getName());
        System.out.println(mary.getSalary());
        System.out.println(mary.getHour());
        System.out.println();


        System.out.println(mark.getName());
        System.out.println(mark.getSalary());
        System.out.println(mark.getHour());
        System.out.println();

        ben.setHour(4);
        ben.setSalary(200);
        System.out.println("Name is " + ben.getName());
        System.out.println("Hour is " + ben.getHour());
        System.out.println("Salary is " + ben.getSalary() + " euro ");
        System.out.println();


        mary.setSalary(600);
        mary.setHour(8);
        System.out.println("Name is " + mary.getName());
        System.out.println("Hour is " + mary.getHour());
        System.out.println("Salary is " + mary.getSalary() + " euro ");

        System.out.println();


        mark.setSalary(250);
        mark.setHour(5);
        System.out.println("Name is " + mark.getName());
        System.out.println("Hour is " + mark.getHour());
        System.out.println("Salary is " + mark.getSalary() + " euro ");

        System.out.println();


       // System.out.println("Number"+ employee.numberOfworkingHoursperDay);
        //System.out.println("Salary is "+employee.salary);
    }
}
