
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
public class StopListener implements ActionListener {
    
    private JButton stop;
    private GalleryPanel p;

    public StopListener(JButton stop, GalleryPanel aThis){
        this.stop = stop;
        this.p = aThis;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(this.p.etat){
            case 0:
            case 1:
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                this.p.stopImageDisplay();
                this.p.disableButtons();
                this.p.etat = 0;
                try {
                    ImageIcon playImg = new ImageIcon(ImageIO.read(getClass().getResource("/IMG/play.png")));
                    this.p.getPlay().setIcon(playImg);
                    this.p.disableButtons();
                    this.p.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(PlayListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }
    
}
