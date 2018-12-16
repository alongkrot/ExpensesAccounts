/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expensesaccounts;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author POND
 */
public class FrmType extends javax.swing.JDialog {

    /** Creates new form FrmType */
    public FrmType(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dgvShow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmdClear = new javax.swing.JButton();
        cmdSave = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dgvShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ชื่อรายการ"
            }
        ));
        dgvShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvShow);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ชื่อรายการ");

        cmdClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clean2.png"))); // NOI18N
        cmdClear.setText("ล้าง");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdClear)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClear))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cmdSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file+1.png"))); // NOI18N
        cmdSave.setText("เพิ่มรายการ");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        cmdDelete.setText("ลบรายการ");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        cmdClose.setText("ปิด");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdDelete)
                        .addGap(39, 39, 39)
                        .addComponent(cmdClose)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        Wprv_ShowData();
    }//GEN-LAST:event_formWindowOpened

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        // TODO add your handling code here:
        
        //-------------Add DB--------------//
        try {
            // TODO add your handling code here:
            if (txtName.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก ชื่อรายการ ", "ตรวจสอบ",JOptionPane.WARNING_MESSAGE, null);
                return;

            }

            String sName = txtName.getText().trim();

            String sSql = "Insert Into bntypereceive(name, status) Values ('"+sName+"', '"+psChect+"')";

            PreparedStatement pre = jh_center.con.prepareStatement(sSql);

            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, " เพิ่มเรียบร้อย ", "ตรวจสอบ",JOptionPane.INFORMATION_MESSAGE, null);
            }

            Wprv_ShowData();

            txtName.setText("");
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ",JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_cmdSaveActionPerformed

    private void dgvShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvShowMouseClicked
        // TODO add your handling code here:
        try {
            int nSelect = dgvShow.getSelectedRow();
            String sName = dgvShow.getValueAt(nSelect , 0).toString();

            txtName.setText(sName);
            cmdSave.setEnabled(false);
            
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_dgvShowMouseClicked

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (txtName.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก ชื่อรายการ ", "ตรวจสอบ",JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            if (JOptionPane.showConfirmDialog(this, " ต้องการลบ  ใช่/ไม่ ","ตรวจสอบ", JOptionPane.YES_NO_OPTION ) == JOptionPane.NO_OPTION) {
                return;
            }

            String sName = txtName.getText().trim();

            String sSql = " Delete From bntypereceive Where name = '"+sName+"' and status = '"+psChect+"' ";

            PreparedStatement pre = jh_center.con.prepareStatement(sSql);

            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, " ลบเรียบร้อย ", "ตรวจสอบ",JOptionPane.INFORMATION_MESSAGE, null);
            }

            Wprv_ShowData();

            txtName.setText("");
            cmdSave.setEnabled(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ",JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        cmdSave.setEnabled(true);
        
    }//GEN-LAST:event_cmdClearActionPerformed

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
            java.util.logging.Logger.getLogger(FrmType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmType dialog = new FrmType(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
   
    public String psChect = "";
    
    
    private void Wprv_ShowData(){
        try {
            //-------------Show DB--------------//
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel = (DefaultTableModel) dgvShow.getModel();
            
            //------------ลบเเถว-------------//
            int nRowDel = dgvShow.getRowCount()-1; //ดูว่าในตรางมีกี่เเถวเเลว้เก็บใน  nRowDel
            while(nRowDel > -1){
                tableModel.removeRow(nRowDel);
                nRowDel --;
            }
            //-----------------------------//
            
            String sSql;
            String sName;
            Object[] oData = new Object[0];
            sSql = "select * from bntypereceive Where status ='"+psChect+"'";
            ResultSet rs = jh_center.con.createStatement().executeQuery(sSql);
            
            int nRow = 0;
            while(rs.next()){
                sName = rs.getString("name");

                
                System.out.println(sName);
                
                tableModel.addRow(oData);
                dgvShow.setValueAt(sName, nRow, 0);
                nRow++;
            }   
            if (psChect == "1") {
                this.setTitle("กำหนดประเภท รายรับ");     
            }else{
                this.setTitle("กำหนดประเภท รายจ่าย");
            }
        } catch (Exception ex) {
        } 
     }      


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdSave;
    private javax.swing.JTable dgvShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
