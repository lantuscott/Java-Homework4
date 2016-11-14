
public class Loops2
{
	public static void main(String[] args)
	{			
	// loop: prompt to enter a, b such that neither is multiple of other
	//	and re-prompt until they do
		
		int a, b;
		do
		{
			StdOut.print("Enter a, b with neither the multiple of other: ");
			a = StdIn.readInt();
			b = StdIn.readInt();
			StdIn.readLine(); // toss entered newline
		}
		while (a == 0 || b == 0 || a % b == 0 || b % a == 0); 
		// why does the above check for either a or b == 0?
		
		StdOut.printf("You entered %d and %d.\n",  a, b);	
	
		a =0; b=0;
		
		// loop a: rewrite the above using while()
		
		while (a == 0 || b == 0 || a % b == 0 || b % a == 0)
		{

			StdOut.print("Enter a, b with neither the multiple of other: ");
			a = StdIn.readInt();
			b = StdIn.readInt();
			StdIn.readLine(); // toss entered newline

		}
		
		StdOut.printf("You entered %d and %d.\n",  a, b);	
		
		a =0; b=0;
		
		// loop b: rewrite the above loop using for(;;)
		int c=1;
		
		for(int i=0; i<=c; i++)
		{
			if(a == 0 || b == 0 || a % b == 0 || b % a == 0)
			{
				StdOut.print("Enter a, b with neither the multiple of other: ");
				a = StdIn.readInt();
				b = StdIn.readInt();
				StdIn.readLine(); // toss entered newline
				c++;
			}
		}
		
		StdOut.printf("You entered %d and %d.\n",  a, b);


				
	}

}
