package com.examples;

public class Engineer extends Employee{ // mühendis sınıfı miras alır personal sınıfından
    public Engineer(String name, double salary, int age) {
        super(name, salary, age);
    }
    public double getAnnualBonus(){
        return super.salary * .05;
    }
}
