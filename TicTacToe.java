
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//Tic-Tac-Toe Class
public class TicTacToe extends JFrame 
{    
    int k=0,l,count=0;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b;
    JTextField tf,tf1;
    
    public TicTacToe (String s)
    {
        super(s);
    }
    public void setComponent()
    {
       
        b1= new JButton("");
        b1.setBounds(13,30,90,90);
        add(b1);
        b2= new JButton("");
        b2.setBounds(110,30,90,90);
        add(b2);
        b3= new JButton("");
        b3.setBounds(207,30,90,90);
        add(b3);
        b4= new JButton("");
        b4.setBounds(13,125,90,90);
        add(b4);
        b5= new JButton("");
        b5.setBounds(110,125,90,90);
        add(b5);
        b6= new JButton("");
        b6.setBounds(207,125,90,90);
        add(b6);
        b7= new JButton("");
        b7.setBounds(13,220,90,90);
        add(b7);
        b8= new JButton("");
        b8.setBounds(110,220,90,90);
        add(b8);
        b9= new JButton("");
        b9.setBounds(207,220,90,90);
        add(b9);
        b = new JButton("Start New Game");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(90, 320, 130, 30);
        add(b);
        tf = new JTextField();
        tf.setBounds(20, 370, 250, 30);
        tf.setEditable(false);
        add(tf);
        tf1 = new JTextField();
        tf1.setBounds(20, 420, 150, 50);
        tf1.setEditable(false);
        add(tf1);
        
        b1.addActionListener(new A1());
        b2.addActionListener(new A2());
        b3.addActionListener(new A3());
        b4.addActionListener(new A4());
        b5.addActionListener(new A5());
        b6.addActionListener(new A6());
        b7.addActionListener(new A7());
        b8.addActionListener(new A8());
        b9.addActionListener(new A9());
        b.addActionListener(new A());
    }
    //For Checking if any three box match or not.
    public int check()
    {
        count++;     
        if(b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X")
        {
        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        return 1;
        }
        else if(b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X")
        {
            b1.setBackground(Color.BLACK);
            b4.setBackground(Color.BLACK);
            b7.setBackground(Color.BLACK);  
            return 1;
        }       
        else if(b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X")
        {
         b1.setBackground(Color.BLACK);
         b5.setBackground(Color.BLACK);
         b9.setBackground(Color.BLACK);   
        return 1;
        }
        else if(b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X")
        {   b2.setBackground(Color.BLACK);
            b5.setBackground(Color.BLACK);
            b8.setBackground(Color.BLACK);
        return 1;
        }
        else if(b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X")
        {   b3.setBackground(Color.BLACK);
            b6.setBackground(Color.BLACK);
            b9.setBackground(Color.BLACK);
        return 1;
        }
        else if(b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X")
        {   b3.setBackground(Color.BLACK);
            b5.setBackground(Color.BLACK);
            b7.setBackground(Color.BLACK);
        return 1;
        }
        else if(b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X")
        {   b4.setBackground(Color.BLACK);
            b5.setBackground(Color.BLACK);
            b6.setBackground(Color.BLACK);
        return 1;
        }
        else if(b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X")
        {   b7.setBackground(Color.BLACK);
            b8.setBackground(Color.BLACK);
            b9.setBackground(Color.BLACK);
        return 1;
        }
       //for 0
        else if(b1.getText()=="0" && b2.getText()=="0" && b3.getText()=="0")
        {   b1.setBackground(Color.RED);
            b2.setBackground(Color.RED);
            b3.setBackground(Color.RED);
        return 2;
        }
        else if(b1.getText()=="0" && b4.getText()=="0" && b7.getText()=="0")
        {   b1.setBackground(Color.RED);
            b4.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        return 2;
        }
        else if(b1.getText()=="0" && b5.getText()=="0" && b9.getText()=="0")
        {   b1.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        return 2;
        }
        else if(b2.getText()=="0" && b5.getText()=="0" && b8.getText()=="0")
        {   b2.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b8.setBackground(Color.RED);
        return 2;
        }
        else if(b3.getText()=="0" && b6.getText()=="0" && b9.getText()=="0")
        {   b3.setBackground(Color.RED);
            b6.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        return 2;
        }
        else if(b3.getText()=="0" && b5.getText()=="0" && b7.getText()=="0")
        {   b3.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        return 2;
        }
        else if(b4.getText()=="0" && b5.getText()=="0" && b6.getText()=="0")
        {   b4.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b6.setBackground(Color.RED);
        return 2;
        }
        else if(b7.getText()=="0" && b8.getText()=="0" && b9.getText()=="0")
        {   b7.setBackground(Color.RED);
            b8.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        return 2;
        }
        else
        {
          if(count==9)
          {
           tf.setText("Game Draw");   
           JOptionPane.showMessageDialog(null,"Game Over");
          } 
           return 3;
        }
    }
    //This Function is using for all keys disable after Game Over.
    void setEnable()
    {
         b1.setEnabled(false);
         b2.setEnabled(false);
         b3.setEnabled(false);
         b4.setEnabled(false);
         b5.setEnabled(false);
         b6.setEnabled(false);
         b7.setEnabled(false);
         b8.setEnabled(false);
         b9.setEnabled(false);

    }
    //This Functions checks the Won condition of the function. 
    void Woncondition(int li)
    {
        if(li==1)
        {
            tf.setText("Player 1 Won");
    
            setEnable();
            JOptionPane.showMessageDialog(null,"Game Over");            
        }
        else if(li==2)
        {
            tf.setText("Player 2 Won");
            setEnable();
            JOptionPane.showMessageDialog(null,"Game Over");
        }
        else;
    }
    class A implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
               
         k=0;l=0;count=0;
         b1.setText("");
         b2.setText("");
         b3.setText("");
         b4.setText("");
         b5.setText("");
         b6.setText("");
         b7.setText("");
         b8.setText("");
         b9.setText("");
         b1.setEnabled(true);
         b2.setEnabled(true);
         b3.setEnabled(true);
         b4.setEnabled(true);
         b5.setEnabled(true);
         b6.setEnabled(true);
         b7.setEnabled(true);
         b8.setEnabled(true);
         b9.setEnabled(true);
         tf.setText("");
         b1.setBackground(Color.WHITE);
         b2.setBackground(Color.WHITE);
         b3.setBackground(Color.white);
         b4.setBackground(Color.white);
         b5.setBackground(Color.white);
         b6.setBackground(Color.white);
         b7.setBackground(Color.white);
         b8.setBackground(Color.white);
         b9.setBackground(Color.white);
         tf1.setText("");   
         }
    }       
    void Playerturn(int ki)
    {
        if(ki==0)
        {   
            tf1.setText("Player 1");
            Font f = new Font("Verdana",Font.BOLD,30);
            tf1.setFont(f);
            tf1.setForeground(Color.red);
        }
        else
        {
            tf1.setText("Player 2");
        }
    }
    class A1 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b1.setFont(f);
                  b1.setText("X");
                  b1.setEnabled(false);   
                  l = check();
                  Woncondition(l);
                  k=1;
                  
              }
              else
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b1.setFont(f);
                  b1.setText("0");
                  b1.setEnabled(false); 
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A2 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b2.setFont(f);
                  b2.setText("X");
                  b2.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              {
                  Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b2.setFont(f);
                  b2.setText("0");
                  b2.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A3 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b3.setFont(f);
                  b3.setText("X");
                  b3.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b3.setFont(f);
                  b3.setText("0");
                  b3.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A4 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b4.setFont(f);
                  b4.setText("X");
                  b4.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b4.setFont(f);
                  b4.setText("0");
                  b4.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A5 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b5.setFont(f);
                  b5.setText("X");
                  b5.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              {
                Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b5.setFont(f);
                  b5.setText("0");
                  b5.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A6 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b6.setFont(f);
                  b6.setText("X");
                  b6.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              {
                Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b6.setFont(f);
                  b6.setText("0");
                  b6.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A7 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b7.setFont(f);
                  b7.setText("X");
                  b7.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              { 
                Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b7.setFont(f);
                  b7.setText("0");
                  b7.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A8 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {  Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b8.setFont(f);
                  b8.setText("X");
                  b8.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b8.setFont(f);
                  b8.setText("0");
                  b8.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    class A9 implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
              if(k==0)
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b9.setFont(f);
                  b9.setText("X");
                  b9.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=1;
              }
              else
              {   Playerturn(k);
                  Font f = new Font("Verdana",Font.BOLD,25);
                  b9.setFont(f);
                  b9.setText("0");
                  b9.setEnabled(false);
                  l = check();
                  Woncondition(l);
                  k=0;
              }
        }
    }
    public static void main(String[] args)
    {
            TicTacToe jf = new TicTacToe("Tic Tac Toe");
            jf.setLayout(null);
            jf.setVisible(true);
            jf.setSize(320,550);

            jf.getContentPane().setBackground(new Color(221,42,123));
            jf.setResizable(false);
            jf.setComponent();
            
            jf.setLocationRelativeTo(null); 
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
