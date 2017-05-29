import java.util.Scanner;
public class Armstrong {
	int n,reminder,check;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a NUMBER:");
		Armstrong obj=new Armstrong();
		
		
		obj.n=scan.nextInt();
		while(obj.n>0)
		{
			obj.reminder=obj.n%10;
			obj.check=obj.check+(int)Math.pow(obj.reminder,3);
			if(obj.check==obj.n)
				System.out.println("It is armstrong");
			else
				System.out.println("It is not armstrong");
			
			
			
			
		}
	}

}
