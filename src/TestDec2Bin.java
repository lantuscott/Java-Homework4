import static org.junit.Assert.*;

import org.junit.Test;

public class TestDec2Bin
{
	@Test
	public void testSingleBit()
	{
		assertEquals("Test N==0","0",Dec2Bin.dec2Bin(0));
		assertEquals("Test N==1","1",Dec2Bin.dec2Bin(1));
	}
	
	@Test
	public void testSingleDigit()
	{
		assertEquals("Test N==2","10",Dec2Bin.dec2Bin(2));
		
	}

	@Test
	public void testPowerMinus1()
	{
		assertEquals("Test N==15","1111",Dec2Bin.dec2Bin(15));
		assertEquals("Test N==31","11111",Dec2Bin.dec2Bin(31));
		assertEquals("Test N==63","111111",Dec2Bin.dec2Bin(63));
		
		assertEquals("Test N==48","110000",Dec2Bin.dec2Bin(48)); // 7^2 -1
		assertEquals("Test N==143","10001111",Dec2Bin.dec2Bin(143)); //12 ^ 2 - 1
		assertEquals("Test N==35","100011",Dec2Bin.dec2Bin(35)); // 6^2 - 1
	}

}
