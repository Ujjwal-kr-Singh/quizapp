
package quiz.application;
import javax.swing.*;
import java.awt.*;
 import java.awt.event.*;

public class quiz  extends JFrame implements ActionListener {
    String questions[][]= new String[10][5];
    String answer[][] = new String[10][1];
    JLabel Qno,Question;
    
    JButton next,submit,lifeline;
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer = 15;  
    public static  int ans_given = 0;
    public static int score = 0;
    
     ButtonGroup  groupoptions;
     String useranswer[][] = new String[10][1];
     public static int count =0;

     
    
    
String name;

    quiz(String username){
        this.name = name;
        
        setBounds(10,0,1440,850);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel Image = new JLabel(i1);
        Image.setBounds(0,0,1440,391);
        
        add(Image);
        
         Qno = new JLabel();
       Qno.setBounds(100, 450, 50, 30);
       Qno.setFont(new Font("Serif",Font.PLAIN,24));
    
    add(Qno);
    
    
    
     Question = new JLabel();
       Question.setBounds(150, 450, 1000, 30);
       Question.setFont(new Font("SansSerif",Font.PLAIN,24));
    
    add(Question);
 questions[0][0]="Endermen can be damaged in several ways. Which of the following has been made up?";
questions[0][1]="Melee attacks";
questions[0][2]="SPlash water";
questions[0][3]=" Rolled up newspaper";
questions[0][4]="Rain";


questions[1][0]="How do you make a large chest?";
questions[1][1]="Put 2 chest next to each  other";
questions[1][2]="You have to  buy them";
questions[1][3]="You have to find bigger cheset and  make it smaller";
questions[1][4]=" put 3 chest to each other";

questions[2][0]="How many blocks of iron ore does it take to make one iron ingot?";
questions[2][0]="1";
questions[2][0]="2";
questions[2][0]="3";
questions[2][0]="What's an iron ingot?";

questions[3][0]="What are Creepers scared of?";
questions[3][1]="cow";
questions[3][2]="cat";
questions[3][3]="wolf";
questions[3][4]="pig";

questions[4][0]="What can you wear to stop an Enderman attacking you?";
questions[4][1]="A turnip";
questions[4][2]="A cabbage";
questions[4][3]="A potato";
questions[4][4]="A pumpkin";

questions[5][0]="How is a Charged Creeper created?";
questions[5][1]="When a creeper eats a plate of rocks";
questions[5][2]="When a creeper collects a battery";
questions[5][3]="When lightning strikes within four blocks of a creeper";
questions[5][4]="Even the game's creators can't explain";


questions[6][0]="Which of these consoles can you play Minecraft on?";
questions[6][1]="Computer Versions (Windows, Mac OS X, and Linux)";
questions[6][2]="Xbox 360/Xbox One";
questions[6][3]="Mobile";
questions[6][4]="All of these";


questions[7][0]="Who is the Endermen's leader?";
questions[7][1]="Enya";
questions[7][2]="Ender Dragon";
questions[7][3]="Ender King";
questions[7][4]="Donald Trump";

questions[8][0]="How do you make obsidian?";
questions[8][1]="Mix wood and iron";
questions[8][2]="Mix iron and lava";
questions[8][3]="Mix water and diamonds";
questions[8][4]="Mix water and lava";



questions[9][0]="What ore can you build complicated machines with";
questions[9][1]="Bluestone";
questions[9][2]="Redstone";
questions[9][3]="Gold";
questions[9][4]="Obsidian";




answer[0][0]="Rain";
answer[1][0]="Put 2 chest next to each  other";
answer[2][0]="1";
answer[3][0]="cat";
answer[4][0]="A pumpkin";
answer[5][0]="When lightning strikes within four blocks of a creeper";
answer[6][0]="ALL the above";
answer[7][0]="Ender Dragon";
answer[8][0]="Mix water and lava";
answer[9][0]="Redstone";

 opt1= new JRadioButton();


   opt1.setBounds(170, 520, 700, 30);
    opt1.setBackground(Color.WHITE);
    opt1.setFont(new Font("SansSerif", Font.BOLD,18));
    add(opt1);
    
     opt2= new JRadioButton();


   opt2.setBounds(170, 560, 700, 30);
    opt2.setBackground(Color.WHITE);
    opt2.setFont(new Font("SansSerif", Font.BOLD,18));
    add(opt2);
    
     opt3= new JRadioButton();


   opt3.setBounds(170, 600, 700, 30);
    opt3.setBackground(Color.WHITE);
    opt3.setFont(new Font("SansSerif", Font.BOLD,18));
    add(opt3);
    
    opt4= new JRadioButton();


   opt4.setBounds(170, 640, 700, 30);
    opt4.setBackground(Color.WHITE);
    opt4.setFont(new Font("SansSerif", Font.BOLD,18));
    add(opt4);
    
    
    
      groupoptions = new ButtonGroup();
    
     groupoptions.add(opt1);
      groupoptions.add(opt2);
       groupoptions.add(opt3);
        groupoptions.add(opt4);
      next = new JButton("next");
         next.setBounds(1000, 500, 200, 40);
         
         
         next.setFont(new Font("Tahoma",Font.BOLD,22));
         next.setBackground(new Color(30,144,255));
         next.setForeground(Color.WHITE);
         next.addActionListener(this);
         
         
         add(next);
         
            lifeline = new JButton("Lifeline");
         lifeline.setBounds(1000, 550, 200, 40);
         
         
         lifeline.setFont(new Font("Tahoma",Font.BOLD,22));
         lifeline.setBackground(new Color(30,144,255));
         lifeline.setForeground(Color.WHITE);
          lifeline.addActionListener(this);
         
         
         add(lifeline);
         
               submit = new JButton("Submit");
     submit.setBounds(1000, 600, 200, 40);
         
         
        submit.setFont(new Font("Tahoma",Font.BOLD,22));
          submit.setBackground(new Color(30,144,255));
          submit.setForeground(Color.WHITE);
          submit.setEnabled(false);
             submit.addActionListener(this);
         
         add( submit);
         
         
         
         
         start(count);
         
    
    
    
    setVisible(true);
   
    
    }
    
