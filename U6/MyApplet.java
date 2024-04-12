import java.awt.*;
import java.applet.*;

/*
<applet code="MyApplet" width=200 height=60>
</applet>
*/

public class MyApplet extends Applet {
    // Called first.
    public void init() {
        // initialization
        System.out.println("initialized");
    }

    /* Called second, after init(). Also called whenever
    the applet is restarted. */
    public void start() {
        // start or resume execution
        System.out.println("started");
    }
    // Called when the applet is stopped.
    public void stop() {
        // suspends execution
        System.out.println("stopped");
    }
    /* Called when applet is terminated. This is the last
    method executed. */
    public void destroy() {
        // perform shutdown activities
        System.out.println("destroyed");
    }
    // Called when an applet’s window must be restored.
    public void paint(Graphics g) {
        // redisplay contents of window
        System.out.println("painted");
    }
}