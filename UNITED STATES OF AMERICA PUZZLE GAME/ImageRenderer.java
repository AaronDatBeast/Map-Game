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
	
	public class DragImage extends JComponent implements MouseMotionListener, MouseListener {
		Image image;
		int width, height;
		int imageX, imageY;
		boolean dragging;
		StateImage currentState;
		ArrayList<StateImage> state;
		
		private ArrayList<BufferedImage> layers;
		
		public DragImage(Image image, ArrayList<BufferedImage> layers, ArrayList<StateImage> state) {
			this.image = image;
			this.layers = layers;
			this.state = state;
			addMouseMotionListener(this);
			addMouseListener(this);
		}

		public void addLayer(BufferedImage layer) {
			layers.add(layer);
		}
		
		
		
		public void paint(Graphics g) {
			super.paint(g);
			for(BufferedImage buffMyGuy: layers) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.drawImage(buffMyGuy, imageX, imageY, this);
			}
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if(dragging) {
				
			imageX = e.getX() - imageX/2;
			imageY = e.getY() - imageY/2;
			repaint();
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			for (int i = 0; i < state.size(); i++) {
				if(state.get(i).containsPoint(e.getX(), e.getY())) {
					currentState = state.get(i);
					dragging = true;
				}
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
	}

	
	public ImageRenderer(File img_file, JFrame frame, JPanel panel, int x, int y, int p, ArrayList<BufferedImage> layers, ArrayList<StateImage> finalDab) {


		
		BufferedImage image = null;
		try { 
			image = ImageIO.read(img_file); 
		} catch(IOException e) {

		}
		
		Image newImage = image.getScaledInstance(image.getWidth()/p,image.getHeight()/p,Image.SCALE_SMOOTH);
	
		layers.add(image);



		frame.getContentPane().add(new DragImage(newImage, layers, finalDab));
		
		

 
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