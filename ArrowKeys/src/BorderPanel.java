


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	public class BorderPanel extends JPanel {
		private final int height = 200, width = 200;
		private int x = 50, y=50;
		public BorderPanel()
		{
		setLayout (new BorderLayout());
		addKeyListener (new ButtonListener());
		
		setBackground (Color.black);
		setPreferredSize (new Dimension (height,width));
		
		setFocusable(true);
		

	}
		public void paintComponent (Graphics page)
		{
			super.paintComponent(page);
			page.setColor(Color.green);
			page.fillOval (x,y,6,6);
			page.drawString("Coordinates: (" + x + "' " + y + ") ", 5, 15);
			
		}
		
		private class ButtonListener implements KeyListener
		{
			public void keyPressed (KeyEvent event)
			{
				System.out.println("press");
			switch (event.getKeyCode())
			{
			case KeyEvent.VK_UP:
				if (y>=0)
				y-= 5;
				else
				
					y+=5;
				
				break;
			case KeyEvent.VK_DOWN:
				if (y<=200)
				y+=5;
				else y-=5;
					
				break;
			case KeyEvent.VK_LEFT:
				if (x>=0)
				x-=5;
				else x+=5;
				break;
			case KeyEvent.VK_RIGHT:
				if (x<=200)
				x+=5;
				else x-=5;
				break;
				
			}
			repaint();
		}
		public void keyTyped (KeyEvent event){}
		public void keyReleased (KeyEvent event){}
	}
	}
	

