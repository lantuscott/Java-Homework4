
public class Loops1
{
	public static void main(String[] args)
	{
	// loop: find largest power of 2 <= input N
		
		StdOut.print ("Enter an integer N: ");
		
		int N = StdIn.readInt();
		StdIn.readLine(); // read and toss entered newline
		
		int power = 1; // Math.pow(2,0)
		
		while (power <= N) // ends when power > N
			power = power * 2;
		
		power /= 2; // divide power by 2 to get largest power <= N
		
		StdOut.printf("Largest power of 2 <= %d is %d\n", N, power);
	
	// loop a; rewrite the above using do...while()
		
		do{
			
			power = power*2;
			
		}while(power <= N);
		
		power /=2;
		
		StdOut.printf("Largest power of 2 <= %d is %d\n", N, power);
		
	// loop b: rewrite the above using for(;;)
		
		for(int i=0; i<=N; i++)
		{
			if(power <= N)
				power = power * 2;
		}
		
			power /=2;

		StdOut.printf("Largest power of 2 <= %d is %d\n", N, power);
		
				
	}

}
