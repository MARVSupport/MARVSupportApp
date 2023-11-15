package view;

import controller.TicketConnections;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import modal.Fail;
import modal.Sucess;
import model.Ticket;
import utils.HoverEffect;

public class InfoTicket extends javax.swing.JPanel {

    HoverEffect hover = new HoverEffect();
    Fail erro = new Fail();

    public InfoTicket() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAbrir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        separadorTitulo = new javax.swing.JSeparator();
        labelExtras = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDataAbertura = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        txtCriador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pFechar = new javax.swing.JPanel();
        btFechar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        painelAdmin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        pSalvar = new javax.swing.JPanel();
        btSalvar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(16, 16, 16));
        setMaximumSize(new java.awt.Dimension(1060, 650));
        setMinimumSize(new java.awt.Dimension(1060, 650));
        setPreferredSize(new java.awt.Dimension(1060, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAbrir.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAbrir.setForeground(new java.awt.Color(255, 255, 255));
        labelAbrir.setText("TICKET");
        add(labelAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("ID: #");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setText("1");
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 120, 120, -1));

        txtTitulo.setEditable(false);
        txtTitulo.setBackground(new java.awt.Color(15, 15, 15));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("TÍTULO");
        txtTitulo.setBorder(null);
        txtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTituloMouseClicked(evt);
            }
        });
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 260, -1));

        separadorTitulo.setBackground(new java.awt.Color(51, 51, 51));
        separadorTitulo.setForeground(new java.awt.Color(51, 51, 51));
        separadorTitulo.setPreferredSize(new java.awt.Dimension(0, 1));
        add(separadorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 203, 260, 3));

        labelExtras.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        labelExtras.setForeground(new java.awt.Color(255, 255, 255));
        labelExtras.setText("Assunto do TICKET");
        add(labelExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("CRIADO POR:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("STATUS:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("DATA DE ABERTURA:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        txtDataAbertura.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtDataAbertura.setForeground(new java.awt.Color(255, 255, 255));
        txtDataAbertura.setText("11/11/2011");
        add(txtDataAbertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 550, -1, -1));

        txtStatus.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(255, 255, 255));
        txtStatus.setText("ABERTO");
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 530, 140, -1));

        txtCriador.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtCriador.setForeground(new java.awt.Color(255, 255, 255));
        txtCriador.setText("CRIADOR");
        add(txtCriador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("COMENTÁRIO");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 370, -1));

        pFechar.setBackground(new java.awt.Color(16, 16, 16));
        pFechar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pFechar.setForeground(new java.awt.Color(16, 16, 16));

        btFechar.setBackground(new java.awt.Color(16, 16, 16));
        btFechar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btFechar.setForeground(new java.awt.Color(255, 255, 255));
        btFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btFechar.setText("FECHAR");
        btFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFecharMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pFecharLayout = new javax.swing.GroupLayout(pFechar);
        pFechar.setLayout(pFecharLayout);
        pFecharLayout.setHorizontalGroup(
            pFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pFecharLayout.setVerticalGroup(
            pFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(pFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtComentario.setEditable(false);
        txtComentario.setBackground(new java.awt.Color(15, 15, 15));
        txtComentario.setColumns(20);
        txtComentario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtComentario.setForeground(new java.awt.Color(255, 255, 255));
        txtComentario.setLineWrap(true);
        txtComentario.setRows(5);
        txtComentario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtComentarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtComentario);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 370, 190));

        painelAdmin.setBackground(new java.awt.Color(16, 16, 16));
        painelAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SELECIONAR STATUS");
        painelAdmin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, -1));

        comboStatus.setBackground(new java.awt.Color(16, 16, 16));
        comboStatus.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        comboStatus.setForeground(new java.awt.Color(255, 255, 255));
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABERTO", "PENDENTE", "FECHADO", " " }));
        comboStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painelAdmin.add(comboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, -1));

        pSalvar.setBackground(new java.awt.Color(0, 204, 204));

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btSalvar.setText("SALVAR");
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalvarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pSalvarLayout = new javax.swing.GroupLayout(pSalvar);
        pSalvar.setLayout(pSalvarLayout);
        pSalvarLayout.setHorizontalGroup(
            pSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        pSalvarLayout.setVerticalGroup(
            pSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        painelAdmin.add(pSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, -1));

        add(painelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 230, 140));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtAssunto.setEditable(false);
        txtAssunto.setBackground(new java.awt.Color(15, 15, 15));
        txtAssunto.setColumns(20);
        txtAssunto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 440, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMouseClicked

    }//GEN-LAST:event_txtTituloMouseClicked

    private void btFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharMouseClicked

    }//GEN-LAST:event_btFecharMouseClicked

    private void btFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharMouseEntered

        hover.efeitoHover(pFechar, 102, 0, 0);
    }//GEN-LAST:event_btFecharMouseEntered

    private void btFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharMouseExited
        hover.efeitoHover(pFechar, 16, 16, 16);
    }//GEN-LAST:event_btFecharMouseExited

    private void txtComentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtComentarioMouseClicked

    }//GEN-LAST:event_txtComentarioMouseClicked

    private void btSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseEntered
        hover.efeitoHover(pSalvar, 0, 153, 153);
    }//GEN-LAST:event_btSalvarMouseEntered

    private void btSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseExited
        hover.efeitoHover(pSalvar, 0, 204, 204);
    }//GEN-LAST:event_btSalvarMouseExited

    private void txtAssuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAssuntoMouseClicked

    }//GEN-LAST:event_txtAssuntoMouseClicked

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked

        salvarTicket();
    }//GEN-LAST:event_btSalvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btFechar;
    private javax.swing.JLabel btSalvar;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAbrir;
    private javax.swing.JLabel labelExtras;
    private javax.swing.JPanel pFechar;
    private javax.swing.JPanel pSalvar;
    private javax.swing.JPanel painelAdmin;
    private javax.swing.JSeparator separadorTitulo;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JLabel txtCriador;
    private javax.swing.JLabel txtDataAbertura;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
 public void mostrarDadosTicket(int idTicket, String nivel) throws SQLException {
        TicketConnections ct = new TicketConnections();

        try {
            ResultSet resultado = ct.mostrarDados(idTicket);
            while (resultado.next()) {

                // realizando a busca e implementando
                Ticket t = new Ticket();
                t.setId(resultado.getInt("id"));
                t.setTitulo(resultado.getString("titulo"));
                t.setAssunto(resultado.getString("assunto"));
                t.setData(resultado.getString("data"));
                t.setStatus(resultado.getInt("status"));
                t.setCriador(resultado.getString("criador"));
                t.setComentario(resultado.getString("comentario"));

                // mostrando o resultado
                String idT = String.valueOf(t.getId());
                int stt = t.getStatus();
                txtTitulo.setText(t.getTitulo());
                txtAssunto.setText(t.getAssunto());
                txtDataAbertura.setText(t.getData());
                txtId.setText(idT);
                txtComentario.setText(t.getComentario());
                txtCriador.setText(t.getCriador());

                switch (stt) {
                    case 1:
                        txtStatus.setText("ABERTO");
                        comboStatus.setSelectedIndex(0);
                        break;
                    case 2:
                        txtStatus.setText("PENDENTE");
                        comboStatus.setSelectedIndex(1);
                        break;
                    case 3:
                        txtStatus.setText("FECHADO");
                        comboStatus.setSelectedIndex(2);
                        break;
                }
                System.out.println(nivel);
                if (nivel.equals("Administrador(a)")) {
                    painelAdmin.setVisible(true);
                    txtComentario.setEditable(true);
                } else {
                    painelAdmin.setVisible(false);
                    txtComentario.setEditable(false);
                }
            }
        } catch (Exception e) {
            erro.informarErro("Ocorreu um erro: " + e);
        }
    }
    // método pra trocar de aba clicando na opção

    private void trocarTela(JPanel painel) {
        painel.setSize(1060, 650);
        painel.setLocation(0, 0);
        this.removeAll();
        this.add(painel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    private void salvarTicket() {
        Ticket ticket = new Ticket();
        int id = Integer.parseInt(txtId.getText());
        String comentario = txtComentario.getText();
        int status = comboStatus.getSelectedIndex();

        ticket.setId(id);
        ticket.setComentario(comentario);

        switch (status) {
            case 0:
                ticket.setStatus(1);
                break;
            case 1:
                ticket.setStatus(2);
                break;
            case 2:
                ticket.setStatus(3);
                break;
        }
        
        TicketConnections tc = new TicketConnections();
        tc.editarTicket(ticket);
    }
}
