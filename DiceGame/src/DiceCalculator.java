/****
 * Use of Classes and a simple dice game
 * @author Mindforge
 * date: 2/14/2016
 */

import java.util.Scanner;
public class DiceCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String exit = "y";
		
		int totalRolls, num1, num2, count=0, value1, value2 = 0;
		int rollNum = 1;
		
	
		
		
		while (exit!="x") {
			
		  System.out.println("Do you want to play dice y to play x to end: ");
		  exit = scan.nextLine();
		  
		  System.out.println("Enter the first number you want: ");
		  value1 = scan.nextInt();
		  
		  System.out.println("Enter the second number you want: ");
		  value2 = scan.nextInt();
		
		  System.out.println ("Enter number of rolls: ");
		  totalRolls = scan.nextInt();
		  
		  Dice dice1 = new Dice();
		  Dice dice2 = new Dice();
		  
		  for (rollNum=1; rollNum<=totalRolls; rollNum++)
		  {
			  num1= dice1.roll();
			  num2= dice2.roll();
			  
			  if (num1 == value1 && num2 == value2) 
                    count++;
			  else if  (num1 == value2 && num2 == value1)
				   count++;

			  
		  }
		  System.out.println("Number of rolls: " + totalRolls);
		  System.out.println("Number of times selected number came up: " + count);
		  System.out.println("Ratio: " + (float)count/totalRolls);
		

		}
	}

}
