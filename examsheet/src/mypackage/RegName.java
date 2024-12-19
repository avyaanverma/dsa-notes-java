import java.awt.*;
import java.awt.event.*;

public class RegName extends Frame {
    private Label Name;
    public RegName(){
        setTitle("regional name avyaan");
        setSize(400,400);
        setLayout(new FlowLayout());
        int[] arr = {2309, 2357, 2351, 2366, 2344};

        String name = "";

        for(int i=0; i<arr.length; i++){
            name+=(char)arr[i];
        }
        Label name = new Label(name);
        add(name);
        String unicode_nos = "";
        for(int a = 0; a < name.length; a++){
            for(int i=0; i < arr.length; i++){
                unicode_nos+=arr[i]+":"+name[a]+"\n";
            }
        }

        Label unicode = new Label(unicode);
        add(unicode);
    }
    
}
