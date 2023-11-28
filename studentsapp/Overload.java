package studentsapp;

class Overload {
 private String name;

 public Overload(String n) {
  name = n;
 }

 public Overload() {
  name = "\t\tEnrollment App";
 }

 public void printName() {
  System.out.println(name);
 }
}