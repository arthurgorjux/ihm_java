
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
                    ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/stop.png")));
                    this.play.setIcon(stopImg);
                    this.p.enableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.etat = 2;
                break;
            case 2:
                this.p.stopImageDisplay();
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.play.setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.etat = 0;
        }
        /*if(!stop){
            this.p.createImageDisplay();
            stop = true;            
            try {
                ImageIcon stopImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/stop.png")));
                this.play.setIcon(stopImg);
                this.p.enableButtons();
                this.p.repaint();
            } catch (IOException ex) {
                Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            this.p.stopImageDisplay();
            stop = false;
            try {
                ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                this.play.setIcon(playImg);
                this.p.disableButtons();
                this.p.repaint();
            } catch (IOException ex) {
                Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }*/
    }    
}
