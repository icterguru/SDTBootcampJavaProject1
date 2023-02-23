package ch20MiscPrograms;

import java.io.Serializable;

class Employee implements Serializable{
	private int id;
	private String name;
	
	static float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

public class SerializableEx1 {
	public static void main(String args[]){

		Employee e =new Employee();//object is created
		e.setId(101);
		e.setName("Mahdi Munim");
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		e.salary = 100;
		
		
//		e.getId();
//		e.getName();
//		
		//		e.setName("Mahdi Munim");//setting value to the object
		//
		//		System.out.println(e.getName());

	}
}
