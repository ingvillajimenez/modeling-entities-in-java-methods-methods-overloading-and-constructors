package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {

//        Employee e1 = new Employee("Alex", 2.5, 70000);
//        e1.setName("Alix");
//        e1.printDetails();
//        System.out.println("*** after update");
//        e1.update("Alix", 3, 72000);
//        e1.update("Alixx");
//        e1.printDetails();
//        e1.update("Alixx", 4);
//        Integer returnInteger = e1.printDetails();
//        System.out.println("Name (e1): " + e1.getName());
//        System.out.println("Bonus (e1) : " + e1.calculateBonus(10));
//        System.out.println("Increment% (e1) : " + e1.calculateIncrement());
//        System.out.println("Updated salary (e1) : " + e1.getSalary());
//        System.out.println();

//        Employee e2 = new Employee("Dave", 4, 85000);
//        e2.printDetails();
//        e2.update("David", 3.8);
//        e2.printDetails();

//        System.out.println();

//        Employee e2 = new Employee("Betty", 5, 65000);
//        String name = e2.getName();
//        double experience = e2.getExperience();
//        double salary = e2.getSalary();
//        System.out.format("*** Name: %s, Experience: %.2f, Salary: %.2f", name, experience, salary);
//        e2.setExperience(5.5);
//        e2.setSalary(68000.0);
//        e2.printDetails();
//        Double returnDouble = e2.printDetails();
//        System.out.println("Experience (e2): " + e2.getExperience());

//        Employee e3 = new Employee("Ellen", 3, 74000);
//        e3.printDetails();
//        e3.update("Eleanor", 2.5, 74550);
//        e3.printDetails();

//        Employee e3 = new Employee("Carol", 3, 96000);
//        e3.setName("Carolina");
//        e3.setExperience(3.5);
//        e3.setSalary(98000.0);
//        e3.printDetails();
//        Object returnObject = e3.printDetails();
//        System.out.println("Salary (e3): " + e3.getSalary());

        Car c1 = new Car();
//        System.out.println("(c1): " + c1);
//        System.out.println("Name: " + c1.name);
//        System.out.println("Type: " + c1.type);
//        System.out.println("MPG: " + c1.mpg);
//        System.out.println("Price: " + c1.price);
        c1.printCarInfo();

        System.out.println();

//        Car c2 = new Car();
//        Car c2 = new Car("Toyota Corolla");
        Car c2 = new Car("Volkswagen GTI");
//        System.out.println("(c2): " + c2);
//        System.out.println("Name: " + c2.name);
//        System.out.println("Type: " + c2.type);
//        System.out.println("MPG: " + c2.mpg);
//        System.out.println("Price: " + c2.price);
        c2.printCarInfo();

        System.out.println();

//        Car c3 = new Car();
//        Car c3 = new Car("Kia Rio");
        Car c3 = new Car("Hyundai Elantra", "Hatchback");
//        System.out.println("(c3): " + c3);
//        System.out.println("Name: " + c3.name);
//        System.out.println("Type: " + c3.type);
//        System.out.println("MPG: " + c3.mpg);
//        System.out.println("Price: " + c3.price);
        c3.printCarInfo();

        System.out.println();

        Car c4 = new Car("Honda Civic", "Hatchback", 21.5f);
        c4.printCarInfo();
        System.out.println();

        Car c5 = new Car("Toyota Corolla", "Hatchback", 24.5f, 19825);
        c5.printCarInfo();
        System.out.println();

    }
}
