import java.util.Scanner;

public class Leepyear {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=scan.nextInt();
		
				  if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				{
					  System.out.println("The given year is leepyear");
				}
				  else{
					  System.out.println("The given year is not leepyear");
			
				}
	}

}
