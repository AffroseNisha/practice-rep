import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args)
	{
		int a,b,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a digit to find its sum");
		a=scan.nextInt();
		while(a>0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
			
		}
			System.out.println("the sum is:"+sum);	
	}

}
