
package studentsapp;
import java.util.Scanner;

public class Student {
 private String firstName;
 private String lastName;
 private int semester;
 private String paymentID;
 private String course = null;
 private int tuitionBalance = 450;
 private static int costOfCourse = 500;
 private static int id = 1000;

 public Student() {
 int x = 1;
 do {
  try {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter student first name: ");
  this.firstName = in.nextLine();

  System.out.print("Enter student last name: ");
  this.lastName = in.nextLine();

  System.out.print("1 - Semester 1\n2 - Semester 2\n3 - Semester 3\n4 - Semester 4\n5 - Semester 5\nEnter your semester: ");
  this.semester = in.nextInt();

  System.out.println("--------------------------------------");
  setStudentID();

  x = 2;
  }
  catch (Exception e) {
  System.out.println("Invalid input. Please try again.");
  }
 } while(x == 1);
 }

 private void setStudentID() {
 id++;
 this.paymentID = semester + "" + id;
 }

 public void enroll() {
 do {
  System.out.print("Enter course to enroll (Q to quit when finish.):");
  Scanner in = new Scanner(System.in);
  String course = in.nextLine();
  if (!course.equals("Q")) {
  this.course = course;
  tuitionBalance = tuitionBalance + costOfCourse;
  }
  else {
  break;
  }
 } while (1 != 0);
 System.out.println("------------------------------------------");
 System.out.println("\n");
 System.out.println("******************************************");
 }

 public void totalpay() {
 int totPayment = 0;
 totPayment = tuitionBalance - 450;
 System.out.println("Total payment: " + totPayment);
 System.out.println("******************************************");
 }

 public void viewBalance() {
 System.out.println("Your balance is: " + tuitionBalance);
 System.out.println("******************************************");
 }

 public void payTuition() {
 int x = 1;
 do {
  try {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter your payment: ");
  int payment = in.nextInt();
  tuitionBalance = tuitionBalance - payment;
  System.out.println("Thank you for your payment of: " + payment);
  System.out.println("******************************************");
  x = 2;
  }
  catch (Exception e) {
  System.out.println("Invalid input. Please try again.");
  }
 } while(x == 1);
 }

 public String toString() {
 return "Name: " + firstName + " " + lastName +
   "\nSemester: " + semester +
   "\nPayment ID: " + paymentID +
   "\nCourses Enrolled: " + course +
   "\nBalance: " + tuitionBalance +
   "\n-------------------------------------------";
 }
}