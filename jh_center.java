/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensesaccounts;

import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;

/**
 *
 * @author POND
 */
public class jh_center {
    public static Connection con;   
    public static boolean psbpageFix = true;
    public static boolean psbPageInOut = true;
    public static boolean psbPageRepostDay = true;
    
    public static JInternalFrame psjinPageFix = null;
    public static JInternalFrame psjinPageInOut = null;
    public static JInternalFrame psjinPageReportDay = null;
    
    public static String pssUsername =" ";
    
    
    //open from child
     public static void Cprv_ScreenFormDialog(JDialog _Frm){
         Dimension dimScreen = Toolkit.getDefaultToolkit().getScreenSize();
         
         int nWidth = _Frm.getSize().width;
         int nHeigth = _Frm.getSize().height;
         
         int nSreenX = (dimScreen.width-nWidth)/2;
         int nSreenY = ((dimScreen.height-nHeigth)/2-30);
         
         _Frm.setLocation(nSreenX, nSreenY);
         _Frm.setVisible(true);
     }
    
}



        
