import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
public class GUI extends Frame implements ActionListener{
    public GUI(){
            setTitle("Gui app for button interaction ");
            setSize(400,400);
            setLayout(new FlowLayout());

            b1 = new Button("1 press");
            b2 = new Button("2 press");

            add(b1);
            add(b2);

            b1.addActionListener(this);
            b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Button was pressed");
    }
}
 
