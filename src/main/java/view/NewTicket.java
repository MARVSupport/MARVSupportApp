/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.TicketConnections;
import controller.UserConnections;
import javax.swing.JPanel;
import modal.Fail;
import model.Ticket;
import model.User;
import utils.CurrentDate;

public class NewTicket extends javax.swing.JPanel {

    Fail fail = new Fail();
    CurrentDate data = new CurrentDate();
    Ticket ticket = new Ticket();
    User usuario = new User();

    public NewTicket() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separadorTitulo = new javax.swing.JSeparator();
        labelExtras = new javax.swing.JLabel();
        pAbrirTicket = new javax.swing.JPanel();
        btAbrirTicket = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        pCancelar = new javax.swing.JPanel();
        btCancelar = new javax.swing.JLabel();
        labelAbrir = new javax.swing.JLabel();

        setBackground(new java.awt.Color(16, 16, 16));
        setMaximumSize(new java.awt.Dimension(1060, 650));
        setMinimumSize(new java.awt.Dimension(1060, 650));
        setPreferredSize(new java.awt.Dimension(1060, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separadorTitulo.setBackground(new java.awt.Color(51, 51, 51));
        separadorTitulo.setForeground(new java.awt.Color(51, 51, 51));
        separadorTitulo.setPreferredSize(new java.awt.Dimension(0, 1));
        add(separadorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 173, 260, 3));

        labelExtras.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        labelExtras.setForeground(new java.awt.Color(255, 255, 255));
        labelExtras.setText("Assunto do TICKET");
        add(labelExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 214, -1, -1));

        pAbrirTicket.setBackground(new java.awt.Color(0, 204, 204));

        btAbrirTicket.setBackground(new java.awt.Color(0, 204, 204));
        btAbrirTicket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAbrirTicket.setForeground(new java.awt.Color(255, 255, 255));
        btAbrirTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btAbrirTicket.setText("ABRIR TICKET");
        btAbrirTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAbrirTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAbrirTicketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAbrirTicketMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAbrirTicketMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pAbrirTicketLayout = new javax.swing.GroupLayout(pAbrirTicket);
        pAbrirTicket.setLayout(pAbrirTicketLayout);
        pAbrirTicketLayout.setHorizontalGroup(
            pAbrirTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAbrirTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pAbrirTicketLayout.setVerticalGroup(
            pAbrirTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAbrirTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(pAbrirTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 160, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtAssunto.setBackground(new java.awt.Color(15, 15, 15));
        txtAssunto.setColumns(20);
        txtAssunto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtAssunto.setForeground(new java.awt.Color(255, 255, 255));
        txtAssunto.setLineWrap(true);
        txtAssunto.setRows(5);
        txtAssunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtAssunto.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtAssunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAssuntoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtAssunto);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 530, 320));

        txtTitulo.setBackground(new java.awt.Color(15, 15, 15));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Título do TICKET");
        txtTitulo.setBorder(null);
        txtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTituloMouseClicked(evt);
            }
        });
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 260, -1));

        pCancelar.setBackground(new java.awt.Color(16, 16, 16));
        pCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btCancelar.setText("CANCELAR");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pCancelarLayout = new javax.swing.GroupLayout(pCancelar);
        pCancelar.setLayout(pCancelarLayout);
        pCancelarLayout.setHorizontalGroup(
            pCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        pCancelarLayout.setVerticalGroup(
            pCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        add(pCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 160, 30));

        labelAbrir.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAbrir.setForeground(new java.awt.Color(255, 255, 255));
        labelAbrir.setText("ABRIR TICKET");
        add(labelAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btAbrirTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbrirTicketMouseClicked
        criarTicket();
    }//GEN-LAST:event_btAbrirTicketMouseClicked

    private void btAbrirTicketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbrirTicketMouseEntered
        painelMudar(pAbrirTicket, 0, 153, 153);
    }//GEN-LAST:event_btAbrirTicketMouseEntered

    private void btAbrirTicketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbrirTicketMouseExited
        painelMudar(pAbrirTicket, 0, 204, 204);
    }//GEN-LAST:event_btAbrirTicketMouseExited

    private void txtAssuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAssuntoMouseClicked
        if (txtTitulo.getText().isEmpty()) {
            txtTitulo.setText("Título do TICKET");
        }
    }//GEN-LAST:event_txtAssuntoMouseClicked

    private void txtTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMouseClicked
        if (txtTitulo.getText().equals("Título do TICKET")) {
            txtTitulo.setText("");
        }
    }//GEN-LAST:event_txtTituloMouseClicked

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked

        resetarCampos();
    }//GEN-LAST:event_btCancelarMouseClicked

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered

        painelMudar(pCancelar, 102, 0, 0);
    }//GEN-LAST:event_btCancelarMouseEntered

    private void btCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseExited
        painelMudar(pCancelar, 16, 16, 16);
    }//GEN-LAST:event_btCancelarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btAbrirTicket;
    private javax.swing.JLabel btCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAbrir;
    private javax.swing.JLabel labelExtras;
    private javax.swing.JPanel pAbrirTicket;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JSeparator separadorTitulo;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
    // efeito hover nos botões
    private void painelMudar(JPanel painel, int r, int g, int b) {
        painel.setBackground(new java.awt.Color(r, g, b));
    }

    public void resgatarUsuario(User user) {
        ticket.setCriador(user.getUsuario());
        usuario = user;
    }

    private void criarTicket() {
        if (txtTitulo.getText().isEmpty() || txtTitulo.getText().equals("Título do TICKET")) {
            fail.informarErro("Insira o título do chamado.");

        } else if (txtAssunto.getText().isEmpty()) {
            fail.informarErro("Insira o assunto do chamado.");

        } else {
            ticket.setTitulo(txtTitulo.getText());
            ticket.setAssunto(txtAssunto.getText());
            ticket.setData(data.verificarData());
            ticket.setStatus(1); // ABERTO
            TicketConnections tc = new TicketConnections();
            tc.criarTicket(ticket);
            System.out.println("Foi aberto um novo chamado!");
            resetarCampos();
            
            UserConnections uc = new UserConnections();
            uc.enviarEmailAdmin("Chamado aberto por: " + usuario.getUsuario() + " | Título: " + ticket.getTitulo(), "Assunto: " + ticket.getAssunto());
        }

    }

    private void resetarCampos() {
        txtTitulo.setText("Título do TICKET");
        txtAssunto.setText("");
    }
}
