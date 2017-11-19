import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;


public class ImagePolymorph extends Polymorph{

	static BufferedImage img;	
	
	ImagePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("download.jpg"));
		} catch (Exception e) {
			System.out.println("image didn't load");
		}
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, x, y, width, height, null);
	}
	
	public void update(){
		
	}
}
