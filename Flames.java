import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;

public class Flames extends Frame implements ActionListener
{
  Label l1=new Label("Enter your name:");
  Label l2=new Label("Enter your partner name:");
  Label l3=new Label("Relationship is:");
  TextField t1=new TextField(30);
  TextField t2=new TextField(30);
  TextField t3=new TextField(30);
  TextField t4=new TextField(30);
  Button b1=new Button("Calculate"); 
 Flames(String s1)
 {
  super(s1);
  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(l3);
  add(t3);
  add(b1);
  add(t4);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  String c="FLAMES";
  String c1=t1.getText();
  String c2=t2.getText();
  //System.out.println("the entered strings are"+c1+c2);
  char[] s=c.toCharArray();
  char[] s1=c1.toCharArray();
  char[] s2=c2.toCharArray();
  int i,i1,i2,k,l,m,n;
  i1=c1.length();
  i2=c2.length();
  for(k=0;k<i1;k++)
  {
   for(l=0;l<i2;l++)
   {
    if(s1[k]==s2[l])
    { 
     m=k; n=l;
     while(m<i1-1)
     {
      s1[m]=s1[m+1]; m++;
     }
     i1--;
     while(n<i2-1)
     {
      s2[n]=s2[n+1]; n++;
     }
     i2--;
    } 
   } k--;
  }
  //i1=s1.length();
  //i2=s2.length();
  int f=i1+i2;
  i=c.length(); k=0;
  while(i!=1)
  {
   for(l=1;l<=f;l++)
   { 
    k=(k+1)%6;
    for(m=k;m<f-1;m++)
     s[m]=s[m+1];
    i--;
   }
  }
  if(s[0]=='F')
    t3.setText("Friendship");
  else if(s[0]=='L')
    t3.setText("Friendship");
  else if(s[0]=='A')
    t3.setText("Affection");
  else if(s[0]=='M')
    t3.setText("Marriage");
  else if(s[0]=='E')
    t3.setText("Enemy"); 
  else
    t3.setText("Sister");
 }

 public static void main(String s[])
 {
  Flames f1=new Flames("Flames program");
  f1.setLayout(new FlowLayout());
  f1.setVisible(true);
  f1.setSize(450,400); 
 }
}