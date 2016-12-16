
package com.demo.interfaz;
import com.demo.dominio.Factura;
import com.demo.repository.FacturaRepository;
public class frmfactura extends javax.swing.JFrame {
FacturaRepository facturaRepository=new FacturaRepository();
   
    public frmfactura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtfac = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtce = new javax.swing.JTextField();
        txtpro = new javax.swing.JTextField();
        txtcan = new javax.swing.JTextField();
        txtpre = new javax.swing.JTextField();
        txtpag = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jbtfactura = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

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
        getContentPane().add(txtfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 61, 85, -1));

        jLabel2.setText("Id factura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 64, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 89, -1, -1));

        jLabel4.setText("Cedula");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setText("Producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setText("Precio U");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel8.setText("Total Pago");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 89, 85, -1));
        getContentPane().add(txtce, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 85, -1));
        getContentPane().add(txtpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 85, -1));
        getContentPane().add(txtcan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 85, -1));
        getContentPane().add(txtpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 85, -1));
        getContentPane().add(txtpag, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 85, -1));

        btbuscar.setText("buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 60, -1, -1));

        btguardar.setText("guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 101, 80, -1));

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 141, -1, -1));

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 222, -1, -1));

        jbtfactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jbtfactura);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 263, 351, 106));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("FACTURA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        frmventana pri=new frmventana();
            pri.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        facturaRepository.eliminar(txtfac.getText());
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        facturaRepository.consultar(jbtfactura, "Select *from factura");
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        int id_factura=Integer.parseInt(txtfac.getText());
        String nombre=(txtnom.getText());
        String producto=(txtpro.getText());
        int cantidad=Integer.parseInt(txtcan.getText());
        int tpagar=Integer.parseInt(txtpag.getText());
        int preciouni=Integer.parseInt(txtpre.getText());
        int cedula=Integer.parseInt(txtce.getText());
        Factura factura=new Factura(id_factura, nombre, producto, cantidad, tpagar, preciouni,cedula);
        facturaRepository.ingresar(factura);
        
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
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmfactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jbtfactura;
    private javax.swing.JTextField txtcan;
    private javax.swing.JTextField txtce;
    private javax.swing.JTextField txtfac;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpag;
    private javax.swing.JTextField txtpre;
    private javax.swing.JTextField txtpro;
    // End of variables declaration//GEN-END:variables
}
