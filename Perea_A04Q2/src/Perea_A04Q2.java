/*******
 * 
 * Completion time:23mins
 * @author Edward Perea
 * 
 * version 1.00
 *
 */

import java.util.Scanner;



public class Perea_A04Q2 {

	public static void main(String[] args) {
		String nums="";
		int errorReport=0, counter=0;
		double value=0,average=0,numbers=0;
		
		Scanner scan = new Scanner (System.in);
		Double doubleNum = new Double(0.0);
		
		while (counter<5)
		{
		System.out.print ("Please enter a number: ");
		nums = scan.nextLine();
		
		try
		   {
		value = doubleNum.parseDouble(nums);
		   }
		
		catch (NumberFormatException exception)
		   {
			System.out.println ("Please enter a valid number.");
			errorReport = 1;
		   }
		if (errorReport ==0 )
		   {
			numbers+=value;
			counter++;
		   }
		else if (errorReport==1)
		   {
			  errorReport=0; 
		   }
		     
		   {
		
		
		}
		
		
	}
		average = numbers/5;
		System.out.print("The average is: " + average);
}
}