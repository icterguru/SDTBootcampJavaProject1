package ch10ConstructorAndMethod;
/* J10_05.java       */
/*  Using Argumented Constructor Method */

class Student10_05 {
  int  Roll;	
  String Name;
  float Mark;	
  
  Student10_05(int R, String N, float M)  // Argumented Constructor
   {
   Roll = R;
   Name = N; 
   Mark = M;
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   System.out.println("Mark is : " +Mark);
   }
  }  

 public class J10_05{
public static void main(String args[]) {
	Student10_05 S = new Student10_05(101, "Masud Karim",  85.50f);
	System.out.println();
	Student10_05 S1 = new Student10_05(102, "Karim",  95.50f);
// Creating object and Calling Constructor Method
// S.display();
 }
}
