
public class PrimeNumber {
	public static void main(String[] args)
	{
		int j;
		for(int i=1;i<100;i++)
		{
			j=0;
			for(int k=2;k<i;k++)
			   {
				   if(i%k==0)
				   {
					   j=1;
					   break;
				   }
			   }
			   if(j==0)
			   {
				   System.out.println(+i);
			   }
			
		}
	}


}