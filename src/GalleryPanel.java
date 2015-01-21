
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

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
    private JLabel vignetteActive = null;
    private JLabel currentImage = null;
    private JLabel firstImage = null;
    private Map<JLabel, JLabel> mapImages;
    private Map<JLabel, JLabel> mapImagesBig;
    public int etat = 0;
    public Timer timerNormal;
    public Timer timerInverse;
    public Timer timerActif;
    private JLabel[] imagesLabel;
    private JLabel[] imagesLabelInverse;
    private JLabel vignetteSuivante = null;
    private int cpt = 0;
    
    public GalleryPanel(ImageIcon[] images) throws IOException{
        super(); 
        this.timerNormal = new Timer(3000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                defilementNormal();
            }
        });
        this.imagesLabel = new JLabel[12];
        this.imagesLabelInverse = new JLabel[12];
        timerActif = timerNormal;
        this.images = images;
        this.mapImages = new HashMap<JLabel, JLabel>();
        this.mapImagesBig = new HashMap<JLabel, JLabel>();
        gridImages = new JPanel();
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 4, 5, 5));
        Image imgStart = ImageIO.read(getClass().getResource("/IMG/play.png"));
        play = new JButton(new ImageIcon(imgStart));
        Image imgPause = ImageIO.read(getClass().getResource("/IMG/pause.png"));
        play.addActionListener(new PlayListener(play, this));
        pause = new JButton(new ImageIcon(imgPause));
        pause.setEnabled(false);
        ImageIcon previousImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/previous.png")));
        previous = new JButton(previousImg);
        previous.setEnabled(false);
        ImageIcon nextImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/next.png")));
        next = new JButton(nextImg);
        next.setEnabled(false);
        gridImages.setLayout(new GridLayout(3, 4, 5, 5));        
        gridImages.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 5));
       
        JLabel image1 = new JLabel(images[0]);
        this.imagesLabel[0] = image1;
        this.firstImage = image1;
        ImageIcon img1Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image1_big.jpg")));        
        JLabel image1Big = new JLabel(img1Big);
        this.mapImages.put(image1, image1Big);
        
        JLabel image2 = new JLabel(images[1]);
        this.imagesLabel[1] = image2;
        ImageIcon img2Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image2_big.jpg")));        
        JLabel image2Big = new JLabel(img2Big);
        this.mapImages.put(image2, image2Big);
        
        JLabel image3 = new JLabel(images[2]);
        this.imagesLabel[2] = image3;
        ImageIcon img3Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image3_big.jpg")));        
        JLabel image3Big = new JLabel(img3Big);
        this.mapImages.put(image3, image3Big);
        
        JLabel image4 = new JLabel(images[3]);
        this.imagesLabel[3] = image4;
        ImageIcon img4Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image4_big.jpg")));        
        JLabel image4Big = new JLabel(img4Big);
        this.mapImages.put(image4, image4Big);
        
        JLabel image5 = new JLabel(images[4]);
        this.imagesLabel[4] = image5;
        ImageIcon img5Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image5_big.jpg")));        
        JLabel image5Big = new JLabel(img5Big);
        this.mapImages.put(image5, image5Big);
        
        JLabel image6 = new JLabel(images[5]);
        this.imagesLabel[5] = image6;
        ImageIcon img6Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image6_big.jpg")));        
        JLabel image6Big = new JLabel(img6Big);
        this.mapImages.put(image6, image6Big);
        
        JLabel image7 = new JLabel(images[6]);
        this.imagesLabel[6] = image7;
        ImageIcon img7Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image7_big.jpg")));        
        JLabel image7Big = new JLabel(img7Big);
        this.mapImages.put(image7, image7Big);
        
        JLabel image8 = new JLabel(images[7]);
        this.imagesLabel[7] = image8;
        ImageIcon img8Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image8_big.jpg")));        
        JLabel image8Big = new JLabel(img8Big);
        this.mapImages.put(image8, image8Big);
        
        JLabel image9 = new JLabel(images[8]);
        this.imagesLabel[8] = image9;
        ImageIcon img9Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image9_big.jpg")));        
        JLabel image9Big = new JLabel(img9Big);
        this.mapImages.put(image9, image9Big);
        
        JLabel image10 = new JLabel(images[9]);
        this.imagesLabel[9] = image10;
        ImageIcon img10Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image10_big.jpg")));        
        JLabel image10Big = new JLabel(img10Big);
        this.mapImages.put(image10, image10Big);
        
        JLabel image11 = new JLabel(images[10]);
        this.imagesLabel[10] = image11;
        ImageIcon img11Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image11_big.jpg")));        
        JLabel image11Big = new JLabel(img11Big);
        this.mapImages.put(image11, image11Big);
        
        JLabel image12 = new JLabel(images[11]);
        this.imagesLabel[11] = image12;
        ImageIcon img12Big = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/image12_big.jpg")));        
        JLabel image12Big = new JLabel(img12Big);
        this.mapImages.put(image12, image12Big);
        
        this.mapImagesBig.put(image1Big, image2Big);
        this.mapImagesBig.put(image2Big, image3Big);
        this.mapImagesBig.put(image3Big, image4Big);
        this.mapImagesBig.put(image4Big, image5Big);
        this.mapImagesBig.put(image5Big, image6Big);
        this.mapImagesBig.put(image6Big, image7Big);
        this.mapImagesBig.put(image7Big, image8Big);
        this.mapImagesBig.put(image8Big, image9Big);
        this.mapImagesBig.put(image9Big, image10Big);
        this.mapImagesBig.put(image10Big, image11Big);
        this.mapImagesBig.put(image11Big, image12Big);
        this.mapImagesBig.put(image12Big, image1Big);
        
        for(int i = 0; i < this.imagesLabel.length / 2; i++){
            JLabel temp = this.imagesLabel[i];
            this.imagesLabelInverse[i] = this.imagesLabel[this.imagesLabel.length - i - 1];
            this.imagesLabelInverse[this.imagesLabel.length - i - 1] = temp;
        }
       
        this.displayImage = new JPanel();
        
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
    
    public void enableButtons(){
        this.next.setEnabled(true);
        this.previous.setEnabled(true);
        this.pause.setEnabled(true);
    }
    
    public void disableButtons(){
        this.next.setEnabled(false);
        this.previous.setEnabled(false);
        this.pause.setEnabled(false);
    }
    
    public void createImageDisplay(){ 
        if(this.vignetteActive == null){             
            this.vignetteActive = this.firstImage;
        }        
        this.currentImage = this.mapImages.get(this.vignetteActive);
        this.displayImage.add(this.currentImage);
        this.remove(gridImages);
        this.remove(buttons);
        this.add(this.displayImage, BorderLayout.NORTH);
        this.add(buttons, BorderLayout.SOUTH);        
        this.timerNormal.start();

        validate();
        repaint();     
    }
    
    public void defilementNormal(){
        this.displayImage.remove(this.currentImage);
        this.currentImage = this.mapImagesBig.get(this.currentImage);
        this.displayImage.add(this.currentImage);
        this.add(this.displayImage, BorderLayout.NORTH);
        validate();
        repaint();
    }
    
    public void stopImageDisplay(){
        this.displayImage.remove(this.currentImage);
        this.vignetteActive.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.vignetteActive = null;
        this.currentImage = null;
        System.out.println("Dans stop apres");
        System.out.println(this.currentImage == null);
        this.remove(displayImage);
        this.remove(buttons);
        this.add(gridImages, BorderLayout.NORTH);
        this.add(buttons, BorderLayout.SOUTH);
        timerNormal.stop();
        validate();
        repaint();
    }
    
    public JButton getPlay(){
        return this.play;
    }
    
}
