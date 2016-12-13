/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class factura extends javax.swing.JFrame {

    FileInputStream fis;
    Connection con;
    ResultSet r;
    CallableStatement cst;

    public factura() {
        initComponents();
        fechaactual();
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/farmacia",
                    "postgres", "1234");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    void fechaactual() {
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.DATE) + "/" + cal.get(cal.MONTH) + "/" + cal.get(cal.YEAR);
        String hora = cal.get(cal.HOUR_OF_DAY) + ":" + cal.ge­t(cal.MINUTE);
        this.jTextField13.setText(fecha);

        this.jTextField14.setText(hora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtcedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbproducto = new javax.swing.JComboBox<>();
        txtcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        txtpreuni = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txttotalpago = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Cedula ");

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Generar factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtcedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Nombre");

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Producto");

        cbproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amoxicilina", "vitaminas", "pañales", "biberones", "pastillas", "remedios", "" }));

        txtcantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Cantidad");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("fecha");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtpreuni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpreuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreuniActionPerformed(evt);
            }
        });
        txtpreuni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpreuniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreuniKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Precio U.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Total pago");

        txttotalpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalpagoActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("hora");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton6.setText("Factura1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE FACTURA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17)
                                .addComponent(cbproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtpreuni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttotalpago, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(268, 268, 268))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(30, 30, 30)
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(25, 25, 25)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jButton5)))
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtpreuni, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txttotalpago, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(90, 90, 90))
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

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if (txtcedula.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");

        } else {

            String codigo = (this.txtcedula.getText());
            try {
                cst = con.prepareCall("select cedula,nombre,cantidad,tpagar,precioUni from factura where cedula=? ");
                cst.setString(1, codigo);
                r = cst.executeQuery();

                if (r.next()) {

                    JOptionPane.showMessageDialog(this, "Encontrado!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.txtcedula.setText(r.getString(1));
                    this.txtnombre.setText(r.getString(2));
                    this.txtcantidad.setText(r.getString(3));
                    this.txtpreuni.setText(r.getString(4));
                    this.txtpreuni.setText(r.getString(5));
                    
                    
                } else {

                    JOptionPane.showMessageDialog(this, "Cliente No Encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Cliente No Encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }         // TODO add your handling code here:
        
        
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Ventana1 ciu = new Ventana1();
        ciu.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtcedula.getText().length() == 0) {

            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR DATOS");
        } else {
            try {
                String sql = "INSERT INTO factura(cedula,nombre,producto,cantidad,tpagar,fecha,hora,precioUni) VALUES (?,?,?,?,?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, txtcedula.getText());
                ps.setString(2, txtnombre.getText());
                ps.setString(3, cbproducto.getSelectedItem().toString());
                ps.setString(4, txtcantidad.getText());
                ps.setString(5, txttotalpago.getText());
                ps.setString(6, jTextField13.getText());
                ps.setString(7, jTextField14.getText());
                ps.setString(8, txtpreuni.getText());

                ps.execute();
                ps.close();

                JOptionPane.showMessageDialog(rootPane, "Guardado correctamente");
                this.txtcantidad.setText("");
                this.txtpreuni.setText("");
                this.txtnombre.setText("");
                //this.txtcedula.setText("");
                this.jTextField13.setText("");
                this.jTextField14.setText("");
                cbproducto.setSelectedIndex(0);
            } catch (SQLException | NumberFormatException | HeadlessException x) {
                JOptionPane.showMessageDialog(rootPane,"exception 2 " + x );
            }
        }          // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpreuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreuniActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtpreuniActionPerformed

    private void txtpreuniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreuniKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtpreuniKeyTyped

    private void txtpreuniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreuniKeyPressed
        // TODO add your handling code here:
        Character s;
        s=evt.getKeyChar();
        if(s==KeyEvent.VK_ENTER){
        if(txtcantidad.getText().length()==0){
            JOptionPane.showConfirmDialog(this, "Debe ingresar cantidad","Error",2);
        }else{
            double pg=Integer.parseInt(txtcantidad.getText())*Double.parseDouble(txtpreuni.getText());
            txttotalpago.setText(String.valueOf(pg));
        }
        }
    }//GEN-LAST:event_txtpreuniKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (txtcedula.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");

        } else {

            String codigo = (this.txtcedula.getText());
            try {
                
                String sql = "delete from factura where cedula=? ";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, codigo);
                
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(this, "Factura eliminada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Error al eliminar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (txtcedula.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NECESITA INGRESAR UN CODIGO");
        } else {

            String codigo = (this.txtcedula.getText());
            try {
                
                String sql = "update factura set nombre=?, producto=?, cantidad=?, tpagar=?, fecha=?, hora=?, precioUni=? where cedula=? ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, txtnombre.getText());
                ps.setString(2, cbproducto.getSelectedItem().toString());
                ps.setString(3, txtcantidad.getText());
                ps.setString(4, txttotalpago.getText());
                ps.setString(5, jTextField13.getText());
                ps.setString(6, jTextField14.getText());
                ps.setString(7, txtpreuni.getText());
                
                ps.setString(8, codigo);
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(this, "Ciudad editada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e.toString());
                JOptionPane.showMessageDialog(this, "Error al editar"+e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txttotalpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalpagoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        facturaf f1=new facturaf();
        f1.setVisible(true);
        f1.mostrarDatos(txtcedula.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbproducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpreuni;
    private javax.swing.JTextField txttotalpago;
    // End of variables declaration//GEN-END:variables
}
