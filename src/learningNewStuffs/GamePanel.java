package learningNewStuffs;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.*;

public class GamePanel extends JPanel {
    public static final long serialVersionUID = 1L;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    BufferedImage img;
    public GamePanel() {
        super();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
        init();
    }

    private void init(){
        try{
            img = ImageIO.read(getClass().getResourceAsStream("/Images/image1.jpg"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if(img!=null){
            g.drawImage(img,0,0,null);
        }


        FontMetrics metrics = g.getFontMetrics();
        Rectangle2D strRect = metrics.getStringBounds("JAVA 2D!",g);

        int centrePanelX = WIDTH/2;
        int centrePanelY = HEIGHT/2;

        int strX = centrePanelX-(int)(strRect.getWidth()/2);
        int strY = centrePanelY - (int)(strRect.getHeight()/2);

//        g.drawString("JAVA 2D!",strX,strY);
        g.setColor(Color.YELLOW);
        g.fillOval(100,100,100,100);

        g.setColor(Color.BLACK);
        g.fillOval(129,128,12,24);
        g.fillOval(159,128,12,24);

        g.drawOval(100,100,100,100);

        g.drawArc(125,160,50,14,0,-180);

        //Drawing a polygon
        Polygon poly = new Polygon();
        poly.addPoint(250,200);
        poly.addPoint(250,250);
        poly.addPoint(150,250);
        g.fillPolygon(poly);
    }

}