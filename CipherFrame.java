import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class CipherFrame extends Frame implements ActionListener, WindowListener
{
TextField t1,t2;
Button b1;
String str;
 
CipherFrame()
{
setLayout(new FlowLayout());
setVisible(true);
t1=new TextField("plain text");
t2=new TextField("cipher text");
str=new String();
b1=new Button("Convert");
add(t1);
add(t2);
add(b1);
b1.addActionListener(this);
addWindowListener(this);
}
public void actionPerformed(ActionEvent ae)
{ 
 str=t1.getText();
char chr[]=new char[str.length()];
for(int i=0;i<str.length();i++)
 chr[i]=str.charAt(i);
for(int i=0;i<str.length();i++)
 chr[i]+=3;
t2.setText(new String(chr));
}
 
public void windowActivated(WindowEvent we){}

public void windowClosing(WindowEvent we){}
//public void windowDeactivated(WindowEvent we)
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}
 public void windowDeactivated(WindowEvent we)
{}
 public void windowClosed(WindowEvent we)
{
 setVisible(false);
}
public static void main(String args[])
{
 CipherFrame f1=new CipherFrame();
}
}