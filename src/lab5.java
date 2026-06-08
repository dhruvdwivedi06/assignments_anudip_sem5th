//import java.util.Scanner;
//
//                                     //Gross Salary of Employees
//public class GrossSalary {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int choice;
//
//        do {
//            System.out.print("Enter Basic Salary: ");
//            double basic = sc.nextDouble();
//
//            double hra, da, grossSalary;
//
//            if (basic > 15000) {
//                hra = 0.20 * basic;
//                da = 0.60 * basic;
//            } else {
//                hra = 3000;
//                da = 0.70 * basic;
//            }
//
//            grossSalary = basic + hra + da;
//
//            System.out.println("Gross Salary = " + grossSalary);
//
//            System.out.print("Enter -1 to continue, any other number to exit: ");
//            choice = sc.nextInt();
//
//        } while (choice == -1);
//
//        sc.close();
//    }
//}
//
//                                    //Count Odd and Even Numbers
//public class lab5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int evenCount = 0, oddCount = 0, num;
//
//        while (true) {
//            System.out.print("Enter a number (-1 to stop): ");
//            num = sc.nextInt();
//
//            if (num == -1) {
//                break;
//            }
//
//            if (num % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//        }
//
//        System.out.println("Total Even Numbers = " + evenCount);
//        System.out.println("Total Odd Numbers = " + oddCount);
//
//        sc.close();
//    }
//}