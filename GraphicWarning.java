import java.awt.*;
import java.awt.event.*;

public class GraphicWarning extends Frame{

    static private final int line=15;
    static private final int letter=5;
    
   
    public GraphicWarning(){
        setBackground(Color.cyan);
        setForeground(Color.black);
        }
        
    public void paint(Graphics g){
        g.drawRect(2*letter,2*line,33*letter,6*line);
        g.drawString("W A R N I N G",9*letter,4*line);
        g.drawString("Possible virus detected",4*letter,5*line);
        g.drawString("Reboot and run virus",5*letter,6*line);
        g.drawString("remover software",7*letter,7*line);
        
      }
      
     public  static void main(String [] args) {
     
        Frame f= new GraphicWarning();
        f.setTitle("Draw warning");
        f.setSize(50*letter,10*line);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
        // public void windowClosing(WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
              }
            });
            }
            
         }
            
         
       
    
