import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

 public class play2{
     private JFrame frame;
     private JOptionPane optionPane;
     
     ImageIcon back = new ImageIcon(getClass().getResource("back3.jpg"));
     JLabel gambarBackground = new JLabel(back);
     ImageIcon gambar = new ImageIcon("sp.png");
     JLabel player = new JLabel(gambar);
     JLabel menu = new JLabel(" ");
     JLabel open = new JLabel(" ");
     int dx=705, dy=100,i;
     JButton atas = new JButton("up");
     JButton bawah = new JButton("down");
     JButton kanan = new JButton("right");
     JButton kiri = new JButton("left");
     JTextArea area = new JTextArea();
     Font font = new Font("", Font.BOLD, 15);
     JPanel panel = new JPanel();
     Timer waktu;
     private Room startingRoom, nextRoom ;
     private Parser parser;
     private Player pemain;
    
     public play2() {
        makeFrame();
        frame.setVisible(true);
        Reaksi();
        createRooms();
        pemain = new Player(startingRoom);
        parser = new Parser();
        }
        
     public void setVisible(boolean visible) {
        frame.setVisible(visible);
     }
        
     private void makeFrame(){
        frame = new JFrame("Pirate of Bikini Bottom");
        frame.setSize(935,705);
        komponenVisual();
        frame.setResizable(false);
         ImageIcon crab = new ImageIcon("pat2.png");
         frame.addWindowListener(new WindowAdapter(){    
                public void windowClosing(WindowEvent e) {
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
                    JOptionPane.showMessageDialog(null,"You must play it...!","Answer",JOptionPane.QUESTION_MESSAGE,crab);
                }
            });
     }
    
     private void komponenVisual(){
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);
       
        panel.add(player);
        player.setBounds(dx,dy,50,100);
        
        panel.add(atas);
        atas.setBounds(44,550,70,20);
        atas.setBackground(Color.cyan);
        atas.setForeground(Color.black);
        atas.setFont(atas.getFont().deriveFont(13.0f));
       
        panel.add(bawah);
        bawah.setBounds(44,600,70,20);
        bawah.setBackground(Color.cyan);
        bawah.setForeground(Color.black);
        bawah.setFont(atas.getFont().deriveFont(13.0f));
        
        panel.add(kiri);
        kiri.setBounds(10,575,70,20);
        kiri.setBackground(Color.cyan);
        kiri.setForeground(Color.black);
        kiri.setFont(atas.getFont().deriveFont(13.0f));
        
        panel.add(kanan);
        kanan.setBounds(90,575,70,20);
        kanan.setBackground(Color.cyan);
        kanan.setForeground(Color.black);
        kanan.setFont(atas.getFont().deriveFont(13.0f));
         
        panel.add(area);
        area.setBounds(1000,0,100,20);
        area.setEditable(false);
        area.setLineWrap(true);
    
        panel.add(open);
        open.setBounds(300,490,60,100);
        open.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        open.addMouseListener(new MouseAdapter() {
                ImageIcon logo1 = new ImageIcon("key2.png");
                ImageIcon press = new ImageIcon("key22.png");
                ImageIcon krab = new ImageIcon("treas.png");
                ImageIcon winn = new ImageIcon("pearl.png");            
                ImageIcon winnn = new ImageIcon("pat2.png");    
                         
                public void mouseClicked(MouseEvent e) {
                    open.setIcon(logo1);
                }

                  public void mouseEntered(MouseEvent e) {
                    open.setIcon(press);
                }

                public void mouseExited(MouseEvent e) {
                    open.setIcon(logo1);
                }
                
                public void mousePressed(MouseEvent e) {
                    open.setIcon(press);
                    frame.setVisible(false);
                      String pass= JOptionPane.showInputDialog("Masukkan Password anda ");
                           if(pass.equals("v15k4")){
                               JOptionPane.showMessageDialog(null,"You Win ! get the Treasure !","Ending",JOptionPane.QUESTION_MESSAGE,krab);
                                Ending en = new Ending();
                            }else{
                                JOptionPane.showMessageDialog(null,"Wrong Password!","Ending",JOptionPane.QUESTION_MESSAGE,winnn);
                                JOptionPane.showMessageDialog(null,"LOSER! Harta Karun milik Mr.Crab","Ending",JOptionPane.QUESTION_MESSAGE,krab);
                            }
                            
                   
                }
            });
        open.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("key2.png")));   
        panel.add(gambarBackground);
        gambarBackground.setBounds(0,0,930,680); 
     }
    
       public void timeKiri () {
        i=0;
 
        ActionListener task = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    i++;
                    player.setBounds(dx-=1,dy,50,70);   
                    atas.setEnabled(false);
                    bawah.setEnabled(false);
                    kanan.setEnabled(false);
                    kiri.setEnabled(false);
                    ImageIcon win0 = new ImageIcon("pearl.png");
                    if(i==100) {
                        waktu.stop();
                        int pos = pemain.getCurrentRoom().getPos();
                        if(pos==1){} 
                        else if(pos==2){} 
                        else if(pos==3){} 
                        else if(pos==4){
                            jebakan();
                            cekDarah();   
                        } 
                        else if(pos==5){}
                        else if(pos==6){}
                        else if(pos==7){}
                        else if(pos==8){}
                        else if(pos==9){}
                        else if(pos==10){}
                        else if(pos==11){
                            jebakan();
                            cekDarah();
                        } 
                        else if(pos==12){}                            
                        else if(pos==15){}   
                        else if(pos==16){}  
                        else if(pos==17){
                            jebakan();
                            cekDarah();   
                        }   
                        else if(pos==18){}    
                        else if(pos==19){} 
                        else if(pos==20){}
                        else if(pos==21){}    
                        else if(pos==22){
                            JOptionPane.showMessageDialog(null,"Congratulation! Pass : v15k4","Ending",JOptionPane.QUESTION_MESSAGE,win0);
                        }   
                        else if(pos==23){}   
                        
                        atas.setEnabled(true);
                        bawah.setEnabled(true);
                        kanan.setEnabled(true);
                        kiri.setEnabled(true);
 
                      } 
                      
                      
                }
            };
        waktu=new Timer(5,task);
        waktu.start();
    }
    
      

     public void timeKanan () {
        i=0;
        ActionListener task = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    i++;
                    player.setBounds(dx+=1,dy,50,70);
                    atas.setEnabled(false);
                    bawah.setEnabled(false);
                    kanan.setEnabled(false);
                    kiri.setEnabled(false);
                    
                    if(i==100) {
                        waktu.stop();
                        int pos = pemain.getCurrentRoom().getPos();
                         if(pos==0){}
                         else if(pos==1){} 
                         else if(pos==2){} 
                         else if(pos==3){}
                         else if(pos==4){}  
                         else if(pos==5){}  
                         else if(pos==6){}  
                         else if(pos==7){
                           jebakan();
                           cekDarah();
                         }
                         else if(pos==8){}
                         else if(pos==10){} 
                         else if(pos==11){
                             jebakan();
                            cekDarah();
                         } 
                         else if(pos==12){} 
                         else if(pos==13){}
                         else if(pos==14){}
                         else if(pos==15){}   
                         else if(pos==16){}    
                         else if(pos==17){
                            jebakan();
                            cekDarah();
                         }    
                         else if(pos==18){}
                         else if(pos==21){}   
                         else if(pos==22){}  
                         else if(pos==23){}
                         else if(pos==24){}
 
                        atas.setEnabled(true);
                        bawah.setEnabled(true);
                        kanan.setEnabled(true);
                        kiri.setEnabled(true);
 
                    }

                }
            };
        waktu=new Timer(5,task);
        waktu.start();
    }
    
    public void timeBawah() {
        i=0;
        ActionListener task = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    i++;
                    player.setBounds(dx,dy+=1,50,70);
                    atas.setEnabled(false);
                    bawah.setEnabled(false);
                    kanan.setEnabled(false);
                    kiri.setEnabled(false);
                    
                    if(i==100) {
                        waktu.stop();
                        int pos = pemain.getCurrentRoom().getPos();
                         if(pos==4){}   
                         else if(pos==8){}
                         else if(pos==13){
                             jebakan();
                             cekDarah();
                         }
                         else if(pos==19){}
                         
                        atas.setEnabled(true);
                        bawah.setEnabled(true);
                        kanan.setEnabled(true);
                        kiri.setEnabled(true);
 
                    }
                }
            };
        waktu=new Timer(5,task);
        waktu.start();
        
    }
        

     public void timeAtas () {
        i=0;
        ActionListener task = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    i++;
                    
                    player.setBounds(dx,dy-=1,50,70);
                    atas.setEnabled(false);
                    bawah.setEnabled(false);
                    kanan.setEnabled(false);
                    kiri.setEnabled(false);
 
                    if(i==100) {
                        waktu.stop();
                        int pos = pemain.getCurrentRoom().getPos();
                        
                        if(pos==5){}
                        else if(pos==9){}   
                        else if(pos==14){
                            jebakan();
                            cekDarah();
                        }   
                        else if(pos==20){}
                        atas.setEnabled(true);
                        bawah.setEnabled(true);
                        kanan.setEnabled(true);
                        kiri.setEnabled(true);
 
                    }
                }
            };
        waktu=new Timer(5,task);
        waktu.start();
    }
     
     
     
      private void createRooms()
    {
        Room awal, ruang1, ruang2, ruang3, ruang4, ruang5, ruang6, ruang7, ruang8, ruang9, ruang10, ruang11, ruang12, ruang13, ruang14, ruang15, ruang16,ruang17, ruang18, ruang19, ruang20, ruang21, ruang22, ruang23, ruang24;
        Room ruang25, ruang26, ruang27, ruang28, ruang29, ruang30, ruang31, ruang32, ruang33, ruang34, ruang35;
        Room ruang36, ruang37, ruang38, ruang39, ruang40, ruang41, ruang42;
        
        awal = new Room("",0);
        ruang1 = new Room("",1);
        ruang2 = new Room("",2);
        ruang3 = new Room("",3);
        ruang4 = new Room("",4);
        ruang5 = new Room("",5);
        ruang6 = new Room("",6);
        ruang7 = new Room("",7);
        ruang8 = new Room("",8);
        ruang9 = new Room("",9);
        ruang10 = new Room("",10);
        ruang11 = new Room("",11);
        ruang12 = new Room("",12);
        ruang13 = new Room("",13);
        ruang14 = new Room("",14);
        ruang15 = new Room("",15);
        ruang16 = new Room("",16);
        ruang17 = new Room("",17);
        ruang18 = new Room("",18);
        ruang19 = new Room("",19);
        ruang20 = new Room("",20);
        ruang21 = new Room("",21);
        ruang22 = new Room("",22);
        ruang23 = new Room("",23);
        ruang24 = new Room("",24);
        ruang25 = new Room("",25);
        ruang26 = new Room("",26);
        ruang27 = new Room("",27);
        ruang28 = new Room("",28);
        ruang29 = new Room("",29);
        ruang30 = new Room("",30);
        ruang31 = new Room("",31);
        ruang32 = new Room("",32);
        ruang33 = new Room("",33);
        ruang34 = new Room("",34);
        ruang35 = new Room("",35);
        ruang36 = new Room("",36); 
        ruang37 = new Room("",37); 
        ruang38 = new Room("",38); 
        ruang39 = new Room("",39);
        ruang40 = new Room("",40);
        ruang41 = new Room("",41);
        ruang42 = new Room("",42);
          
        awal.setExit("left",ruang1);
        ruang1.setExit("right",awal);    
        ruang1.setExit("left",ruang2);
        ruang2.setExit("right",ruang1);    
        ruang2.setExit("left",ruang3);
        ruang3.setExit("right",ruang2);    
        ruang3.setExit("left",ruang4);
        ruang4.setExit("right",ruang3);    
        ruang4.setExit("down",ruang5);
        ruang5.setExit("up",ruang4); 
        ruang5.setExit("right",ruang6);
        ruang6.setExit("left",ruang5); 
        ruang6.setExit("right",ruang7);
        ruang7.setExit("left",ruang6); 
        ruang7.setExit("right",ruang8);
        ruang8.setExit("left",ruang7); 
        ruang8.setExit("down",ruang9);
        ruang9.setExit("up",ruang8); 
        ruang9.setExit("left",ruang10);    
        ruang10.setExit("right",ruang9);              
        ruang10.setExit("left",ruang11);    
        ruang11.setExit("right",ruang10);     
        ruang11.setExit("left",ruang12);    
        ruang12.setExit("right",ruang11);       
        ruang12.setExit("left",ruang13);    
        ruang13.setExit("right",ruang12);
        ruang13.setExit("down",ruang14);
        ruang14.setExit("up",ruang13); 
        ruang14.setExit("right",ruang15);     
        ruang15.setExit("left",ruang14); 
        ruang15.setExit("right",ruang16);     
        ruang16.setExit("left",ruang15); 
        ruang16.setExit("right",ruang17);     
        ruang17.setExit("left",ruang16); 
        ruang17.setExit("right",ruang18);     
        ruang18.setExit("left",ruang17); 
        ruang18.setExit("right",ruang19);     
        ruang19.setExit("left",ruang18); 
        
        ruang19.setExit("down",ruang20);
        ruang20.setExit("up",ruang19); 
        
        ruang20.setExit("left",ruang21);     
        ruang21.setExit("right",ruang20);  
        ruang21.setExit("left",ruang22);     
        ruang22.setExit("right",ruang21);  
        ruang22.setExit("left",ruang23);     
        ruang23.setExit("right",ruang22);  
        ruang23.setExit("left",ruang24);     
        ruang24.setExit("right",ruang23);  
        
        startingRoom = awal;  // start game outside
    }
    
   
    public void jebakan(){

        ImageIcon q1 = new ImageIcon("s1.png");
        ImageIcon q2 = new ImageIcon("s2.png");
        ImageIcon q3 = new ImageIcon("s3.png");
        ImageIcon q4 = new ImageIcon("s4.png");
        ImageIcon q5 = new ImageIcon("s11.png");
        ImageIcon q6 = new ImageIcon("s6.png");
        ImageIcon q7 = new ImageIcon("s7.png");
        ImageIcon q8 = new ImageIcon("s8.png");
        ImageIcon q9 = new ImageIcon("s9.png");
        ImageIcon q10 = new ImageIcon("s10.png");
        ImageIcon win = new ImageIcon("pat.png");
        ImageIcon win1 = new ImageIcon("pearl.png");
        ImageIcon win2 = new ImageIcon("sandyy.png");
        ImageIcon lose = new ImageIcon("treas.png");
        ImageIcon lose1 = new ImageIcon("pat2.png");
       
        int j = (int)(Math.random()*10);
            if(j==1){
                String jawab = JOptionPane.showInputDialog(q1);
                if(jawab.equals("pyongyang") || jawab.equals("PYONGYANG")){
                    JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win);
                }else{
                    JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                       pemain.kurangiDarah();
                }
            }
             
            else if(j==2){
                String jawab = JOptionPane.showInputDialog(q2);
                if(jawab.equals("seoul") || jawab.equals("SEOUL")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                pemain.kurangiDarah();
                }
            }
            else if(j==3){
                String jawab = JOptionPane.showInputDialog(q3);
                if(jawab.equals("korea selatan") || jawab.equals("KOREA SELATAN")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win2);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                   pemain.kurangiDarah();
                }
            }
            
             else if(j==4){
                String jawab = JOptionPane.showInputDialog(q4);
                if(jawab.equals("uranus") || jawab.equals("URANUS")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win2);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                   pemain.kurangiDarah();
                }
            }
            
             else if(j==5){
                String jawab = JOptionPane.showInputDialog(q5);
                if(jawab.equals("bill gates") || jawab.equals("BILL GATES")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win2);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                   pemain.kurangiDarah();
                }
            }

             else if(j==6){
                String jawab = JOptionPane.showInputDialog(q6);
                if(jawab.equals("walt disney") || jawab.equals("WALT DISNEY")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
              
                   pemain.kurangiDarah();
                }
            }
            
             else if(j==7){
                String jawab = JOptionPane.showInputDialog(q7);
                if(jawab.equals("piranha") || jawab.equals("PIRANHA")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                pemain.kurangiDarah();
                }
            }
               else if(j==8){
                String jawab = JOptionPane.showInputDialog(q8);
                if(jawab.equals("paris") || jawab.equals("PARIS")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win2);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                pemain.kurangiDarah();
                }
            }
               else if(j==9){
                String jawab = JOptionPane.showInputDialog(q9);
                if(jawab.equals("luwak") || jawab.equals("LUWAK")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                pemain.kurangiDarah();
                }
            }
               else if(j==10){
                String jawab = JOptionPane.showInputDialog(q10);
                if(jawab.equals("titanic") || jawab.equals("TITANIC")){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar","Answer",JOptionPane.QUESTION_MESSAGE,win2);
                }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah! darah anda akan dikurangi 1","Answer",JOptionPane.QUESTION_MESSAGE,lose1);
                pemain.kurangiDarah();
                }
            }
        }
    
        public void cekDarah(){
        JLabel patty = new JLabel (" ");
        if(pemain.getDarah() == 3){
          patty.setIcon(new ImageIcon("darah1.jpg"));
          panel.add(patty);
          patty.setBounds(10,10,300,100);
        }  
        if(pemain.getDarah() == 2){
          patty.setIcon(new ImageIcon("darah2.jpg"));
          panel.add(patty);
          patty.setBounds(10,10,300,100);
        }
        else if(pemain.getDarah() == 1){
          patty.setIcon(new ImageIcon("darah3.jpg"));
          panel.add(patty);
          patty.setBounds(10,10,300,100);
        }
        else if(pemain.getDarah() == 0){
            JOptionPane.showMessageDialog(null,"GAME OVER");
              System.exit(0);
        }
    }
    
       public String printWelcome()
    {
        String welcome = "";
        
        welcome += pemain.getCurrentRoom().getLongDescription();
        //System.out.print(welcome);
        return welcome;

    }

 
      public String goRoom(Command command) 
    {
        String room = "";
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            room = "";
            //System.out.println(room);
            return room;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        nextRoom = pemain.getCurrentRoom().getExit(direction);

        if (nextRoom == null) {
            room = "";
        }
        else {
            pemain.setCurrentRoom(nextRoom);
            room = pemain.getCurrentRoom().getLongDescription();
        }
        //System.out.println(room);
        return room;
    }
 
      public String quit(Command command) 
    {
        String response = "";
        if(command.hasSecondWord()) {
            response = "";
            //System.out.println(response);
        }
        return response;
    }

    public String go(String direction) {
        return goRoom(new Command(CommandWord.GO, direction));        
    }
    
    
     public void Reaksi()
    {
             bawah.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   area.setText(go("down"));
                    if(nextRoom==null) {
                        JOptionPane.showMessageDialog(null,"No Door");
                    } 
                     else {
                        timeBawah();
                    }
                }
            });
            
            
             kanan.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    area.setText(go("right"));
                    if(nextRoom==null) {
                        JOptionPane.showMessageDialog(null,"No Door");
                    }
                    else {
                        timeKanan();
                    }
                }

            }); 
            
              atas.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    area. setText(go("up"));
                    if(nextRoom==null) {
                        JOptionPane.showMessageDialog(null,"No Door");
                    }
                    else {
                        timeAtas();
                    }

                }
            });
               kiri.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    area.setText(go("left"));
                    if(nextRoom==null) {
                        JOptionPane.showMessageDialog(null,"No Door");
                    }
                    else  {
                        timeKiri();
                    }
                   
                    
                }

            }); 
          
       
    }
     
}
    
        
     

