package vista.administrativo;

import vista.standard.*;
import javax.swing.JOptionPane;
import vista.Ventana;

public class PanelCambioContraseñaAdmin extends javax.swing.JPanel {

    private static PanelCambioContraseñaAdmin instancia=null;
    
    private PanelCambioContraseñaAdmin() {
        initComponents();
    }
    public static PanelCambioContraseñaAdmin obtenerInstancia() {//para garantizar hay solo una instancia
        if (instancia == null) {
            instancia = new PanelCambioContraseñaAdmin();
        }
        return instancia;
    }//-----------------------------------------------------END_obtenerInstancia
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelTextos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelContrasennas = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        PanelBotones = new javax.swing.JPanel();
        btnCambiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        PanelTitulo.setBackground(new java.awt.Color(208, 144, 56));
        PanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cambio de contraseña");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PanelTextos.setBackground(new java.awt.Color(226, 221, 205));
        PanelTextos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(226, 221, 205));

        jLabel2.setText("Contraseña anterior:");

        jLabel3.setText("Nueva contraseña:");

        jLabel4.setText("Repita su contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );

        PanelContrasennas.setBackground(new java.awt.Color(158, 143, 123));
        PanelContrasennas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.setText("jPasswordField1");

        jPasswordField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField3.setText("jPasswordField1");

        javax.swing.GroupLayout PanelContrasennasLayout = new javax.swing.GroupLayout(PanelContrasennas);
        PanelContrasennas.setLayout(PanelContrasennasLayout);
        PanelContrasennasLayout.setHorizontalGroup(
            PanelContrasennasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContrasennasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelContrasennasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(jPasswordField2)
                    .addComponent(jPasswordField3))
                .addContainerGap())
        );
        PanelContrasennasLayout.setVerticalGroup(
            PanelContrasennasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContrasennasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTextosLayout = new javax.swing.GroupLayout(PanelTextos);
        PanelTextos.setLayout(PanelTextosLayout);
        PanelTextosLayout.setHorizontalGroup(
            PanelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(PanelContrasennas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTextosLayout.setVerticalGroup(
            PanelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTextosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelContrasennas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelBotones.setBackground(new java.awt.Color(222, 68, 33));
        PanelBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCambiar.setText("Cambiar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCambiar)
                .addGap(65, 65, 65)
                .addComponent(btnCancelar)
                .addContainerGap(461, Short.MAX_VALUE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTextos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTextos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "¿Desea finalizar el cambio de contraseña?", null, JOptionPane.YES_NO_OPTION)) {
               Ventana.obtenerInstancia().ventanaPrincipalAdmin();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelContrasennas;
    private javax.swing.JPanel PanelTextos;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
