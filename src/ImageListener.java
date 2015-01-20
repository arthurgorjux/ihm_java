
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthur
 */
class ImageListener implements MouseListener {

    private JLabel image;
    private GalleryPanel p;
    private static boolean use = false;
    private static JLabel imageTemp;
    public ImageListener(JLabel imageL, GalleryPanel p) {
        this.image = imageL;
        this.p = p;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount() == 2){
            this.image.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            p.setVignetteActive(this.image);
            p.createImageDisplay();
        }
        if(!use){
            this.image.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            this.imageTemp = this.image;
            use = true;
            p.setVignetteActive(this.image);
        }else{
            if(this.imageTemp != this.image){
                this.imageTemp.setBorder(new EmptyBorder(0, 0, 0, 0));
                this.image.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                this.imageTemp = this.image;
                use = true;
                p.setVignetteActive(this.image);
            }else{
                this.image.setBorder(new EmptyBorder(0, 0, 0, 0));
                this.use = false;
                p.setVignetteActive(null);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
