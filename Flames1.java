import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
public class Flames1 extends Frame implements ActionListener
{
  Label l1=new Label("Enter your name:");
  Label l2=new Label("Enter your partner name:");
  Label l3=new Label("Relationship is:");
  TextField t1=new TextField(30);
  TextField t2=new TextField(30);
  TextField t3=new TextField(30);
  TextField t4=new TextField(30);
  Button b1=new Button("Calculate"); 
 Flames1(String s1)
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
  char[] s=c.toCharArray(); 
  char[] s1=c1.toCharArray(); 
  char[] s2=c2.toCharArray(); 
  int i,i1,i2,k,l,m;
  i1=c1.length();
  i2=c2.length();
  //for(k=0;k<i1;k++)
  k=0;
  while(k<i1)
  {
   for(l=0;l<i2;l++)
   if(s1[k]==s2[l])
    { s1[k]='\0'; s2[l]='\0'; k++;}
   k++;
  }
  int f=0;
  for(k=0;k<i1;k++)
  {
   if(s1[k]!='\0')
    f++;
  }
  for(l=0;l<i2;l++)
  {
   if(s2[l]!='\0')
    f++;
  }
  i=c.length(); k=0;
  while(i!=1)
  {
    k=(f-1)%6;
    for(m=k;m<i-1;m++)
     s[m]=s[m+1];
    i--;
  }
  if(s[0]=='F')
    t3.setText("Friendship");
  else if(s[0]=='L')
    t3.setText("Love");
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
  Flames1 f1=new Flames1("Flames program");
  f1.setLayout(new FlowLayout());
  f1.setVisible(true);
  f1.setSize(450,400); 
 }
}