     public void actionPerformed(ActionEvent e){
         
         if(e.getSource()==next){
             
             repaint();
           opt1.setEnabled(true);
         opt2.setEnabled(true);
          opt3.setEnabled(true);
           opt4.setEnabled(true);
             ans_given=1;
              if(groupoptions.getSelection()==null){
             useranswer[count][0]="";
         }
         else
         {
             
            useranswer[count][0]= groupoptions.getSelection().getActionCommand();
         }
              if(count==8){             
              next.setEnabled(false);
              submit.setEnabled(true);
              
              
              
              }
             count++;
             start(count);
             
         
         
         }
         else if(e.getSource()==lifeline){
             
             
             if(count==2 || count==4 ||count==6 ||count==8||count==9){
             opt2.setEnabled(false);
             opt3.setEnabled(false);
             
             }
             else{ 
                 
                 opt1.setEnabled(false);
                 opt4.setEnabled(false);
             }
         
         
         lifeline.setEnabled(false);
         }
         else if(e.getSource()==submit){
            ans_given = 1;
            
             
             
                 if(groupoptions.getSelection()==null){
             useranswer[count][0]="";
         }
         else
         {
             
            useranswer[count][0]= groupoptions.getSelection().getActionCommand();
            
             
         }
                  for( int i =0;i<useranswer.length;i++){
                      if(useranswer[i][0].equals(answer[i][1])){
                  score+=10;
                       }
                  
                    }
                  
                  setVisible(false);
                  
                  
                    new Score( name,score);
                    
                
                  
               // score
         }
    
         
}
    
     public void paint(Graphics g){
         super.paint(g);
         String time = "Time left-" +timer + " seconds";// 15 
         g.setColor(Color.RED);
         g.setFont(new Font("SansSerif",Font.BOLD,24));
         if(timer>0){
            
         g.drawString(time, 1000, 450);
         }
         
         
         else{
         
          g.drawString("Times UP!", 1000, 500);
         
         
         
         }
         timer--;
       try {         
       
       Thread.sleep(1000);
       repaint();
       
       }catch(Exception e){
       
       e.printStackTrace();
       
       }
         
         
         if(ans_given==1){
         ans_given=0 ;
          timer = 15;
           
         
         }
         else if ( timer<0){
         timer = 15;
         
         opt1.setEnabled(true);
         opt2.setEnabled(true);
          opt3.setEnabled(true);
           opt4.setEnabled(true);
             if(count==8){             
              next.setEnabled(false);
              submit.setEnabled(true);
             }
              if (count ==9){ // submit button
                  if(groupoptions.getSelection()==null){
             useranswer[count][0]="";
         }
         else
         {
             
            useranswer[count][0]= groupoptions.getSelection().getActionCommand();
            
             
         }
                  for( int i =0;i<useranswer.length;i++){
                  
                  if(useranswer[i][0].equals(answer[i][1])){
                  
                  score+=10;
                  
                  
                  }
                  
                   
                  
                  }
                  
                  setVisible(false);
                  new Score(name, score);
                  
                  
              } else{ // next button 
                  
              
             
      
         
         if(groupoptions.getSelection()==null){
             useranswer[count][0]="";
         }
         else
         {
             
            useranswer[count][0]= groupoptions.getSelection().getActionCommand();
            
             
         }
         count++;/// intial =0
         start(count);
         
         }
         
     
         }
         
         
         
     }
    
    
    public void start( int count){
        Qno.setText(""+(count+1)+". ");
        Question.setText(questions[count][0]);
        
        
        
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
         opt2.setText(questions[count][2]);
         opt2.setActionCommand(questions[count][2]);
          opt3.setText(questions[count][3]);
          opt3.setActionCommand(questions[count][3]);
           opt4.setText(questions[count][4]);
           opt4.setActionCommand(questions[count][4]);
        
        
        groupoptions.clearSelection();
        
    }
    
    
     
    
    public static void main(String args[]) {

        new quiz("user");
        
        
        
}
}
