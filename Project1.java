import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Project1 extends JPanel{
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setContentPane(new Project1());
        f.setSize(600, 400);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        int y=130;
        y+=70;
        int x=250;
        
        super.paintComponent(g);
        setBackground(Color.darkGray);

        /*Display Words*/

        Font myFont = new Font("Consolas", Font.PLAIN, 20);
        g.setFont(myFont);
        g.setColor(Color.white);
        g.drawString("Kevin_Rufino {", x+20, 20+y);
        g.drawString("  CIS162 =          ;", x+20, 40+y);
        g.drawString("  computer           ();", x+20, 60+y);
        g.drawString("}", x+20, 80+y);
        
        g.setColor(Color.red);
        g.drawString("           javaIntro", x+20, 40+y);
        
        Font mFont = new Font("Consolas", Font.ITALIC, 20);
        g.setFont(mFont);

        g.setColor(Color.cyan);
        g.drawString(".programmer", 380, 60+y);

        g.setFont(myFont);
        g.setColor(Color.lightGray);
        g.drawString("    //\"logical thinker\"", x+20, 80+y);
        g.drawString("// rufinoke@mail.gvsu.edu", x+20, 100+y);
        g.drawString("// (616) 123-4567", x+20, 120+y);
        g.drawString("1", x, 20+y);
        g.drawString("2", x, 40+y);
        g.drawString("3", x, 60+y);
        g.drawString("4", x, 80+y);
        g.drawString("5", x, 100+y);
        g.drawString("6", x, 120+y);
        
        /*Shapes*/
        g.setColor(Color.white);
        //type box
        g.fillRect(470, 105+y, 15, 18);
        //Card Border
        g.drawRect(10, 10, 560, 330);
        //Picture border
        g.drawRect(27, 27, 206, 206);

        /*Picture*/
        BufferedImage photo = null;
        try {
            File file = new File("MyPhoto.jpg");
            photo = ImageIO.read(file);
        } catch (IOException e){
            g.drawString("Problem reading the file", 100, 100);
        }
        g.drawImage(photo, 30, 30, 200, 200, null);

        /*Windows Logo*/
        //red
        g.setColor(Color.red);
        int [] ra = {350,450,400};
        int [] rb = {50,50,100};
        g.fillPolygon(ra, rb, 3);
        int [] rc = {300,400,350};
        int [] rd = {100,100,50};
        g.fillPolygon(rc, rd, 3);
        //green
        g.setColor(Color.green);
        int [] ga = {455,555,505};
        int [] gb = {50,50,100};
        g.fillPolygon(ga, gb, 3);
        int [] gc = {405,505,455};
        int [] gd = {100,100,50};
        g.fillPolygon(gc, gd, 3);
        //yellow
        g.setColor(Color.yellow);
        int [] ya = {405,505,455};
        int [] yb = {105,105,155};
        g.fillPolygon(ya, yb, 3);
        int [] yc = {355,455,405};
        int [] yd = {155,155,105};
        g.fillPolygon(yc, yd, 3);
        //cyan
        g.setColor(Color.cyan);
        int [] ca = {299,399,349};
        int [] cb = {105,105,155};
        g.fillPolygon(ca, cb, 3);
        int [] cc = {249,349,299};
        int [] cd = {155,155,105};
        g.fillPolygon(cc, cd, 3);
        // :^}
    }
}