package com.skillsoft.classesandobjects;

public class Employee {

    private String name = "";
    private double experience = 0.0;
    private double salary = 0.0;

    public Employee(String name, double experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public void printDetails() {

        System.out.println("\n*** In printDetails()");

        System.out.println("Name: " + name + " Years of Experience: " + experience + " Salary: " + salary);

//        return;
    }

    public String getName() {
//        return this.name;
        return name;
//        return experience;

//        System.out.println("This code will not be executed");
    }

    public double getExperience() {
//        return this.experience;
        return experience;
//        return name;
    }

    public double getSalary() {
//        return this.salary;
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public void update(String name, double experience, double salary) {
//        setName(name);
//        setExperience(experience);
//        setSalary(salary);
//    }

//    public void update(String name, double experience, double salary) {
//        this.setName(name);
//        this.setExperience(experience);
//        this.setSalary(salary);
//    }

//    public double calculateBonus(float performancePercentage) {
//        double bonus = (salary * performancePercentage * 0.01);
//
//        return bonus;
//    }

//    public double calculateIncrement() {
//        double increment;
//
//        if (salary < 65000) {
//
//            increment = 0.10;
//        } else {
//
//            increment = 0.05;
//        }
//
//        salary = salary + salary * increment;
//
//        return increment;
//    }

    // NOTE: This is private because you do not want external entities to invoke this method
    // directly, external classes should only call update
    private void saveToDatabase() {
//        System.out.format("Saving to database... Name: %s", name);
        System.out.format("Saving to database... (%s, %.2f, %.2f)\n", name, experience, salary);
    }

    public void update(String name) {
        System.out.println("update(String name) invoked");

        setName(name);

        saveToDatabase();
    }

    public void update(String name, double experience) {
        System.out.println("update(String name, double experience) invoked");

//        setName(name);
        setExperience(experience);
        update(name);

        saveToDatabase();
    }

    public void update(String name, double experience, double salary) {
        System.out.println("update(String name, double experience, double salary) invoked");

//        setName(name);
//        setExperience(experience);
        setSalary(salary);
        update(name, experience);

        saveToDatabase();

//        return true;
    }
}
