//Vehicle, Car, Motorcycle and Garage
//class Vehicle {
//    void start() {
//        System.out.println("Vehicle started.");
//    }
//}
//class Car extends Vehicle {
//    @Override
//    void start() {
//        System.out.println("Car started.");
//    }
//}
//class Motorcycle extends Vehicle {
//    @Override
//    void start() {
//        System.out.println("Motorcycle started.");
//    }
//}
//class Garage {
//    void serviceVehicle(Vehicle vehicle) {
//        vehicle.start();
//        System.out.println("Vehicle serviced.");
//    }
//}
//public class VehicleTest {
//    public static void main(String[] args) {
//        Car car = new Car();
//        Motorcycle motorcycle = new Motorcycle();
//
//        Garage garage = new Garage();
//
//        garage.serviceVehicle(car);
//        garage.serviceVehicle(motorcycle);
//    }
//}

                                //Student Class with Constructors
 //class Student {
//    String name;
//    int age;
//    String department;
//
//    // Default Constructor
//    Student() {
//        name = "Unknown";
//        age = 20;
//        department = "Unassigned";
//    }
//    // Constructor with name and age
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.department = "IT";
//    }
//    // Constructor with name, age and department
//    Student(String name, int age, String department) {
//        this.name = name;
//        this.age = age;
//        this.department = department;
//    }
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Department: " + department);
//        System.out.println();
//    }
//}
//
//public class StudentTest {
//    public static void main(String[] args) {
//
//        Student s1 = new Student();
//
//        Student s2 = new Student("Rahul", 21);
//
//        Student s3 = new Student("Priya", 22, "CSE");
//
//        s1.display();
//        s2.display();
//        s3.display();
//    }
//                                }