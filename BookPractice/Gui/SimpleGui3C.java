package BookPractice.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;
    Graphics2D g2d;
    Graphics2D g2d2;
    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
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
            g2d = (Graphics2D) g;
            g2d2 = (Graphics2D) g;
            g2d.setPaint(getGradient());
            g2d2.setPaint(getGradient());
            g2d.fillOval(20, 20, 100, 100);
            g2d2.fillOval(100, 100, 100, 100);
        }
    }
}
