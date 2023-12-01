package view;

import controller.UserConnections;
import java.sql.ResultSet;
import java.sql.SQLException;

import modal.Fail;
import modal.Sucess;
import model.User;

public class Config extends javax.swing.JPanel {

    User usuario = new User();
    Fail fail = new Fail();
    Sucess sucess = new Sucess();
    UserConnections uc = new UserConnections();

    public Config() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        txtAbertos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtEmailUser = new javax.swing.JTextField();
        btSalvarEmail = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1060, 650));
        setMinimumSize(new java.awt.Dimension(1060, 650));

        container.setBackground(new java.awt.Color(16, 16, 16));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAbertos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtAbertos.setForeground(new java.awt.Color(255, 255, 255));
        txtAbertos.setText("CONFIGURAÇÕES");
        container.add(txtAbertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 310, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEU EMAIL:");
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 152, 80, -1));

        jCheckBox1.setBackground(new java.awt.Color(16, 16, 16));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Claro");
        jCheckBox1.setEnabled(false);
        container.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(16, 16, 16));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Escuro");
        jCheckBox2.setEnabled(false);
        container.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TEMA:");
        container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 60, -1));

        txtEmailUser.setBackground(new java.awt.Color(16, 16, 16));
        txtEmailUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmailUser.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailUser.setText("Email");
        container.add(txtEmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 330, 27));

        btSalvarEmail.setBackground(new java.awt.Color(16, 16, 16));
        btSalvarEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarEmail.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarEmail.setText("SALVAR");
        btSalvarEmail.setToolTipText("BUSCAR");
        btSalvarEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), null, null));
        btSalvarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarEmail.setFocusPainted(false);
        btSalvarEmail.setFocusable(false);
        btSalvarEmail.setIconTextGap(0);
        btSalvarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEmailActionPerformed(evt);
            }
        });
        container.add(btSalvarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 70, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 0));
        jLabel3.setText("*ATENÇÃO* ao alterar o email utilizar um existente e utilizável.");
        container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarEmailActionPerformed
        salvarEmail();
    }//GEN-LAST:event_btSalvarEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarEmail;
    private javax.swing.JPanel container;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtAbertos;
    private javax.swing.JTextField txtEmailUser;
    // End of variables declaration//GEN-END:variables

    public void resgatarUsuario(User user) {
        usuario = user;
        UserConnections conexao = new UserConnections();
        ResultSet resultadoLogin = conexao.verificarDados(usuario);
        try {
            while (resultadoLogin.next()) {
                usuario.setEmail(resultadoLogin.getString("email"));
                txtEmailUser.setText(usuario.getEmail());
            }
        } catch (SQLException ex) {
            fail.informarErro("Erro ao puxar email.");
        }
    }

    private void salvarEmail() {
        if (!isEmailValid(txtEmailUser.getText())) {
            fail.informarErro("Email inválido.");
        } else {
            usuario.setEmail(txtEmailUser.getText());
            uc.editarEmailUsuario(usuario);
        }
    }

    private boolean isEmailValid(String email) {
        return email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
    }

}
