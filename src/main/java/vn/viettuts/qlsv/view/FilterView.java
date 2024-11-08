/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.viettuts.qlsv.view;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import vn.viettuts.qlsv.controller.HangHoaController;
import vn.viettuts.qlsv.dao.HangHoaDao;

/**
 *
 * @author miin
 */
public class FilterView extends javax.swing.JFrame {

    private HangHoaDao hangHoaDao;
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form FilterView
     */
    public FilterView() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        fromNgayNhapDate = new com.toedter.calendar.JDateChooser();
        toNgayNhapDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        toAgeLabel1 = new javax.swing.JLabel();
        hoTenLabel = new javax.swing.JLabel();
        tenHangHoaField = new javax.swing.JTextField();
        tuoiLabel = new javax.swing.JLabel();
        fromAgeLabel = new javax.swing.JLabel();
        fromSoLuongField = new javax.swing.JTextField();
        toAgeLabel = new javax.swing.JLabel();
        toSoLuongField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        donViTinhField = new javax.swing.JTextField();
        gradeLabel = new javax.swing.JLabel();
        gpaLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        fromGpaLabel = new javax.swing.JLabel();
        findButton = new javax.swing.JButton();
        fromGiaBanField = new javax.swing.JTextField();
        toGpaLabel = new javax.swing.JLabel();
        toGiaBanField = new javax.swing.JTextField();
        toDonGiaField = new javax.swing.JTextField();
        fromDonGiaField = new javax.swing.JTextField();
        fromAgeLabel1 = new javax.swing.JLabel();
        toAgeLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bộ lọc");
        setBackground(new java.awt.Color(0, 204, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ngày nhập");

        fromNgayNhapDate.setDateFormatString("dd/MM/yyyy");

        toNgayNhapDate.setDateFormatString("dd/MM/yyyy");

        jLabel3.setText("từ");

        toAgeLabel1.setText("đến");

        hoTenLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoTenLabel.setText("Tên hàng hóa:");

        tenHangHoaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenHangHoaFieldActionPerformed(evt);
            }
        });

        tuoiLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tuoiLabel.setText("Số lượng:");

        fromAgeLabel.setText("từ");

        fromSoLuongField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromSoLuongFieldActionPerformed(evt);
            }
        });

        toAgeLabel.setText("đến");

        toSoLuongField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toSoLuongFieldActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressLabel.setText("Đơn vị tính:");

        gradeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeLabel.setText("Đơn giá:");

        gpaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gpaLabel.setText("Giá bán:");

        clearButton.setBackground(new java.awt.Color(255, 51, 102));
        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        fromGpaLabel.setText("từ");

        findButton.setBackground(new java.awt.Color(255, 51, 102));
        findButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        findButton.setForeground(new java.awt.Color(255, 255, 255));
        findButton.setText("Tìm kiếm");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        toGpaLabel.setText("đến");

        toGiaBanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGiaBanFieldActionPerformed(evt);
            }
        });

        toDonGiaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDonGiaFieldActionPerformed(evt);
            }
        });

        fromDonGiaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromDonGiaFieldActionPerformed(evt);
            }
        });

        fromAgeLabel1.setText("từ");

        toAgeLabel3.setText("đến");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tuoiLabel)
                                    .addComponent(gradeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromAgeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fromAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(toSoLuongField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(donViTinhField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gpaLabel))
                                        .addGap(2, 2, 2)
                                        .addComponent(fromGpaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fromGiaBanField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(toGpaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(toGiaBanField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(hoTenLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fromDonGiaField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(fromSoLuongField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(toAgeLabel3)
                                            .addComponent(toAgeLabel))
                                        .addGap(99, 99, 99)))
                                .addComponent(toDonGiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tenHangHoaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromNgayNhapDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toAgeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toNgayNhapDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hoTenLabel)
                            .addComponent(tenHangHoaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tuoiLabel)
                            .addComponent(fromAgeLabel)
                            .addComponent(fromSoLuongField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toAgeLabel)
                            .addComponent(toSoLuongField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradeLabel)
                            .addComponent(toDonGiaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromDonGiaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromAgeLabel1)
                            .addComponent(toAgeLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donViTinhField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpaLabel)
                            .addComponent(fromGpaLabel)
                            .addComponent(fromGiaBanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toGpaLabel)
                            .addComponent(toGiaBanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toAgeLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fromNgayNhapDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(toNgayNhapDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        tenHangHoaField.setText("");
        fromSoLuongField.setText("");
        toSoLuongField.setText("");
        fromDonGiaField.setText("");
        toDonGiaField.setText("");
        donViTinhField.setText("");
        fromGiaBanField.setText("");
        toGiaBanField.setText("");
        fromNgayNhapDate.setDate(null);
        toNgayNhapDate.setDate(null);

    }//GEN-LAST:event_clearButtonActionPerformed

    private void fromSoLuongFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromSoLuongFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromSoLuongFieldActionPerformed

    private void tenHangHoaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenHangHoaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenHangHoaFieldActionPerformed

    private void toGiaBanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGiaBanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toGiaBanFieldActionPerformed

    private void toSoLuongFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toSoLuongFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toSoLuongFieldActionPerformed

    private void toDonGiaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDonGiaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toDonGiaFieldActionPerformed

    private void fromDonGiaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromDonGiaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromDonGiaFieldActionPerformed
    public void addFindHangHoaListener(ActionListener listener) {
        findButton.addActionListener(listener);
    }

    public String getTenHangHoa() {
        return tenHangHoaField.getText();
    }

    public String getDonViTinh() {
        return donViTinhField.getText();
    }

    public int getSoLuongFrom() {
        return Integer.parseInt(fromSoLuongField.getText());
    }

    public int getSoLuongTo() {
        return Integer.parseInt(toSoLuongField.getText());
    }

    public double getGiaBanFrom() {
        return Double.parseDouble(fromGiaBanField.getText());
    }

    public Double getGiaBanTo() {
        return Double.valueOf(toGiaBanField.getText());
    }

    public Double getDonGiaFrom() {
        return Double.valueOf(fromDonGiaField.getText());
    }

    public Double getDonGiaTo() {
        return Double.valueOf(toDonGiaField.getText());
    }

    public String getFromDateNgayNhap() {
        Date dateFromNgayNhap = fromNgayNhapDate.getDate();
        if (dateFromNgayNhap != null) {
            try {
                return df.format(dateFromNgayNhap);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public String getToDateNgayNhap() {
        Date dateToNgayNhap = toNgayNhapDate.getDate();
        if (dateToNgayNhap != null) {
            try {
                return df.format(dateToNgayNhap);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField donViTinhField;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel fromAgeLabel;
    private javax.swing.JLabel fromAgeLabel1;
    private javax.swing.JTextField fromDonGiaField;
    private javax.swing.JTextField fromGiaBanField;
    private javax.swing.JLabel fromGpaLabel;
    private com.toedter.calendar.JDateChooser fromNgayNhapDate;
    private javax.swing.JTextField fromSoLuongField;
    private javax.swing.JLabel gpaLabel;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JLabel hoTenLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tenHangHoaField;
    private javax.swing.JLabel toAgeLabel;
    private javax.swing.JLabel toAgeLabel1;
    private javax.swing.JLabel toAgeLabel3;
    private javax.swing.JTextField toDonGiaField;
    private javax.swing.JTextField toGiaBanField;
    private javax.swing.JLabel toGpaLabel;
    private com.toedter.calendar.JDateChooser toNgayNhapDate;
    private javax.swing.JTextField toSoLuongField;
    private javax.swing.JLabel tuoiLabel;
    // End of variables declaration//GEN-END:variables
}