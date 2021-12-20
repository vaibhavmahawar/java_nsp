import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class vaibhav extends Applet implements ActionListener {
    int a=0,b=0,c=0,f=0,x=0,y=0;
    Button u = new Button("Up");
    Button d = new Button("Down");
    Button l = new Button("Left");
    Button r = new Button("Right");
    
    public void init() {
        add(u);
        u.addActionListener(this);
        add(d);
        d.addActionListener(this);
        add(l);
        l.addActionListener(this);
        add(r);
        r.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == u) {
           y=y-1;
           a++;
        }
        else if (e.getSource() == d) {
            y=y+1;
            b++;
        }
        else if (e.getSource() == l) {
            x=x+1;
            c++;
        }
        else if (e.getSource() == r) {
            x=x-1;
            f++;
        }
        repaint();
    }

    public void paint(Graphics g){
        if(x>=0||y>=0){
            final int MID = 500;
            final int TOP = 500;
            setBackground(Color.cyan);
            g.setColor (Color.white);
            g.fillOval (MID-20+x, TOP+y, 40, 40);      // head
            g.fillOval (MID-35+x, TOP+35+y, 70, 50);   // upper torso
            g.fillOval (MID-50+x, TOP+80+y, 100, 60);  // lower torso
            g.setColor (Color.black);
            g.fillOval (MID-10+x, TOP+10+y, 5, 5);   // left eye
            g.fillOval (MID+5+x, TOP+10+y, 5, 5);    // right eye
            g.drawArc (MID-10+x, TOP+20+y, 20, 10, 190, 160);   // smile
            g.drawLine (MID-25+x, TOP+60+y, MID-50+x, TOP+40+y);  // left arm
            g.drawLine (MID+25+x, TOP+60+y, MID+55+x, TOP+60+y);  // right arm
            g.drawLine (MID-20+x, TOP+5+y, MID+20+x, TOP+5+y);  // brim of hat
            g.fillRect (MID-15+x, TOP-20+y, 30, 25);        // top of hat
        }
    }
}  
/* 
<applet code="vaibhav.class" width="1000" height="1000"> 
</applet> 
*/