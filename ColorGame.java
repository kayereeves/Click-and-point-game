
package theguild.hangman;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.util.Scanner;
import javax.sound.sampled.*;

/**
 *
 * @author kiann
 */
public class ColorGame extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="Custom Variable Declarations">     
    private static int currentScore = 0;
    private int turns = 0;
    private static String lbColorName;
    private static String lbTextString;
    private static String colorChoice;
    private static String[] colorList = {"red", "blue", "green", "yellow", "purple"};
    private static int numColors = colorList.length;
    private int testNum = 70;
    private final int buttonX = 100;
    private final int buttonY = 100;
    private javax.swing.ImageIcon purpleIcon = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//purplebutton.png", buttonX, buttonY));
    private javax.swing.ImageIcon purpleIconHighlighted = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//purplebutton_h.png", buttonX, buttonY));
    private javax.swing.ImageIcon redIcon = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//redbutton.png", buttonX, buttonY));
    private javax.swing.ImageIcon redIconHighlighted = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//redbutton_h.png", buttonX, buttonY));
    private javax.swing.ImageIcon blueIcon = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//bluebutton.png", buttonX, buttonY));
    private javax.swing.ImageIcon blueIconHighlighted = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//bluebutton_h.png", buttonX, buttonY));
    private javax.swing.ImageIcon yellowIcon = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//yellowbutton.png", buttonX, buttonY));
    private javax.swing.ImageIcon yellowIconHighlighted = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//yellowbutton_h.png", buttonX, buttonY));
    private javax.swing.ImageIcon greenIcon = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//greenbutton.png", buttonX, buttonY));
    private javax.swing.ImageIcon greenIconHighlighted = 
    new ImageIcon(GlobalCode.imgResizer("src//main//java//resources//greenbutton_h.png", buttonX, buttonY));
    // </editor-fold>                        

    public ColorGame(int score) {
        setPreferredSize(GlobalCode.dims);
        pack();
        initComponents();
        currentScore = score;
        getContentPane().setBackground(GlobalCode.bgColor);
        colorText.setBackground(GlobalCode.bgColor);
        setIconImage(GlobalCode.img.getImage());
        GlobalCode.clock(this);
        resetTextAndColor();

    }
    
    public ColorGame() {
        setPreferredSize(GlobalCode.dims);
        pack();
        initComponents();
        getContentPane().setBackground(GlobalCode.bgColor);
        colorText.setBackground(GlobalCode.bgColor);
        setIconImage(GlobalCode.img.getImage());
        GlobalCode.clock(this);
        resetTextAndColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purpleButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        redButton = new javax.swing.JButton();
        colorText = new javax.swing.JLabel();

        purpleButton.setBackground(java.awt.Color.magenta);
        purpleButton.setIcon(purpleIcon);
        purpleButton.setBorderPainted(false);
        purpleButton.setContentAreaFilled(false);
        purpleButton.setRolloverIcon(purpleIconHighlighted);
        purpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleButtonActionPerformed(evt);
            }
        });

        blueButton.setBackground(java.awt.Color.blue);
        blueButton.setIcon(blueIcon);
        blueButton.setBorderPainted(false);
        blueButton.setContentAreaFilled(false);
        blueButton.setPreferredSize(new java.awt.Dimension(53, 43));
        blueButton.setRolloverIcon(blueIconHighlighted);
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        yellowButton.setBackground(java.awt.Color.yellow);
        yellowButton.setIcon(yellowIcon);
        yellowButton.setBorderPainted(false);
        yellowButton.setContentAreaFilled(false);
        yellowButton.setRolloverIcon(yellowIconHighlighted);
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        greenButton.setBackground(java.awt.Color.green);
        greenButton.setIcon(greenIcon);
        greenButton.setBorderPainted(false);
        greenButton.setContentAreaFilled(false);
        greenButton.setRolloverIcon(greenIconHighlighted);
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });

        redButton.setBackground(java.awt.Color.red);
        redButton.setIcon(redIcon);
        redButton.setBorderPainted(false);
        redButton.setContentAreaFilled(false);
        redButton.setRolloverIcon(redIconHighlighted);
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorText.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        colorText.setForeground(new java.awt.Color(0, 153, 153));
        colorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorText.setText("Color");
        getContentPane().add(colorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 280, 70));

        setSize(new java.awt.Dimension(614, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold desc="Button Action Listeners">   
    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        colorChoice = "yellow";
        compareColors();
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        colorChoice = "green";
        compareColors();
    }//GEN-LAST:event_greenButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        colorChoice = "blue";
        compareColors();
    }//GEN-LAST:event_blueButtonActionPerformed

    private void purpleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleButtonActionPerformed
        colorChoice = "purple";
        compareColors();
    }//GEN-LAST:event_purpleButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        colorChoice = "red";
        compareColors();
    }//GEN-LAST:event_redButtonActionPerformed
    // </editor-fold>
    
