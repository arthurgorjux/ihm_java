
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    public PlayListener(JButton play, GalleryPanel aThis) {
        this.play = play;
        this.p = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!stop){
            this.p.createImageDisplay();
            stop = true;
        }else{
            continue;
        }
    }
    
}
