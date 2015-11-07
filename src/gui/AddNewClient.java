package gui;

import home.ConnectToDatabase;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddNewClient extends javax.swing.JFrame {

    private final String username;
    private String sql;
    private Date date;

    public AddNewClient(String username) {

        this.username = username;
        this.date = new Date();
        this.sql = "";

        initComponents();

        this.tfBookingDate.setText(this.date.toString());
        this.tfEventDate.setText(this.date.toString());
        this.tfDeliveryDate.setText(this.date.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAddNewClient = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfClientName = new javax.swing.JTextField();
        tfClientPhneNumber = new javax.swing.JTextField();
        tfPackageName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfClientAddress = new javax.swing.JTextArea();
        tfTotalPayment = new javax.swing.JTextField();
        tfAdvance = new javax.swing.JTextField();
        tfDueAmmount = new javax.swing.JTextField();
        bReset = new javax.swing.JButton();
        bSaveAndExit = new javax.swing.JButton();
        bSaveAndAddNew = new javax.swing.JButton();
        tfBookingDate = new javax.swing.JTextField();
        tfEventDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbPhotography = new javax.swing.JCheckBox();
        cbCinematgraphy = new javax.swing.JCheckBox();
        tfEventDuration = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfDeliveryDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Client Entry");

        jLabel1.setText("Client Name: ");

        jLabel2.setText("Cient Address: ");

        jLabel3.setText("Client Phone Number: ");

        jLabel4.setText("Event Type: ");

        jLabel5.setText("Package Name: ");

        jLabel6.setText("Total Payment: ");

        jLabel7.setText("Advance Payment: ");

        jLabel8.setText("Due Ammount: ");

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 3, 36)); // NOI18N
        jLabel9.setText("Rahul's Photograhy");

        tfClientPhneNumber.setText("+880");

        tfPackageName.setText("Golden");

        tfClientAddress.setColumns(20);
        tfClientAddress.setRows(5);
        jScrollPane1.setViewportView(tfClientAddress);

        tfTotalPayment.setText("0");
        tfTotalPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTotalPaymentKeyReleased(evt);
            }
        });

        tfAdvance.setText("0");
        tfAdvance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAdvanceKeyReleased(evt);
            }
        });

        tfDueAmmount.setText("0");

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bSaveAndExit.setText("Save And Exit");
        bSaveAndExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveAndExitActionPerformed(evt);
            }
        });

        bSaveAndAddNew.setText("Save And Add New");
        bSaveAndAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveAndAddNewActionPerformed(evt);
            }
        });

        tfBookingDate.setEditable(false);

        jLabel10.setText("Booking Date: ");

        jLabel11.setText("Event Date: ");

        cbPhotography.setText("Photography");

        cbCinematgraphy.setText("Cninematography");

        tfEventDuration.setText("1");

        jLabel12.setText("Event Duration: ");

        jLabel13.setText("Day(s)");

        jLabel14.setText("Delivery Date: ");

        jLabel15.setText("Copyright $ ashik.ar.420@gmail.com");

        javax.swing.GroupLayout pAddNewClientLayout = new javax.swing.GroupLayout(pAddNewClient);
        pAddNewClient.setLayout(pAddNewClientLayout);
        pAddNewClientLayout.setHorizontalGroup(
            pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAddNewClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAddNewClientLayout.createSequentialGroup()
                        .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDueAmmount)
                            .addComponent(tfAdvance)
                            .addComponent(tfTotalPayment)
                            .addComponent(tfPackageName, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
                    .addGroup(pAddNewClientLayout.createSequentialGroup()
                        .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAddNewClientLayout.createSequentialGroup()
                                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pAddNewClientLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pAddNewClientLayout.createSequentialGroup()
                                .addComponent(tfEventDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addComponent(tfClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(tfClientPhneNumber)
                            .addComponent(tfBookingDate)
                            .addComponent(tfEventDate)
                            .addGroup(pAddNewClientLayout.createSequentialGroup()
                                .addComponent(cbPhotography)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbCinematgraphy))
                            .addComponent(tfDeliveryDate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pAddNewClientLayout.createSequentialGroup()
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAddNewClientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSaveAndExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSaveAndAddNew))
                    .addGroup(pAddNewClientLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(pAddNewClientLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pAddNewClientLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bReset, bSaveAndAddNew, bSaveAndExit});

        pAddNewClientLayout.setVerticalGroup(
            pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAddNewClientLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfClientPhneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbPhotography)
                    .addComponent(cbCinematgraphy))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEventDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPackageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDueAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bSaveAndExit)
                    .addComponent(bSaveAndAddNew))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pAddNewClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pAddNewClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed

        this.date = new Date();

        this.tfClientName.setText("");
        this.tfClientAddress.setText("");
        this.tfClientPhneNumber.setText("+880");
        this.tfBookingDate.setText(this.date.toString());
        this.tfEventDate.setText(this.date.toString());
        this.cbCinematgraphy.setSelected(false);
        this.cbPhotography.setSelected(false);
        this.tfEventDuration.setText("1");
        this.tfDeliveryDate.setText(this.date.toString());
        this.tfPackageName.setText("Golden");
        this.tfTotalPayment.setText("0");
        this.tfAdvance.setText("0");
        this.tfDueAmmount.setText("0");
    }//GEN-LAST:event_bResetActionPerformed

    private void bSaveAndExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveAndExitActionPerformed

        try {
            this.addNewEntry();

            this.dispose();
        } catch (HeadlessException ex) {
            Logger.getLogger(AddNewClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bSaveAndExitActionPerformed

    private void bSaveAndAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveAndAddNewActionPerformed

        try {
            this.addNewEntry();

            this.bResetActionPerformed(evt);
        } catch (HeadlessException ex) {
            Logger.getLogger(AddNewClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bSaveAndAddNewActionPerformed

    private void tfTotalPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTotalPaymentKeyReleased

        if (!this.tfTotalPayment.getText().trim().equals("")) {

            int i = Integer.parseInt(this.tfTotalPayment.getText()) - Integer.parseInt(this.tfAdvance.getText());
            this.tfDueAmmount.setText(String.valueOf(i));
            if (i < 0) {

                this.tfDueAmmount.setBackground(Color.RED);
                this.tfTotalPayment.setBackground(Color.YELLOW);
                JOptionPane.showMessageDialog(null,
                        "This is not allowed to this system. This may crush the system. Please check again.");
            } else {
                
                this.tfDueAmmount.setBackground(Color.WHITE);
                this.tfTotalPayment.setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_tfTotalPaymentKeyReleased

    private void tfAdvanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAdvanceKeyReleased

        if (!this.tfAdvance.getText().trim().equals("")) {

            int i = Integer.parseInt(this.tfTotalPayment.getText()) - Integer.parseInt(this.tfAdvance.getText());
            this.tfDueAmmount.setText(String.valueOf(i));
            if (i < 0) {

                this.tfDueAmmount.setBackground(Color.RED);
                this.tfAdvance.setBackground(Color.YELLOW);
                JOptionPane.showMessageDialog(null,
                        "This is not allowed to this system. This may crush the system. Please check again.");
            } else {
                
                this.tfDueAmmount.setBackground(Color.WHITE);
                this.tfAdvance.setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_tfAdvanceKeyReleased

    private void addNewEntry() {

        try {
            
            String photographyString = "NO";
            String cinematgraphyString = "NO";

            if (cbCinematgraphy.isSelected()) {

                cinematgraphyString = "YES";
            }

            if (cbPhotography.isSelected()) {

                photographyString = "YES";
            }

            this.sql = "INSERT INTO " + this.username + "(client_name, client_address, phone, "
                    + "booking_date, event_date, photography, cinematography, package_name, "
                    + "total_payment, advance, delivery_date, event_duration) VALUES ("
                    + "\"" + this.tfClientName.getText() + "\","
                    + "\"" + this.tfClientAddress.getText() + "\","
                    + "\"" + this.tfClientPhneNumber.getText() + "\","
                    + "\"" + this.tfBookingDate.getText() + "\","
                    + "\"" + this.tfEventDate.getText() + "\","
                    + "\"" + photographyString + "\","
                    + "\"" + cinematgraphyString + "\","
                    + "\"" + this.tfPackageName.getText() + "\","
                    + "\"" + this.tfTotalPayment.getText() + "\","
                    + "\"" + this.tfAdvance.getText() + "\","
                    + "\"" + this.tfDeliveryDate.getText() + "\","
                    + "\"" + this.tfEventDuration.getText() + "\""
                    + ")";

            ConnectToDatabase.getResult(this.sql);

            JOptionPane.showMessageDialog(null, "A New entry is added successfully to your list.");
        } catch (Exception e) {

            System.err.println(e);
        }
    }

    public void launch() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddNewClient(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSaveAndAddNew;
    private javax.swing.JButton bSaveAndExit;
    private javax.swing.JCheckBox cbCinematgraphy;
    private javax.swing.JCheckBox cbPhotography;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pAddNewClient;
    private javax.swing.JTextField tfAdvance;
    private javax.swing.JTextField tfBookingDate;
    private javax.swing.JTextArea tfClientAddress;
    private javax.swing.JTextField tfClientName;
    private javax.swing.JTextField tfClientPhneNumber;
    private javax.swing.JTextField tfDeliveryDate;
    private javax.swing.JTextField tfDueAmmount;
    private javax.swing.JTextField tfEventDate;
    private javax.swing.JTextField tfEventDuration;
    private javax.swing.JTextField tfPackageName;
    private javax.swing.JTextField tfTotalPayment;
    // End of variables declaration//GEN-END:variables
}
