
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
 * @author Nicolas
 */
public class AvancerInverseListener implements ActionListener{
    
    private JButton previous;
    private GalleryPanel p;
    
    public AvancerInverseListener(JButton previous, GalleryPanel aThis){
        this.previous = previous;
        this.p = aThis;
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         switch (p.etat){
            case 0:
            case 1:
                break;
            case 2:
                if(p.timerNormal.getDelay() == 3000){
                    p.timerInverse.setDelay(2000);
                    p.etat = 4 ;
                    p.getPrevious().setEnabled(true);
                    p.getNext().setEnabled(true);
                }
                break;
            case 3:
                break;
            case 4 :
                if(p.timerInverse.getDelay() == 3000){
                    p.timerInverse.setDelay(2000);
                    p.etat = 8 ;
                    p.getPrevious().setEnabled(true);
                    p.getNext().setEnabled(true);
                }
                break;
            case 5 :
                break;
            case 6 :
                if(p.timerNormal.getDelay() == 2000){
                    p.timerNormal.setDelay(3000);
                    p.etat = 2 ;
                    p.getPrevious().setEnabled(true);
                    p.getNext().setEnabled(true);
                }
                break;
            case 7 :
                if(p.timerNormal.getDelay() == 1000){
                    p.timerNormal.setDelay(2000);
                    p.etat = 6 ;
                    p.getPrevious().setEnabled(true);
                    p.getNext().setEnabled(true);
                }
                break;
            case 8 :
                if(p.timerInverse.getDelay() == 2000){
                    p.timerInverse.setDelay(1000);
                    p.etat = 9 ;
                    p.getPrevious().setEnabled(false);
                    p.getNext().setEnabled(true);
                }
                break;
            case 9 :
            case 10 :
            case 11 :
            case 12 :
            case 13 :
            case 14 :  
                break;
        }
    }
    
}
