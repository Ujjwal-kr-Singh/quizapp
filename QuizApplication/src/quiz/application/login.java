
package quiz.application;
import quiz.application.Rules;
import javax.swing.*;
import java.awt.*;
 
import java.awt.event.*;


public class login extends JFrame  implements ActionListener{
    JButton rules ,Back;
    JTextField tfname;
    
    

    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
      // image  
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel Image = new JLabel(i1);
        Image.setBounds(0,0,600,500);
        
        add(Image);
        // heading 
        JLabel heading = new JLabel("Simple minds ");
        heading.setBounds(750, 60, 300, 50);
        
        
        heading.setFont(new Font("Monospaced",Font.BOLD,35));
        //heading.setForeground(Color.BLUE);
        heading.setForeground(new Color(30,144,254));
       add(heading);
       
       
       
       JLabel name = new JLabel("Enter Your Name ");
        name.setBounds(810, 150, 300, 20);
        
        
        name.setFont(new Font("SansSerif",Font.BOLD,18));
        //heading.setForeground(Color.BLUE);
        name.setForeground(new Color(30,144,254));
       add(name);
        tfname = new JTextField();
       tfname.setBounds(735,200,300,25);
       tfname.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(tfname);
        
         rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        
        add(rules);
        
          Back = new JButton("Back");
        Back.setBounds(900,270,120,25);
        Back.setBackground(new Color(30,144,254));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        
        add(Back);
        
        
        
        
         
        
        
        
        setSize(1200,500);
      setLocation(200,120);
      
     setVisible(true);
     
        
        
        
    }
    public void actionPerformed(ActionEvent e){
    
        
        
        if(e.getSource()==rules){
            String name = tfname.getText();
            
            setVisible(false);
              new Rules(name);
              
}
        else if (e.getSource()==Back){
            setVisible(false);
        }    
    }
    
   public static void main(String[] args){
       
        
    new login(); // anonyms object
    
   }
   
}

