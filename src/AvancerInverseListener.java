
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
            case 2:
            case 3:
                break;
            case 4 :
                break;
            case 5 :
            case 6 :
            case 7 :
                break;
            case 8 :
                break;
            case 9 :
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
