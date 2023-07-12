package com.skillsoft.classesandobjects;

public class Car {

//    public String name;
//    public String type;
//    public float mpg;
//    public int price;

//    private String name = "Honda Civic";
//    private String type = "hatchback";
//    private float mpg = 24.5f;
//    private int price = 25000;

    private String name;
    private String type;
    private float mpg;
    private int price;

//    public Car() {
//        name = "Honda Accord";
//        type = "sedan";
//        mpg = 22.5f;
//        price = 28000;
//
//        System.out.println("Object constructed");
//    }

    // NOTE: This is a parameterized constructor, it hides the default no-argument
    // constructor
//    public Car(String carName) {
//        System.out.println("Parameterized constructor: " + this);
//
//        name = carName;
//    }

    // NOTE: This is an explicit, default, no-argument constructor
//    public Car() {
//
//    }

    public Car() {
        System.out.println("Default no-argument constructor: " + this);
    }

//    public Car(String carName) {
//        System.out.println("Car(String carName): " + this);

//        name = carName;
//    }

    public Car(String name) {
        System.out.println("Car(String name): " + this);

        this.name = name;
    }

//    public Car(String carName, String carType) {
//        System.out.println("Car(String carName, String carType): " + this);

//        name = carName;
//        type = carType;
//    }

    public Car(String name, String type) {
        this(name);

        System.out.println("Car(String name, String type): " + this);

//        this(name);

//        this.name = name;
        this.type = type;
    }

//    public Car(String carName, String carType, float carMpg) {
//        System.out.println("Car(String carName, String carType, float carMpg): " + this);

//        name = carName;
//        type = carType;
//        mpg = carMpg;
//    }

    public Car(String name, String type, float mpg) {
        this(name, type);

        System.out.println("Car(String name, String type, float mpg): " + this);

//        this(name, type);

//        this.name = name;
//        this.type = type;
        this.mpg = mpg;
    }

//    public Car(String carName, String carType, float carMpg, int carPrice) {
//        System.out.println("Car(String carName, String carType, float carMpg, int carPrice): " + this);

//        name = carName;
//        type = carType;
//        mpg = carMpg;
//        price = carPrice;
//    }

    public Car(String name, String type, float mpg, int price) {
        this(name, type, mpg);

        System.out.println("Car(String name, String type, float mpg, int price): " + this);

//        this(name, type, mpg);

//        this.name = name;
//        this.type = type;
//        this.mpg = mpg;
        this.price = price;
    }

    public void printCarInfo() {
        System.out.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n",
                name, type, mpg, price);
    }

}
