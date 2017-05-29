import java.util.Scanner;

public class Palindrome {
	 public static void main(String args[]){ 
	       System.out.print("Enter Number: ");
	       Scanner scan = new Scanner(System.in);
	       int num = scan.nextInt();
	        int n = num;
	       
	       int rev=0,rmd; 
	       while(num > 0) 
	       { 
	         rmd = num % 10; 
	         rev = rev * 10 + rmd; 
	         num = num / 10; 
	       } 
	       if(rev == n) 
	         System.out.println("It is a Palindrome Number"); 
	       else 
	         System.out.println(" It is not a Palindrome Number"); 
	     } 
	}



