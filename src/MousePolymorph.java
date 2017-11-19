import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MousePolymorph extends Polymorph implements MouseMotionListener{

	MousePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}

	public void update(){
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	x	= e.getX();
		y = e.getY();
		
	}
}
