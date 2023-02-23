package ch16MultiThreading;

/*  Example of a Single Threaded Program */
class MyThread extends Thread   //Creating New Thread 
{
public void run() {
 for(int  i= 1; i<=5; i=i+2)
   System.out.println("Inside Thread A.");
 }
}  
 public class SingleThreadedEx1
{
 public static void main(String args[])
  {
   MyThread  Th = new MyThread();
   System.out.println("Starting MyThread :");
   Th.start();	// Calls run() Method 
   System.out.println("Exit From Main Thread.");
  }
}  
