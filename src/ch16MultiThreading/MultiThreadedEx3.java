package ch16MultiThreading;

/*  Using sleep() Method with try and catch Statements */
class A3 extends Thread   // Thread A3
{
public void run() {
 for(int  k= 1; k<=5; k=k+2)
   {
    System.out.println("Inside Thread A3 : k = " +k);
    try{
      sleep(1000);  // Causes wait of 1 Sec.
       }
    catch(Exception E){
 System.out.println("Eception Caught.");
      }
    }
  System.out.println("Exit From A3.");
  }
}  

 public class MultiThreadedEx3{   // Main Thread
 public static void main(String args[]){
   System.out.println("Starting Main Thread:");
   A3 Th1 = new A3(); //Creating Object of Thread A3
   System.out.println("Starting Thread A3:");
   Th1.start();  // Calls run() Method of Thread A3 
   System.out.println("Exit From Main Thread.");
  }
}  
