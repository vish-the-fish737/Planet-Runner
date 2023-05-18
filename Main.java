import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseListener;


class Main {
  public static void main(String[] args) {
    JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		rocket m = new rocket();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn.

		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

  }

class rocket extends JPanel {

public rocket() {setSize(1280,720);}

public void paintComponent(Graphics g) {drawPlatform(g);drawRocket(g);}

private void drawPlatform(Graphics g) {
  g.setColor(Color.CYAN);
  g.fillRect(0,0,1280,720);
  g.setColor(Color.BLACK);
  g.fillRect(400,300,200,250);
  g.setColor(Color.GREEN);
  g.fillRect(0,550,1200,170);
  g.setColor(Color.BLUE);
  g.fillRect(980,550,300,170);

}

private void drawRocket(Graphics g) {
int xVal1[]={405,475,500};
int yVal1[]={300,200,230};
int xVal2[]={575,500,500};
int yVal2[]={300,200,250};
g.setColor(Color.RED);
g.fillOval(463,100,50,175);
g.fillPolygon(xVal1,yVal1,xVal1.length);
g.fillPolygon(xVal2,yVal2,xVal2.length);
int xVal3[]={405,475,500};
int yVal3[]={235,150,235};
int xVal4[]={575,500,500};
int yVal4[]={235,150,235};
g.fillPolygon(xVal3,yVal3,xVal3.length);
g.fillPolygon(xVal4,yVal4,xVal4.length);
g.setColor(Color.GRAY);
g.fillRect(473,170,30,25);
g.setColor(Color.ORANGE);
for(int i=0;i<=50;i+=2)
g.drawLine(463+i,275,463+i,350);
g.setColor(Color.BLACK);
int xVal5[]={463,513,500,476};
int yVal5[]={275,275,245,245};
g.fillPolygon(xVal5,yVal5,xVal5.length);
}
}