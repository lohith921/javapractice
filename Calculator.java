import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener 
{
  public Label l[]=new Label[9];
  public  TextField tf[]=new TextField[8];
  public Button b=new Button("Calculate");
  public void init() 
  { // TODO start asynchronous download of heavy resources
   l[0]=new Label("Welcome to % calculator");
   l[1]=new Label("Enter first year marks");
   l[2]=new Label("Enter 2-1 marks:");
   l[3]=new Label("Enter 2-2 marks:");
   l[4]=new Label("Enter 3-1 marks:");
   l[5]=new Label("Enter 3-2 marks:");
   l[6]=new Label("Enter 4-1 marks:");
   l[7]=new Label("Enter 4-2 marks:");
   l[8]=new Label("Your % is:");
   tf[0]=new TextField();
   tf[1]=new TextField();
   tf[2]=new TextField();
   tf[3]=new TextField();
   tf[4]=new TextField();
   tf[5]=new TextField();
   tf[6]=new TextField();
   tf[7]=new TextField();
   setLayout(new FlowLayout());
  }
  public void run() {}
  public void actionPerformed(ActionEvent e) 
  {
   String s=e.getActionCommand();
   if("Calculate".equals(s)) 
   {
    float total,percntage;
    total = Integer.parseInt(tf[0].getText())+Integer.parseInt(tf[1].getText())
        +Integer.parseInt(tf[2].getText());
    total/=2;
    for(int i=3;i<7;i++)
    {
     total+=Integer.parseInt(tf[i].getText());
     total/=5475;
     //float percntage;
     percntage=total*100;
     tf[7].setText(""+percntage);
    }
   }
  }
 }
}
/* <applet code="Calculator" width=400 height=400>
  </applet>
 */