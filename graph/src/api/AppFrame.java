package api;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppFrame extends Frame
{

    private boolean active = true;

    public AppFrame(String title, int width, int height)
    {
        super(title);
        setSize(width, height);

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                active = false;
                System.exit(0);
            }
        });

        setBackground(Color.BLACK);
        setVisible(true);
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

}
