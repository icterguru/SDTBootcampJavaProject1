package ch10ConstructorAndMethod;
/* J10_05.java       */
/*  Using Argumented Constructor Method */

class Student {
  int  Roll;	
  String Name;
  float Mark;	
  
  Student(int R, String N, float M)  // Argumented Constructor
   {
   Roll = R;
   Name = N; 
   Mark = M;
   }
  
  void display()  
  {
  System.out.println("Roll is : " +Roll);                 
  System.out.println("Name is : " +Name);
  System.out.println("Mark is : " +Mark);
  }
  }  

 public class ArgumentedConstructorEx1{
public static void main(String args[]) {
	Student s1 = new Student(101, "Masud Karim",  85.50f);
	System.out.println();
	Student s2 = new Student(102, "Karim",  95.50f);
// Creating object and Calling Constructor Method
 s1.display();
 }
}
