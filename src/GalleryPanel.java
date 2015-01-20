
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
public class GalleryPanel extends JPanel{
    private JPanel gridImages;
    private JPanel buttons;
    private JPanel displayImage;
    private JButton play;
    private JButton stop;
    private JButton pause;
    private JButton previous;
    private JButton next;
    private ImageIcon[] images;
    private JLabel vignetteActive;
    private JLabel currentImage;
    private Map<JLabel, JLabel> mapImages;
    
    public GalleryPanel(ImageIcon[] images) throws IOException{
        super(); 
        this.images = images;
        this.mapImages = new HashMap<JLabel, JLabel>();
        gridImages = new JPanel();
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 4, 5, 5));
        Image imgStart = ImageIO.read(getClass().getResource("/IMG/play.png"));
        play = new JButton(new ImageIcon(imgStart));
        Image imgPause = ImageIO.read(getClass().getResource("/IMG/pause.png"));
        play.addActionListener(new PlayListener(play, this));
        pause = new JButton(new ImageIcon(imgPause));
        pause.setEnabled(false);
        previous = new JButton("<<");
        previous.setEnabled(false);
        next = new JButton(">>");
        next.setEnabled(false);
        gridImages.setLayout(new GridLayout(3, 4, 5, 5));        
        //gridImages.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        JLabel image1 = new JLabel(images[0]);
        ImageIcon img1Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image1_big.jpg")));
        JLabel image1Big = new JLabel(img1Big);
        this.mapImages.put(image1, image1Big);
        //add(image1Big);
        JLabel image2 = new JLabel(images[1]);
        JLabel image3 = new JLabel(images[2]);
        JLabel image4 = new JLabel(images[3]);
        JLabel image5 = new JLabel(images[4]);
        JLabel image6 = new JLabel(images[5]);
        JLabel image7 = new JLabel(images[6]);
        JLabel image8 = new JLabel(images[7]);
        JLabel image9 = new JLabel(images[8]);
        JLabel image10 = new JLabel(images[9]);
        JLabel image11 = new JLabel(images[10]);
        JLabel image12 = new JLabel(images[11]);
        image1.addMouseListener(new ImageListener(image1, this));
        image2.addMouseListener(new ImageListener(image2, this));
        image3.addMouseListener(new ImageListener(image3, this));
        image4.addMouseListener(new ImageListener(image4, this));
        image5.addMouseListener(new ImageListener(image5, this));
        image6.addMouseListener(new ImageListener(image6, this));
        image7.addMouseListener(new ImageListener(image7, this));
        image8.addMouseListener(new ImageListener(image8, this));
        image9.addMouseListener(new ImageListener(image9, this));
        image10.addMouseListener(new ImageListener(image10, this));
        image11.addMouseListener(new ImageListener(image11, this));
        image12.addMouseListener(new ImageListener(image12, this));
        
        gridImages.add(image1);
        gridImages.add(image2);
        gridImages.add(image3);
        gridImages.add(image4);
        gridImages.add(image5);
        gridImages.add(image6);
        gridImages.add(image7);
        gridImages.add(image8);
        gridImages.add(image9);
        gridImages.add(image10);
        gridImages.add(image11);
        gridImages.add(image12);
        
        buttons.add(previous);
        buttons.add(play);
        buttons.add(pause);
        buttons.add(next);
        this.setLayout(new BorderLayout());
        add(gridImages, BorderLayout.NORTH);
        add(buttons, BorderLayout.SOUTH);
    }

    public void setVignetteActive(JLabel image) {
        this.vignetteActive = image;
    }
    
    public boolean hasVignetteActive(){
        return this.vignetteActive != null;
    }
    
    public void createImageDisplay(){
        this.displayImage = new JPanel();
        if(!this.hasVignetteActive()){ 
            this.vignetteActive = new JLabel(images[0]);
        }
        this.currentImage = (JLabel) this.mapImages.entrySet().iterator().next().getValue();
        
        this.displayImage.add(this.currentImage);
        this.remove(gridImages);
        this.remove(buttons);
        this.add(this.displayImage, BorderLayout.NORTH);
        this.add(buttons, BorderLayout.SOUTH);        
        
        revalidate();
        repaint();
    }
    
}
