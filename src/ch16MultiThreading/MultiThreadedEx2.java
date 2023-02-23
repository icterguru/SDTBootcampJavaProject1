package ch16MultiThreading;
/*   J18_05.java   */
/*   Example of Multi-Thread Program */
/*   In implementing Runnable Interface   */
class A2 implements Runnable   // Thread A
{
public void run()
 {
 for(int  i= 1; i<=5; i=i+2)
   {
    System.out.println("Inside Thread A : i = " +i);
   }
  System.out.println("Exit From A.");
  }
}  

class B2 implements Runnable   // Thread B
{
public void run()
 {
  for(int  j= 2; j<=6; j=j+2)
   {
    System.out.println("Inside Thread B : j = " +j);                 
   }
  System.out.println("Exit From B.");
 }
}  

 public class MultiThreadedEx2
{
 public static void main(String args[])
  {
   A2 ObjA = new A2();  // Creating Object of Thread A
   Thread Th1 = new Thread(ObjA); 
   B2 ObjB = new B2();  // Creating Object of Thread B

   Thread Th2 = new Thread(ObjB); 
   
   System.out.println("Starting Thread A:");
   Th1.start(); //Starting Thread A

   System.out.println("Starting Thread B:");
   Th2.start();  //Starting Thread B
   System.out.println("Exit From Main Thread.");
  }
}  
