/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalsproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author James
 */
public class History extends javax.swing.JFrame {

    /**
     * Creates new form History
     */
    Color clkColor, white, red;

    public History() {
        initComponents();

        clkColor = new Color(76, 44, 23);
        white = new Color(255, 255, 255);
        red = new Color(242, 5, 5);

        histo.getColumnModel().getColumn(0).setPreferredWidth(50);
        histo.getColumnModel().getColumn(1).setPreferredWidth(40);
        histo.getColumnModel().getColumn(2).setPreferredWidth(50);
        histo.getColumnModel().getColumn(3).setPreferredWidth(50);
        histo.getColumnModel().getColumn(4).setPreferredWidth(200);
        histo.getColumnModel().getColumn(5).setPreferredWidth(100);
        histo.getColumnModel().getColumn(6).setPreferredWidth(100);
        histo.getColumnModel().getColumn(7).setPreferredWidth(80);
        histo.getColumnModel().getColumn(8).setPreferredWidth(80);

        addtables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bckP = new javax.swing.JPanel();
        bck = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        histo = new javax.swing.JTable();
        delP = new javax.swing.JPanel();
        delB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1185, 623));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 545));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(76, 44, 23));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 545));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HISTORY");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\Image.png")); // NOI18N

        bckP.setBackground(new java.awt.Color(255, 255, 255));
        bckP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bck.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        bck.setForeground(new java.awt.Color(76, 44, 23));
        bck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bck.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\backB.png")); // NOI18N
        bck.setText("BACK");
        bck.setIconTextGap(8);
        bck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bckMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bckPLayout = new javax.swing.GroupLayout(bckP);
        bckP.setLayout(bckPLayout);
        bckPLayout.setHorizontalGroup(
            bckPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bckPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bck, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bckPLayout.setVerticalGroup(
            bckPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bck, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(260, 260, 260)
                .addComponent(bckP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bckP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 918, 55);

        histo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TransactionID", "OrderID", "Payment Method", "Discount", "Date & Time", "Total Payment", "EmployeeID", "Amounttendered", "Change"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(histo);
        if (histo.getColumnModel().getColumnCount() > 0) {
            histo.getColumnModel().getColumn(0).setResizable(false);
            histo.getColumnModel().getColumn(1).setResizable(false);
            histo.getColumnModel().getColumn(2).setResizable(false);
            histo.getColumnModel().getColumn(3).setResizable(false);
            histo.getColumnModel().getColumn(4).setResizable(false);
            histo.getColumnModel().getColumn(5).setResizable(false);
            histo.getColumnModel().getColumn(6).setResizable(false);
            histo.getColumnModel().getColumn(7).setResizable(false);
            histo.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(21, 73, 880, 375);

        delP.setBackground(new java.awt.Color(255, 255, 255));
        delP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 5, 5)));

        delB.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        delB.setForeground(new java.awt.Color(242, 5, 5));
        delB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        delB.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\delR.png")); // NOI18N
        delB.setText("DELETE");
        delB.setIconTextGap(7);
        delB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delBMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delBMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                delBMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout delPLayout = new javax.swing.GroupLayout(delP);
        delP.setLayout(delPLayout);
        delPLayout.setHorizontalGroup(
            delPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delB, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
        );
        delPLayout.setVerticalGroup(
            delPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delB, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel1.add(delP);
        delP.setBounds(414, 466, 99, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\beans-20240420T093021Z-001\\beans\\bean2.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 380, 140, 132);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean3.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(860, 230, 50, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\beans-20240420T093021Z-001\\beans\\bean3.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(790, 60, 140, 132);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean1 (1).png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 70, 70, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean2.png")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 450, 70, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\beans-20240420T093021Z-001\\beans\\bean3.png")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(-20, 190, 140, 132);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean3.png")); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(-10, 440, 50, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bens.png")); // NOI18N
        jLabel12.setText("jLabel7");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(330, 430, 60, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\beans-20240420T093021Z-001\\beans\\bean3.png")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(640, 360, 140, 132);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean1 (1).png")); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(850, 460, 70, 60);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delBMouseClicked
        // TODO add your handling code here:
        int sel = histo.getSelectedRow();
        if (sel != -1) {
            int delete = JOptionPane.showConfirmDialog(null, "Do you want to Remove it?", "Remove Item", JOptionPane.YES_NO_OPTION);
            if (delete == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) histo.getModel();
                int[] rows = histo.getSelectedRows();
                for (int i = 0; i < rows.length; i++) {
                    String delRows = model.getValueAt(histo.getSelectedRow(), 0).toString();
                    model.removeRow(rows[i] - i);
                    delDB(delRows);
                }
                JOptionPane.showMessageDialog(null, "Item remove");
            } else {
                JOptionPane.showMessageDialog(null, "Item canceled");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select the item you want to Remove");
        }
    }//GEN-LAST:event_delBMouseClicked

    private void delBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delBMousePressed
        // TODO add your handling code here:
        delP.setBackground(red);
        delB.setForeground(white);
        delB.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\delW.png")); // NOI18N
    }//GEN-LAST:event_delBMousePressed

    private void bckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckMouseClicked
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        BillingSystem1 bil = new BillingSystem1();
        bil.toFront();
        bil.setState(java.awt.Frame.NORMAL);
        bil.pack();
        bil.setLocationRelativeTo(null);

    }//GEN-LAST:event_bckMouseClicked

    private void bckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckMousePressed
        // TODO add your handling code here:
        bckP.setBackground(clkColor);
        bck.setForeground(white);
        bck.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\backW.png"));

    }//GEN-LAST:event_bckMousePressed

    private void delBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delBMouseReleased
        // TODO add your handling code here:
        delP.setBackground(white);
        delB.setForeground(red);
        delB.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\delR.png"));
    }//GEN-LAST:event_delBMouseReleased
    public void delDB(String delRows) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
            Statement statement = connection.createStatement();

            String qryProd = "DELETE FROM `transaction` WHERE TransactionID = '" + delRows + "'";
            statement.execute(qryProd);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addtables() {

        DefaultTableModel dt = (DefaultTableModel) histo.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
            Statement statement = connection.createStatement();

            String get = "SELECT * FROM `transaction`";
            statement.execute(get);
            String TransactionID = "12345";
            String OrderID = "12345";
            String PaymentMethod = "12345";
            String DiscountAmount = "12345";
            String DateTime = "12345";
            String TotalPayment = "12345";
            String EmployeeID = "12345";
            String Amounttendered = "12345";
            String Change = "12345";
            ResultSet rsProd = statement.executeQuery(get);
            while (rsProd.next()) {
                TransactionID = rsProd.getString("TransactionID");
                OrderID = rsProd.getString("OrderID");
                PaymentMethod = rsProd.getString("PaymentMethod");
                DiscountAmount = rsProd.getString("DiscountAmount");
                DateTime = rsProd.getString("DateTime");
                TotalPayment = rsProd.getString("TotalPayment");
                EmployeeID = rsProd.getString("EmployeeID");
                Amounttendered = rsProd.getString("Amounttendered");
                Change = rsProd.getString("Change");

                Vector v = new Vector();
                v.add(TransactionID);
                v.add(OrderID);
                v.add(PaymentMethod);
                v.add(DiscountAmount);
                v.add(DateTime);
                v.add(TotalPayment);
                v.add(EmployeeID);
                v.add(Amounttendered);
                v.add(Change);

                dt.addRow(v);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bck;
    private javax.swing.JPanel bckP;
    private javax.swing.JLabel delB;
    private javax.swing.JPanel delP;
    private javax.swing.JTable histo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
