package hadiahteoripbo;

import javax.swing.*;
 import java.awt.event.*;
public abstract class teoripert9 implements ActionListener{

private static void createAndShowGUI () {
JFrame frame = new JFrame ("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setBounds (400,400, 400, 400); 
frame.getContentPane().setLayout(null);
JButton butt=new JButton("Munculkan Nama"); 
frame.getContentPane().add(butt);
butt.setBounds (20, 20, 200, 20);

JButton butt1=new JButton("Munculkan NIM");
frame.getContentPane().add(butt1);
butt1.setBounds (20, 70, 200, 20);

JButton butt2=new JButton("Munculkan Alamat");
frame.getContentPane().add(butt2);
butt2.setBounds (20, 120, 200, 20);


 final teoripert9 label;
        label = new teoripert9() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
            
        };
        
      
           label.label1 = new JLabel();
           label.label1.setBounds(20, 40, 200, 20);
           frame.getContentPane().add(label.label1);
        
    
           label.label2 = new JLabel();
           label.label2.setBounds(20, 90, 200, 20);
           frame.getContentPane().add(label.label2);
 

           label.label3 = new JLabel();
           label.label3.setBounds(20, 140, 200, 20);
           frame.getContentPane().add(label.label3);           
        
    
        butt.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                label.actionPerformed1();
            };
            
        });
        
      
        butt1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                label.actionPerformed2();
            };
            
        });
        
        butt2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                label.actionPerformed3();
            };
            
        });
      
        
        frame.setVisible(true);
        
    }
    
  
    public void actionPerformed1(){
     
        label1.setText("Ronaldo Yusuf");
    }      
  
    public void actionPerformed2(){
       
        label2.setText("51019018");
    }    

    public void actionPerformed3(){
       
        label3.setText("Jl.AbdulKadirKompHartacoBlok1AL");
    }    
    
    
    public static void main(String[] args) {
   
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    

JLabel label1, label2, label3; 
}
