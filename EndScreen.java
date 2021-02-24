
package theguild.hangman;

import java.awt.Color;

/**
 *
 * @author kiann
 */
public class EndScreen extends javax.swing.JFrame {
    
    private static Color bgColor = java.awt.Color.blue.darker().darker().darker().darker();

    public EndScreen() {
        initComponents();
        getContentPane().setBackground(bgColor);
        endButtonPanel.setBackground(bgColor);
        javax.swing.ImageIcon img = new javax.swing.ImageIcon("src//main//java//resources//tgicon.png");
        setIconImage(img.getImage());
    }
    
    public EndScreen(int score) {
        initComponents();
        scoreText.setText(scoreText.getText() + score + " points");
        getContentPane().setBackground(bgColor);
        endButtonPanel.setBackground(bgColor);
        javax.swing.ImageIcon img = new javax.swing.ImageIcon("src//main//java//resources//tgicon.png");
        setIconImage(img.getImage());
        
        HighScores highScores = new HighScores();
        int minHighScore= highScores.getMinHighScore();
        
        if(score > minHighScore)
        {
            HighScoreEntry hsEntryFrame = new HighScoreEntry();
            hsEntryFrame.setSize(600,400);
            hsEntryFrame.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        endText = new javax.swing.JLabel();
        scoreText = new javax.swing.JLabel();
        endButtonPanel = new javax.swing.JPanel();
        endMenuButton = new javax.swing.JButton();
        endRestartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        endText.setBackground(new java.awt.Color(0, 51, 51));
        endText.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        endText.setForeground(new java.awt.Color(0, 153, 153));
        endText.setText("You finished the game!");

        scoreText.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        scoreText.setForeground(new java.awt.Color(0, 153, 153));
        scoreText.setText("You scored: ");

        endMenuButton.setBackground(new java.awt.Color(0, 51, 51));
        endMenuButton.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        endMenuButton.setForeground(new java.awt.Color(0, 153, 153));
        endMenuButton.setText("Back To Menu");
        endMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endMenuButtonActionPerformed(evt);
            }
        });

        endRestartButton.setBackground(new java.awt.Color(0, 51, 51));
        endRestartButton.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        endRestartButton.setForeground(new java.awt.Color(0, 153, 153));
        endRestartButton.setText("Try Again?");
        endRestartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endRestartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout endButtonPanelLayout = new javax.swing.GroupLayout(endButtonPanel);
        endButtonPanel.setLayout(endButtonPanelLayout);
        endButtonPanelLayout.setHorizontalGroup(
            endButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(endRestartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(endMenuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );
        endButtonPanelLayout.setVerticalGroup(
            endButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endButtonPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(endRestartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(endText, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(endText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(endButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void endMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endMenuButtonActionPerformed
        HangmanUI menu = new HangmanUI();
        menu.setSize(600,400);
        menu.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_endMenuButtonActionPerformed

    private void endRestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endRestartButtonActionPerformed
        HangmanGame game = new HangmanGame();
        game.setSize(600,400);
        game.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_endRestartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel endButtonPanel;
    private javax.swing.JButton endMenuButton;
    private javax.swing.JButton endRestartButton;
    private javax.swing.JLabel endText;
    private javax.swing.JLabel scoreText;
    // End of variables declaration//GEN-END:variables
}
