import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;


public class MessagePolymorph extends Polymorph implements MouseListener{
int xx;
int yy;

	MessagePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}

	public void update(){
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		xx = e.getX();
		yy = e.getY();
		if (xx > x && xx <= (x+width)) {
			if (yy > y && yy <= (y+height)) {
				JOptionPane.showMessageDialog(null, "YOU CLICKED ME");
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
}
