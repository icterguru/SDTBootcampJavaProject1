package ch10ConstructorAndMethod;
/* J10_03.java    */
/* Using Default Constructor Method	*/

class StudentA {
  int  Roll; 
  String Name;  
  float Mark;
  
  public StudentA(){  // Constructor Function
   Roll = 101;
   Name = "Masud"; 
   Mark = 75.5f;
   
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   System.out.println("Mark is : " +Mark);
  

  }
  
 }  

public class DefaultConstructorEx1 {
public static void main(String args[]) {
 
	StudentA s = new StudentA();

// Creating object and Calling Constructor Method
 }
} 
