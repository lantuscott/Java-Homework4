
public class Divisors
{
	public static void main(String[] args)
	{
		StdOut.print("Enter N >= 0: ");
		int N = StdIn.readInt();
		int count = 0;
		int k = 1;
		
		for(int i=0; i<=N; i++)
		{
			count = N % k;
			
			if(count == 0)
			{
				StdOut.printf("\n\nThe number of divisors of %d is %d.", N, k);
			}
			k++;
		}
		

	}
}
