/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Danhsach.ListDanhSach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import quanlyuser.LoginForm;

/**
 *
 * @author Admin
 */
public class ManHinhChinh extends javax.swing.JPanel {

    /**
     * Creates new form ManHinhChinh
     */
    public ManHinhChinh() {
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

        jPanel2 = new javax.swing.JPanel();
        lblcanho = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        lblcanho.setBackground(new java.awt.Color(0, 0, 0));
        lblcanho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcanho.setForeground(java.awt.Color.orange);
        lblcanho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcanho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/house_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        lblcanho.setText("Tổng số phòng");
        lblcanho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblcanhoMouseMoved(evt);
            }
        });
        lblcanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcanhoMouseClicked(evt);
            }
        });
        lblcanho.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblcanhoInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblcanho, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcanho, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));

        lbluser.setBackground(java.awt.Color.orange);
        lbluser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbluser.setForeground(java.awt.Color.orange);
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/person_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        lbluser.setText("Tổng số người dùng");
        lbluser.setMaximumSize(new java.awt.Dimension(100, 100));
        lbluser.setMinimumSize(new java.awt.Dimension(100, 100));
        lbluser.setPreferredSize(new java.awt.Dimension(100, 100));
        lbluser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbluserMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbluser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.orange);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/receipt_long_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel14.setText("Đã thanh toán");
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.orange);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3LH.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblcanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcanhoMouseClicked
       
         
            
            
    }//GEN-LAST:event_lblcanhoMouseClicked

    private void lblcanhoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblcanhoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblcanhoInputMethodTextChanged

    private void lblcanhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcanhoMouseMoved
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            try {
            Connection con = DriverManager.getConnection(url,username,password);
            String rtn = null;
             String query1 ="select count(*) as sophong from Phong";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
                while (rs.next()) {
                    int count = rs.getInt("sophong");
                    lblcanho.setText(String.valueOf("Tổng số phòng là: " +count));
                  
                }
                            
        } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Không có phong nào được thue");
        }
         
    }//GEN-LAST:event_lblcanhoMouseMoved

    private void lbluserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseMoved
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            try {
            Connection con = DriverManager.getConnection(url,username,password);
            String rtn = null;
             String query1 ="select count(*) as sophong from listds";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
                while (rs.next()) {
                    int count = rs.getInt("sophong");
                    lbluser.setText(String.valueOf("Tổng số người dùng là: "
                            + " " + count));
               
                }
                            
        } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Không có phong nào được thue");
        }
    }//GEN-LAST:event_lbluserMouseMoved

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            try {
            Connection con = DriverManager.getConnection(url,username,password);
            String rtn = null;
             String query1 ="select count(*) as chuathanhtoan from HoaDon where trangthai = N'Chưa thanh toán';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
                while (rs.next()) {
                    int count = rs.getInt("chuathanhtoan");
                    jLabel14.setText(String.valueOf("Chưa thanh toán là: "
                            + " " + count)); 
                    
                }
                            
        } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Không có phong nào được thue");
        }
    }//GEN-LAST:event_jLabel14MouseMoved

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblcanho;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables
}
