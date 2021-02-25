package theguild.hangman;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.*;


public class GlobalCode {

    public static Color bgColor = java.awt.Color.blue.darker().darker().darker().darker();
    public static ImageIcon img = new javax.swing.ImageIcon("src//main//java//resources//tgicon.png");
    public static java.awt.Dimension dims = new java.awt.Dimension(600, 400);
    
    public static void clock(JFrame myJFrame)
    {
        JLabel myClock = new JLabel();
        
        myClock.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        myClock.setForeground(new java.awt.Color(0, 153, 153));
        myClock.setText("clock");
        myJFrame.add(myClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 168, 28));   
        
        Thread clock = new Thread()
        {
            public void run()
            {
                try{
                    for(;;){
                        Calendar calendar = 
                        new java.util.GregorianCalendar(Calendar.getInstance()
                                                                .getTimeZone());
                        DateFormat df = 
                        new java.text.SimpleDateFormat("MMMMM dd, YYYY "
                                                       + "hh:mm:ss");
                        String date = df.format(calendar.getTime());
                        
                        myClock.setText(date);
                        sleep(1000);
                    }
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        
        clock.start();     
    }
    
    public static Image imgResizer(String filePath, int x, int y)
    {
        java.awt.image.BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
        } 
        catch (java.io.IOException e) {
        }

        Image newimg = img.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH); 
        return newimg;
    }
}
