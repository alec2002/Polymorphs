import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    MousePolymorph m = new MousePolymorph(0, 50, 50, 50);
    MessagePolymorph mm = new MessagePolymorph(50, 150, 50, 50);
    ArrayList<Polymorph> list = new ArrayList<Polymorph>();
   
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   
   	
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(m);
   	 window.addMouseListener(mm);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
 	
 	list.add(new RedMorph(150, 50, 50, 50));
 	list.add(new BluePolymorph(200, 50, 50, 50));
 	list.add(new MovingMorph(255, 50, 50, 50));
 	list.add(new RedMorph(350, 50, 50, 50));
 	list.add(new CirclePolymorph(400, 50, 50, 50));
 	list.add(m);
 	list.add(new ImagePolymorph(50, 50, 50, 50));
 	list.add(mm);
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for(Polymorph l: list){
 		l.draw(g);
 		l.update();
 	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	
   	 repaint();
   	 
   	 repaint();
   	 
    }
	
}
