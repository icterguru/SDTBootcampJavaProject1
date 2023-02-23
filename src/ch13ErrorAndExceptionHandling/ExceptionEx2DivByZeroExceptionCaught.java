package ch13ErrorAndExceptionHandling;

/*  Exception caused in division by zero  */
public class ExceptionEx2DivByZeroExceptionCaught
{
	public static void main(String args[])
	{
		int x, y, z, d;
		x = 5; y=10; z=15;
		try{
			d = z/(y-2*x);  // Exception Makes Here (Division by zero)
		}
		catch (Exception e){
//			System.out.println(e.printStackTrace());
			System.out.println("Value of d is undetermined");
			System.out.println("\t(Division by zero)");  //ERROR Message
			d = z/(y-x);  // OK and displayed
		}
		System.out.println("==============================");
		System.out.println("Now d = "+d);
	}
}
