import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StateImage {
	private int xPos;
	private int yPos;
	private File stateImage;
	private JFrame frame;
	private JPanel panel;
	private int p;
	private ImageRenderer r;
	
	public StateImage(JFrame frame, JPanel panel, int xPos, int yPos, File stateImage, int p) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.stateImage = stateImage;
		this.frame = frame;
		this.panel = panel;
		this.p = p;
		 r = new ImageRenderer(stateImage, frame, panel, xPos, yPos, p);
	}
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public File getStateImage() {
		return stateImage;
	}
	public void setStateImage(File stateImage) {
		this.stateImage = stateImage;
	}
	
	public boolean containsPoint(int x, int y) {
		
		
		BufferedImage image = null;
		try { 
			image = ImageIO.read(stateImage); 
		} catch(IOException e) {

		}
		
		if (x > this.xPos && x < this.xPos + image.getWidth() && y > this.xPos && y < this.yPos + image.getHeight()) {
			System.out.println("Clicked");
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void moveState(int x, int y) {
		r = new ImageRenderer(stateImage, frame, panel, x, y, p);
	}
}