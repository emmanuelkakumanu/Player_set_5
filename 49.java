import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		if(n>=-2147483648 && n<=2147483647)
		{
			System.out.print("INT");
		}
		else
		{
			System.out.print("LONG");
		}
	}
}
