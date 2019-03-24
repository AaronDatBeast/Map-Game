import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageRenderer {
	private JLabel jlabel;
	BufferedImage image;
	private int x;
	private int y;
	private int width;
	private int height;

	public ImageRenderer(File img_file, JFrame frame, JPanel panel, int x, int y, int p) {
		this.x = x;
		this.y = y;



		try { 
			image = ImageIO.read(img_file); 
		} catch(IOException e) {

		}

		JLabel jlabel = new JLabel();
		Image newImage = image.getScaledInstance(image.getWidth()/p,image.getHeight()/p,Image.SCALE_SMOOTH);
		jlabel.setIcon(new ImageIcon(newImage));



		frame.getContentPane().add(jlabel);
		frame.getContentPane().setLayout(null);

		this.width = image.getWidth();
		this.height = image.getHeight();

		jlabel.setBounds(x,y, image.getWidth(), image.getHeight());//sets position

	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		jlabel.setBounds(x,y, width, height);//sets position

	}


}