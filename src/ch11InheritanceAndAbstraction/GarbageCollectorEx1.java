package ch11InheritanceAndAbstraction;

/* 	Inheriting Constructor and Finalize Methods */
class Student3{
String s;
Student3(String c)  // Constructor Method
 {
 s = c;
 System.out.println("Student  Constructor " + s);
 }
protected void finalize() // Finalize Mathod
 {
 System.out.println("Student Finalize " + s);
 }
} 

class Exam {
Exam() {
 Student3 p = new Student3("is alive");
 System.out.println("Calling Exam Constructor");
 }
protected void finalize()  // Finalize Mathod
 {
 System.out.println("Calling Exam Finalize");
 }
}

class Result3 extends Exam    
{
Result3() 
 {
 System.out.println("Calling Result Constructor");
 }
protected void finalize() 
{
 System.out.println("Calling Result Finalize");
}
}

 public class GarbageCollectorEx1{
public static void main(String args[]) {
new Result3(); // Calls Constructors
System.out.println("After Calling Constructors... ...");
System.gc();    // Run Garbage Collector  
System.runFinalization();  // Calls Finalizes  
}
} 
