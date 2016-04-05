import javax.swing.JFrame;

public class ArrowKeys {

	public static void main(String[] args) {
		JFrame frame = new JFrame ("Arrow Keys");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add (new BorderPanel());
		
		frame.pack();
		frame.setVisible(true);

	}

}
