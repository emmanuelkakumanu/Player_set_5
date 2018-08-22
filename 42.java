import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		boolean status=false;int f=0;
		for(int i=0;i<n;i++)
		{
			status=false;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				status=true;
			}
			if(status)
			f++;
		}
		//System.out.println(f);
		if(f==n-1)
		System.out.print("yes");
		else
		System.out.print("no");
		
		

	}
}
