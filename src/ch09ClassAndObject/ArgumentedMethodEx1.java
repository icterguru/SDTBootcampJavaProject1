package ch09ClassAndObject;

/* Example of Argumented Method */
class StudentB {
  public int  Roll;	
  protected String Name;
  private float Mark;	

 void setData(int R, String N, float M) {
   this.Roll = R ;
   this.Name = N; 
   this.Mark =M ;
   }
 void display(){
   System.out.println("Roll is : " + Roll);                 
   System.out.println("Name is : " + Name);                 
   System.out.println("Mark is : " + Mark) ;
   }
  }  

 public class ArgumentedMethodEx1 {
 public static void main(String args[]){
  StudentB S = new StudentB();	// Creating object
 S.setData(101, "Ritu", 85);  // Calling Argumented Method
 S.display();
 }
} 
