import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StateImage {
	private int xPos;
	private int yPos;
	private File stateImage;
	
	public StateImage(JFrame frame, JPanel panel, int xPos, int yPos, String name, File stateImage) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.stateImage = stateImage;
		ImageRenderer r = new ImageRenderer(stateImage, frame, panel, xPos, yPos);
	}
	
}