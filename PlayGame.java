
/**
 * Play Game
 * 
 * @author (Kelompok 10) 
 * @version (5 Jan 2016)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class PlayGame
{
    private JFrame frame;
    private JOptionPane optionpane;
    
    ImageIcon background = new ImageIcon(getClass().getResource("pulauu.jpg"));
    JLabel Background = new JLabel(background);
    
    JLabel kata = new JLabel("THE PIRATE OF BIKINI BOTTOM");
       
    JLabel nama = new JLabel(" Design by Nabil Mardi Yeni ");
    
    JLabel play = new JLabel(" ");
    
    JLabel exit = new JLabel(" ");
    
       
    public PlayGame(){
        makeFrame();
        frame.setVisible(true);
        
    }
    
    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }
    
    private void makeFrame(){
        frame = new JFrame("Pirate of Bikini Bottom");
        frame.setSize(900,650);
        frame.setResizable(false);
        komponenVisual();
    }
    
    private void komponenVisual(){
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);
        
        panel.add(kata);
        kata.setBounds(80,20,800,70);
        kata.setForeground(Color.black);
        kata.setFont(new Font("SketchBones", Font.BOLD,40));
               
        panel.add(nama);
        nama.setBounds(20,570,400,30);
        nama.setForeground(Color.black);
        nama.setFont(new Font("SketchBones", Font.BOLD,15));
        
        JLabel logo1 = new JLabel("");
        logo1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("spons.png")));
        panel.add(logo1); 
        logo1.setBounds(90,190,200,250);
        
        JLabel logo2 = new JLabel("");
        logo2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("patrik.png")));
        panel.add(logo2); 
        logo2.setBounds(270,120,200,250);
        
        JLabel logo3 = new JLabel("");
        logo3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("plankton.png")));
        panel.add(logo3); 
        logo3.setBounds(350,280,200,250);
        
        JLabel logo4 = new JLabel("");
        logo4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("squid.png")));
        panel.add(logo4); 
        logo4.setBounds(500,130,200,300);
        
        JLabel logo5 = new JLabel("");
        logo5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("sandy.png")));
        panel.add(logo5); 
        logo5.setBounds(550,130,200,300);
        
        JLabel logo6 = new JLabel("");
        logo6.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("crab.png")));
        panel.add(logo6); 
        logo6.setBounds(654,280,200,300);
        
        /** Action Listener jika menekan tombol play
         *  akan muncul frame baru ke story
         */

        panel.add(play);
        play.setBounds(500,540,150,50);
        play.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        play.addMouseListener(new MouseAdapter() {
                ImageIcon logo1 = new ImageIcon("play.png");
                ImageIcon press1 = new ImageIcon ("play1.png");
                public void mouseClicked(MouseEvent e) {
                    play.setIcon(logo1);
                }
                
                public void mouseEntered(MouseEvent e) {
                    play.setIcon(press1);
                }

                public void mouseExited(MouseEvent e) {
                    play.setIcon(logo1);
                }
                
                public void mousePressed(MouseEvent e) {
                    play.setIcon(press1);
                    frame.setVisible(true);
                    Story stor = new Story();
                    frame.setVisible(false);
                }
            });
        play.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("play.png")));
        
        /** Action Listener jika menekan tombol exit
         *  game akan di close
         */
        
        panel.add(exit);
        exit.setBounds(700,540,150,50);
        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exit.addMouseListener(new MouseAdapter() {
                ImageIcon logo2 = new ImageIcon("exit1.png");
                ImageIcon press2 = new ImageIcon ("exit2.png");
                public void mouseClicked(MouseEvent e) {
                    exit.setIcon(logo2);
                }
                
                public void mouseEntered(MouseEvent e) {
                    exit.setIcon(press2);
                }

                public void mouseExited(MouseEvent e) {
                    exit.setIcon(logo2);
                }
                
                public void mousePressed(MouseEvent e) {
                    exit.setIcon(press2);
                    frame.setVisible(true);
                    System.exit(0);
                }
            });
        exit.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("exit1.png")));
        
        panel.add(Background);
        Background.setBounds(0,0,905,620);
    }
    
}
