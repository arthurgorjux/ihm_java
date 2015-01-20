
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthur
 */
public class Canvas extends JComponent implements MouseMotionListener, MouseListener, KeyListener{

    Point pointDepart;
    Point pointArrivee;
    Line2D line;
    ArrayList<Line2D> lines;
    int etat;
    
    public Canvas(){
        super();
        etat = 0;
        addMouseListener(this);
        addMouseMotionListener(this);
        this.setPreferredSize(new Dimension(500, 500));
        lines = new ArrayList<Line2D>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if(!lines.isEmpty()){
            for(Line2D l : lines){
                g2d.setPaint(Color.BLACK);
                g2d.setStroke(new BasicStroke(1.5f));
                g2d.draw(l);
            }
        }
        if(pointDepart != null && pointArrivee != null && line != null){
            g2d.setPaint(Color.RED);
            g2d.setStroke(new BasicStroke(1.5f));
            g2d.draw(line);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch(etat){
            case 0:
                etat = 1;
                pointDepart = e.getPoint();
                break;
            case 1:
                etat = 2;
                pointArrivee = e .getPoint();
                this.line = new Line2D.Double(pointDepart.getX(), pointDepart.getY(), pointArrivee.getX(), pointArrivee.getY());
                lines.add(line);
                repaint();
                break;
            case 2:
                etat = 1;
                pointDepart = pointArrivee;
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        /*switch(etat){
            case 1:
                etat = 0;
                break;
            case 2:
                etat = 0;
                lines.add(line);
                pointDepart = null;
                pointArrivee = null;
                line = null;
                repaint();
                break;
        }  */      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
