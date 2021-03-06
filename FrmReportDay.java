/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensesaccounts;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author POND
 */
public class FrmReportDay extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmReportDay
     */
    public FrmReportDay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmdReport = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        dtpDate = new org.jdesktop.swingx.JXDatePicker();

        setTitle("พิมพ์รายงานประจำวัน");

        jLabel1.setText("วันที่ :");

        cmdReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer (1).png"))); // NOI18N
        cmdReport.setText("พิมพ์");
        cmdReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReportActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtpDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdReport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdReportActionPerformed
        // TODO add your handling code here:
        try {
            DateFormat datDate = new SimpleDateFormat("yyyy/MM/dd");
            DateFormat datDateTitle = new SimpleDateFormat("dd/MM/yyyy");
            Date dateFormat;
            String resultDateFrom;
            SimpleDateFormat formatter;
    
            Date dNow = new Date();
            
            //-----------------delete data---------------------//
            String sSql = " Delete From rp_bninout ";
            PreparedStatement pre = jh_center.con.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
               // JOptionPane.showMessageDialog(rootPane, " ลบเรียบร้อย ", "ตรวจสอบ",JOptionPane.INFORMATION_MESSAGE, null);
            }
            //----------------------------------------------------//

            
            //--------------------Insert Select Report-------------------------//
            sSql = "INSERT into rp_bninout(docno, dateinout, typeinout, amount,status)\n" 
                 + "select docno, dateinout, typeinout, amount,  CASE WHEN status='1' THEN 'รายรับ' ELSE 'รายจ่าย' End As status "
                 + "from bninout Where datecreate ='"+datDate.format(dtpDate.getDate()).toString().trim()+"' Order by docno desc";
            
            pre = jh_center.con.prepareStatement(sSql);
             if (pre.executeUpdate() != -1) {
               // JOptionPane.showMessageDialog(rootPane, " ลบเรียบร้อย ", "ตรวจสอบ",JOptionPane.INFORMATION_MESSAGE, null);
            }
               
            sSql ="select * from rp_bninout";
            ResultSet rs = jh_center.con.createStatement().executeQuery(sSql);
            

            if(rs.next()){
                HashMap param = new HashMap();
                param.put("sheadTitle", "เอกสารทั้งหมด : "+datDateTitle.format(dtpDate.getDate()).toString().trim());
                JasperPrint print;
                print = JasperFillManager.fillReport("C:\\Users\\POND\\Desktop\\ExpensesAccountsProject\\ReportExpensesAccounts\\reportExpensesAccounts.jasper", param, jh_center.con);
                JasperViewer view = new JasperViewer(print, false);
                view.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(rootPane, " ไม่มีข้อมูลในรายงาน ", "ตรวจสอบ",JOptionPane.WARNING_MESSAGE, null);
                }   
        } catch (Exception ex) {
            System.out.println(ex.getMessage().toString());
        }           
    }//GEN-LAST:event_cmdReportActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdReport;
    private org.jdesktop.swingx.JXDatePicker dtpDate;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
