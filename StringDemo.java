import java.lang.*;
class StringDemo
{
 public static void main(String args[])
{
 char chars[] = { 'a', 'b', 'c' };
char chars1[]={'a','b','c','d','e','f','g','h'};
String s1=new String(chars1,1,4);
byte ascii[] = {91, 92, 93, 94, 95, 96 };
String s2 = new String(ascii);
System.out.println(s2);
 String s = new String(chars);
System.out.println(""+s+""+s1);
}
}