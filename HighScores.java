
package theguild.hangman;

import java.awt.Color;

/**
 *
 * @author kiann
 */
public class HighScores extends javax.swing.JFrame {

    public HighScores() {
        setPreferredSize(GlobalCode.dims);
        pack();
        initComponents();
        getContentPane().setBackground(GlobalCode.bgColor);
        setIconImage(GlobalCode.img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        highScoresText = new javax.swing.JLabel();
        hsBackButton = new javax.swing.JButton();
        score1 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        score3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        highScoresText.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        highScoresText.setForeground(new java.awt.Color(0, 153, 153));
        highScoresText.setText("High Scores");

        hsBackButton.setBackground(new java.awt.Color(0, 51, 51));
        hsBackButton.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        hsBackButton.setForeground(new java.awt.Color(0, 153, 153));
        hsBackButton.setText("Back to menu");
        hsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsBackButtonActionPerformed(evt);
            }
        });

        score1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        score1.setForeground(new java.awt.Color(0, 153, 153));
        score1.setText("ABC.....00000");

        score2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        score2.setForeground(new java.awt.Color(0, 153, 153));
        score2.setText("ABC.....00000");

        score3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        score3.setForeground(new java.awt.Color(0, 153, 153));
        score3.setText("ABC.....00000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(score2)
                            .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(hsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(highScoresText)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(highScoresText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(score2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(score3)
                .addGap(28, 28, 28)
                .addComponent(hsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hsBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsBackButtonActionPerformed
        HangmanUI menu = new HangmanUI();
        menu.setSize(600,400);
        menu.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_hsBackButtonActionPerformed

    private void hsMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        HangmanUI menu = new HangmanUI();
        menu.setSize(600,400);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel highScoresText;
    private javax.swing.JButton hsBackButton;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    private javax.swing.JLabel score3;
    // End of variables declaration//GEN-END:variables
}
