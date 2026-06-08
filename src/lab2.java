import java.util.*;

public class lab2 {
}
//Assigement 1
class Car{
    String make;
    String model;
    Short year;
    int price;

    public Car(String model,String make,Short year,int price){
        this.make=make;
        this.year=year;
        this.model=model;
        this.price=price;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Make (e.g., Toyota): ");
        String userMake = input.nextLine();

        System.out.print("Enter Model (e.g., Camry): ");
        String userModel = input.nextLine();

        System.out.print("Enter Year: ");
        short userYear = input.nextShort();

        System.out.print("Enter Price: ");
        int userPrice = input.nextInt();

        Car myCar = new Car(userMake, userModel, userYear, userPrice);

        System.out.println("\n--- Saved Car Details ---");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Price: $" + myCar.price);

        input.close();
    }
}


//Assigement 2
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sumOne = calc.add(12, 15);
        System.out.println("Result of add(12, 15) [Two ints]: " + sumOne);

        int sumTwo = calc.add(5, 10, 25);
        System.out.println("Result of add(5, 10, 25) [Three ints]: " + sumTwo);

        double sumThree = calc.add(14.5, 22.3);
        System.out.println("Result of add(14.5, 22.3) [Two doubles]: " + sumThree);
    }
}