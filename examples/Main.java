package com.examples;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Ebru Şal", 65000, 32);

        Salesperson employeeTwo = new Salesperson("Esra Gürdağ", 780000, 25,.125);

        employeeOne.getAnnualBonus();
        employeeTwo.raiseCommission();
        employeeTwo.getComissionPercentage();
        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComissionPercentage());
    }
}
