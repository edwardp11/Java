/****
 * One dice object for Dice Calculator
 * @author Mindforge
 * 2/14/2016
 */
public class Dice {

	private final int face = 6;  //number of faces of die
	private int faceValue;  //value on face of die
	
	public Dice()   //constructor that sets initial value
	{
		faceValue = 1;
	}
	
	public int roll()  //computes face value
	{
		faceValue = (int)(Math.random() * face) + 1;
		return faceValue;
	}
}
