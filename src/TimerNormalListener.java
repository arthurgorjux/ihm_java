
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
        
    }
    
}
