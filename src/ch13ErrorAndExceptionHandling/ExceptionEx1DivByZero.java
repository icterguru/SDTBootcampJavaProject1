package ch13ErrorAndExceptionHandling;
/*  J14_01.java   */
/*  Exception caused in division by zero  */
 public class ExceptionEx1DivByZero
 {
  public static void main(String args[])
  {
   int x, y, z, d;
   x = 5; y=10; z=15;
   d = z/(y-2*x);  // Exception Makes Here (Division by zero)
   System.out.println("==============================");
   System.out.println("d = "+d);
  }
 }
