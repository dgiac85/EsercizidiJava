package com.pellegrinoprincipe;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SimpleApplet extends JApplet
{
    private int x;
    private int y;
    private int width;
    private int height;

    public void init()
    {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digitare la coordinata x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digitare la coordinata y"));
        width = Integer.parseInt(JOptionPane.showInputDialog("Digitare la lunghezza"));
        height = Integer.parseInt(JOptionPane.showInputDialog("Digitare l'altezza"));
        getContentPane().setBackground(Color.blue);
    }

    public void start() {}

    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }

    public void stop(){}
    public void destroy() {}
}
