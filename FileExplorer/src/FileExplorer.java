import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class FileExplorer {

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame ("FileExplorer for Text");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		JTextArea ta = new JTextArea (20,30);
		JFileChooser chooser= new JFileChooser();
		
		int status = chooser.showOpenDialog(null); //showopen returns an int
		
		if (status != JFileChooser.APPROVE_OPTION)  //if nothing chosen
			ta.setText("No file chosen");
		else
		{
			File file = chooser.getSelectedFile();
			Scanner scan = new Scanner (file);
			
			String info = " ";
			while (scan.hasNext())
				info+=scan.nextLine() + "\n";
			
			ta.setText(info);;
		}
		
		frame.getContentPane().add (ta);
		frame.pack();
		frame.setVisible(true);

	}

}
