import java.lang.*;
import java.io.*;
class Cipher
{
 public static void main(String args[])
{
System.out.println("enter your message:");
String str=new String();
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
try
{ 
 str=br.readLine();
}
catch(IOException e)
{
 System.out.println("exception caught:"+e);
}
char chr[]=new char[str.length()];
for (int i=0;i<str.length();i++)
 chr[i]=str.charAt(i);
for(int i=0;i<str.length();i++)
 chr[i]+=3;
String s = new String(chr);
System.out.println("Your text is ciphered");
System.out.println(" "+str+" "+s);
}
}