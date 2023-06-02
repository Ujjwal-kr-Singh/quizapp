
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    
    Score(String name , int score){
         setBounds(350,130,750,550);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Score.png"));
     
     Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,200,300,250);
        
        add(Image);
        
        
        
        
        
        
      JLabel heading = new JLabel("THANK YOU" +   name  + "FOR PLAYING SIMPLE QUIZ");
       heading.setBounds(45, 30, 700, 30);
      heading.setFont(new Font("Serif",Font.PLAIN,26));
    
      
       JLabel Score = new JLabel("YOUR SCORE IS "+ score);
        Score.setBounds(350, 200, 300, 30);
       Score.setFont(new Font("Serif",Font.PLAIN,26));
    
    add(  Score );
    
    
    
    
       JButton submit = new JButton("PLay  again");
          submit.setBounds(380, 270, 120, 30);
         
         
   
          submit.setBackground(new Color(30,144,255));
          submit.setForeground(Color.WHITE);
           submit.addActionListener(this);
         
        add(submit);
        

    setVisible(true);
    
    
    
    
    }
    public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
        new login();
        
    }
    
    
    
    public static void main(String [] args ){
        
    new Score("user",0);
    
    
    
    
    }
}
