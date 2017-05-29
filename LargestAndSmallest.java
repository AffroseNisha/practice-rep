import java.util.Scanner;

public class LargestAndSmallest {
public static void main(String[] args)
{
	int a,b,c,d;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the  numbers");
	a=scan.nextInt();
	c=d=a;
	for(b=0;b<10;b++)
	{
		System.out.println("Enter the  numbers");
		a=scan.nextInt();
		if(c<a)
		{
			c=a;
		}
		if (d>a)
		{
			d=a;
		}
	}
	

System.out.println("the greatest no is:"+c);
System.out.println("the snallest no is:"+d);

}
}

