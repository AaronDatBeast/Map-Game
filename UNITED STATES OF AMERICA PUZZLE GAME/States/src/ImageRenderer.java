import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;



public class ImageRenderer implements MouseListener, MouseMotionListener{
	private StateImage state;
	
	
	public ImageRenderer(File img_file, JFrame frame, JPanel panel, int x, int y) {
		BufferedImage image = null;
		try { 
			image = ImageIO.read(img_file); 
		} catch(IOException e) {

		}


		JLabel jlabel = new JLabel();
		Image newImage = image.getScaledInstance(image.getWidth()/4,image.getHeight()/4,Image.SCALE_SMOOTH);
		jlabel.setIcon(new ImageIcon(newImage));



		frame.getContentPane().add(jlabel);
		frame.getContentPane().setLayout(null);

		jlabel.setBounds(x,y, image.getWidth(), image.getHeight());

	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int currentlyClickedX = e.getX();
		int currentlyClickedY = e.getY();
		
		if (state.containsPoint(currentlyClickedX, currentlyClickedY)) {
			
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}