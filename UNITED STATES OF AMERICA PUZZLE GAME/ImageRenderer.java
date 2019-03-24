import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageRenderer implements MouseListener{
	
	public class DragImage extends JComponent implements MouseMotionListener {
		Image image;
		int width, height;
		int imageX, imageY;
		
		public DragImage(Image image) {
			this.image = image;
			addMouseMotionListener(this);
		}

		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(image, imageX, imageY, this);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			imageX = e.getX();
			imageY = e.getY();
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}


	public ImageRenderer(File img_file, JFrame frame, JPanel panel, int x, int y, int p) {


		
		BufferedImage image = null;
		try { 
			image = ImageIO.read(img_file); 
		} catch(IOException e) {

		}

		Image newImage = image.getScaledInstance(image.getWidth()/p,image.getHeight()/p,Image.SCALE_SMOOTH);
	
		



		frame.getContentPane().add(new DragImage(newImage));
		
		

 
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
		
		//if (state.containsPoint(currentlyClickedX, currentlyClickedY)) {
			
		//}
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
}