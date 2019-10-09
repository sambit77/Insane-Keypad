

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class puzzle extends JFrame
  implements ActionListener
{
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;
  JButton b5;
  JButton b6;
  JButton b7;
  JButton b8;
  JButton b9;
  JButton next;

  puzzle()
  {
    super("puzzle");
    this.b1 = new JButton("1");
    this.b2 = new JButton("");
    this.b3 = new JButton("3");
    this.b4 = new JButton("4");
    this.b5 = new JButton("5");
    this.b6 = new JButton("6");
    this.b7 = new JButton("7");
    this.b8 = new JButton("8");
    this.b9 = new JButton("2");
    this.next = new JButton("next");

    this.b1.setBounds(10, 30, 50, 40);
    this.b2.setBounds(70, 30, 50, 40);
    this.b3.setBounds(130, 30, 50, 40);
    this.b4.setBounds(10, 80, 50, 40);
    this.b5.setBounds(70, 80, 50, 40);
    this.b6.setBounds(130, 80, 50, 40);
    this.b7.setBounds(10, 130, 50, 40);
    this.b8.setBounds(70, 130, 50, 40);
    this.b9.setBounds(130, 130, 50, 40);
    this.next.setBounds(70, 200, 100, 40);

    add(this.b1);
    add(this.b2);
    add(this.b3);
    add(this.b4);
    add(this.b5);
    add(this.b6);
    add(this.b7);
    add(this.b8);
    add(this.b9);
    add(this.next);

    this.b1.addActionListener(this);
    this.b2.addActionListener(this);
    this.b3.addActionListener(this);
    this.b4.addActionListener(this);
    this.b5.addActionListener(this);
    this.b5.addActionListener(this);
    this.b6.addActionListener(this);
    this.b7.addActionListener(this);
    this.b8.addActionListener(this);
    this.b9.addActionListener(this);
    this.next.addActionListener(this);

    this.next.setBackground(Color.black);
    this.next.setForeground(Color.green);
    setSize(400, 400);
    setLayout(null);
    setVisible(true);
    setTitle("solve it if u can");
    setDefaultCloseOperation(3);
  }

  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == this.next)
    {
      String s = this.b4.getLabel();
      this.b4.setLabel(this.b9.getLabel());
      this.b9.setLabel(s);
      s = this.b1.getLabel();
      this.b1.setLabel(this.b5.getLabel());
      this.b5.setLabel(s);
      s = this.b2.getLabel();
      this.b2.setLabel(this.b7.getLabel());
      this.b7.setLabel(s);
    }

    if (e.getSource() == this.b1)
    {
      String s = this.b1.getLabel();
      if (this.b2.getLabel().equals(""))
      {
        this.b2.setLabel(s);
        this.b1.setLabel("");
      }
      else if (this.b4.getLabel().equals(""))
      {
        this.b4.setLabel(s);
        this.b1.setLabel("");
      }

    }

    if (e.getSource() == this.b3)
    {
      String s = this.b3.getLabel();
      if (this.b2.getLabel().equals(""))
      {
        this.b2.setLabel(s);
        this.b3.setLabel("");
      }
      else if (this.b6.getLabel().equals(""))
      {
        this.b6.setLabel(s);
        this.b3.setLabel("");
      }
    }

    if (e.getSource() == this.b2)
    {
      String s = this.b2.getLabel();
      if (this.b1.getLabel().equals(""))
      {
        this.b1.setLabel(s);
        this.b2.setLabel("");
      }
      else if (this.b3.getLabel().equals(""))
      {
        this.b3.setLabel(s);
        this.b2.setLabel("");
      }
      else if (this.b5.getLabel().equals(""))
      {
        this.b5.setLabel(s);
        this.b2.setLabel("");
      }
    }

    if (e.getSource() == this.b4)
    {
      String s = this.b4.getLabel();
      if (this.b1.getLabel().equals(""))
      {
        this.b1.setLabel(s);
        this.b4.setLabel("");
      }
      else if (this.b7.getLabel().equals(""))
      {
        this.b7.setLabel(s);
        this.b4.setLabel("");
      }
      else if (this.b5.getLabel().equals(""))
      {
        this.b5.setLabel(s);
        this.b4.setLabel("");
      }
    }
    if (e.getSource() == this.b5)
    {
      String s = this.b5.getLabel();
      if (this.b2.getLabel().equals(""))
      {
        this.b2.setLabel(s);
        this.b5.setLabel("");
      }
      else if (this.b4.getLabel().equals(""))
      {
        this.b4.setLabel(s);
        this.b5.setLabel("");
      }
      else if (this.b6.getLabel().equals(""))
      {
        this.b6.setLabel(s);
        this.b5.setLabel("");
      }
      else if (this.b8.getLabel().equals(""))
      {
        this.b8.setLabel(s);
        this.b5.setLabel("");
      }
    }

    if (e.getSource() == this.b6)
    {
      String s = this.b6.getLabel();
      if (this.b9.getLabel().equals(""))
      {
        this.b9.setLabel(s);
        this.b6.setLabel("");
      }
      else if (this.b3.getLabel().equals(""))
      {
        this.b3.setLabel(s);
        this.b6.setLabel("");
      }
      else if (this.b5.getLabel().equals(""))
      {
        this.b5.setLabel(s);
        this.b6.setLabel("");
      }
    }

    if (e.getSource() == this.b7)
    {
      String s = this.b7.getLabel();
      if (this.b4.getLabel().equals(""))
      {
        this.b4.setLabel(s);
        this.b7.setLabel("");
      }
      else if (this.b8.getLabel().equals(""))
      {
        this.b8.setLabel(s);
        this.b7.setLabel("");
      }
    }

    if (e.getSource() == this.b8)
    {
      String s = this.b8.getLabel();
      if (this.b7.getLabel().equals(""))
      {
        this.b7.setLabel(s);
        this.b8.setLabel("");
      }
      else if (this.b9.getLabel().equals(""))
      {
        this.b9.setLabel(s);
        this.b8.setLabel("");
      }
      else if (this.b5.getLabel().equals(""))
      {
        this.b5.setLabel(s);
        this.b8.setLabel("");
      }
    }

    if (e.getSource() == this.b9)
    {
      String s = this.b9.getLabel();
      if (this.b6.getLabel().equals(""))
      {
        this.b6.setLabel(s);
        this.b9.setLabel("");
      }
      else if (this.b8.getLabel().equals(""))
      {
        this.b8.setLabel(s);
        this.b9.setLabel("");
      }
      if ((this.b1.getLabel().equals("1")) && (this.b2.getLabel().equals("2")) && 
        (this.b3.getLabel().equals("3")) && (this.b4.getLabel().equals("4")) && 
        (this.b5.getLabel().equals("5")) && (this.b6.getLabel().equals("6")) && 
        (this.b7.getLabel().equals("7")) && (this.b8.getLabel().equals("8")) && 
        (this.b9.getLabel().equals(" ")))
      {
        JOptionPane.showMessageDialog(this, "you won finally u noobie");
      }
    }
  }

  public static void main(String[] args)
  {
    new puzzle();
  }
}