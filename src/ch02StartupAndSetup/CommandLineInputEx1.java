package ch02StartupAndSetup;
/* J02_03.java   */
/* A Command Line Argumented Program */

public class CommandLineInputEx1{

public static void main (String[] args )
{	
	int argCount = args.length;
	System.out.println("Number of arguments is : " + argCount);

	for (int i =0; i<args.length; i++)
	{
		System.out.println("Arg["+i+"] is : " + args[i]);
	}

}
}

