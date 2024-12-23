/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package charityapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Edvin
 */
public class CharityGUI extends javax.swing.JFrame {

    //list to store userss
    private ArrayList<Charity> users;

    

    /**
     * Creates new form CharityGUI
     */
    public CharityGUI() {
        initComponents();
        donateBtn.setVisible(false);
        raffleBtn.setVisible(false);
        pollBtn.setVisible(false);
        //load users from a file
        users = loadUsers();
    }

    //save the list of users to a file
    public static void saveUsers(ArrayList<Charity> users) {
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            //Create or open a file to store the users
            f = new File("users.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);

            //Serialize and save the list of users to the file
            oStream.writeObject(users);

            //Close the streams after saving
            oStream.close();
        } catch (IOException e) {
            //Handle any errors during the file saving process
            System.out.println("Error saving users: " + e.getMessage());
        }
    }

    //load the list of users from the file
    public static ArrayList<Charity> loadUsers() {
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;

        //Initialize the list for users
        ArrayList<Charity> users = new ArrayList<>();

        try {
            //Checks if the file exists before attempting to load data
            f = new File("users.dat");
            
            

            if (f.exists()) {
                fStream = new FileInputStream(f);
                oStream = new ObjectInputStream(fStream);

                //Deserialize and load the list of users from the file
                users = (ArrayList<Charity>) oStream.readObject();

                oStream.close();
            }
            //error handling
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }

        //Return the list of users, empty if not found
        return users;
    }

//check if username already exists
    public static boolean usernameExists(String username, ArrayList<Charity> users) {
        //iterates through each Charity object in the users list to check if the username already exists
        for (Charity user : users) {
            if (user.getUserName().equals(username)) {
                //returns true if username does exist
                return true;
            }
        }
        //returns false if username doesn't exist
        return false;
    }

    //validates the login
    public static boolean validateLogin(String username, String password, ArrayList<Charity> users) {
        //iterates through each Charity object in the users list to check if the username and password match
        for (Charity user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                //returns true if login was successful
                return true;
            }
        }
        //returns false if login failed
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        donateBtn = new javax.swing.JButton();
        raffleBtn = new javax.swing.JButton();
        pollBtn = new javax.swing.JButton();
        loginLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        usernameTf = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTf = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        loginRb = new javax.swing.JRadioButton();
        registerRb = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 500));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 500));

        donateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        donateBtn.setText("Donate");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raffleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donateBtn))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(donateBtn)
                .addGap(80, 80, 80)
                .addComponent(raffleBtn)
                .addGap(78, 78, 78)
                .addComponent(pollBtn)
                .addGap(70, 70, 70))
        );

        loginLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginLbl.setText("Log in");

        usernameLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLbl.setText("Username");

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLbl.setText("Password");

        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        typeGrp.add(loginRb);
        loginRb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginRb.setSelected(true);
        loginRb.setText("Log in");

        typeGrp.add(registerRb);
        registerRb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerRb.setText("Register");

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(passwordLbl))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(submitBtn)))
                                .addGap(0, 155, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerRb)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginLbl)
                                    .addComponent(usernameLbl))
                                .addGap(176, 176, 176))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(loginRb, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLbl)
                .addGap(65, 65, 65)
                .addComponent(usernameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(passwordLbl)
                .addGap(18, 18, 18)
                .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(submitBtn)
                .addGap(23, 23, 23)
                .addComponent(loginRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(registerRb)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void donateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBtnActionPerformed
        // TODO add your handling code here:
        DonationGUI myGUI = new DonationGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_donateBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String username = usernameTf.getText();
        String password = passwordTf.getText();
  
        
        
        if (loginRb.isSelected()) {
            if (validateLogin(username, password, users)) {
                donateBtn.setVisible(true);
                raffleBtn.setVisible(true);
                pollBtn.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        } else if (registerRb.isSelected()) {
            if (usernameExists(username, users)) {
                JOptionPane.showMessageDialog(this, "Username already exists.");
            } else {
                Charity newUser = new Charity(username, password);
                users.add(newUser);
                saveUsers(users);
                JOptionPane.showMessageDialog(this, "Registration successful!");
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed


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
            java.util.logging.Logger.getLogger(CharityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharityGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donateBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JRadioButton loginRb;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTf;
    private javax.swing.JButton pollBtn;
    private javax.swing.JButton raffleBtn;
    private javax.swing.JRadioButton registerRb;
    private javax.swing.JButton submitBtn;
    private javax.swing.ButtonGroup typeGrp;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
