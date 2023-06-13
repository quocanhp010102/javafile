/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlphongthi.giaodienAdmin;

import CLassController.GiamThi;
import CLassController.KetQua;
import CLassController.MonThi;
import CLassController.ThiSinh;
import LuuFile.Filee;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static qlphongthi.giaodienAdmin.ThemGiamThi.fileNameGT;

/**
 *
 * @author PC
 */
public class ThemKetQua extends javax.swing.JDialog  {

    /**
     * Creates new form ThemKetQua
     */
    private KetQuaManager dskq;
    static String fileNameKQ = "ketqua.txt";
    static String fileNameTS = "thisinh.txt";
    static String fileNameMT = "monthi.txt";
    ArrayList<KetQua> dsKQ = new ArrayList<>();
    ArrayList<ThiSinh> dsTS = new ArrayList<>();
    ArrayList<MonThi> dsMT = new ArrayList<>();
    private final Filee db1 = new Filee();
    public ThemKetQua(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       // fakeTV();
        this.setLocationRelativeTo(null);
        dskq = (KetQuaManager) parent;
        dskq.docFileKQ(fileNameKQ);
        docFileTS(fileNameTS);
        docFileMT(fileNameMT);
        
        dsKQ = dskq.dsKQ;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mã kết quả");

        jLabel2.setText("Mã môn thi");

        jLabel3.setText("Số báo danh");

        jLabel4.setText("Điểm");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("thêm kết quả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String maKQ=jTextField1.getText();
        String maMon=jTextField2.getText();
        String sBD=jTextField3.getText();
        String diem=jTextField4.getText();
        boolean isMTV=true;
        boolean isChekc=true;
        boolean isMT=false;
        boolean isKQ=false;
        boolean isSBD=false;
        boolean isTwo=false;
        for(MonThi a:dsMT){
           if(a.getMaMonThi().equals(maMon)){
             isMT=true;
           }
        }
        for(ThiSinh a:dsTS){
           if(a.getsBD().equals(sBD)){
             isSBD=true;
           }
        }
        for(KetQua a:dsKQ){
           if(a.getMaKetQua().equals(maKQ)){
             isKQ=true;
           }
        }
        for(KetQua a:dsKQ){
           if(a.getMaMonThi().equals(maMon)&&a.getsBD().equals(sBD)){
            isTwo=true;
           }
        }
        
        if(maKQ.length()==0||maMon.length()==0||sBD.length()==0||diem.length()==0){
             JOptionPane.showMessageDialog(rootPane, "khong duoc de trong o nao");
         }
        else{
            
             if(isKQ==true){
                JOptionPane.showMessageDialog(rootPane, "ma ket qua nay da ton tai");
             }else if(isTwo==true){
                         JOptionPane.showMessageDialog(rootPane, " ket qua nay da co");
             
                     }else if(isMT==false||isSBD==false ){
                       JOptionPane.showMessageDialog(rootPane, " sai so bao danh hoac mon thi");
             
                     }else{
                KetQua b=new KetQua(maKQ,maMon,sBD, Float.parseFloat(diem));
                System.out.println(b);
                    dskq.AddThanhVien(b);
                    JOptionPane.showMessageDialog(rootPane, "them thanh cong!!");
             }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ThemKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KetQuaManager danhSachTV = new KetQuaManager();
                ThemKetQua dialog = new ThemKetQua(danhSachTV, true);

                dialog.setVisible(true);
            }
        });
    }

    public void docFileTS(String fileName) {
        try {
            dsTS = (ArrayList) db1.readDataFromFile(fileName);
            System.out.println(" đọc được file");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }
    public void docFileMT(String fileName) {
        try {
            dsMT = (ArrayList) db1.readDataFromFile(fileName);
            System.out.println(" đọc được file");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
