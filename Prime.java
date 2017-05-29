import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Entert a number");
		int num=scan.nextInt();
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0)
				
			{
				count=1;
				break;
			}
		}
		if (count==1)
		{
				System.out.println("It is not prime ");
				
			}
	else
			{
				System.out.println("It is  prime");
			
	}

}

}