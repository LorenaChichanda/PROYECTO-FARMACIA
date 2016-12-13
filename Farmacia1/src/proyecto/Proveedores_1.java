/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author usuario
 */
public class Proveedores_1 extends javax.swing.JFrame {
FileInputStream fis;
    Connection con;
    ResultSet r;
    CallableStatement cst;
    private KeyStroke id_proveedor;
    private Object txtnombre;

    public Proveedores_1() {
        initComponents();
          try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/farmacia",
                    "postgres", "1234");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombreproveedor = new javax.swing.JTextField();
        bningresar = new javax.swing.JButton();
        bnvolver = new javax.swing.JButton();
        bnsalir = new javax.swing.JButton();
        bnbuscar = new javax.swing.JButton();
        bneditar = new javax.swing.JButton();
        bneliminar = new javax.swing.JButton();
        txtcedula = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("PROVEEDORES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre_proveedor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cedula");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("telefono");

        txtnombreproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreproveedorActionPerformed(evt);
            }
        });
        txtnombreproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreproveedorKeyTyped(evt);
            }
        });

        bningresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bningresar.setText("INGRESAR");
        bningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bningresarActionPerformed(evt);
            }
        });

        bnvolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnvolver.setText("volver");
        bnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnvolverActionPerformed(evt);
            }
        });

        bnsalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnsalir.setText("salir");
        bnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsalirActionPerformed(evt);
            }
        });

        bnbuscar.setText("Buscar");
        bnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarActionPerformed(evt);
            }
        });

        bneditar.setText("Editar");
        bneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneditarActionPerformed(evt);
            }
        });

        bneliminar.setText("Eliminar");
        bneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarActionPerformed(evt);
            }
        });

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bnbuscar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bneliminar)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bneditar)
                            .addComponent(bningresar))
                        .addGap(29, 29, 29)
                        .addComponent(bnvolver)
                        .addGap(53, 53, 53)
                        .addComponent(bnsalir)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnbuscar))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bningresar)
                    .addComponent(bnvolver)
                    .addComponent(bnsalir))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bneditar)
                    .addComponent(bneliminar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreproveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproveedorKeyTyped
       char c= evt.getKeyChar();
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras");// TODO add your handling code here:
    }                              // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreproveedorKeyTyped

    private void bningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bningresarActionPerformed
        if (txtnombreproveedor.getText().length() == 0) {

            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR DATOS");
        } else {
            try {
                String sql = "INSERT INTO proveedor(nombre,cedula,direccion,telefono) VALUES (?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, txtnombreproveedor.getText());
                ps.setString(2, txtcedula.getText());
                ps.setString(3, txtdireccion.getText());
                ps.setString(4, txttelefono.getText());
                //int id_proveedor=Integer.parseInt(txtid.getText());
                //ps.setInt(5, id_proveedor);
                ps.execute();
                ps.close();

                JOptionPane.showMessageDialog(rootPane, "Guardado correctamente");
                this.txtnombreproveedor.setText("");
                this.txtcedula.setText("");
                this.txtdireccion.setText("");
                this.txttelefono.setText("");
            } catch (SQLException | NumberFormatException | HeadlessException x) {
                JOptionPane.showMessageDialog(rootPane, "exception 2 " + x );
            }
        }             // TODO add your handling code here:
    }//GEN-LAST:event_bningresarActionPerformed

    private void bnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnvolverActionPerformed
Ventana1 jFrame = new Ventana1();//"Frame2" es el nombre que tu le pusiste a tu 2do jframe
                jFrame.setVisible(true);  
                dispose();// TODO add your handling code here:
    }//GEN-LAST:event_bnvolverActionPerformed

    private void bnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsalirActionPerformed
dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_bnsalirActionPerformed

    private void bnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarActionPerformed
        // TODO add your handling code here:
         //mostrarDatos(txtid.getText());
        bneditar.setEnabled(true);
        bningresar.setEnabled(false);
        bneliminar.setEnabled(true);
        if (txtcedula.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");
        } else {
            String codigo = (this.txtcedula.getText());
            try {
                cst = con.prepareCall("select nombre,cedula,direccion,telefono from proveedor where cedula=? ");
                cst.setString(1, codigo);
                r = cst.executeQuery();

                if (r.next()) {
                    JOptionPane.showMessageDialog(this, "Encontrado!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.txtnombreproveedor.setText(r.getString(1));
                    this.txtcedula.setText(r.getString(2));
                    this.txtdireccion.setText(r.getString(3));
                    this.txttelefono.setText(r.getString(4));
                    
                    this.txtid.setText(r.getString(5));
                } else{
                    JOptionPane.showMessageDialog(this, "Cliente No Encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                    
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                
            }
        }
    }//GEN-LAST:event_bnbuscarActionPerformed

    private void bneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneditarActionPerformed
        // TODO add your handling code here:
        if (txtnombreproveedor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");

        } else {

            String cedula = (this.txtcedula.getText());
            try {
                
                String sql = "update proveedor set nombre=?, direccion=?, telefono=? where cedula=? ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, txtnombreproveedor.getText());
                ps.setString(2, txtdireccion.getText());
                ps.setString(3, txttelefono.getText());
                ps.setString(4, cedula);
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(this, "Proveedor editado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Error al editar"+e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bneditarActionPerformed

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
        // TODO add your handling code here:
        if (txtnombreproveedor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");

        } else {

            String codigo = (this.txtnombreproveedor.getText());
            try {
                
                String sql = "delete from proveedor where nombre=? ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, codigo);
              
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(this, "Proveedor eliminado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Error al eliminar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bneliminarActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtnombreproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreproveedorActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnbuscar;
    private javax.swing.JButton bneditar;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton bningresar;
    private javax.swing.JButton bnsalir;
    private javax.swing.JButton bnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombreproveedor;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void txtid(int i, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
