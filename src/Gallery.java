
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthur
 */
public class Gallery extends JFrame{
    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;
    private ImageIcon image4;
    private ImageIcon image5;
    private ImageIcon image6;
    private ImageIcon image7;
    private ImageIcon image8;
    private ImageIcon image9;
    private ImageIcon image10;
    private ImageIcon image11;
    private ImageIcon image12;
    private ImageIcon[] images = new ImageIcon[12];
    private int curImageIndex=0;
    private GalleryPanel galleryPanel;
    
    public Gallery() throws IOException{
        image1 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image1_min.jpg")));
        image2 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image2_min.jpg")));
        image3 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image3_min.jpg")));
        image4 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image4_min.jpg")));
        image5 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image5_min.jpg")));
        image6 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image6_min.jpg")));
        image7 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image7_min.jpg")));
        image8 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image8_min.jpg")));
        image9 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image9_min.jpg")));
        image10 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image10_min.jpg")));
        image11 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image11_min.jpg")));
        image12 = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image12_min.jpg")));
        
        images[0] = image1;
        images[1] = image2;
        images[2] = image3;
        images[3] = image4;
        images[4] = image5;
        images[5] = image6;
        images[6] = image7;
        images[7] = image8;
        images[8] = image9;
        images[9] = image10;
        images[10] = image11;
        images[11] = image12;
        galleryPanel = new GalleryPanel(images);
        add(galleryPanel);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1100, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public GalleryPanel getGalleryPanel(){
        return this.galleryPanel;
    }
    
}
