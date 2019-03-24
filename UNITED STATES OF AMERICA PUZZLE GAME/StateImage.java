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
	
	public StateImage(JFrame frame, JPanel panel, int xPos, int yPos, File stateImage, int p) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.stateImage = stateImage;
	}
	public boolean containsPoint(int x, int y) {
		BufferedImage image = null;
		try { 
			image = ImageIO.read(stateImage); 
		} catch(IOException e) {

		}
		if (x > this.xPos && x < this.xPos + image.getWidth() && y > this.xPos && y < this.yPos + image.getHeight()) {
			return true;
		}
		else {
			return false;
		}
	}
}