package ch14IOAndFileOperations;

/* A Sample File Management Program */
import java.io.*;
public class FileManagementEx1{
	public static void main(String args[])
	{
		File f = new File("./", "test.txt");
		if(f.exists()==true)
		{
			System.out.println("The file : "  + f.getName() +" exists.");
			System.out.println("Path of the File is : " + f.getPath());
			System.out.println("Absoulate Path of the File is : " + f.getAbsolutePath());
			
		}
		else{
			System.out.println("The file : "  + f.getName() +" does not exist.");
		} 
	}
}
