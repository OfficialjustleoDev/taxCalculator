import java.util.Scanner;
class Employee {
 private String userName;
 private int userNumber;
 private double userSalary;
 public Employee(String userName, int userNumber, double 
userSalary) {
 this.userName = userName;
 this.userNumber = userNumber;
 this.userSalary = userSalary;
 }
 public double calculateTax() {
 return
 //I used a TINERY OPERATOR (short-hand If else 
statement)
 //The Tinery operator consists of 3 operands
 // i Previousely struggled to add parimeters using tinery 
but used && to add parimeters i needed
 userSalary <= 10000 ? 0 ://if salary is <= to 
10000 you dont get taxed
 (userSalary > 10000 && userSalary <= 
20000) ? 0.1 * (userSalary) ://if you earn more than 10 but less 
than 20 you get taxed 10%
 ( userSalary > 20000 && 
userSalary <= 40000) ? 0.2 * (userSalary) ://if you earn more 
than 20000 but less than 40000 you get taxed 20%
 0.25*userSalary; // 
Anything above 40000 you get taxed 25%
 
 /* 
the below code required a 
return value which could on return 0.0 which would mean else
Hence 0.25*userSalary; 
was a better option
(userSalary > 40000) ? 
0.25 * (userSalary): 0.0;
*/
 }
 public double getTaxPercentage() {
 return calculateTax() / userSalary;
 }
 public void displayInfo() {
 System.out.println("Name"+"\t"+"Employee No"+"\t\t"+ 
"Salary"+"\t\t"+ "AfterTax"+"\t"+ "Tax Value");
4 | P a g e
 System.out.println(userName+ "\t"+userNumber+"\t\t\t"+ 
userSalary+" \t"+(userSalarycalculateTax())+"\t"+getTaxPercentage() * 100 + "%");
 }
 public static void main(String[]args) {
 Employee myEmployee=new Employee("Java",1010,700000);
 myEmployee.displayInfo();
 }
}