//    private Image GlobalCode.imgResizer(String filePath, int x, int y)
//    {
//        java.awt.image.BufferedImage img = null;
//        try {
//            img = ImageIO.read(new File(filePath));
//        } 
//        catch (java.io.IOException e) {
//        }
//
//        Image newimg = img.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH); 
//        return newimg;
//    }

    private String pickColor(String[] colors) {
        int index = (int) (Math.random() * colors.length);
        String randomColor = new String(colors[index]);
        
        return randomColor;
    }
    
    private void setColorTextState(String color, String text) {
        colorText.setText(text);
        lbTextString = text;
        lbColorName = color;
        
        switch (color) {
            case "red":
                colorText.setForeground(java.awt.Color.RED);
                break;
            
            case "blue":
                colorText.setForeground(java.awt.Color.BLUE);
                break;
            
            case "green":
                colorText.setForeground(java.awt.Color.GREEN);
                break;
                
            case "yellow":
                colorText.setForeground(java.awt.Color.YELLOW);
                break;
                
            case "purple":
                colorText.setForeground(java.awt.Color.MAGENTA);
                break;
                
            default:
                System.out.println("Invalid color");
                break;
        }     
    }
    
    private void resetTextAndColor()
    {
        setColorTextState(pickColor(colorList), pickColor(colorList));
        setButtonPositions();
    }
    
    private void setButtonPositions() {
        
        JButton[] coloredButtons = {redButton, blueButton, greenButton, yellowButton, purpleButton};
        Rectangle[] myRectangles = new Rectangle[7];
        
        for (int index = 0; index < 6; index++)
            myRectangles[index] = new Rectangle(10,10);
        
        myRectangles[6] = new Rectangle(200,170,200,60);
        
        int x;
        int y;
        boolean valid;
        
        for (int index = 0; index < coloredButtons.length; index++) {
            
            do {
                valid = true;
                x = (int) (Math.random() * 460);    //generate random potential position for button
                y = (int) (Math.random() * 250) + 10;
                myRectangles[index] = new Rectangle(x, y, 90, 90);
                
                //test if the button can go there without overlapping other buttons or word
                if (myRectangles[index].intersects(myRectangles[6])) {
                        valid = false;
                    }
                for (int index2 = 0; index2 < index; index2++) {
                    if (myRectangles[index].intersects(myRectangles[index2])) {
                        valid = false;
                    }
                    
                }
                
            } while (valid == false);
            
            // paint the button at validated location
            this.add(coloredButtons[index], new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y,90,90));
        }
    }
            
    private void compareColors() {   
        turns++;
        
        if (colorChoice.equals(lbColorName))
        {
            currentScore += 100;
            playSound("correctAnswer");
        }
        else
        {
            playSound("wrongAnswer");
        }
        
        
        
        if (turns >= 5) {
            EndScreen end = new EndScreen(currentScore);
            end.setSize(600, 400);
            end.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        }
        else {
            resetTextAndColor();
        }        
    }
    
    private void playSound(String result)
    {        
        AudioInputStream audioInputStream;
        String filePath = " ";
        Clip clip;
        
        switch (result)
        {
        case "correctAnswer":
             filePath = "src\\main\\java\\resources\\winSound.wav";
             break;
        case "wrongAnswer":
            filePath = "src\\main\\java\\resources\\wrongSound.wav";
             break;
        default:
            System.out.println("Error: invalid sound choice");
        }
        
            try {  
            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f);
            clip.start();
            } catch (Exception ex) {
                System.out.println("error!");
                ex.printStackTrace();   
            }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorGame().setVisible(true);       
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueButton;
    private javax.swing.JLabel colorText;
    private javax.swing.JButton greenButton;
    private javax.swing.JButton purpleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
    //private JPanel[] myJPanelArray = {jPanel1, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7, jPanel8};
    
}
