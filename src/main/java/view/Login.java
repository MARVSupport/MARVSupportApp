/*
 * The MIT License
 *
 * Copyright 2023 MARVSupport..
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package view;

import controller.UserConnections;
import db.DbConnection;
import java.awt.Color;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import modal.Fail;
import model.User;
import utils.HoverEffect;


/**
 * VIEW - Login
 *
 * @author Victor Silva
 * @version 1.0.2
 */

// classe view - Login
public class Login extends javax.swing.JFrame {

    // importando objetos que serão usados repetidas vezes
    Fail fail = new Fail();
    HoverEffect hover = new HoverEffect();

    public Login() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icone-32x32.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        loginForm = new javax.swing.JPanel();
        iniciarSessao = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        iconeUser = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        iconeSenha = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        esqueceuTexto = new javax.swing.JLabel();
        txtCliqueAqui = new javax.swing.JLabel();
        pEntrar = new javax.swing.JPanel();
        btEntrar = new javax.swing.JLabel();
        separadorUser = new javax.swing.JSeparator();
        separadorSenha = new javax.swing.JSeparator();
        copyright = new javax.swing.JLabel();
        pSair = new javax.swing.JPanel();
        btSair = new javax.swing.JLabel();
        versao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MARVSupport | Login");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        background.setBackground(new java.awt.Color(10, 10, 10));

        Logo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-32x32.png"))); // NOI18N
        Logo.setText("MARVSupport");

        txtStatus.setBackground(new java.awt.Color(153, 0, 0));
        txtStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(153, 0, 0));
        txtStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeOffline.png"))); // NOI18N
        txtStatus.setText("OFFLINE");

        loginForm.setBackground(new java.awt.Color(10, 10, 10));
        loginForm.setForeground(new java.awt.Color(10, 10, 10));
        loginForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarSessao.setBackground(new java.awt.Color(0, 0, 0));
        iniciarSessao.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        iniciarSessao.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSessao.setText("INICIAR SESSÃO");
        loginForm.add(iniciarSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, -1));

        usuario.setBackground(new java.awt.Color(131, 131, 131));
        usuario.setFont(new java.awt.Font("Myanmar Text", 1, 16)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("USUÁRIO");
        loginForm.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        iconeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeUsuario.png"))); // NOI18N
        loginForm.add(iconeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(10, 10, 10));
        txtUsuario.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setText("Nome de usuário");
        txtUsuario.setBorder(null);
        txtUsuario.setCaretPosition(0);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        loginForm.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 30));

        txtSenha.setBackground(new java.awt.Color(10, 10, 10));
        txtSenha.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(153, 153, 153));
        txtSenha.setText("******");
        txtSenha.setBorder(null);
        txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSenhaMousePressed(evt);
            }
        });
        loginForm.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 207, 250, 30));

        iconeSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeSenha.png"))); // NOI18N
        loginForm.add(iconeSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        senha.setFont(new java.awt.Font("Myanmar Text", 1, 16)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("SENHA");
        loginForm.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        esqueceuTexto.setForeground(new java.awt.Color(153, 153, 153));
        esqueceuTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esqueceuTexto.setText("Esqueceu sua senha?");
        loginForm.add(esqueceuTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtCliqueAqui.setForeground(new java.awt.Color(0, 204, 204));
        txtCliqueAqui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCliqueAqui.setText("clique aqui.");
        txtCliqueAqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginForm.add(txtCliqueAqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 276, 110, -1));

        pEntrar.setBackground(new java.awt.Color(10, 10, 10));
        pEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btEntrar.setFont(new java.awt.Font("Myanmar Text", 1, 16)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btEntrar.setText("ENTRAR");
        btEntrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btEntrar.setAlignmentY(0.0F);
        btEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEntrar.setFocusable(false);
        btEntrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pEntrarLayout = new javax.swing.GroupLayout(pEntrar);
        pEntrar.setLayout(pEntrarLayout);
        pEntrarLayout.setHorizontalGroup(
            pEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        pEntrarLayout.setVerticalGroup(
            pEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntrarLayout.createSequentialGroup()
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        loginForm.add(pEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 100, 40));

        separadorUser.setBackground(new java.awt.Color(51, 51, 51));
        loginForm.add(separadorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 280, 10));

        separadorSenha.setBackground(new java.awt.Color(51, 51, 51));
        loginForm.add(separadorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 237, 280, 10));

        copyright.setBackground(new java.awt.Color(0, 0, 0));
        copyright.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        copyright.setForeground(new java.awt.Color(153, 153, 153));
        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("2023© MARVSupport");
        copyright.setToolTipText("2023© MARVSupport");
        loginForm.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 345, 140, 20));

        pSair.setBackground(new java.awt.Color(10, 10, 10));

        btSair.setBackground(new java.awt.Color(10, 10, 10));
        btSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSair.setForeground(new java.awt.Color(102, 102, 102));
        btSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btSair.setText("X");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pSairLayout = new javax.swing.GroupLayout(pSair);
        pSair.setLayout(pSairLayout);
        pSairLayout.setHorizontalGroup(
            pSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );
        pSairLayout.setVerticalGroup(
            pSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        versao.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        versao.setForeground(new java.awt.Color(204, 204, 204));
        versao.setText("v1.0.2");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(loginForm, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(versao)
                        .addGap(151, 151, 151))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatus)
                    .addComponent(pSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Nome de usuário")) { //ao clicar pra colocar o usuário, apaga a escrita e muda a cor do separador
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.WHITE);
            hover.efeitoHoverSeparador(separadorUser, 0, 204, 204);
        }
        if (txtSenha.getText().isEmpty()) { //ao clicar pra colocar a senha, apaga a escrita e muda a cor do separador
            txtSenha.setText("******");
            txtSenha.setForeground(new java.awt.Color(153, 153, 153));
            hover.efeitoHoverSeparador(separadorSenha, 51, 51, 51);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMousePressed
        if (txtSenha.getText().equals("******")) { //ao clicar pra colocar a senha, apaga a escrita e muda a cor do separador
            txtSenha.setText("");
            txtSenha.setForeground(Color.WHITE);
            hover.efeitoHoverSeparador(separadorSenha, 0, 204, 204);
        }
        if (txtUsuario.getText().isEmpty()) { //ao clicar pra colocar o usuário, apaga a escrita e muda a cor do separador
            txtUsuario.setText("Nome de usuário");
            txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
            hover.efeitoHoverSeparador(separadorUser, 51, 51, 51);
        }
    }//GEN-LAST:event_txtSenhaMousePressed

    private void btEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseClicked
        try {
            Logar(); // realiza a verificação de Login
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEntrarMouseClicked

    private void btEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseEntered
        hover.efeitoHover(pEntrar, 0, 204, 204);
    }//GEN-LAST:event_btEntrarMouseEntered

    private void btEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseExited
        hover.efeitoHover(pEntrar, 10, 10, 10);
    }//GEN-LAST:event_btEntrarMouseExited

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        hover.efeitoHover(pSair, 153, 0, 0);
        btSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        hover.efeitoHover(pSair, 10, 10, 10);
        btSair.setForeground(Color.GRAY);
    }//GEN-LAST:event_btSairMouseExited

    private void btSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMousePressed
        System.exit(0); // sai do sistema ao clicar no X
    }//GEN-LAST:event_btSairMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        verificarConexao(); // verifica conexão com o banco de dados
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel background;
    private javax.swing.JLabel btEntrar;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel esqueceuTexto;
    private javax.swing.JLabel iconeSenha;
    private javax.swing.JLabel iconeUser;
    private javax.swing.JLabel iniciarSessao;
    private javax.swing.JPanel loginForm;
    private javax.swing.JPanel pEntrar;
    private javax.swing.JPanel pSair;
    private javax.swing.JLabel senha;
    private javax.swing.JSeparator separadorSenha;
    private javax.swing.JSeparator separadorUser;
    private javax.swing.JLabel txtCliqueAqui;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel versao;
    // End of variables declaration//GEN-END:variables
