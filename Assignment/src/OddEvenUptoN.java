
import java.util.*;

public class OddEvenUptoN {
	public static void main(String[] args)
	{
		int n,i;
		System.out.print("enter a number upto which u want to print odd number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("THE ODD NUMBERS:");
		for(i=0;i<=n;i++)
		{
			if(i%2!=0)
			 System.out.println(i);
		}
		System.out.print("enter a number upto which u want to print even number:");
		n=s.nextInt();
		System.out.println("THE EVEN NUMBERS:");
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			 System.out.println(i);
		}
	}

}
