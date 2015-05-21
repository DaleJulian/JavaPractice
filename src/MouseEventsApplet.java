import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class MouseEventsApplet extends Applet 
	implements MouseListener, MouseMotionListener {

	String msg = "";
	int mouseX = 0, mouseY = 0; //mouse coordinates
	
	public void init(){
		//register this class as a listener for mouse events
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	//handle mouse clicked
	public void mouseClicked(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}
	
	//handle mouse entered
	public void mouseEntered(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}
	
	//handle mouse exited
	public void mouseExited(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
	}
	
	//handle button pressed
	public void mousePressed(MouseEvent me){
		//save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down.";
		repaint();
	}
	
	//handle button released
	public void mouseReleased(MouseEvent me){
		//save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up.";
		repaint();
	}
	
	//handle mouse dragged
	public void mouseDragged(MouseEvent me){
		//show status
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}
	
	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
