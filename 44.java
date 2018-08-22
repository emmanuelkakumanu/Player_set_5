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
		int k=s.nextInt();
		char ch[]=str.toCharArray();int j=0;
		char ch1[]=new char[str.length()];
		if(k>str.length())
		{
			System.out.print(str);
		}
		else
		{
		for(int i=k;i<ch.length;i++)
		{
			ch1[j++]=ch[i];
		}
		for(int i=0;i<k;i++)
		{
			ch1[j++]=ch[i];
		}
		for(int i=0;i<ch.length;i++)
		System.out.print(ch1[i]);
		}
	}
}
