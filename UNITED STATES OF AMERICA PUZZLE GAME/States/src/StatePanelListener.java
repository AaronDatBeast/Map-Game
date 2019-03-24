import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;





public class StatePanelListener implements MouseListener, MouseMotionListener, KeyListener, ActionListener{
	private JPanel statePanel;
	private ArrayList<StateImage> state;
	private StateImage currentState;
	private boolean dragging;

	public StatePanelListener(JPanel panel, ArrayList<StateImage> states) {
		this.state = states;
		statePanel = panel; 
		statePanel.addMouseListener(this);
		statePanel.addMouseMotionListener(this); //***don't forget
		statePanel.addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (dragging==true) {
			System.out.println("Dragging");
			System.out.println(currentState);
			currentState.moveState(e.getX(), e.getY());
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
		int currentlyClickedX = e.getX();
		int currentlyClickedY = e.getY();

		System.out.println(currentlyClickedX);
		System.out.println(currentlyClickedY);

		for (int i=0; i<state.size(); i++) {
			if(state.get(i).containsPoint(currentlyClickedX, currentlyClickedY)) {
				currentState = state.get(i);
				dragging = true;
				// System.out.print("clicked");
				// state.get(i).moveState(e.getX(), e.getY());
			}
		}



	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		dragging = false;

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