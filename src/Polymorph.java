import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
   protected int width;
   protected int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
   	 
    }
    int getX(){
    	return x;
    }
    void setX(int x){
    	if (x > PolymorphWindow.WIDTH) {
			this.x = PolymorphWindow.WIDTH;
		}
    	else if (x < 0) {
			this.x = 0;
		}
    }
    int getY(){
    	return y;
    }
    void setY(int y){
    	if (y > PolymorphWindow.HEIGHT) {
			this.y = PolymorphWindow.HEIGHT;
		}
    	else if(y < 0){
    		this.y = 0;
    	}
    }
    int getWidth(){
    	return width;
    }
    void setWidth(int width){
    	if (width < 0) {
			this.width = 0;
		}
    }
    int getHeight(){
    	return height;
    }
    void setHeight(int height){
    	if (height < 0) {
			this.height = 0;
		}
    }
    public abstract void draw(Graphics g);
}
