
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class TimerInverseListener implements ActionListener{

    Timer timer;
    GalleryPanel panel;
    
    public TimerInverseListener(GalleryPanel aThis, Timer timerInverse) {
        panel = aThis;
        timer = timerInverse;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (panel.etat){
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 4 :
                panel.etat = 4;
                this.panel.defilementInverse();
                break;
            case 5 :
            case 6 :
            case 7 :
                break;
            case 8 :
                panel.etat = 8;
                this.panel.defilementInverse();
                break;
            case 9 :
                panel.etat = 9;
                this.panel.defilementInverse();
                break;
            case 10 :
            case 11 :
            case 12 :
            case 13 :
            case 14 :
                break;               
        }
    }
}
