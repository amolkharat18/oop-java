// Use Parameters
import java.awt.*;
import java.applet.*;
/*
<applet code="ParamDemo" width=300 height=80>
<param name=myFirstName value=John>
<param name=myLastName value=Smith>
</applet>
*/
public class ParamDemo extends Applet {
    String myFirstName, myLastName;

    // Initialize the string to be displayed.
    public void start() {
        myFirstName = getParameter("myFirstName");
        myLastName = getParameter("myLastName");
    }
        
    // Display parameters.
    public void paint(Graphics g) {
        g.drawString("My name: " + myFirstName + " " + myLastName, 10, 10);
    }
}