/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlphongthigiaodienuser;


import CLassController.MonThi;
import CLassController.PhongThi;
import CLassController.SinhVien;
import CLassController.ThiSinh;
import LuuFile.Filee;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author PC
 */
public final class LichThiUser extends javax.swing.JFrame {

    /**
     * Creates new form LichThiUser
     */
    private final Filee db1 = new Filee();
    static String fileNamePT = "phongthi.txt";
    static String fileNameMT = "monthi.txt";
    static String fileNameTS = "thisinh.txt";
    ArrayList<ThiSinh> dsTS = new ArrayList<>();
    ArrayList<PhongThi> dsPT = new ArrayList<>();
    ArrayList<MonThi> dsMT = new ArrayList<>();
    private final DefaultTableModel tblVeModel;
    public LichThiUser() {
        initComponents();
        docFilePT(fileNamePT);
        docFileMT(fileNameMT);
        docFileTS(fileNameTS);       
        fakeTV();
        tblVeModel = (DefaultTableModel) jTable1.getModel();
        showData(dsTS, tblVeModel);
        
        
    }
        ArrayList<SinhVien> dsTVCC = new ArrayList<>();
        public void fakeTV() {
        SinhVien a = new SinhVien("2020604551", "Nguyễn Văn A", 1990, "hà nội","HTTT05","CNTT");
        SinhVien b = new SinhVien("2020604552", "Nguyễn Văn B", 1990, "hà nội","HTTT05","CNTT");
        SinhVien c = new SinhVien("2020604553", "Nguyễn Văn C", 1990, "hà nội","HTTT05","CNTT");
        SinhVien d = new SinhVien("2020604554", "Nguyễn Văn D", 1990, "hà nội","HTTT05","CNTT");
        SinhVien e = new SinhVien("2020604555", "Nguyễn Văn E", 1990, "hà nội","HTTT05","CNTT");
        SinhVien f = new SinhVien("2020604556", "Nguyễn Văn F", 1990, "hà nội","HTTT05","CNTT");
        
         
       
        dsTVCC.add(a);
        dsTVCC.add(b);
        dsTVCC.add(c);
        dsTVCC.add(d);
        dsTVCC.add(e);
        dsTVCC.add(f);


    }
    public final <T> void showData(ArrayList<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            if (t instanceof ThiSinh thiSinh) {
                
                
                String mamonthi = null, maphong = null, coso = null, 
                        ngaythi = null, monthi = null , tensv = null, diadiem = null;                
                for(PhongThi pt : dsPT){
                    if(pt.getMaPhong().equals(thiSinh.getMaPhong())){
                         maphong = pt.getMaPhong();
                         coso = pt.getCoSo();
                         ngaythi = pt.getNgayThi();
                         diadiem = pt.getDiaDiem();
                        mamonthi = pt.getMaMonThi();
                    }
                }
                for(MonThi mt : dsMT){
                    if(mt.getMaMonThi().equals( mamonthi)){
                         monthi = mt.getTenMonThi();
                    }
                }
                for(SinhVien sv : dsTVCC){
                    if(sv.getMaSV().equals(thiSinh.getMaSV())){
                         tensv = sv.getTenSV();
                    }
                }
                
                
                model.addRow(new Object[]{ thiSinh.getMaSV(), tensv,monthi, thiSinh.getCaThi(),
                    thiSinh.getLanThi(), thiSinh.getsBD(), thiSinh.getViTri()
                         , maphong , coso, diadiem, ngaythi
                });
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_masv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Đại học Công Nghiệp Hà Nội");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(298, 298, 298)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Tên SV", "Tên Môn", "Ca", "Lần", "SBD", "Vị Trí", "Tên Phòng", "Cơ Sở", "Địa Điểm", "Ngày Thi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Tìm Theo MSV: ");

        jButton1.setText("Tìm");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_masv, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_masv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
        tblVeModel.setRowCount(0);
        String masv = txt_masv.getText();
        for(ThiSinh t:dsTS){
            if(masv == null ? t.getMaSV() == null : masv.equals(t.getMaSV())){
                String mamonthi = null, maphong = null, coso = null, 
                        ngaythi = null, monthi = null , tensv = null, diadiem = null;                
                for(PhongThi pt : dsPT){
                    if(pt.getMaPhong().equals(((ThiSinh) t).getMaPhong())){
                         maphong = pt.getMaPhong();
                         coso = pt.getCoSo();
                         ngaythi = pt.getNgayThi();
                         diadiem = pt.getDiaDiem();
                        mamonthi = pt.getMaMonThi();
                    }
                }
                for(MonThi mt : dsMT){
                    if(mt.getMaMonThi().equals( mamonthi)){
                         monthi = mt.getTenMonThi();
                    }
                }
                for(SinhVien sv : dsTVCC){
                    if(sv.getMaSV().equals(((ThiSinh) t).getMaSV())){
                         tensv = sv.getTenSV();
                    }
                }
                
                
                tblVeModel.addRow(new Object[]{ ((ThiSinh) t).getMaSV(), tensv,monthi, ((ThiSinh) t).getCaThi(),
                    ((ThiSinh) t).getLanThi(), ((ThiSinh) t).getsBD(), ((ThiSinh) t).getViTri()
                         , maphong , coso, diadiem, ngaythi
                });
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   public void docFileTS(String fileName) {
        try {
            dsTS = (ArrayList) db1.readDataFromFile(fileName);
            System.out.println(" đọc được file");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }
   public void docFilePT(String fileName) {
        try {
            dsPT = (ArrayList) db1.readDataFromFile(fileName);
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
            java.util.logging.Logger.getLogger(LichThiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichThiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichThiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichThiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichThiUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_masv;
    // End of variables declaration//GEN-END:variables
}
