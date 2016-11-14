
public class Dec2Bin
{
	public static String dec2Bin(int N)
	{
		String result = "";
		
		if(N==0)
		{
			return "0";
		}
		
		int binaryNumber;
				
		while(N > 0)
		{
			binaryNumber = N % 2;          // The binary number
			N = N / 2;
			result += ""+binaryNumber;
	
		}
		
		String reverse = new StringBuffer(result).reverse().toString();
		
		result = reverse;
		
		return result;
	}
	
	
	
	public static void main(String[] args)
	{
		StdOut.print("Enter int > 0: ");
		
		int N = StdIn.readInt();
		
		StdOut.printf("The binary equivalent to %d is %s\n",N,dec2Bin(N));
	}

}


