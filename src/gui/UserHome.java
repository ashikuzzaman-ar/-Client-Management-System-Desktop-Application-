package gui;

import home.ConnectToDatabase;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserHome extends javax.swing.JFrame {

    private final String username;
    private final Date date;
    private final DefaultTableModel defaultTableModel;
    private final File dummy = new File("");
    private ResultSet resultSet;
    private String sql;

    public UserHome(String username) {

        this.date = new Date();
        this.resultSet = null;
        this.sql = "";

        initComponents();

        this.defaultTableModel = (DefaultTableModel) this.tblClientList.getModel();
        this.username = username;
        eventInitializer();
    }

    private void deleteData() {

        this.sql = ("DELETE FROM " + this.username + " WHERE ( "
                + "client_name = \"" + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 1) + "\" AND "
                + "event_date = \"" + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 0) + "\" AND "
                + "delivery_date = \"" + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 5) + "\" AND "
                + "booking_date = \"" + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 9) + "\" AND "
                + "phone = \"" + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 3) + "\")");

        ConnectToDatabase.getResult(this.sql);
    }

    private void eventInitializer() {

        try {

            this.lCurrentDateTme.setText("Date: " + this.date.toString());
            this.setTitle(this.username);

            this.sql = "select * from " + this.username + " order by event_date";

            this.resultSet = ConnectToDatabase.getResult(this.sql);

            while (this.resultSet.next()) {

                this.defaultTableModel.addRow(new Object[]{
                    this.resultSet.getString("event_date"),
                    this.resultSet.getString("client_name"),
                    this.resultSet.getString("client_address"),
                    this.resultSet.getString("phone"),
                    this.resultSet.getString("package_name"),
                    this.resultSet.getString("delivery_date"),
                    this.resultSet.getString("total_payment"),
                    this.resultSet.getString("advance"),
                    String.valueOf(
                    Integer.parseInt(this.resultSet.getString("total_payment"))
                    - Integer.parseInt(this.resultSet.getString("advance"))),
                    this.resultSet.getString("booking_date"),
                    this.resultSet.getString("photography"),
                    this.resultSet.getString("cinematography"),
                    this.resultSet.getString("event_duration")+" Day(s)"
                });
            }
        } catch (SQLException | NumberFormatException e) {

            System.err.println(e);
        } finally {

            this.tblClientList.setRowHeight(25);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bAddNew = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        lCurrentDateTme = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bRefresh = new javax.swing.JButton();
        bAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bAddNew.setText("Add New");
        bAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddNewActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        lCurrentDateTme.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        lCurrentDateTme.setForeground(new java.awt.Color(102, 0, 255));
        lCurrentDateTme.setText("Date: ");

        tblClientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Date", "Client Name", "Client Address", "Phone", "Package", "Delivery Date", "Total Payment", "Advance", "Due Ammount", "Booking Date", "Phtgraphy", "Cinematgraphy", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientList);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Rahul's Photography");

        jLabel1.setText("Copyright $ ashik.ar.420@gmail.com");

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        bAbout.setText("About");
        bAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bAbout)
                                .addGap(18, 18, 18)
                                .addComponent(bRefresh)
                                .addGap(18, 18, 18)
                                .addComponent(bAddNew)
                                .addGap(18, 18, 18)
                                .addComponent(bEdit)
                                .addGap(18, 18, 18)
                                .addComponent(bDelete))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(lCurrentDateTme, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAbout, bAddNew, bDelete, bEdit, bRefresh});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCurrentDateTme)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAddNew)
                            .addComponent(bEdit)
                            .addComponent(bDelete)
                            .addComponent(bRefresh)
                            .addComponent(bAbout)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddNewActionPerformed

        AddNewClient addNewClient = new AddNewClient(this.username);
        addNewClient.launch();
    }//GEN-LAST:event_bAddNewActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed

        for (int i = this.defaultTableModel.getRowCount() - 1; i >= 0; i--) {

            this.defaultTableModel.removeRow(i);
        }
        this.eventInitializer();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        
        EditClient editClient = new EditClient(
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 0)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 1)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 2)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 3)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 4)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 5)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 6)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 7)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 9)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 10)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 11)),
                String.valueOf(this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 12)),
                this.username
        );
        
        editClient.launch();
    }//GEN-LAST:event_bEditActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        int i = this.tblClientList.getSelectedRow();
        this.deleteData();
        this.defaultTableModel.removeRow(i);
        JOptionPane.showMessageDialog(null, "Row number " + (i+1) + " has been successfully deleted.");
    }//GEN-LAST:event_bDeleteActionPerformed

    private void tblClientListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientListMouseClicked

        String displayString;

        displayString = ("Event Date:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 0) + "\n\n"
                + "Client Name:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 1) + "\n\n"
                + "Client Address:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 2) + "\n\n"
                + "Client Phone Number:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 3) + "\n\n"
                + "Package Name:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 4) + "\n\n"
                + "Delivery Date:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 5) + "\n\n"
                + "Total Payment:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 6) + "\n\n"
                + "Advance:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 7) + "\n\n"
                + "Due Ammount:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 8) + "\n\n"
                + "Boking Date:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 9) + "\n\n"
                + "Photography:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 10) + "\n\n"
                + "Cinematography:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 11) + "\n\n"
                + "Event Duration:  " + this.defaultTableModel.getValueAt(this.tblClientList.getSelectedRow(), 12));

        new ViewDetailsMode(displayString).launch();
    }//GEN-LAST:event_tblClientListMouseClicked

    private void bAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAboutActionPerformed

        About.launch();
    }//GEN-LAST:event_bAboutActionPerformed

    public void launch() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserHome(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAbout;
    private javax.swing.JButton bAddNew;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCurrentDateTme;
    private javax.swing.JTable tblClientList;
    // End of variables declaration//GEN-END:variables
}
