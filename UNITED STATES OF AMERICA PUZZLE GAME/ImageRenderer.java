public class ImageRenderer {
	import java.awt.BorderLayout;
	import java.awt.Image;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;

	import javax.imageio.ImageIO;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class ImageTester extends JPanel{
		public static void main(String[] args) {
			JFrame frame = new JFrame("Image");
			JPanel panel = new JPanel();
			//frame.setContentPane(panel);
			frame.setSize(700,700);
			frame.setLocation(100, 100);
			
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			BufferedImage image = null;
			try {
				File img_file = new File("california2.png");
				// image = new BufferedImage(0, 0, 
	              //      BufferedImage.TYPE_INT_ARGB); 
				image = ImageIO.read(img_file); 
			} catch(IOException e) {
				
			}
			

			JLabel jlabel = new JLabel();
			Image newImage = image.getScaledInstance(image.getWidth()/4,image.getHeight()/4,Image.SCALE_SMOOTH);
	jlabel.setIcon(new ImageIcon(newImage));



			frame.getContentPane().add(jlabel);
	frame.getContentPane().setLayout(null);

	jlabel.setBounds(100,0, image.getWidth(), image.getHeight());
			
			frame.setVisible(true);
		}
	}
}