
package com.demo.interfaz;
import com.demo.dominio.Registro;
import com.demo.repository.RegistroRepository;



public class frmregistro extends javax.swing.JFrame {
    RegistroRepository registroRepository=new RegistroRepository();
    
    public frmregistro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtre = new javax.swing.JTextField();
        txtciu = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txtem = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btvolver = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbregistro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        txtreg = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setText("id registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setText("ciudad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setText("direccion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setText("email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        getContentPane().add(txtre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 76, -1));
        getContentPane().add(txtciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 76, -1));
        getContentPane().add(txtdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 76, -1));
        getContentPane().add(txtem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 76, -1));

        btbuscar.setText("Buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 62, -1, -1));

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 103, -1, -1));

        btvolver.setText("Volver");
        btvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 185, 71, -1));

        btguardar.setText("Guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 144, -1, -1));

        jtbregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbregistro);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, 375, 101));

        jLabel6.setText("telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel7.setText("cod regional");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 80, -1));
        getContentPane().add(txtreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvolverActionPerformed

        frmventana pri=new frmventana();
            pri.setVisible(true);
            dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btvolverActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        registroRepository.eliminar(txtre.getText());
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
       registroRepository.consultar(jtbregistro, "Select *from registro");
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        int id_registro=Integer.parseInt(txtre.getText());
        String ciudad=(txtciu.getText());
        String direccion=(txtdir.getText());
        String email=(txtem.getText());
        int telefono=Integer.parseInt(txttel.getText());
        int codigo_regional=Integer.parseInt(txtreg.getText());
        Registro registro=new Registro(id_registro, ciudad, direccion, email, telefono, codigo_regional);
        registroRepository.ingresar(registro);
    }//GEN-LAST:event_btguardarActionPerformed

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
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtbregistro;
    private javax.swing.JTextField txtciu;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtem;
    private javax.swing.JTextField txtre;
    private javax.swing.JTextField txtreg;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
