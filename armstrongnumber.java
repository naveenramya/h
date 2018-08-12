
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp,rem,sum=0,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
