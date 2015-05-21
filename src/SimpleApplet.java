import java.awt.*;
import java.applet.*;


/*BASIC APPLET SKELETON*/

public class SimpleApplet extends Applet {

	//called first
	public void init(){
		//initialization
	}
	
	//called second and everytime the applet
	//restarts
	public void start(){
		//start or resume execution
	}
	
	//called when the applet is stopped
	public void stop(){
		//suspends execution
	}
	
	//called when the applet is terminated
	//this is the last method executed
	public void destroy(){
		//perform shutdown activities
	}
	
	//called when an AWT-based applet's window
	//must be restored
	public void paint(Graphics g){
		//redisplay contents of window
		g.drawString("Java is ozzm!!", 20, 20);
	}
}


