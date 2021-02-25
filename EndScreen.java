
package theguild.hangman;

import java.awt.Color;

/**
 *
 * @author kiann
 */
public class EndScreen extends javax.swing.JFrame {

    public EndScreen() {

        initComponents();
        GlobalCode.loadJFramePreferences(this, TopJPanel);
        endButtonPanel.setBackground(GlobalCode.bgColor);
    }
    
    public EndScreen(int score) {
        setPreferredSize(GlobalCode.dims);
        pack();
        initComponents();
        scoreText.setText(scoreText.getText() + score + " points");
        getContentPane().setBackground(GlobalCode.bgColor);
        endButtonPanel.setBackground(GlobalCode.bgColor);
        setIconImage(GlobalCode.img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        endButtonPanel = new javax.swing.JPanel();
        endMenuButton = new javax.swing.JButton();
        endRestartButton = new javax.swing.JButton();
        scoreText = new javax.swing.JLabel();
        endText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 400));

        TopJPanel.setOpaque(false);
        TopJPanel.setPreferredSize(new java.awt.Dimension(560, 400));
        TopJPanel.setLayout(new javax.swing.BoxLayout(TopJPanel, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setOpaque(false);

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
            .addComponent(endMenuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
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

        scoreText.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        scoreText.setForeground(new java.awt.Color(0, 153, 153));
        scoreText.setText("You scored: ");

        endText.setBackground(new java.awt.Color(0, 51, 51));
        endText.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        endText.setForeground(new java.awt.Color(0, 153, 153));
        endText.setText("You finished the game!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {endButtonPanel, endText, scoreText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(endText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(endButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        TopJPanel.add(jPanel1);

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

    private void endMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endMenuButtonActionPerformed
        HangmanUI menu = new HangmanUI();
        menu.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_endMenuButtonActionPerformed

    private void endRestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endRestartButtonActionPerformed
        HangmanGame game = new HangmanGame();
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
    private javax.swing.JPanel TopJPanel;
    private javax.swing.JPanel endButtonPanel;
    private javax.swing.JButton endMenuButton;
    private javax.swing.JButton endRestartButton;
    private javax.swing.JLabel endText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel scoreText;
    // End of variables declaration//GEN-END:variables
}
