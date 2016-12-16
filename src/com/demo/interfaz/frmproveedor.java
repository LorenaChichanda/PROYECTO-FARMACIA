
package com.demo.interfaz;
import com.demo.dominio.Proveedor;
import com.demo.repository.ProveedorRepository;

public class frmproveedor extends javax.swing.JFrame {
ProveedorRepository proveedorRepository =new ProveedorRepository();
   
    public frmproveedor() {
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
        txtnom = new javax.swing.JTextField();
        txtced = new javax.swing.JTextField();
        txtdi = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        btingresar = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btvolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbproveedor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtprove = new javax.swing.JTextField();

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

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("PROVEEDORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 11, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Cedula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setText("Direccion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 201, -1, -1));
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 67, -1));
        getContentPane().add(txtced, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 67, -1));
        getContentPane().add(txtdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 67, -1));

        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 198, 67, -1));

        btingresar.setText("Ingresar");
        btingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 86, -1, -1));

        btbuscar.setText("Buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 52, 73, -1));

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 133, 73, -1));

        btvolver.setText("volver");
        btvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 180, 73, -1));

        jtbproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbproveedor);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, 365, 127));

        jLabel6.setText("id proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        getContentPane().add(txtprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        proveedorRepository.eliminar(txtprove.getText());
    }//GEN-LAST:event_bteliminarActionPerformed

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    private void btvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvolverActionPerformed

        frmventana pri=new frmventana();
            pri.setVisible(true);
            dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btvolverActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        proveedorRepository.consultar(jtbproveedor, "Select *from proveedor");
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btingresarActionPerformed
        int id_proveedor=Integer.parseInt(txtprove.getText());
        String nombre =(txtnom.getText());
        int cedula=Integer.parseInt((txtced.getText()));
        String direccion=(txtdi.getText());
        int telefono=Integer.parseInt(txttel.getText());
        Proveedor proveedor=new Proveedor(id_proveedor, nombre, cedula, direccion, telefono);
        proveedorRepository.ingresar(proveedor);
    }//GEN-LAST:event_btingresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmproveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btingresar;
    private javax.swing.JButton btvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtbproveedor;
    private javax.swing.JTextField txtced;
    private javax.swing.JTextField txtdi;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprove;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
