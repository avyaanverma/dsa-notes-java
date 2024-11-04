# AWT - Abstract Windowin Toolkit

- It's a package in Java used for GUI.  It's a part of Java Standard Edition (SE) and is used for creating desktop applications.

![AWT](https://images.javatpoint.com/java/awt/images/java-awt.png)

- Object class is the root class.

-  It provides a lot of classes and interfaces for creating GUI components.

- Component class is directly inherting from the Object class. All the elements like the button, text fields, scroll bars, etc. are called components. In Java AWT, there are classes for each component as shown in above diagram. In order to place every component in a particular position on a screen, we need to add them to a container.

- Visual Elements are that you can see

- Container class can contain other visual elements also.   It's a subclass of Component class.

- The Container is a component in AWT that can contain another components like buttons, textfields, labels etc. The classes that extends Container class are known as container such as Frame, Dialog and Panel.

- Overall it's a Hybrid Inheritance.


## Types of containers:

- There are four types of containers in Java AWT:

    - Window
    - Panel
    - Frame
    - Dialog

- Window

- The window is the container that have no borders and menu bars. You must use frame, dialog or another window for creating a window. We need to create an instance of Window class to create this container.
Panel

- The Panel is the container that doesn't contain title bar, border or menu bar. It is generic container for holding the components. It can have other components like button, text field etc. An instance of Panel class creates a container, in which we can add components.
Frame

- The Frame is the container that contain title bar and border and can have menu bars. It can have other components like button, text field, scrollbar etc. Frame is most widely used container while developing an AWT application.

|Method| Description |
| -------| ------ | 
| | | 
| | |
| | | 
| | |

## Java AWT Example

- To create simple AWT example, you need a frame. There are two ways to create a GUI using Frame in AWT.

    - By extending Frame class (inheritance)
    - By creating the object of Frame class (association)

## AWT Example by Inheritance

- Let's see a simple example of AWT where we are inheriting Frame class. Here, we are showing Button component on the Frame.

```java
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

Frame f = new Frame();
f.setSize(width:450, height:450);
f.setTitle(title:"My First GUI");
f.setBackground(Color.BLUE);
f.setLocation(x:150,y:150)
F.setVisible(b:true);

Label l = new  Label("Enter your Name");
// we have to establish relation between Frame and Label
// This is called HAS A relationship

f.add(l);

TextField tf = new TextField();
f.add(tf);
// Problem is if add components like this it will take entire window 
Button b = new Button("Submit");
f.add(b);
// One solution is to add a Layout


```


```java
Frame f = new Frame();
f.setSize(width:450, height:450);
f.setTitle(title:"My First GUI");
f.setBackground(Color.BLUE);
f.setLocation(x:150,y:150)
F.setVisible(b:true);
f.setLayout(new FlowLayout());

Label l = new  Label("Enter your Name");

f.add(l);

TextField tf = new TextField();
f.add(tf);
CheckBox c1 = new CheckBox("Java");
f.add(c1);

Button b = new Button("Submit");
f.add(b);

List list = new List();
list.add("Java";)
list.add("Python")
list.add("CPP")
list.add("Python")
```

## Java.awt.event Package in Java 

- a core java package that provides interfaces and classes to handle various events in GUIT applications.
- Essentaial for creating interactive applictionas with user inputs, mousr movemntts, keyboard actions, etc.

- Event Classes : Represent specfic types of events eg: ActionEvent, KeyEvent, Mouse Event.

- Event Interfaces : Defince event handle methods  eg: ActionListener, KeyListener, MouseListener, MouseMotionListener.


## Action Listener
- ActionListener is an interface in Java's java.awt.event package that enables an app to response to sepvcific user actions, primarliy associated button lcicks 

- Purposse : It listens for and handles action  events - events that occur due to use ractions like clicking a button, pressing "Enter" in a text field, or selecting a menu item.

- Interface Definition: Since it's an interface, Action Listener contains only one method actionPerformed(ActionEvent e), which needs to be implemented by the class that will handle the event.


## Email Validator Program in Java
![email-program](./Screenshot%202024-11-04%20092100.png)
![email-logic](./Screenshot%202024-11-04%20092824.png)

```java
import java.awt.*;
import java.awt.event.*;

public class EmailValidator extends Frame implements  ActionListener {

    private TextField emailField;
    private Label resultLabel;

    public EmailValidator(){
        setTitle("Email Validator");
        setSize(400, 400);
        setLayout(new FlowLayout());

        Label labelPrompt = new Label("Enter Email: ");
        Button validateButton = new Button("Validate");
        emailField = new TextField(30);
        resultLabel = new Label();

        add(labelPrompt);
        add(emailField))
        add(validateButton))
        add(resultLabel))

        validateButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String email = emailField.getText();

        if(email.contains("@") && email.contains(".")){
            resultLabel.setText("Email is valid");
            resultLabel.setForeground(Color.GREEN);
        }
        else{
            resultLabel.setText("Email is invalid");
            resultLabel.setForeground(Color.RED);
        }

    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        System.out.println();
        
        EmailValidator em = new EmailValidator();
        em.show(); // this is deprecated
    }
}
```



