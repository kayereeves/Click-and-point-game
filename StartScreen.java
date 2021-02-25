
package theguild.hangman;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author kiann
 */
public class StartScreen extends javax.swing.JFrame {
    
    public StartScreen() {
        setPreferredSize(GlobalCode.dims);
        pack();
        initComponents();
        setIconImage(GlobalCode.img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        byTheGuild = new javax.swing.JLabel();
        titleText1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 153, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                loadingNextWindow(evt);
            }
        });

        titleText.setBackground(new java.awt.Color(0, 153, 153));
        titleText.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        titleText.setForeground(new java.awt.Color(0, 153, 153));
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleText.setText("Game Suite");
        titleText.setToolTipText("");
        titleText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        byTheGuild.setBackground(new java.awt.Color(0, 153, 153));
        byTheGuild.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        byTheGuild.setForeground(new java.awt.Color(0, 153, 153));
        byTheGuild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        byTheGuild.setText("by The GUI-LD");
        byTheGuild.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        titleText1.setBackground(new java.awt.Color(0, 153, 153));
        titleText1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        titleText1.setForeground(new java.awt.Color(0, 153, 153));
        titleText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleText1.setText("Point-And-Click");
        titleText1.setToolTipText("");
        titleText1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(byTheGuild, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleText)
                .addGap(163, 163, 163))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(103, Short.MAX_VALUE)
                    .addComponent(titleText1)
                    .addGap(84, 84, 84)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(byTheGuild, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(123, 123, 123))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(titleText1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(234, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(614, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadingNextWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_loadingNextWindow
        int delay = 3000;
        ActionListener taskPerformer = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                openMainMenu();
            }
        };
        Timer timer = new Timer(delay, taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_loadingNextWindow

    public void openMainMenu(){
        HangmanUI menu = new HangmanUI();
        menu.setSize(600, 400);
        menu.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("DarkMetal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartScreen s = new StartScreen();
                s.setSize(600, 400);
                s.getContentPane().setBackground(GlobalCode.bgColor);
                s.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel byTheGuild;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel titleText1;
    // End of variables declaration//GEN-END:variables
}
