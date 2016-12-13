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

/**
 *
 * @author Usuario
 */
public class Ciudades extends javax.swing.JFrame {
FileInputStream fis;
    Connection con;
    ResultSet r;
    CallableStatement cst;

    public Ciudades() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        txtcodigore = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ciudad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Codigo_regional");

        txtciudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudadActionPerformed(evt);
            }
        });
        txtciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudadKeyTyped(evt);
            }
        });

        txtcodigore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcodigore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Registro de Farmacia");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");

        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txtdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txttelefono)
                                    .addComponent(txtemail)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtcodigore))
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addGap(53, 53, 53)
                        .addComponent(jButton4)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(83, 83, 83)
                .addComponent(jButton5)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudadKeyTyped
        char c= evt.getKeyChar();
				if(Character.isDigit(c)){
					getToolkit().beep();
					evt.consume();
     JOptionPane.showMessageDialog(null, "Solo puede ingresar letras");// TODO add your handling code here:
    }//GEN-LAST:event_txtciudadKeyTyped
    }
    private void txtcodigoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoreKeyTyped
       char c= evt.getKeyChar();
				if(Character.isLetter(c)){
				getToolkit().beep();
				evt.consume();
				JOptionPane.showMessageDialog(null, "Solo puede ingresar números"); // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoreKeyTyped
    }
    private void txtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtcodigore.getText().length() == 0) {

            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR DATOS");
        } else {
            try {
                String sql = "INSERT INTO registro(ciudad,direccion,telefono,email) VALUES (?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, txtciudad.getText());
                ps.setString(2, txtdireccion.getText());
                ps.setString(3, txttelefono.getText());
                ps.setString(4, txtemail.getText());

                ps.execute();
                ps.close();

                JOptionPane.showMessageDialog(rootPane, "Guardado correctamente");
                this.txtciudad.setText("");
                this.txtdireccion.setText("");
                this.txtcodigore.setText("");
                this.txttelefono.setText("");
                this.txtemail.setText("");
            } catch (SQLException | NumberFormatException | HeadlessException x) {
                JOptionPane.showMessageDialog(rootPane, "exception 2 " + x );
            }
        }             // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Ventana1 jFrame = new Ventana1();//"Frame2" es el nombre que tu le pusiste a tu 2do jframe
        jFrame.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        if (txtciudad.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UNA CIUDAD");

        } else {

            String codigo = (this.txtciudad.getText());
            try {
                cst = con.prepareCall("select ciudad, direccion, email, telefono,codigo_regional from registro where ciudad=? ");
                cst.setString(1, codigo);
                r = cst.executeQuery();

                if (r.next()) {
                    JOptionPane.showMessageDialog(this, "Encontrado!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.txtciudad.setText(r.getString(1));
                    this.txtdireccion.setText(r.getString(2));
                    this.txtemail.setText(r.getString(3));
                    this.txttelefono.setText(r.getString(4));
                    this.txtcodigore.setText(r.getString(5));
                    
                } else {

                    JOptionPane.showMessageDialog(this, "Ciudad No Encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Cliente No Encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtciudad.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");
        } else {

            String codigo = (this.txtciudad.getText());
            try {
                
                String sql = "update registro set  direccion=?, email=?, telefono=? where ciudad=? ";

                PreparedStatement ps = con.prepareStatement(sql);
                
                ps.setString(1, txtdireccion.getText());
                ps.setString(2, txtemail.getText());
                ps.setString(3, txttelefono.getText());
                ps.setString(4, codigo);
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(this, "Ciudad editada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Error al editar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (txtciudad.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");

        } else {

            String codigo = (this.txtciudad.getText());
            try {
                
                String sql = "delete from registro where ciudad=? ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, codigo);
                
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(this, "Ciudad eliminada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Error al eliminar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Ciudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ciudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ciudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ciudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciudades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcodigore;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
