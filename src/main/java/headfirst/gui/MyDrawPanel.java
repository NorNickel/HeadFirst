package headfirst.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MyDrawPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        //g.setColor(Color.ORANGE);
        //g.fillRect(20, 50, 100, 100);
        //Graphics2D g2g = (Graphics2D) g;
        //g.fillRect(0, 0, this.getWidth(), this.getHeight());

        //int red = (int) (Math.random() * 255);
        //int green = (int) (Math.random() * 255);
        //int blue = (int) (Math.random() * 255);

        //Color randomColor = new Color(red, green, blue);
        //g.setColor(randomColor);
        //g.fillOval(70, 70, 100, 100);
        try {
            Image myImg = (Image) ImageIO.read(new File("D:\\JavaProjects\\HeadFirst\\src\\main\\java\\headfirst\\gui\\cat.jpg"));
            System.out.println(myImg.getHeight(this));
            System.out.println(myImg.getWidth(this));
            g.drawImage(myImg, 10, 10, this);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
