import java.awt.*; import java.awt.event.*; 
public class FlowLayoutExample2 {  
public static void main(String[] args) {  
Frame f=new Frame("FlowLayout Example");  
Button b1=new Button("B1");
Button b2=new Button("B2");
Button b3=new Button("B3");
Button b4=new Button("B4");
Button b5=new Button("B5");
Label l1= new Label("Hi!");
Label l2=new Label("This is awt tutorial");
Label l3=new Label("Welcome to Label class!");
        f.add(b1);  
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
   f.add(l1);
  f.add(l2);
f.add(l3);
    f.setSize(600,300); 
 
    f.setLayout(new FlowLayout(FlowLayout.RIGHT,50,50));//Setting the layout for the Frame 
    f.setVisible(true);   
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
}  
}