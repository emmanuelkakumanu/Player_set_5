import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String sub=s.next();
		boolean st=false;
		for(int i=0;i<str.length();i++)
		{
			
			String t=str.substring(i);
			if(t.equals(sub))
			{
				st=true;break;
			}
		}
		if(st)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
