import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseListener;


class Planet {
  pu\
  blic static void main(String[] args) {
    JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		rocket m = new rocket();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn.
   
		j.setVisible(true); //allows the frame to be shown.
       
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

  }

class rocket extends JPanel {

public rocket() {setSize(1680,700);}

public void draw(Graphics g) {
  drawPlanet(g);
  drawRocket(g);
  drawCharacter(g);
  drawAliens(g);
  drawGun(g);}

private void drawPlanet(Graphics g) {
  g.setColor(Color.BLACK);
  g.fillRect(0,0,1600,700);q1
  g.setColor(Color.WHITE);
  for(int j=0;j<=500;j++)
  {int x=(int)(Math.random()*1600);
  int y=(int)(Math.random()*700);
  g.fillOval(x,y,5,5);}
  Color color=new Color(210,174,29);
  g.setColor(color);
  g.fillRect(0,450,1600,270);
  for(int i=0;i<=6;i++){
  Color color2=new Color(186,153,18);
  g.setColor(color2);
  int x2=(int)(Math.random()*1600);
  g.fill3DRect(x2,413,50,37,true);
  Color color3=new Color(255,128,0);
  g.setColor(color3);
  g.fill3DRect(x2,413,50,5,true);
  g.setColor(Color.WHITE);
  g.drawOval(x2,375,45,35);
  g.drawOval(x2+2,345,45,35);
  g.drawOval(x2+5,315,45,35);
  g.drawOval(x2,285,45,35);
  g.drawOval(x2+2,255,45,35);
  g.drawOval(x2,360,45,35);
  g.drawOval(x2+2,350,45,35);
  g.drawOval(x2+5,290,45,35);
  g.drawOval(x2,275,45,35);
  g.drawOval(x2+2,260,45,35);
  g.drawOval(x2+5,300,45,35);
  g.drawOval(x2+5,320,45,35);
  }
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
private void drawCharacter(Graphics g) {
g.setColor(Color.BLACK);
g.drawLine(350,450,350,550);
g.drawLine(350,465,330,485);
g.drawLine(350,465,370,485);
g.drawLine(350,550,320,585);
g.drawLine(350,550,380,585);
g.setColor(Color.WHITE);
g.fillOval(330,410,40,40);
g.setColor(Color.BLACK);
g.fillOval(340,420,5,5);
g.fillOval(355,420,5,5);
g.drawArc(340,435,20,10,185,170);
}
private void drawAliens(Graphics g) {
g.setColor(Color.BLACK);
g.drawLine(450,450,450,550);
g.drawLine(450,465,430,485);
g.drawLine(450,465,470,485);
g.drawLine(450,550,420,585);
g.drawLine(450,550,480,585);
g.setColor(Color.GREEN);
g.fillOval(430,390,40,60);
g.setColor(Color.BLACK);
g.fillOval(435,405,10,20);
g.fillOval(455,405,10,20);
}
private void drawGun(Graphics g) {
g.setColor(Color.RED);
g.fill3DRect(10,490,15,10,true);
g.fill3DRect(10,500,10,30,true);
}
}