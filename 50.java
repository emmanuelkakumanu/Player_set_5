import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();boolean st=false;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			st=true;
			break;
				
			}
		}
		if(st)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
