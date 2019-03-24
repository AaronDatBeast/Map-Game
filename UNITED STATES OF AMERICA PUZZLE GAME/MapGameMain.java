import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class MapGameMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cool Frame");
		JPanel panel = new JPanel();
		
		frame.setSize(700,700);
		frame.setLocation(100, 100);
		frame.setContentPane(panel);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArrayList<StateImage> states = new ArrayList<StateImage>();
		ArrayList<BufferedImage> layers = new ArrayList<BufferedImage>();
		
		states.add(new StateImage(frame, panel, 0, 0, new File("alabama.png"), 4));
		ImageRenderer n = new ImageRenderer(new File("alabama.png"), frame, panel, 0,0,4,layers, states);

//		layers.add(new ImageRender(frame, panel, 0, 0, new File("alabama.png"), 4));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("arizona.png"),4));
//		merica.add(new StateImage(frame, panel, 20, 0, new File("arkansas.png")));
//		merica.add(new StateImage(frame, panel, 30, 0, new File("california.png")));
//		merica.add(new StateImage(frame, panel, 40, 0, new File("colorado.png")));
//		merica.add(new StateImage(frame, panel, 50, 0, new File("connecticut.png")));
//		merica.add(new StateImage(frame, panel, 60, 0, new File("delaware.gif")));
//		merica.add(new StateImage(frame, panel, 500, 305, new File("florida.png"), 4));
//		merica.add(new StateImage(frame, panel, 545, 320, new File("georgia.jpg"), 4));
//		merica.add(new StateImage(frame, panel, 90, 0, new File("idaho.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("illinois.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("indiana.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("iowa.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("kansas.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("kentucky.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("louisiana.gif")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("maine.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("maryland.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("massachusetts.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("michigan.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("minnesota.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("mississippi.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("missouri.gif")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("montana.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("nebraska.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("nevada.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("new hampshire.gif")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("new jersey.gif")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("new mexico.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("new york.png")));
//		merica.add(new StateImage(frame, panel, 575, 180, new File("north carolina.png"),10));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("north dakota.png"), 10));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("ohio.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("oklahoma.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("oregon.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("pensylvania.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("rhode island.gif")));
//		merica.add(new StateImage(frame, panel, 571, -60, new File("south carolina.png"), 20));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("south dakota.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("tennessee.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("texas.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("Utah.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("vermont img.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("virginia.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("washington.gif")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("west virginia.gif")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("wisconsin.png")));
//		merica.add(new StateImage(frame, panel, 0, 0, new File("wyoming.png")));
		frame.setVisible(true);
	}
}