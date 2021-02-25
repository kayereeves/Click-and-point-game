
package theguild.hangman;

import java.awt.Color;
import java.util.Calendar;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author kiann
 */
public class HangmanGame extends javax.swing.JFrame {
    
    private String word;
    private String displayWord = ""; //partially obscured for display
    private String[] wordBank;
    private int wordBankSize;
    private int numUniqueLetters;
    private int livesRemaining = 6; //lose if livesRemaining = 0
    private int score = 100;
    private int lettersGuessed = 0; //win if lettersGuessed = numUniqueLetters
    private int lettersGuessedRight = 0;

    public HangmanGame() {
 
        wordBank = setWordBank();
  
        setWordString();
        setUniqueLetters();
        initComponents();
        GlobalCode.loadJFramePreferences(this, TopJPanel);
        keyboardPanel.setBackground(GlobalCode.bgColor);
        bodyPanel.setBackground(GlobalCode.bgColor);
        head.setBackground(GlobalCode.bgColor);
        torso.setBackground(GlobalCode.bgColor);
        legs.setBackground(GlobalCode.bgColor);
        wordTextDisplay.setBackground(GlobalCode.bgColor);
        wordTextDisplay.setText(displayWord);
        GlobalCode.clock(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopJPanel = new javax.swing.JPanel();
        keyboardPanel = new javax.swing.JPanel();
        vButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        aButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        hangmanHead = new javax.swing.JLabel();
        torso = new javax.swing.JPanel();
        hangmanArmR = new javax.swing.JLabel();
        hangmanBody = new javax.swing.JLabel();
        hangmanArmL = new javax.swing.JLabel();
        legs = new javax.swing.JPanel();
        hangmanLegR = new javax.swing.JLabel();
        hangmanLegL = new javax.swing.JLabel();
        wordTextDisplay = new javax.swing.JLabel();
        endGameText = new javax.swing.JLabel();
        TopJPanel1 = new javax.swing.JPanel();
        skipButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 400));
        setPreferredSize(new java.awt.Dimension(560, 400));

        TopJPanel.setOpaque(false);
        TopJPanel.setPreferredSize(new java.awt.Dimension(560, 400));
        TopJPanel.setRequestFocusEnabled(false);

