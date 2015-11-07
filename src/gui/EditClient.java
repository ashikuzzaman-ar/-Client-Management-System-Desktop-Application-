package gui;

import home.ConnectToDatabase;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditClient extends javax.swing.JFrame {

    private final String eventDate;
    private final String clientName;
    private final String clientAddress;
    private final String clientPhone;
    private final String packageName;
    private final String deliveryDate;
    private final String totalPayment;
    private final String advance;
    private final String bookingDate;
    private final String photography;
    private final String cinematography;
    private final String eventDuration;
    private final String username;

    public EditClient(String eventDate, String clientName, String clientAddress, String clientPhone,
            String packageName, String deliveryDate, String totalPayment, String advance,
            String bookingDate, String photography, String cinematography, String eventDuration, String username) {

        this.eventDate = eventDate;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.packageName = packageName;
        this.deliveryDate = deliveryDate;
        this.totalPayment = totalPayment;
        this.advance = advance;
        this.bookingDate = bookingDate;
        this.photography = photography;
        this.cinematography = cinematography;
        this.eventDuration = eventDuration;
        this.username = username;

        initComponents();

        initializerComponent();
    }

    private void initializerComponent() {

        this.tfEventDate.setText(this.eventDate);
        this.tfClientName.setText(this.clientName);
        this.tfClientAddress.setText(this.clientAddress);
        this.tfClientPhneNumber.setText(this.clientPhone);
        this.tfPackageName.setText(this.packageName);
        this.tfDeliveryDate.setText(this.deliveryDate);
        this.tfTotalPayment.setText(this.totalPayment);
        this.tfAdvance.setText(this.advance);
        this.tfBookingDate.setText(this.bookingDate);
        this.tfEventDuration.setText(this.eventDuration);

        if (this.photography.equals("YES")) {

            this.cbPhotography.setSelected(true);
        }

        if (this.cinematography.equals("YES")) {

            this.cbCinematgraphy.setSelected(true);
        }

        int i = Integer.parseInt(this.totalPayment) - Integer.parseInt(this.advance);

        this.tfDueAmmount.setText(String.valueOf(i));

        if (i < 0) {

            this.tfDueAmmount.setBackground(Color.RED);
        }
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
        bCancel = new javax.swing.JButton();
        bSaveAndExit = new javax.swing.JButton();
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
        setTitle("Edit Entry");

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

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bSaveAndExit.setText("Save And Exit");
        bSaveAndExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveAndExitActionPerformed(evt);
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
                .addGap(110, 110, 110)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pAddNewClientLayout.createSequentialGroup()
                .addGroup(pAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(tfDeliveryDate)))))
                    .addGroup(pAddNewClientLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pAddNewClientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSaveAndExit)))
                .addContainerGap())
        );

        pAddNewClientLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancel, bSaveAndExit});

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
                    .addComponent(bCancel)
                    .addComponent(bSaveAndExit))
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

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void editEntry() {

        String photographyString = "NO";
        String cinematgraphyString = "NO";

        if (cbCinematgraphy.isSelected()) {

            cinematgraphyString = "YES";
        }

        if (cbPhotography.isSelected()) {

            photographyString = "YES";
        }

        String sql;

        sql = ("UPDATE " + this.username + " SET "
                + "client_name = \"" + this.tfClientName.getText() + "\","
                + "client_address = \"" + this.tfClientAddress.getText() + "\","
                + "phone = \"" + this.tfClientPhneNumber.getText() + "\","
                + "booking_date = \"" + this.tfBookingDate.getText() + "\","
                + "event_date = \"" + this.tfEventDate.getText() + "\","
                + "photography = \"" + photographyString + "\","
                + "cinematography = \"" + cinematgraphyString + "\","
                + "package_name = \"" + this.tfPackageName.getText() + "\","
                + "total_payment = \"" + this.tfTotalPayment.getText() + "\","
                + "advance = \"" + this.tfAdvance.getText() + "\","
                + "delivery_date = \"" + this.tfDeliveryDate.getText() + "\","
                + "event_duration = \"" + this.tfEventDuration.getText() + "\" "
                + "WHERE ("
                + "client_name = \"" + this.clientName + "\" AND "
                + "event_date = \"" + this.eventDate + "\" AND "
                + "delivery_date = \"" + this.deliveryDate + "\" AND "
                + "booking_date = \"" + this.bookingDate + "\" AND "
                + "phone = \"" + this.clientPhone + "\""
                + ")");
        
        ConnectToDatabase.getResult(sql);
    }


    private void bSaveAndExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveAndExitActionPerformed

        try {
            
            this.editEntry();

            JOptionPane.showMessageDialog(null, "Your entry is successfully updated!");
            this.dispose();
        } catch (HeadlessException ex) {
            Logger.getLogger(AddNewClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bSaveAndExitActionPerformed

    public void launch() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditClient(eventDate, clientName, clientAddress, clientPhone,
                        packageName, deliveryDate, totalPayment, advance,
                        bookingDate, photography, cinematography, eventDuration, username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
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
