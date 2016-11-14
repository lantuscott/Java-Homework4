
public class Nested
{

	public static void drawSquare(double side, Turtle t)
	{
		for (int i=0; i<4; i++)
		{
			t.goForward(side);
			t.turnLeft(90);
		}
	}

	public static void drawTriangle(double side, Turtle t)
	{
		for (int i=0; i<3; i++)
		{
			t.goForward(side);
			t.turnLeft(120.0);
		}
	}
	
	public static void main(String[] args)
	{
		Turtle t = new Turtle(0.125, 0.125, 0.0);
		// change starting state (position, heading) of turtle above
		// drawSquare(0.50,t);
		
	// add code below to draw picture(s) in HW 4 handout

	}

}
