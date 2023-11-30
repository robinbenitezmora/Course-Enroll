import studentsapp.Overriding;

import java.util.Scanner;

import studentsapp.Overload;
import studentsapp.Student;

public class StudentDatabaseApp {
 public static void main(String[] args) {
  char welcome[] = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };
  String welString = new String(welcome);
  System.out.println("\t\t" + welString);

  Overload a = new Overload("\t\tStudent");
  Overload b = new Overload();
  a.printName();
  b.printName();

  Overriding ov = new Overriding();
  ov.myMethod();

  System.out.print("Enter number of new studente to enroll: ");
  try (Scanner in = new Scanner(System.in)) {
   int numOfStudents = in.nextInt();
   Student[] students = new Student[numOfStudents];

   for (int n = 0; n < numOfStudents; n++) {
    students[n] = new Student();
    students[n].enroll();
    students[n].totalpay();
    students[n].payTuition();
    System.out.println(students[n].toString());
   }
  }
 }
}
