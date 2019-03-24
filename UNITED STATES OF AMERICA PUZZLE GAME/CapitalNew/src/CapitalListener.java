import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class CapitalListener implements MouseListener {
	private Capital[] capitals;
	private int score;
	private int mouseX;
	private int mouseY;

	
	public CapitalListener(JPanel panel) {
		capitals = new Capital[2];
		capitals[0]= new Capital("Sacramento", 124, 320);
		capitals[1]= new Capital("Reno", 200, 320);
		panel.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
		
		mouseX = e.getX();
		mouseY = e.getY();
		
		for (Capital i: capitals) {
			System.out.println("Find: " + i.getName());
			System.out.println("Distance: " + Distance(i, e.getX(), e.getY()));
		}

		/*
		if (Distance(capitals[0], e.getX(), e.getY())<200) {
			score++;
			System.out.println("Get a point: " + score);
		}
		*/

	}
	
	public double Distance(Capital cap, int x, int y) {
		return Math.pow(x-cap.getxCo(), 2) + Math.pow(y-cap.getyCo(), 2);
	}
	
	public void Find(Capital cap, int x, int y) {
		System.out.println("Find " + cap.getName());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (Distance(capitals[0], e.getX(), e.getY())<200) {
			score++;
			System.out.println("Get a point: " + score);
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

	public Capital[] getCapitals() {
		return capitals;
	}

	public void setCapitals(Capital[] capitals) {
		this.capitals = capitals;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMouseX() {
		return mouseX;
	}

	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}
	
	
	
}