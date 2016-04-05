/********
 * Write a program that reads strings from the user and writes them to an output file
 *  called userStrings.txt.  Stop processing when the user enters the string "DONE". 
 *  Do not write the sentinel string ("DONE") to the output file. 

 * @author Edward Perea, utilizes some code from CST200 course
 * 
 * Completion Time: 40m
 * 
 * Version 1.00
 *
 */
import java.io.*;
import java.util.Scanner;
public class Perea_A04Q3 {

	public static void main(String[] args) throws IOException
	{
		String file = "userStrings.txt";  //file to be created and populated
		String entered = "";
		Scanner scan = new Scanner (System.in);
		
		FileWriter fw = new FileWriter (file);
		BufferedWriter bw = new BufferedWriter (fw);
		PrintWriter out = new PrintWriter (bw);
		
		System.out.println ("Enter strings.");
		
		while (!entered.equals("DONE"))
		{
			entered = scan.nextLine();
			
			if (!entered.equals("DONE"))
				{
				out.println(entered);
				}
		}
		
	out.close();
	
	System.out.println ("Complete");
		

	}

}
