import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class amstrong5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int n1=input.nextInt();
		int r;
		int temp;
		int sum;
		while(n<=n1)
	            {
	                       sum=0;
	            	temp=n;
		while(n>0)
		{
	               r=n%10;
	               sum=sum+(r*r*r);
	               n=n/10;
		}
		if(sum==n)
		{
		System.out.println(n+" ");
		}
		n++;
	            }
}
}


