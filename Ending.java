import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

 public class Ending {
     private JFrame frame;
     private JOptionPane optionPane;
     
     ImageIcon back = new ImageIcon(getClass().getResource("spons.jpg"));
     JLabel gambarBackground = new JLabel(back);    
     JLabel no = new JLabel("");
     
     public Ending() {
         makeFrame();
         frame.setVisible(true);
        
        }
        
     public void setVisible(boolean visible) {
        frame.setVisible(visible);
     }
        
     private void makeFrame(){
        frame = new JFrame("The End Of Game");
        frame.setSize(950,650);
        frame.setResizable(false);
        komponenVisual();
     }
    
     private void komponenVisual(){
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);
       
        panel.add(no);
        no.setBounds(790,540,150,50);
        no.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        no.addMouseListener(new MouseAdapter() {
                ImageIcon logo4 = new ImageIcon("exit1.png");
                ImageIcon press4 = new ImageIcon ("exit2.png");
                public void mouseClicked(MouseEvent e) {
                    no.setIcon(logo4);
                }
                
                public void mouseEntered(MouseEvent e) {
                    no.setIcon(press4);
                }

                public void mouseExited(MouseEvent e) {
                    no.setIcon(logo4);
                }
                
                public void mousePressed(MouseEvent e) {
                    no.setIcon(press4);
                    frame.setVisible(true);
                    System.exit(0);
                }
            });
        no.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("exit1.png")));
        
        
        panel.add(gambarBackground);
        gambarBackground.setBounds(0,0,950,670); 
     }
    
    
    
}
    
        
     

