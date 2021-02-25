
package theguild.hangman;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author kiann
 */
public class HangmanUI extends javax.swing.JFrame {
    
private ImageIcon logo = new ImageIcon(GlobalCode.imgResizer(
        "src//main//java//resources//tgicon.png", 300, 300));
    
    
    public HangmanUI() {
         
        initComponents();
        GlobalCode.loadJFramePreferences(this, TopJPanel);
        menuButtonPanel.setBackground(GlobalCode.bgColor);
        menuTitle.setBackground(GlobalCode.bgColor);
        titlePanel.setBackground(GlobalCode.bgColor);
         
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        TopJPanel = new javax.swing.JPanel();
        menuIcon = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        menuTitle1 = new javax.swing.JLabel();
        menuTitle2 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        menuButtonPanel = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        hsButton = new javax.swing.JButton();
        creditsButton = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        TopJPanel.setOpaque(false);
        TopJPanel.setPreferredSize(new java.awt.Dimension(560, 400));
        TopJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuIcon.setFocusable(false);
        TopJPanel.add(menuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-550, 30, -1, 64));

        menuTitle.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        menuTitle.setForeground(new java.awt.Color(0, 153, 153));
        menuTitle.setText("The GUI-LD");

        menuTitle1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        menuTitle1.setForeground(new java.awt.Color(0, 153, 153));
        menuTitle1.setText("Point-And-Click");

        menuTitle2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        menuTitle2.setForeground(new java.awt.Color(0, 153, 153));
        menuTitle2.setText("Game Suite");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(menuTitle2)
                    .addComponent(menuTitle1)
                    .addComponent(menuTitle))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTitle2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TopJPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        logoLabel.setIcon(logo);
        TopJPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 300, 300));

        playButton.setBackground(new java.awt.Color(0, 51, 51));
        playButton.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        playButton.setForeground(new java.awt.Color(0, 153, 153));
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        hsButton.setBackground(new java.awt.Color(0, 51, 51));
        hsButton.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        hsButton.setForeground(new java.awt.Color(0, 153, 153));
        hsButton.setText("High Scores");
        hsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsButtonActionPerformed(evt);
            }
        });

        creditsButton.setBackground(new java.awt.Color(0, 51, 51));
        creditsButton.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        creditsButton.setForeground(new java.awt.Color(0, 153, 153));
        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuButtonPanelLayout = new javax.swing.GroupLayout(menuButtonPanel);
        menuButtonPanel.setLayout(menuButtonPanelLayout);
        menuButtonPanelLayout.setHorizontalGroup(
            menuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(creditsButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hsButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        menuButtonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {creditsButton, hsButton, playButton});

        menuButtonPanelLayout.setVerticalGroup(
            menuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TopJPanel.add(menuButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TopJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TopJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        HangmanGame game = new HangmanGame();
        game.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    private void hsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsButtonActionPerformed
        HighScores hs = new HighScores();
        hs.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_hsButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        Credits credits = new Credits();
        credits.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_creditsButtonActionPerformed


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
                java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new HangmanUI().setVisible(true);
                }
            });

        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopJPanel;
    private javax.swing.JButton creditsButton;
    private javax.swing.JButton hsButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuButtonPanel;
    private javax.swing.JLabel menuIcon;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel menuTitle1;
    private javax.swing.JLabel menuTitle2;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
