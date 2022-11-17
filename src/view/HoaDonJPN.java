/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Danhsach.ListDanhSach;
import HoaDon.HoaDon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author 1102l
 */
public class HoaDonJPN extends javax.swing.JPanel {
    String gender;
    String filename = null;
    DefaultTableModel dm;
     /**
     * Creates new form listDS
     */
    public HoaDonJPN() {
        initComponents();
        show_user();
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
        txtHoten = new javax.swing.JTextField();
        txtmaHD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdDa = new javax.swing.JRadioButton();
        rdChua = new javax.swing.JRadioButton();
        txtMaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_List = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfSearch = new javax.swing.JTextField();

        setBackground(java.awt.Color.black);
        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.orange, 2));
        setForeground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Họ tên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Mã hóa đơn");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Ngày lập hóa đơn");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Tình Trạng");

        rdDa.setBackground(new java.awt.Color(0, 0, 0));
        rdDa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdDa.setForeground(new java.awt.Color(153, 0, 0));
        rdDa.setText("Đã thanh toán");

        rdChua.setBackground(new java.awt.Color(0, 0, 0));
        rdChua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdChua.setForeground(new java.awt.Color(153, 0, 0));
        rdChua.setText("Chưa  thanh toán");
        rdChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdChuaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Mã phòng");

        saveBtn.setBackground(new java.awt.Color(102, 0, 0));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setForeground(java.awt.Color.orange);
        saveBtn.setText("Lưu");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(java.awt.Color.orange);
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(java.awt.Color.orange);
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1_List.setBackground(java.awt.Color.orange);
        jTable1_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Họ tên", "Mã Phòng", "Thời gian ", "Tình trạng"
            }
        ));
        jTable1_List.setColumnSelectionAllowed(true);
        jTable1_List.setSelectionBackground(java.awt.Color.orange);
        jTable1_List.setSelectionForeground(java.awt.Color.orange);
        jTable1_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_List);
        jTable1_List.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("3LH");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.orange);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("APARTMENT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(java.awt.Color.orange);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HÓA ĐƠN");

        jtfSearch.setToolTipText("Tìm kiếm");
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });
        jtfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHoten, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmaHD, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaPhong, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(saveBtn)
                                    .addComponent(jButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdDa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdChua))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(saveBtn))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton2)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdChua, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(rdDa))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdChuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdChuaActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        try {

                String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO HoaDon(maHD, hoten, maphong, time, trangthai) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, txtmaHD.getText());
            ps.setString(2, txtHoten.getText());
            ps.setString(3, txtMaPhong.getText());
            ps.setString(4, txtTime.getText());
            if (rdDa.isSelected()) {
                gender = "Đã thanh toán";
            } else {
                gender = "Chưa thanh toán";
            }
            ps.setString(5, gender);    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Successfully");
            DefaultTableModel model = (DefaultTableModel) jTable1_List.getModel();
            model.setRowCount(0);
            show_user();
        } catch (Exception e) {
            e.printStackTrace();
        }

        }

         public ArrayList<HoaDon> userList() {
        ArrayList<HoaDon> userList = new ArrayList<>();

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            Connection con = DriverManager.getConnection(url,username,password);
            String query1 = "SELECT * FROM HoaDon;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            HoaDon lids;
            while (rs.next()) {

                lids = new HoaDon(rs.getInt("id"),rs.getString("maHD"), rs.getString("hoten"), rs.getString("maphong"), rs.getDate("time"), rs.getString("trangthai"));
                userList.add(lids);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;

        }

        public void show_user() {
        ArrayList<HoaDon> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1_List.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getStt();
            row[1] = list.get(i).getMaHD();
            row[2] = list.get(i).getHotenchuho();
            row[3] = list.get(i).getCanho();
            row[4] = list.get(i).getTime();
            row[5] = list.get(i).getTrangthai();
            
            model.addRow(row);
            }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            Connection con = DriverManager.getConnection(url,username,password);
            int row = jTable1_List.getSelectedRow();
            String value = (jTable1_List.getModel().getValueAt(row, 0).toString());
            String query = "Update HoaDon SET maHD = ? , hoten = ? , maphong = ? , time = ? , trangthai = ? where stt =" + value;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, txtmaHD.getText());
            ps.setString(2, txtHoten.getText());
            ps.setString(3, txtMaPhong.getText());
            ps.setString(4, txtTime.getText());
            if (rdDa.isSelected()) {
                gender = "Đã thanh toán";
            } else {
                gender = "Chưa thanh toán";
            }
            ps.setString(5, gender);    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successfully");
            DefaultTableModel model = (DefaultTableModel)jTable1_List.getModel();
            model.setRowCount(0);
            show_user();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn xóa ?","Delete",JOptionPane.YES_NO_OPTION);
        if(opt ==0){
        
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            Connection con = DriverManager.getConnection(url,username,password);
            int row = jTable1_List.getSelectedRow();
            String value = (jTable1_List.getModel().getValueAt(row, 0).toString());
            String query = "Delete From HoaDon where id =" + value;
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Successfully");
            DefaultTableModel model = (DefaultTableModel)jTable1_List.getModel();
            model.setRowCount(0);
            show_user();

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_ListMouseClicked
        int i = jTable1_List.getSelectedRow();
        TableModel model = jTable1_List.getModel();
        txtmaHD.setText(model.getValueAt(i, 1).toString());
        txtHoten.setText(model.getValueAt(i, 2).toString());
        txtMaPhong.setText(model.getValueAt(i, 3).toString());
        txtTime.setText(model.getValueAt(i,4).toString());
        gender = model.getValueAt(i, 5).toString();
        if (gender.equals("Chưa thanh toán")) {
                rdChua.setSelected(true);
            } else {
                rdDa.setSelected(true);
            }        
    }//GEN-LAST:event_jTable1_ListMouseClicked
    private void seach(String query)
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        dm =(DefaultTableModel) jTable1_List.getModel();
        jTable1_List.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void jtfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchKeyReleased
        String query =jtfSearch.getText().toLowerCase();
        
        seach(query);
    }//GEN-LAST:event_jtfSearchKeyReleased

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_List;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JRadioButton rdChua;
    private javax.swing.JRadioButton rdDa;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtmaHD;
    // End of variables declaration//GEN-END:variables
}
