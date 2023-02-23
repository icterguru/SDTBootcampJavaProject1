package ch07StringOperations;

/* Example of readLine() Method */
import  java.io.*; 
 public class StringInputEx1{
public static void main(String args[])throws IOException {
String   Name;
BufferedReader inData = new BufferedReader (new InputStreamReader(System.in));
System.out.print("Please enter your name: ");
Name= inData.readLine();
System.out.print("Your name is : ");
System.out.print(Name);
 }
}
