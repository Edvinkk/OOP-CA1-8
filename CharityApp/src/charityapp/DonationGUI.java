/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package charityapp;

/**
 *
 * @author Bogdan Postolachi
 */

import java.awt.event.ActionEvent;


public class DonationGUI extends javax.swing.JFrame {
    private final Donations donation;
    private final DonationHistory donationHistory;
    private final TotalDonationHistory totalDonationHistory;
    /**
     * Creates new form DonationGUI
     */
    public DonationGUI() {
        donation = new Donations();
        donationHistory = new DonationHistory();
        totalDonationHistory = new TotalDonationHistory();
        initComponents();
        //setButtonActions();

    }
    
    
     private void clearFields(){
        nameTf.setText(" ");
        dobTf.setText(" ");
        amountTf.setText(" ");
        historyTa.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        donateLBL = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        raffleBtn = new javax.swing.JButton();
        pollBtn = new javax.swing.JButton();
        walletLbl = new javax.swing.JLabel();
        donateRb = new javax.swing.JRadioButton();
        histRb = new javax.swing.JRadioButton();
        totlHistRb = new javax.swing.JRadioButton();
        nameTf = new javax.swing.JTextField();
        dobTf = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        amountTf = new javax.swing.JTextField();
        amountLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTa = new javax.swing.JTextArea();
        donateBtn = new javax.swing.JButton();
        histBtn = new javax.swing.JButton();
        totHistBtn = new javax.swing.JButton();
        historyLbl = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(753, 511));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 500));

        donateLBL.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        donateLBL.setForeground(new java.awt.Color(0, 255, 102));
        donateLBL.setText("Donate");

        homeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(0, 51, 51));
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        raffleBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        raffleBtn.setText("Raffle");
        raffleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raffleBtnActionPerformed(evt);
            }
        });

        pollBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pollBtn.setText("Poll");
        pollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollBtnActionPerformed(evt);
            }
        });

        walletLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/charityapp/wallet.png"))); // NOI18N
        walletLbl.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeBtn)
                            .addComponent(donateLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pollBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(raffleBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(walletLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(donateLBL)
                .addGap(18, 18, 18)
                .addComponent(walletLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(homeBtn)
                .addGap(46, 46, 46)
                .addComponent(raffleBtn)
                .addGap(46, 46, 46)
                .addComponent(pollBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(donateRb);
        donateRb.setText("Donate");
        donateRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateRbActionPerformed(evt);
            }
        });

        buttonGroup1.add(histRb);
        histRb.setText("View Your History");
        histRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histRbActionPerformed(evt);
            }
        });

        buttonGroup1.add(totlHistRb);
        totlHistRb.setText("View Total History");
        totlHistRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totlHistRbActionPerformed(evt);
            }
        });

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        dobTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTfActionPerformed(evt);
            }
        });

        nameLbl.setText("Full Name:");

        dobLbl.setText("DOB:");

        amountTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTfActionPerformed(evt);
            }
        });

        amountLbl.setText("Donation Ammount:");

        historyTa.setColumns(20);
        historyTa.setRows(5);
        jScrollPane1.setViewportView(historyTa);

        donateBtn.setText("Donate");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
            }
        });

        histBtn.setText("View Your History");
        histBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histBtnActionPerformed(evt);
            }
        });

        totHistBtn.setText("View Total History");
        totHistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totHistBtnActionPerformed(evt);
            }
        });

        historyLbl.setText("History:");

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountTf, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(dobLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(238, 238, 238))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(amountLbl)
                                    .addGap(202, 202, 202))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(historyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(236, 236, 236))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(nameLbl)
                                    .addGap(235, 235, 235))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(donateBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(histBtn)
                                            .addGap(18, 18, 18)
                                            .addComponent(totHistBtn))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(78, 78, 78)))
                            .addComponent(dobTf, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(donateRb, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(histRb)
                                .addGap(34, 34, 34)
                                .addComponent(totlHistRb))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(clearBtn)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donateRb)
                    .addComponent(histRb)
                    .addComponent(totlHistRb))
                .addGap(37, 37, 37)
                .addComponent(nameLbl)
                .addGap(12, 12, 12)
                .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dobLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dobTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(amountLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(historyLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donateBtn)
                    .addComponent(histBtn)
                    .addComponent(totHistBtn))
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        CharityGUI myGUI = new CharityGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void dobTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTfActionPerformed

    private void amountTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTfActionPerformed

    private void donateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBtnActionPerformed
        // TODO add your handling code here:
        String userName = nameTf.getText().trim();
        String dob = dobTf.getText().trim();
        String amountText = amountTf.getText().trim();

        if (userName.isEmpty() || dob.isEmpty() || amountText.isEmpty()) {
            historyTa.setText("All fields are required to donate.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            String message = "Thank you for your generous support!";
            totalDonationHistory.addDonation(userName, "defaultPassword", amount, dob, message);

            historyTa.setText("Thank you for your donation, " + userName + "!");
        } catch (NumberFormatException ex) {
            historyTa.setText("Please enter a valid donation amount.");
        }
    }//GEN-LAST:event_donateBtnActionPerformed

    private void histBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histBtnActionPerformed
        // TODO add your handling code here:
        String totalHistory = donationHistory.displayHistory();
       historyTa.setText(totalHistory);
    }//GEN-LAST:event_histBtnActionPerformed

    private void totHistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totHistBtnActionPerformed
        // TODO add your handling code here:
       String totalHistory = totalDonationHistory.displayTotalDonations();
       historyTa.setText(totalHistory);
    }//GEN-LAST:event_totHistBtnActionPerformed

    private void raffleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffleBtnActionPerformed
        // TODO add your handling code here:
        RaffleGUI myGUI = new RaffleGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_raffleBtnActionPerformed

    private void pollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollBtnActionPerformed
        // TODO add your handling code here:
        PollGUI myGUI = new PollGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pollBtnActionPerformed

    private void donateRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateRbActionPerformed
        // TODO add your handling code here:
        nameLbl.setVisible(true);
        nameTf.setVisible(true);
        dobLbl.setVisible(true);
        dobTf.setVisible(true);
        amountLbl.setVisible(true);
        amountTf.setVisible(true);
        historyLbl.setVisible(false);
        historyTa.setVisible(true);
        donateBtn.setVisible(true);
        histBtn.setVisible(false);
        totHistBtn.setVisible(false);
    }//GEN-LAST:event_donateRbActionPerformed

    private void histRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histRbActionPerformed
        // TODO add your handling code here:
        nameLbl.setVisible(true);
        nameTf.setVisible(true);
        dobLbl.setVisible(false);
        dobTf.setVisible(false);
        amountLbl.setVisible(false);
        amountTf.setVisible(false);
        historyLbl.setVisible(true);
        historyTa.setVisible(true);
        donateBtn.setVisible(false);
        histBtn.setVisible(true);
        totHistBtn.setVisible(false);
    }//GEN-LAST:event_histRbActionPerformed

    private void totlHistRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totlHistRbActionPerformed
        // TODO add your handling code here:
        nameLbl.setVisible(true);
        nameTf.setVisible(true);
        dobLbl.setVisible(false);
        dobTf.setVisible(false);
        amountLbl.setVisible(false);
        amountTf.setVisible(false);
        historyLbl.setVisible(true);
        historyTa.setVisible(true);
        donateBtn.setVisible(false);
        histBtn.setVisible(false);
        totHistBtn.setVisible(true);
    }//GEN-LAST:event_totlHistRbActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    
    
   /* private void setButtonActions() {
    // Action for "Donate" button
    //donateBtn.setText("Donate");
    donateBtn.addActionListener((ActionEvent e) -> {
        String name1 = nameTf.getText().trim();
        String dob = dobTf.getText().trim();
        String amountText = amountTf.getText().trim();
        if (name1.isEmpty() || dob.isEmpty() || amountText.isEmpty()) {
            historyTa.setText("All fields are required to donate.");
            return;
        }
        try {
            double amount = Double.parseDouble(amountText);
            donation.addDonation(amount);
            donationHistory.addDonationEntry(amount);
            totalDonationHistory.addDonation(name1, amount);
            historyTa.setText("Thank you for your donation, " + name1 + "!");
        }catch (NumberFormatException ex) {
            historyTa.setText("Please enter a valid amount.");
        }
    });

    // Action for "View Your History" button
    //histBtn.setText("View Your History");
    histBtn.addActionListener((ActionEvent e) -> {
        StringBuilder history = donationHistory.getHistory();
        if (history.length() == 0) {
            historyTa.setText("No donation history found.");
        } else {
            historyTa.setText(history.toString());
        }
    });

    // Action for "View Total History" button
    //totHistBtn.setText("View Total History");
    totHistBtn.addActionListener((ActionEvent e) -> {
        String totalHistory = totalDonationHistory.displayTotalDonations();
        historyTa.setText(totalHistory);
    });
}*/

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
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DonationGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTf;
    private javax.swing.JButton donateBtn;
    private javax.swing.JLabel donateLBL;
    private javax.swing.JRadioButton donateRb;
    private javax.swing.JButton histBtn;
    private javax.swing.JRadioButton histRb;
    private javax.swing.JLabel historyLbl;
    private javax.swing.JTextArea historyTa;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JButton pollBtn;
    private javax.swing.JButton raffleBtn;
    private javax.swing.JButton totHistBtn;
    private javax.swing.JRadioButton totlHistRb;
    private javax.swing.JLabel walletLbl;
    // End of variables declaration//GEN-END:variables
}
