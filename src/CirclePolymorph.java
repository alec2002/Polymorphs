import java.awt.Color;
import java.awt.Graphics;


public class CirclePolymorph extends Polymorph{
	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
	int ctr;
	
	public void update(){
		x += (int)(Math.sin(ctr)*100);
		y += (int)(Math.cos(ctr)*100);
		ctr++;
	}
}
