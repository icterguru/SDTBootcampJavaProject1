package ch09ClassAndObject;
/* J09_12.java    */
/* Example of Nested Objects	*/
class StudentA {
  private int  Roll; // private member;
  String Name= new String();
  void setData(){
   Roll = 101;
   Name = "Masud"; 
   }
  void display(){
   System.out.println("Inside Student Class...") ;
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   }
  }  

class Result{
  float Mark;
  StudentA S = new StudentA();	
		// S is an object of Student class
  void setData(){
   S.setData();
   Mark = 75.50f;
   }
  void display(){
   S.display();
   System.out.println("Inside Result  Class...") ;
   System.out.println("Mark is : " +Mark) ;
   }
  }  

 public class NestedObjectsEx1 {
public static void main(String args[]) {
 Result R = new Result();	// Creating object
		// R is an object of Result class
 R.setData();
 R.display();
 }
}
