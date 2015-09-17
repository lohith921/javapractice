import java.lang.*;
import java.io.*;
import java.applet.*;
import java.awt.*;

class Cipher
{
public void start()
{ 

}
public void run()
{
//System.out.println("enter your message:");
TextField t1=new TextField("plain text");
TextField t2=new TextField("cipher text");
Button b1=new Button("convert");
 String str=new String();
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in);
char chr[]=new char[str.length()];
try
{ 
 str=t1.getText();
}
catch(Exception e)
{
 System.out.println("exception caught:"+e);
}
for (int i=0;i<str.length();i++)
 chr[i]=str.charAt(i);
for(int i=0;i<str.length();i++)
 chr[i]+=3;
String s = new String(chr);
t2.setText(s);
//System.out.println("Your text is ciphered");
//System.out.println(" "+str+" "+s);
}
}
/* <applet code="CipherApplet.java" width=300 height=400>
</applet>*/