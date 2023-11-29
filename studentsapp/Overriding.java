package studentsapp;

public class Overriding {
 public void myMethod() {
  System.out.println("**************************************");
 }
}

class Demo extends Overriding {
 public void myMethod() {
  super.myMethod();
 }
}
