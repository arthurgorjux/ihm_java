
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
 * @author Nicolas
 */
public class PauseListener implements ActionListener {
    
    private JButton pause;
    private GalleryPanel p;

    public PauseListener(JButton pause, GalleryPanel aThis){
        this.pause = pause;
        this.p = aThis;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(this.p.etat){
            case 0:
            case 1:
                break;
            case 2:
                this.p.etat = 3;
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.p.getPlay().setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.timerNormal.stop();
                this.p.timerInverse.stop();
                break;
            case 3:
                break;
            case 4:
                this.p.etat = 5;
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.p.getPlay().setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.timerNormal.stop();
                this.p.timerInverse.stop();
                break;
            case 5:
                break;
            case 6:
                this.p.etat = 10;
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.p.getPlay().setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.timerNormal.stop();
                this.p.timerInverse.stop();
                break;
            case 7:
                this.p.etat = 11;
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.p.getPlay().setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.timerNormal.stop();
                this.p.timerInverse.stop();
                break;
            case 8:
                this.p.etat = 12;
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.p.getPlay().setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.timerNormal.stop();
                this.p.timerInverse.stop();
                break;
            case 9:
                this.p.etat = 13;
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.p.getPlay().setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.p.timerNormal.stop();
                this.p.timerInverse.stop();
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
        }
    }
    
}
