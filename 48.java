import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int fa[]=new int[a];int j=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0 && i%2==1)
			fa[j++]=i;
		}
		System.out.print(fa[0]);
		for(int i=1;i<j;i++)
		System.out.print(" "+fa[i]);
	}
}
