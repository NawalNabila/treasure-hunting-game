
/**
 * Cerita permulaan game 
 * 
 * @author (Kelompok 10) 
 * @version (5 Jan 2016)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Story
{
    private JFrame frame;
    private JOptionPane optionpane;
    
    ImageIcon background = new ImageIcon(getClass().getResource("pulauu.jpg"));
    JLabel Background = new JLabel(background);
    
    JLabel story = new JLabel("Hello Aku bajak laut dari Bikini Bottom");
    JLabel story1 = new JLabel("Namaku adalah Spongebob.");
    JLabel story2 = new JLabel("Aku punya misi untuk menemukan harta karun");
    JLabel story3 = new JLabel("Aku butuh bantuanmu untuk menjawab teka-teki dari Mr.Crab");
    JLabel story4 = new JLabel("Jika kamu bisa menjawab kamu berhasil mencapai ending");
    JLabel story5 = new JLabel("Dan mendapatkan harta karun");
    JLabel story7 = new JLabel("Let's Get The Treasure");
    JLabel play = new JLabel(" ");
    
       
    public Story(){
        makeFrame();
        frame.setVisible(true);
        
    }
    
    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }
    
    private void makeFrame(){
        frame = new JFrame("Pirate of Bikini Bottom");
        frame.setSize(920,650);
        komponenVisual();
    }
    
    private void komponenVisual(){
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);
        
        panel.add(story);
        story.setBounds(50,10,750,60);
        story.setForeground(Color.black);
        story.setFont(new Font("SketchBones", Font.BOLD,30));
        
        panel.add(story1);
        story1.setBounds(50,60,700,50);
        story1.setForeground(Color.black);
        story1.setFont(new Font("SketchBones", Font.BOLD,20));
               
        panel.add(story2);
        story2.setBounds(50,95,700,70);
        story2.setForeground(Color.black);
        story2.setFont(new Font("SketchBones", Font.BOLD,20));
        
        panel.add(story3);
        story3.setBounds(50,145,700,70);
        story3.setForeground(Color.black);
        story3.setFont(new Font("SketchBones", Font.BOLD,20));
        
        panel.add(story4);
        story4.setBounds(50,195,800,70);
        story4.setForeground(Color.black);
        story4.setFont(new Font("SketchBones", Font.BOLD,20));
        
        panel.add(story5);
        story5.setBounds(260,245,700,70);
        story5.setForeground(Color.black);
        story5.setFont(new Font("SketchBones", Font.BOLD,20));
        
        panel.add(story7);
        story7.setBounds(180,430,700,70);
        story7.setForeground(Color.black);
        story7.setFont(new Font("SketchBones", Font.BOLD,40));
        
        JLabel logo1 = new JLabel("");
        logo1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("spons.png")));
        panel.add(logo1); 
        logo1.setBounds(15,325,200,250);
                
        JLabel logo3 = new JLabel("");
        logo3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("crab1.png")));
        panel.add(logo3); 
        logo3.setBounds(665,270,200,250);
       
        /** Action Listener jika menekan tombol play
         *  akan muncul frame baru ke menu utama
         */
        
        panel.add(play);
        play.setBounds(750,540,150,50);
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
                    play2 playy = new play2();
                    frame.setVisible(false);
                }
            });
        play.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("play.png")));
        
        panel.add(Background);
        Background.setBounds(0,0,905,620);
    }
    
}
