import java.util.Scanner;

public class PerfectNumber {
public static void main (String[] args)
{
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
			
		}
	}
	if(sum==n)
	{
		System.out.println("The given number is perfect");
	}
	else
	{
		System.out.println("The given number is not perfect");
	}
	
}
}
