
public class PerfectNumbers {
	public static void main(String[] args)
	{

		int i,j,sum=0;
		
		
		for(i=1;i<=100;i++)
		{
			sum=0;
			
			for(j=1;j<i;j++)
			{
				if(i%j==0)
			     sum=sum+j;
			   }
			if(i==sum)
				{
			System.out.println(+i);
		        }
		}
	}
	


	

}
