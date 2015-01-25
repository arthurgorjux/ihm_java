
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthur
 */
class PlayListener implements ActionListener {

    private JButton play;
    private GalleryPanel p;
    private static boolean stop = false;
    public PlayListener(JButton play, GalleryPanel aThis){
        this.play = play;
        this.p = aThis;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(this.p.etat){
            case 0:
            case 1:
                this.p.createImageDisplay();                
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/pause.png")));
                    this.play.setIcon(stopImg);
                    this.p.enableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 2;
                break;
            case 2:
                this.p.pauseImageDisplayNormal();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.play.setIcon(stopImg);
                    this.p.disableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 3;
                break;
            case 3:
                this.p.replayImageDisplayNormal();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/pause.png")));
                    this.play.setIcon(stopImg);
                    this.p.enableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 2;
                break;
            case 4:
                this.p.pauseImageDisplayInverse();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.play.setIcon(stopImg);
                    this.p.disableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 5;
                break;
            case 5:
                this.p.replayImageDisplayInverse();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/pause.png")));
                    this.play.setIcon(stopImg);
                    this.p.enableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 4;
                break;
            case 6:
               this.p.pauseImageDisplayNormal();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.play.setIcon(stopImg);
                    this.p.disableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }                
                this.p.etat = 10;
                break;
            case 7:
                this.p.pauseImageDisplayNormal();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.play.setIcon(stopImg);
                    this.p.disableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }                
                this.p.etat = 11;
                break;
            case 8:
                this.p.pauseImageDisplayInverse();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.play.setIcon(stopImg);
                    this.p.disableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 12;
                break;
            case 9:
                this.p.pauseImageDisplayInverse();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.play.setIcon(stopImg);
                    this.p.disableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 13;
                break;
            case 10:
                this.p.replayImageDisplayNormal();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/pause.png")));
                    this.play.setIcon(stopImg);
                    this.p.enableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }                
                this.p.etat = 6;
                break;
            case 11:
                this.p.replayImageDisplayNormal();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/pause.png")));
                    this.play.setIcon(stopImg);
                    this.p.getPrevious().setEnabled(true);
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }                
                this.p.etat = 7;
                break;
            case 12:
                this.p.replayImageDisplayInverse();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/pause.png")));
                    this.play.setIcon(stopImg);
                    this.p.enableArrows();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 8;
                break;
            case 13:
                this.p.replayImageDisplayInverse();
                try {
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/pause.png")));
                    this.play.setIcon(stopImg);
                    this.p.getNext().setEnabled(true);
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.p.etat = 9;
                break;
            case 14:
                break;
        }
    }    
}
