import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
        static int largest()
        {
            int i,n,temp=0;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int arr[];
            arr=new int[n];
            for(i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
            }
            int max=arr[0];
            for(i=1;i<n;i++)
                if(arr[i] > max)
                  max=arr[i];
            return max;
        }
          public static void main(String[] args)
          {
               System.out.println(" "+largest());
           }
       
}











		
	