        vButton.setBackground(new java.awt.Color(0, 51, 51));
        vButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        vButton.setForeground(new java.awt.Color(0, 153, 153));
        vButton.setText("V");
        vButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vButtonActionPerformed(evt);
            }
        });

        qButton.setBackground(new java.awt.Color(0, 51, 51));
        qButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        qButton.setForeground(new java.awt.Color(0, 153, 153));
        qButton.setText("Q");
        qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });

        hButton.setBackground(new java.awt.Color(0, 51, 51));
        hButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        hButton.setForeground(new java.awt.Color(0, 153, 153));
        hButton.setText("H");
        hButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hButtonActionPerformed(evt);
            }
        });

        uButton.setBackground(new java.awt.Color(0, 51, 51));
        uButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        uButton.setForeground(new java.awt.Color(0, 153, 153));
        uButton.setText("U");
        uButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uButtonActionPerformed(evt);
            }
        });

        gButton.setBackground(new java.awt.Color(0, 51, 51));
        gButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        gButton.setForeground(new java.awt.Color(0, 153, 153));
        gButton.setText("G");
        gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });

        jButton.setBackground(new java.awt.Color(0, 51, 51));
        jButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jButton.setForeground(new java.awt.Color(0, 153, 153));
        jButton.setText("J");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        mButton.setBackground(new java.awt.Color(0, 51, 51));
        mButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        mButton.setForeground(new java.awt.Color(0, 153, 153));
        mButton.setText("M");
        mButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonActionPerformed(evt);
            }
        });

        tButton.setBackground(new java.awt.Color(0, 51, 51));
        tButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        tButton.setForeground(new java.awt.Color(0, 153, 153));
        tButton.setText("T");
        tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });

        sButton.setBackground(new java.awt.Color(0, 51, 51));
        sButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        sButton.setForeground(new java.awt.Color(0, 153, 153));
        sButton.setText("S");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });

        wButton.setBackground(new java.awt.Color(0, 51, 51));
        wButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        wButton.setForeground(new java.awt.Color(0, 153, 153));
        wButton.setText("W");
        wButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wButtonActionPerformed(evt);
            }
        });

        yButton.setBackground(new java.awt.Color(0, 51, 51));
        yButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        yButton.setForeground(new java.awt.Color(0, 153, 153));
        yButton.setText("Y");
        yButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yButtonActionPerformed(evt);
            }
        });

        aButton.setBackground(new java.awt.Color(0, 51, 51));
        aButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        aButton.setForeground(new java.awt.Color(0, 153, 153));
        aButton.setText("A");
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });

        pButton.setBackground(new java.awt.Color(0, 51, 51));
        pButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        pButton.setForeground(new java.awt.Color(0, 153, 153));
        pButton.setText("P");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });

        eButton.setBackground(new java.awt.Color(0, 51, 51));
        eButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        eButton.setForeground(new java.awt.Color(0, 153, 153));
        eButton.setText("E");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        lButton.setBackground(new java.awt.Color(0, 51, 51));
        lButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        lButton.setForeground(new java.awt.Color(0, 153, 153));
        lButton.setText("L");
        lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });

        iButton.setBackground(new java.awt.Color(0, 51, 51));
        iButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        iButton.setForeground(new java.awt.Color(0, 153, 153));
        iButton.setText("I");
        iButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButtonActionPerformed(evt);
            }
        });

        rButton.setBackground(new java.awt.Color(0, 51, 51));
        rButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        rButton.setForeground(new java.awt.Color(0, 153, 153));
        rButton.setText("R");
        rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });

        bButton.setBackground(new java.awt.Color(0, 51, 51));
        bButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        bButton.setForeground(new java.awt.Color(0, 153, 153));
        bButton.setText("B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });

        xButton.setBackground(new java.awt.Color(0, 51, 51));
        xButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        xButton.setForeground(new java.awt.Color(0, 153, 153));
        xButton.setText("X");
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });

        fButton.setBackground(new java.awt.Color(0, 51, 51));
        fButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        fButton.setForeground(new java.awt.Color(0, 153, 153));
        fButton.setText("F");
        fButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonActionPerformed(evt);
            }
        });

        nButton.setBackground(new java.awt.Color(0, 51, 51));
        nButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        nButton.setForeground(new java.awt.Color(0, 153, 153));
        nButton.setText("N");
        nButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nButtonActionPerformed(evt);
            }
        });

        zButton.setBackground(new java.awt.Color(0, 51, 51));
        zButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        zButton.setForeground(new java.awt.Color(0, 153, 153));
        zButton.setText("Z");
        zButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zButtonActionPerformed(evt);
            }
        });

        kButton.setBackground(new java.awt.Color(0, 51, 51));
        kButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        kButton.setForeground(new java.awt.Color(0, 153, 153));
        kButton.setText("K");
        kButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonActionPerformed(evt);
            }
        });

        oButton.setBackground(new java.awt.Color(0, 51, 51));
        oButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        oButton.setForeground(new java.awt.Color(0, 153, 153));
        oButton.setText("O");
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });

        cButton.setBackground(new java.awt.Color(0, 51, 51));
        cButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        cButton.setForeground(new java.awt.Color(0, 153, 153));
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        dButton.setBackground(new java.awt.Color(0, 51, 51));
        dButton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        dButton.setForeground(new java.awt.Color(0, 153, 153));
        dButton.setText("D");
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout keyboardPanelLayout = new javax.swing.GroupLayout(keyboardPanel);
        keyboardPanel.setLayout(keyboardPanelLayout);
        keyboardPanelLayout.setHorizontalGroup(
            keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addComponent(hButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addComponent(aButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(keyboardPanelLayout.createSequentialGroup()
                                .addComponent(vButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, keyboardPanelLayout.createSequentialGroup()
                                .addComponent(oButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        keyboardPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {aButton, bButton, cButton, dButton, eButton, fButton, gButton, hButton, iButton, jButton, kButton, lButton, mButton, nButton, oButton, pButton, qButton, rButton, sButton, tButton, uButton, vButton, wButton, xButton, yButton, zButton});

        keyboardPanelLayout.setVerticalGroup(
            keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        keyboardPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aButton, bButton, cButton, dButton, eButton, fButton, gButton, hButton, iButton, jButton, kButton, lButton, mButton, nButton, oButton, pButton, qButton, rButton, sButton, tButton, uButton, vButton, wButton, xButton, yButton, zButton});

        hangmanHead.setBackground(new java.awt.Color(0, 51, 51));
        hangmanHead.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hangmanHead.setForeground(new java.awt.Color(0, 153, 153));
        hangmanHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangmanHead.setText("O");
        hangmanHead.setEnabled(false);

        hangmanArmR.setBackground(new java.awt.Color(0, 51, 51));
        hangmanArmR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hangmanArmR.setForeground(new java.awt.Color(0, 153, 153));
        hangmanArmR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangmanArmR.setText("\\");
            hangmanArmR.setEnabled(false);

            hangmanBody.setBackground(new java.awt.Color(0, 51, 51));
            hangmanBody.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            hangmanBody.setForeground(new java.awt.Color(0, 153, 153));
            hangmanBody.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            hangmanBody.setText("|");
            hangmanBody.setEnabled(false);

            hangmanArmL.setBackground(new java.awt.Color(0, 51, 51));
            hangmanArmL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            hangmanArmL.setForeground(new java.awt.Color(0, 153, 153));
            hangmanArmL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            hangmanArmL.setText("/");
            hangmanArmL.setEnabled(false);

            javax.swing.GroupLayout torsoLayout = new javax.swing.GroupLayout(torso);
            torso.setLayout(torsoLayout);
            torsoLayout.setHorizontalGroup(
                torsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(torsoLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(hangmanArmL)
                    .addGap(0, 0, 0)
                    .addComponent(hangmanBody)
                    .addGap(0, 0, 0)
                    .addComponent(hangmanArmR)
                    .addGap(0, 0, 0))
            );
            torsoLayout.setVerticalGroup(
                torsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(torsoLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(torsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hangmanBody)
                        .addComponent(hangmanArmR)
                        .addComponent(hangmanArmL)))
            );

            javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
            head.setLayout(headLayout);
            headLayout.setHorizontalGroup(
                headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headLayout.createSequentialGroup()
                    .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(torso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(headLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(hangmanHead)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            headLayout.setVerticalGroup(
                headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(hangmanHead, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(torso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            hangmanLegR.setBackground(new java.awt.Color(0, 51, 51));
            hangmanLegR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            hangmanLegR.setForeground(new java.awt.Color(0, 153, 153));
            hangmanLegR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            hangmanLegR.setText("\\");
                hangmanLegR.setEnabled(false);

                hangmanLegL.setBackground(new java.awt.Color(0, 51, 51));
                hangmanLegL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                hangmanLegL.setForeground(new java.awt.Color(0, 153, 153));
                hangmanLegL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                hangmanLegL.setText("/");
                hangmanLegL.setEnabled(false);

                javax.swing.GroupLayout legsLayout = new javax.swing.GroupLayout(legs);
                legs.setLayout(legsLayout);
                legsLayout.setHorizontalGroup(
                    legsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(legsLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(hangmanLegL)
                        .addGap(0, 0, 0)
                        .addComponent(hangmanLegR)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                legsLayout.setVerticalGroup(
                    legsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(legsLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(legsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hangmanLegL)
                            .addComponent(hangmanLegR))
                        .addContainerGap())
                );

                javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
                bodyPanel.setLayout(bodyPanelLayout);
                bodyPanelLayout.setHorizontalGroup(
                    bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(legs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                bodyPanelLayout.setVerticalGroup(
                    bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(legs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                wordTextDisplay.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
                wordTextDisplay.setForeground(new java.awt.Color(0, 153, 153));
                wordTextDisplay.setText("word");

                endGameText.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
                endGameText.setForeground(new java.awt.Color(0, 153, 153));
                endGameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                javax.swing.GroupLayout TopJPanelLayout = new javax.swing.GroupLayout(TopJPanel);
                TopJPanel.setLayout(TopJPanelLayout);
                TopJPanelLayout.setHorizontalGroup(
                    TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopJPanelLayout.createSequentialGroup()
                        .addContainerGap(74, Short.MAX_VALUE)
                        .addGroup(TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(endGameText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keyboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(TopJPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(wordTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(136, Short.MAX_VALUE))
                );
                TopJPanelLayout.setVerticalGroup(
                    TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopJPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(endGameText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wordTextDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keyboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                );

                TopJPanel1.setOpaque(false);
                TopJPanel1.setPreferredSize(new java.awt.Dimension(560, 400));
                TopJPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                skipButton.setBackground(new java.awt.Color(0, 51, 51));
                skipButton.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
                skipButton.setForeground(new java.awt.Color(0, 153, 153));
                skipButton.setText("skip");
                skipButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        skipButtonActionPerformed(evt);
                    }
                });
                TopJPanel1.add(skipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 66, 29));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TopJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TopJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
            }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Button Actions">   
    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        score = 0;
        nextGame(score);
    }//GEN-LAST:event_skipButtonActionPerformed

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aButtonActionPerformed
        aButton.setEnabled(false);
        correctGuess('a');
    }//GEN-LAST:event_aButtonActionPerformed

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
        bButton.setEnabled(false);
        correctGuess('b');
    }//GEN-LAST:event_bButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        cButton.setEnabled(false);
        correctGuess('c');
    }//GEN-LAST:event_cButtonActionPerformed

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButtonActionPerformed
        dButton.setEnabled(false);
        correctGuess('d');
    }//GEN-LAST:event_dButtonActionPerformed

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eButtonActionPerformed
        eButton.setEnabled(false);
        correctGuess('e');
    }//GEN-LAST:event_eButtonActionPerformed

    private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonActionPerformed
        fButton.setEnabled(false);
        correctGuess('f');
    }//GEN-LAST:event_fButtonActionPerformed

    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButtonActionPerformed
        gButton.setEnabled(false);
        correctGuess('g');
    }//GEN-LAST:event_gButtonActionPerformed

    private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hButtonActionPerformed
        hButton.setEnabled(false);
        correctGuess('h');
    }//GEN-LAST:event_hButtonActionPerformed

    private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iButtonActionPerformed
        iButton.setEnabled(false);
        correctGuess('i');
    }//GEN-LAST:event_iButtonActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        jButton.setEnabled(false);
        correctGuess('j');
    }//GEN-LAST:event_jButtonActionPerformed

    private void kButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonActionPerformed
        kButton.setEnabled(false);
        correctGuess('k');
    }//GEN-LAST:event_kButtonActionPerformed

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButtonActionPerformed
        lButton.setEnabled(false);
        correctGuess('l');
    }//GEN-LAST:event_lButtonActionPerformed

    private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonActionPerformed
        mButton.setEnabled(false);
        correctGuess('m');
    }//GEN-LAST:event_mButtonActionPerformed

    private void nButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nButtonActionPerformed
        nButton.setEnabled(false);
        correctGuess('n');
    }//GEN-LAST:event_nButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        oButton.setEnabled(false);
        correctGuess('o');
    }//GEN-LAST:event_oButtonActionPerformed

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed
        pButton.setEnabled(false);
        correctGuess('p');
    }//GEN-LAST:event_pButtonActionPerformed

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qButtonActionPerformed
        qButton.setEnabled(false);
        correctGuess('q');
    }//GEN-LAST:event_qButtonActionPerformed

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonActionPerformed
        rButton.setEnabled(false);
        correctGuess('r');
    }//GEN-LAST:event_rButtonActionPerformed

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        sButton.setEnabled(false);
        correctGuess('s');
    }//GEN-LAST:event_sButtonActionPerformed

    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtonActionPerformed
        tButton.setEnabled(false);
        correctGuess('t');
    }//GEN-LAST:event_tButtonActionPerformed

    private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uButtonActionPerformed
        uButton.setEnabled(false);
        correctGuess('u');
    }//GEN-LAST:event_uButtonActionPerformed

    private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vButtonActionPerformed
        vButton.setEnabled(false);
        correctGuess('v');
    }//GEN-LAST:event_vButtonActionPerformed

    private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wButtonActionPerformed
        wButton.setEnabled(false);
        correctGuess('w');
    }//GEN-LAST:event_wButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        xButton.setEnabled(false);
        correctGuess('x');
    }//GEN-LAST:event_xButtonActionPerformed

    private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yButtonActionPerformed
        yButton.setEnabled(false);
        correctGuess('y');
    }//GEN-LAST:event_yButtonActionPerformed

    private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zButtonActionPerformed
        zButton.setEnabled(false);
        correctGuess('z');
    }//GEN-LAST:event_zButtonActionPerformed
    // </editor-fold> 
    
    private void nextGame(int score)
    {
        ColorGame cg = new ColorGame(score);
        cg.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }
    
    private void pauseBeforeNextGame(int score)
    {
        int delay = 2000;
        ActionListener taskPerformer = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                nextGame(score);
            }
        };
        Timer timer = new Timer(delay, taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }
    
    private String[] setWordBank(){
        int index = 0;
        wordBankSize = 0;
        String[] wordBank = {""};
        
        try{
            File wordBankFile = new File("src//main//java//resources//wordBank.txt");        
            Scanner myFileReader = new Scanner(wordBankFile);
            
            while(myFileReader.hasNextLine())
            {
                myFileReader.nextLine();
                wordBankSize++;
            }
            
            wordBank = new String[wordBankSize];
            myFileReader = new Scanner(wordBankFile);
            
            while(myFileReader.hasNextLine())
            {
                wordBank[index] = myFileReader.nextLine();
                index++;
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Oh no! The File cannot be found!");
            e.printStackTrace();
        }

        return wordBank;
    }
    
    //sets no. of unique letters in random word
    private void setUniqueLetters() {
        numUniqueLetters = (int) word.chars().distinct().count();
    }
    //retrieves random word from wordBank array
    private void setWordString() {
        int index = (int) (Math.random() * wordBankSize);
        word = new String(wordBank[index]);

        for (int i = 0; i < word.length(); i++) {
            displayWord = new String(displayWord + "-");
        }
    }

    //reveals a correct letter in the word
    private void revealLetters(char guess) {
        String progress = new String("");

        for (int i = 0; i < word.length(); i++) {
            if (displayWord.charAt(i) == '-') {
                if (word.toLowerCase().charAt(i) == guess) {
                    progress = new String(progress + guess);
                } else {
                    progress = new String(progress + '-');
                }
            } else {
                progress = new String(progress + displayWord.charAt(i));
            }
        }

        displayWord = new String(progress);
        wordTextDisplay.setText(displayWord); //update the text display
    }

    //draws a part of the hangman, corresponding to no. of remaining lives
    private void drawHangmanPart(int lives) {
        switch (lives) {
            case 5:
                hangmanHead.setEnabled(true);
                break;
            case 4:
                hangmanBody.setEnabled(true);
                break;
            case 3:
                hangmanArmL.setEnabled(true);
                break;
            case 2:
                hangmanArmR.setEnabled(true);
                break;
            case 1:
                hangmanLegL.setEnabled(true);
                break;
            case 0:
                hangmanLegR.setEnabled(true);
                hangmanLegR.paintImmediately(hangmanLegR.getVisibleRect());

                break;
            default:
                System.out.println("error");
                break;
        }
    }

    /*determines whether guessed letter is correct and performs appropriate
    action*/
    private void correctGuess(char guess) {
        boolean isCorrect = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == guess) {
                isCorrect = true;
                break;
            }
        }

        lettersGuessed++;
        revealLetters(guess);

        if (isCorrect == false) {
            livesRemaining--;
            score -= 10;
            drawHangmanPart(livesRemaining);
            
            //check to see if player has lost
            if (livesRemaining == 0) {
                pauseBeforeNextGame(score);
                endGameText.setText("You Lose");
            }
        } else {
            
            lettersGuessedRight++;
            
            if (lettersGuessedRight == numUniqueLetters) {
                pauseBeforeNextGame(score);
                endGameText.setText("You Win");
            }
        }
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
            java.util.logging.Logger.getLogger(HangmanGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanGame().setVisible(true);
                
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variable Declarations"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopJPanel;
    private javax.swing.JPanel TopJPanel1;
    private javax.swing.JButton aButton;
    private javax.swing.JButton bButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton cButton;
    private javax.swing.JButton dButton;
    private javax.swing.JButton eButton;
    private javax.swing.JLabel endGameText;
    private javax.swing.JButton fButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JLabel hangmanArmL;
    private javax.swing.JLabel hangmanArmR;
    private javax.swing.JLabel hangmanBody;
    private javax.swing.JLabel hangmanHead;
    private javax.swing.JLabel hangmanLegL;
    private javax.swing.JLabel hangmanLegR;
    private javax.swing.JPanel head;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JButton kButton;
    private javax.swing.JPanel keyboardPanel;
    private javax.swing.JButton lButton;
    private javax.swing.JPanel legs;
    private javax.swing.JButton mButton;
    private javax.swing.JButton nButton;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton skipButton;
    private javax.swing.JButton tButton;
    private javax.swing.JPanel torso;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JLabel wordTextDisplay;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
