import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageRenderer {
	public ImageRenderer(File img_file, JFrame frame, JPanel panel) {
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

		jlabel.setBounds(100,0, image.getWidth(), image.getHeight());

	}
}