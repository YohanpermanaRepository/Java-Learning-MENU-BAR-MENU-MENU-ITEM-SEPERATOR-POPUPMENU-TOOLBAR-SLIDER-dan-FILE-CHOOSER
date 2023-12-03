package tgsmod4yohan;
public class nomor2 extends javax.swing.JFrame {
String ys;

    public nomor2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popbersih = new javax.swing.JMenuItem();
        poptutup = new javax.swing.JMenuItem();
        pophasil = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        inputnim = new javax.swing.JTextField();
        inputnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        informasiketerangan = new javax.swing.JTextArea();
        prosesbersih = new javax.swing.JButton();
        prosestutup = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        popbersih.setText("Bersih");
        popbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popbersihActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popbersih);

        poptutup.setText("Tutup");
        poptutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poptutupActionPerformed(evt);
            }
        });
        jPopupMenu1.add(poptutup);

        pophasil.setText("Hasil");
        pophasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pophasilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(pophasil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        inputnim.setBackground(new java.awt.Color(204, 204, 204));
        inputnim.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        inputnama.setBackground(new java.awt.Color(204, 204, 204));
        inputnama.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        informasiketerangan.setBackground(new java.awt.Color(204, 204, 204));
        informasiketerangan.setColumns(20);
        informasiketerangan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        informasiketerangan.setRows(5);
        jScrollPane1.setViewportView(informasiketerangan);

        prosesbersih.setBackground(new java.awt.Color(0, 0, 0));
        prosesbersih.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        prosesbersih.setForeground(new java.awt.Color(255, 255, 255));
        prosesbersih.setText("BERSIH");
        prosesbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesbersihActionPerformed(evt);
            }
        });

        prosestutup.setBackground(new java.awt.Color(51, 51, 51));
        prosestutup.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        prosestutup.setForeground(new java.awt.Color(255, 255, 255));
        prosestutup.setText("TUTUP");
        prosestutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosestutupActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel19.setText("MASUKKAN NAMA");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setText("MASUKKAN NIM");

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel21.setText("KETERANGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prosesbersih)
                            .addComponent(prosestutup)))
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputnama, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputnim, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(prosesbersih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prosestutup)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prosesbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesbersihActionPerformed
        // TODO add your handling code here:
        inputnim.setText(""); inputnama.setText(""); informasiketerangan.setText("");
    }//GEN-LAST:event_prosesbersihActionPerformed
    
    private void prosestutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosestutupActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_prosestutupActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      jPopupMenu1.show(this,evt.getX(), evt.getY());
    }//GEN-LAST:event_jPanel1MousePressed

    private void popbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popbersihActionPerformed
        // TODO add your handling code here:
         inputnim.setText(""); inputnama.setText(""); informasiketerangan.setText("");
    }//GEN-LAST:event_popbersihActionPerformed

    private void poptutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poptutupActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_poptutupActionPerformed

    private void pophasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pophasilActionPerformed
        // TODO add your handling code here:
        ys = "nama \t :"+inputnim.getText()
        +"\nnim \t :"+inputnama.getText();   
        informasiketerangan.setText(ys);
    }//GEN-LAST:event_pophasilActionPerformed

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
            java.util.logging.Logger.getLogger(nomor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nomor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nomor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nomor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nomor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea informasiketerangan;
    private javax.swing.JTextField inputnama;
    private javax.swing.JTextField inputnim;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem popbersih;
    private javax.swing.JMenuItem pophasil;
    private javax.swing.JMenuItem poptutup;
    private javax.swing.JButton prosesbersih;
    private javax.swing.JButton prosestutup;
    // End of variables declaration//GEN-END:variables
}
