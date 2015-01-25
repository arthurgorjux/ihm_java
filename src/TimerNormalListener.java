
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
 * @author arthur
 */
class TimerNormalListener implements ActionListener {

    Timer timer;
    GalleryPanel panel;
    
    public TimerNormalListener(GalleryPanel aThis, Timer timerNormal) {
        panel = aThis;
        timer = timerNormal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (panel.etat){
            case 0:
            case 1:
                break;
            case 2:
                panel.etat = 2;
                this.panel.defilementNormal();
                break;
            case 3:
            case 4 :
            case 5 :
                break;
            case 6 :
                panel.etat = 6;
                this.panel.defilementNormal();
                break;
            case 7 :
                panel.etat = 7;
                this.panel.defilementNormal();
                break;
            case 8 :
            case 9 :
            case 10 :
            case 11 :
            case 12 :
            case 13 :
                break;               
        }

        
    }
    
}
