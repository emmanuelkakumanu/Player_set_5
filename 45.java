import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int a=s.nextInt();
		boolean st=false;
		for(int i=1;i<p;i++)
		{
			for(int j=1;j<p;j++)
			{
				int t=2*(i+j);
				if(t==p && (i*j)==a)
				{
					st=true;
					//System.out.println(i+"\t"+j);
				}
			}
		}
		if(st)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
