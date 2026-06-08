import java.util.Scanner;
                                       //Calculate Total, Average and Grades

//public class lab4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter marks of Subject 1: ");
//        int m1 = sc.nextInt();
//
//        System.out.print("Enter marks of Subject 2: ");
//        int m2 = sc.nextInt();
//
//        System.out.print("Enter marks of Subject 3: ");
//        int m3 = sc.nextInt();
//
//        System.out.print("Enter marks of Subject 4: ");
//        int m4 = sc.nextInt();
//
//        System.out.print("Enter marks of Subject 5: ");
//        int m5 = sc.nextInt();
//
//        int total = m1 + m2 + m3 + m4 + m5;
//        double average = total / 5.0;
//
//        String grade;
//
//        if (average > 90)
//            grade = "Ex";
//        else if (average > 80)
//            grade = "A";
//        else if (average > 60)
//            grade = "B";
//        else if (average >= 40)
//            grade = "C";
//        else
//            grade = "F";
//
//        System.out.println("Total Marks = " + total);
//        System.out.println("Average Marks = " + average);
//        System.out.println("Grade = " + grade);
//
//        sc.close();
//    }
//}
//
                                            //Internet Bill Calculator
//
//public class lab4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter total data consumed (in GB): ");
//        double gb = sc.nextDouble();
//
//        double bill;
//
//        if (gb < 10) {
//            bill = 300;
//        }
//        else if (gb <= 30) {
//            bill = 300 + 5 * (gb - 10);
//        }
//        else {
//            bill = 400 + 3 * (gb - 30);
//        }
//
//        System.out.println("Total Bill Amount = Rs. " + bill);
//
//        sc.close();
//    }
//}