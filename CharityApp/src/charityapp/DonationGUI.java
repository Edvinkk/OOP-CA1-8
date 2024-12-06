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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DonationGUI extends javax.swing.JFrame {

    private final Donations donation;
    //private final DonationHistory donationHistory;
    private TotalDonationHistory totalDonationHistory;

    /**
     * Creates new form DonationGUI
     */
    public DonationGUI() {
        donation = new Donations();
        //donationHistory = new DonationHistory();
        totalDonationHistory = new TotalDonationHistory();
        initComponents();
        //setButtonActions();

    }

    //Default empty fields
    private void clearFields() {
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
        totHistBtn = new javax.swing.JButton();
        historyLbl = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        loadBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        searchTf = new javax.swing.JTextField();
        searchLbl = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();

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

        nameLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 255, 102));
        nameLbl.setText("Full Name:");

        dobLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dobLbl.setForeground(new java.awt.Color(0, 255, 102));
        dobLbl.setText("DOB:");

        amountTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTfActionPerformed(evt);
            }
        });

        amountLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amountLbl.setForeground(new java.awt.Color(0, 255, 102));
        amountLbl.setText("Amount:");

        historyTa.setColumns(20);
        historyTa.setRows(5);
        jScrollPane1.setViewportView(historyTa);

        donateBtn.setBackground(new java.awt.Color(0, 0, 0));
        donateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        donateBtn.setForeground(new java.awt.Color(0, 255, 102));
        donateBtn.setText("Donate");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
            }
        });

        totHistBtn.setBackground(new java.awt.Color(0, 0, 0));
        totHistBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totHistBtn.setForeground(new java.awt.Color(0, 255, 102));
        totHistBtn.setText("View Total History");
        totHistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totHistBtnActionPerformed(evt);
            }
        });

        historyLbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        historyLbl.setForeground(new java.awt.Color(0, 255, 102));
        historyLbl.setText("History:");

        clearBtn.setBackground(new java.awt.Color(0, 0, 0));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(0, 255, 102));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        loadBtn.setBackground(new java.awt.Color(0, 0, 0));
        loadBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadBtn.setForeground(new java.awt.Color(0, 255, 102));
        loadBtn.setText("Load");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(0, 0, 0));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 255, 102));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        searchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTfActionPerformed(evt);
            }
        });

        searchLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        searchLbl.setForeground(new java.awt.Color(0, 255, 102));
        searchLbl.setText("Search:");

        searchBtn.setBackground(new java.awt.Color(0, 0, 0));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 255, 102));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        showBtn.setBackground(new java.awt.Color(0, 0, 0));
        showBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showBtn.setForeground(new java.awt.Color(0, 255, 102));
        showBtn.setText("Show");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dobLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(nameLbl)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(amountTf, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                                            .addComponent(dobTf))
                                                        .addGap(51, 51, 51))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(amountLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)))
                                        .addComponent(donateBtn)
                                        .addGap(116, 116, 116))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(searchLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                        .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(searchBtn)
                                        .addGap(120, 120, 120)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saveBtn)
                                    .addComponent(showBtn)
                                    .addComponent(clearBtn)
                                    .addComponent(loadBtn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(donateRb, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(totlHistRb)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(totHistBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(historyLbl)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donateRb)
                    .addComponent(totlHistRb))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl)
                    .addComponent(clearBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl)
                    .addComponent(dobTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showBtn))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLbl)
                    .addComponent(amountTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donateBtn)
                    .addComponent(saveBtn))
                .addGap(18, 18, 18)
                .addComponent(loadBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLbl)
                    .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(53, 53, 53)
                .addComponent(historyLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totHistBtn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        //Navigation to Home Section
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
        //ensuring the input is clean and ready for use
        //nameTf.getText() retrieves the text entered by the user in the nameTf text field
        String userName = nameTf.getText().trim(); //trim() method removes whitespace from both ends of a string, idea to use from( https://www.w3schools.com/java/ref_string_trim.asp )
        String dob = dobTf.getText().trim(); //trim() prevents accidental white spaces in strings
        String amountText = amountTf.getText().trim();

        //check if any of the input fields are empty.
        if (userName.isEmpty() || dob.isEmpty() || amountText.isEmpty()) {
            historyTa.setText("All fields are required to donate.");
            return; //return statement prevents the statement runing 
        }

        //validate, converts, and processes the donation amount entered by the use
        //try-catch block to manage potential errors that may occur when parsing the donation amount
        try {   //try statement allows to define a block of code to be tested for errors while it is being executed ( https://www.w3schools.com/java/java_try_catch.asp)
            double amount = Double.parseDouble(amountText); //ensures that entered donation amount is a valid numeric value
            String message = "Thank you for your generous support!"; //default message for the donor
            totalDonationHistory.addDonation(userName, "defaultPassword", amount, dob, message); //adds donation details to the total donation history

            historyTa.setText("Thank you for your donation, " + userName + "!"); //thank you mesage displayed on the text area
        } catch (NumberFormatException ex) {  //catch statement allows to define a block of code to be executed, if an error occurs in the try block ( https://www.w3schools.com/java/java_try_catch.asp )
            historyTa.setText("Please enter a valid donation amount.");
        }
    }//GEN-LAST:event_donateBtnActionPerformed

    private void totHistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totHistBtnActionPerformed
        // TODO add your handling code here:
        //retrives the donation history and formats it so it's easy to read for the user
        String totalHistory = totalDonationHistory.displayTotalDonations();
        historyTa.setText(totalHistory);
    }//GEN-LAST:event_totHistBtnActionPerformed

    private void raffleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffleBtnActionPerformed
        // TODO add your handling code here:
        //Navigation to the raffle page
        RaffleGUI myGUI = new RaffleGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_raffleBtnActionPerformed

    private void pollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollBtnActionPerformed
        // TODO add your handling code here:
        //Navigation to poll page
        PollGUI myGUI = new PollGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pollBtnActionPerformed

    private void donateRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateRbActionPerformed
        // TODO add your handling code here:
        //Hides buttons that aren't needed for donating
        nameLbl.setVisible(true);
        nameTf.setVisible(true);
        dobLbl.setVisible(true);
        dobTf.setVisible(true);
        amountLbl.setVisible(true);
        amountTf.setVisible(true);
        historyLbl.setVisible(false);
        historyTa.setVisible(true);
        donateBtn.setVisible(true);
        //histBtn.setVisible(false);
        totHistBtn.setVisible(false);
        searchLbl.setVisible(false);
        searchTf.setVisible(false);
        searchBtn.setVisible(false);
        clearBtn.setVisible(true);
        saveBtn.setVisible(true);
        loadBtn.setVisible(true);
        searchBtn.setVisible(false);
    }//GEN-LAST:event_donateRbActionPerformed

    private void totlHistRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totlHistRbActionPerformed
        // TODO add your handling code here:
        //Hides buttons that aren't needed for viewing the history
        nameLbl.setVisible(true);
        nameTf.setVisible(true);
        dobLbl.setVisible(false);
        dobTf.setVisible(false);
        amountLbl.setVisible(false);
        amountTf.setVisible(false);
        historyLbl.setVisible(true);
        historyTa.setVisible(true);
        donateBtn.setVisible(false);
        //histBtn.setVisible(false);
        totHistBtn.setVisible(true);
        searchLbl.setVisible(true);
        searchTf.setVisible(true);
        searchBtn.setVisible(true);
        clearBtn.setVisible(true);
        saveBtn.setVisible(true);
        loadBtn.setVisible(true);
        searchBtn.setVisible(true);
    }//GEN-LAST:event_totlHistRbActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        //calls the method for clearing all text
        clearFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        //save the totalDonationHistory object to a .dat file
        
        //file creation and object serialization
        File f; 
        FileOutputStream fStream;
        ObjectOutputStream oStream; 
        
        try{
            //create objects for saving to the .dat file
            f = new File("TotalDonationHistory.dat"); //file where data will be saved
            fStream = new FileOutputStream(f);  //stream for writing raw byte data to the file
            oStream = new ObjectOutputStream(fStream); //writing Java objects to the file in a serialized format
            
            oStream.writeObject(totalDonationHistory);
            historyTa.setText("Total donation history saved successfully."); //update text area with success message
            
        } catch (IOException e) {
            historyTa.setText("Error saving total donation history: " + e); //update text area with error message
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        // TODO add your handling code here:
       //variables for handling file operations
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        
        try{
            f = new File("TotalDonationHistory.dat");
            fStream = new FileInputStream(f); //opens file
            oStream = new ObjectInputStream(fStream); //deserializes the object stored in the file
            
            totalDonationHistory = (TotalDonationHistory)oStream.readObject();
            
            //closes the ObjectInputStream
            oStream.close();
            
            //retrieves the list of all donations
            ArrayList<Donations> allDonations = totalDonationHistory.getAllDonations();
            
            //totalDonationHistory = new TotalDonationHistory();
            
            for (Donations tdh : allDonations) {
                historyTa.append("Name:"+tdh.getUserName()+"\nDOB:"+tdh.getDob()+"\n Amount:"+tdh.getdAmount()); //adding details to text area
            }
            historyTa.setText("Total donation history loaded successfully."); //success statement
        } catch (FileNotFoundException e) {
            historyTa.setText("No donation history file found."); //no file error
        } catch (IOException | ClassNotFoundException e) {
            historyTa.setText("Error loading total donation history: " + e); //error message
        }
    }//GEN-LAST:event_loadBtnActionPerformed

    private void searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTfActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
    //getting text from searchTf    
    String userName = searchTf.getText().trim();

    if (userName.isEmpty()) { //checking if userName is empty
        historyTa.setText("Please enter a valid username."); //error message
        return;
    }

    Donations userDonation = null;
    for (Donations donation : totalDonationHistory.getAllDonations()) {
        if (donation.getUserName().equalsIgnoreCase(userName)) {
            userDonation = donation;
            break;
        }
    }

    if (userDonation != null) { //if matching userDonation is found
        historyTa.setText("Donation History for " + userName + ":\n");
        for (Double amount : userDonation.getDonationAmounts()) {
            historyTa.append("€" + amount + "\n");
        }
    } else {
        historyTa.setText("No donation history found for user: " + userName);
    }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        //retrieve and display all donation records
        
        ArrayList<Donations> allDonations = totalDonationHistory.getAllDonations();
        
        if(allDonations.isEmpty()){
            historyTa.setText("No available history");
        }
        else{
            for (Donations tdh : allDonations) {
                historyTa.append("Name:"+tdh.getUserName()+"\nDOB:"+tdh.getDob()+"\n Amount:"+tdh.getdAmount());
            }
        }
    }//GEN-LAST:event_showBtnActionPerformed

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
    private javax.swing.JLabel historyLbl;
    private javax.swing.JTextArea historyTa;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JButton pollBtn;
    private javax.swing.JButton raffleBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTf;
    private javax.swing.JButton showBtn;
    private javax.swing.JButton totHistBtn;
    private javax.swing.JRadioButton totlHistRb;
    private javax.swing.JLabel walletLbl;
    // End of variables declaration//GEN-END:variables
}
