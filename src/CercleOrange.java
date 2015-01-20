
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.JComponent;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthur
 */
public class CercleOrange extends JComponent{

    private Color couleur;
    
    public CercleOrange(){
        super();
        this.setPreferredSize(new Dimension(100, 100));
        this.couleur = Color.ORANGE;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(this.couleur);
        //g.fillOval(this.getX()/2, this.getY()/2, this.getX(), this.getY());
        g.drawOval(0,0,100,100);
    }
}
