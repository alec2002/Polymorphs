import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);

	}
int yspeed = 10;
	public void update() {
		if (y + height > PolymorphWindow.HEIGHT) {
			yspeed = -yspeed;
		}
		else if (y < 0) {
			yspeed = -yspeed;
		}
y += yspeed;
	}

}
