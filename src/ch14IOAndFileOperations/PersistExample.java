package ch14IOAndFileOperations;
import java.io.*;

 @SuppressWarnings("serial")
class StudentA implements Serializable{
 int id;
 String name;
 int age;
//age will not be serialized if it is declared as transident
 public StudentA(int id, String name,int age) {
  this.id = id;
  this.name = name;
  this.age=age;
 }
}


 public class PersistExample{
 public static void main(String args[])throws Exception{
  StudentA s1 =new StudentA(101,"Mahdi",12);//creating object
  //writing object into file
  FileOutputStream f=new FileOutputStream("./Test.txt");
  ObjectOutputStream out=new ObjectOutputStream(f);
  out.writeObject(s1);
  out.flush();

  out.close();
  f.close();
System.out.println("Object stored in the file Test.txt successfully"); }
}
