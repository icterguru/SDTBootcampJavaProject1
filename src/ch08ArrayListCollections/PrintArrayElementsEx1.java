package ch08ArrayListCollections;
public class PrintArrayElementsEx1 {
   
	public static <E> void printArrayElements( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
      String[] nameArray = { "Mahdi", "Munim", "Myesha", "Myeda", "Maliha", "Mithila", "Mitul", "Mugdho" };
      
//    Student[] studentArray = { student1, student2, student3, student4, student5 };
     
      System.out.println("Array integerArray contains:");
      printArrayElements(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArrayElements(doubleArray);   // pass a Double array

      System.out.println("\nArray characterArray contains:");
      printArrayElements(charArray);   // pass a Character array
      
      System.out.println("\nArray nameArray contains:");
      printArrayElements(nameArray);   // pass a String array

   }
}