// verificando conexão com o banco de dados
    public void verificarConexao() {
        ImageIcon ii;
        DbConnection db = new DbConnection();
        db.conectarBD();
        if (db.verificarStatus() == true) {
            ii = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeOnline.png")).getImage());
            txtStatus.setText("ONLINE");
            txtStatus.setForeground(Color.GREEN.darker().darker());
            txtStatus.setIcon(ii);
            txtStatus.setToolTipText("CONEXÃO COM BANCO DE DADOS ONLINE.");
        }
    }
    // verificando usuário/senha para autenticar.
    public void Logar() throws UnknownHostException {
        try {
            String usuario = txtUsuario.getText();
            String senha = txtSenha.getText();

            if (usuario.isEmpty() || senha.isEmpty()) {
                fail.informarErro("Digite em todos os campos.");
            }
            User user = new User();
            user.setUsuario(usuario);
            user.setSenha(senha);
            UserConnections conexao = new UserConnections();
            ResultSet resultadoLogin = conexao.autenticarUsuario(user);
            // realiza a verificação no Banco de dados se existe aquele usuário e senha
            if (resultadoLogin.next()) {
                Dashboard dash = new Dashboard();
                String ipPc = InetAddress.getLocalHost().getHostAddress();
                System.out.println("Usuario autenticado: " + usuario + " | IP: " + ipPc);
                dash.setVisible(true);
                dash.inicializar(user);
                this.dispose();
            } else {
                fail.informarErro("Usuário ou senha incorretos.");
                System.out.println("Erro ao encontrar usuário: " + usuario);
            }
        } catch (SQLException e) {
        }
    }
}