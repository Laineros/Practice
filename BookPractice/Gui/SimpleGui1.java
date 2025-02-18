package BookPractice.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SimpleGui1 implements ActionListener, MouseListener {
    JButton button;
    Graphics2D g2d;
    Graphics2D g2d2;
    MyDrawPanel myDrawPanel = new MyDrawPanel();
    MyDrawPanel2 myDrawPanel2 = new MyDrawPanel2();

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.getContentPane().add(BorderLayout.EAST, myDrawPanel);
        frame.getContentPane().add(BorderLayout.WEST, myDrawPanel2);
        myDrawPanel2.addMouseListener(this);
        myDrawPanel.addMouseListener(this);
        //Button
        /*button = new JButton("click me");
        button.addActionListener(this);
        frame.getContentPane().add(button);*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        myDrawPanel.repaint();
        myDrawPanel2.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        MyDrawPanel2 myDrawPanel2 = new MyDrawPanel2();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        MyDrawPanel2 myDrawPanel2 = new MyDrawPanel2();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        MyDrawPanel2 myDrawPanel2 = new MyDrawPanel2();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        MyDrawPanel2 myDrawPanel2 = new MyDrawPanel2();
    }

    public GradientPaint getGradient() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        return gradientPaint;
    }
    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            //Image
            /*String sep = File.separator;
            Image image = new ImageIcon(String.format("C:%sUsers%<sleoni%<sDownloads%<sphoto1713372265.jpeg",sep)).getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);*/
            //Gradient+Oval
            g2d = (Graphics2D) g;
//g2d2 = (Graphics2D) g;
            g2d.setPaint(getGradient());
//g2d2.setPaint(getGradient());
            g2d.fillOval(20, 20, 100, 100);
//g2d2.fillRoundRect(40,40,200,200, 60, 60);
        }
    }
    class MyDrawPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
            g2d2 = (Graphics2D) g;
            g2d2.setPaint(getGradient());
            g2d2.fillRect(90,90,100,100);
        }
    }
}