package exercise_employee.application;

import exercise_employee.entities.Employee;
import exercise_employee.entities.OutsourcedEmployee;

import java.util.*;

public class Program {
    public static void main(String[] args) {
       try {
           Scanner sc = new Scanner(System.in).useLocale(Locale.US);

           List<Employee> list = new ArrayList<>();

           System.out.print("Enter the numbers of employees: ");
           int n = sc.nextInt();

           for (int i = 1; i <= n; i++) {
               System.out.println("Employee #" + i + " data: ");
               System.out.print("Outsoucerd (y/n)? ");
               char c = sc.next().charAt(0);
               System.out.print("Name: ");
               sc.nextLine();
               String name = sc.nextLine();
               System.out.print("Hours: ");
               int hours = sc.nextInt();
               System.out.print("Value per hour: ");
               double valuePerHour = sc.nextDouble();

               if (c == 'y') {
                   System.out.print("Additional charge: ");
                   double additionalCharge = sc.nextDouble();
                   list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
               } else {
                   list.add(new Employee(name, hours, valuePerHour));
               }
           }

           System.out.println();
           System.out.println("=== PAYMENTS ===");

           for (Employee emp : list) {
               System.out.println(emp.getName() + " $ " + String.format("%.2f", emp.payment()));
           }

           sc.close();
       } catch (InputMismatchException e) {
           System.out.println("You must enter the number for number of employees!");
       }
    }
}
