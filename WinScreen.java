
package theguild.hangman;

import java.awt.Color;

/**
 *
 * @author kiann
 */
public class WinScreen extends javax.swing.JFrame {

    public WinScreen(int score, String word) {
        initComponents();
        GlobalCode.loadJFramePreferences(this, TopJPanel);
        winButtonPanel.setBackground(GlobalCode.bgColor);
        winText.setBackground(GlobalCode.bgColor);
        wordText.setText(wordText.getText() + word);
        scoreText.setText(scoreText.getText() + score + " points");
 
    }
    
    public WinScreen() {
        initComponents();
        GlobalCode.loadJFramePreferences(this, TopJPanel);
        winButtonPanel.setBackground(GlobalCode.bgColor);
        winText.setBackground(GlobalCode.bgColor);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopJPanel = new javax.swing.JPanel();
        winText = new javax.swing.JLabel();
        winButtonPanel = new javax.swing.JPanel();
        winMenuButton = new javax.swing.JButton();
        winHSButton = new javax.swing.JButton();
        wordText = new javax.swing.JLabel();
        scoreText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TopJPanel.setOpaque(false);
        TopJPanel.setPreferredSize(new java.awt.Dimension(540, 360));

        winText.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        winText.setForeground(new java.awt.Color(0, 153, 153));
        winText.setText("You Win!");

        winMenuButton.setBackground(new java.awt.Color(0, 51, 51));
        winMenuButton.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        winMenuButton.setForeground(new java.awt.Color(0, 153, 153));
        winMenuButton.setText("Back To Menu");
        winMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winMenuButtonActionPerformed(evt);
            }
        });

        winHSButton.setBackground(new java.awt.Color(0, 51, 51));
        winHSButton.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        winHSButton.setForeground(new java.awt.Color(0, 153, 153));
        winHSButton.setText("High Scores");
        winHSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winHSButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winButtonPanelLayout = new javax.swing.GroupLayout(winButtonPanel);
        winButtonPanel.setLayout(winButtonPanelLayout);
        winButtonPanelLayout.setHorizontalGroup(
            winButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(winButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(winMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(winHSButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        winButtonPanelLayout.setVerticalGroup(
            winButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(winHSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(winMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        wordText.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        wordText.setForeground(new java.awt.Color(0, 153, 153));
        wordText.setText("The word is: ");

        scoreText.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        scoreText.setForeground(new java.awt.Color(0, 153, 153));
        scoreText.setText("You scored: ");

        javax.swing.GroupLayout TopJPanelLayout = new javax.swing.GroupLayout(TopJPanel);
        TopJPanel.setLayout(TopJPanelLayout);
        TopJPanelLayout.setHorizontalGroup(
            TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopJPanelLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(winText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(winButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wordText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        TopJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {scoreText, winButtonPanel, winText, wordText});

        TopJPanelLayout.setVerticalGroup(
            TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopJPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(winText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(winButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

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

    private void winMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winMenuButtonActionPerformed
        HangmanUI menu = new HangmanUI();
        menu.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_winMenuButtonActionPerformed

    private void winHSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winHSButtonActionPerformed
        HighScores hs = new HighScores();
        hs.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_winHSButtonActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopJPanel;
    private javax.swing.JLabel scoreText;
    private javax.swing.JPanel winButtonPanel;
    private javax.swing.JButton winHSButton;
    private javax.swing.JButton winMenuButton;
    private javax.swing.JLabel winText;
    private javax.swing.JLabel wordText;
    // End of variables declaration//GEN-END:variables
}
