package view;

import controller.TicketConnections;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Ticket;

public class TicketsView extends javax.swing.JPanel {

    String nivel = "";

    public TicketsView() {
        initComponents();
        mostrarTickets();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        container = new javax.swing.JPanel();
        pHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAbertos = new javax.swing.JTable();
        txtAbertos = new javax.swing.JLabel();
        comboSelecionarStatus = new javax.swing.JComboBox<>();
        btBuscar = new javax.swing.JButton();
        txtFiltro = new javax.swing.JLabel();
        barraPesquisa = new javax.swing.JSeparator();
        btBuscar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jScrollPane3.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(16, 16, 16));
        setMaximumSize(new java.awt.Dimension(1060, 650));
        setMinimumSize(new java.awt.Dimension(1060, 650));
        setPreferredSize(new java.awt.Dimension(1060, 650));

        container.setBackground(new java.awt.Color(16, 16, 16));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pHeader.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("#");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TÍTULO");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATA");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STATUS");

        javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
        pHeader.setLayout(pHeaderLayout);
        pHeaderLayout.setHorizontalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel3)
                .addGap(155, 155, 155)
                .addComponent(jLabel5)
                .addGap(82, 82, 82))
        );
        pHeaderLayout.setVerticalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel5))
        );

        container.add(pHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 92, 840, -1));

        jScrollPane1.setBackground(new java.awt.Color(16, 16, 16));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tbAbertos.setBackground(new java.awt.Color(16, 16, 16));
        tbAbertos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbAbertos.setForeground(new java.awt.Color(255, 255, 255));
        tbAbertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAbertos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbAbertos.setGridColor(new java.awt.Color(102, 102, 102));
        tbAbertos.setRowHeight(22);
        tbAbertos.setSelectionBackground(new java.awt.Color(16, 16, 16));
        tbAbertos.setSelectionForeground(new java.awt.Color(0, 204, 204));
        tbAbertos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbAbertos.setShowGrid(false);
        tbAbertos.setShowHorizontalLines(true);
        tbAbertos.getTableHeader().setResizingAllowed(false);
        tbAbertos.getTableHeader().setReorderingAllowed(false);
        tbAbertos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAbertosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAbertos);
        if (tbAbertos.getColumnModel().getColumnCount() > 0) {
            tbAbertos.getColumnModel().getColumn(0).setResizable(false);
            tbAbertos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbAbertos.getColumnModel().getColumn(1).setResizable(false);
            tbAbertos.getColumnModel().getColumn(1).setPreferredWidth(160);
            tbAbertos.getColumnModel().getColumn(2).setResizable(false);
            tbAbertos.getColumnModel().getColumn(2).setPreferredWidth(60);
            tbAbertos.getColumnModel().getColumn(3).setResizable(false);
            tbAbertos.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        container.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 840, 490));

        txtAbertos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtAbertos.setForeground(new java.awt.Color(255, 255, 255));
        txtAbertos.setText("TICKETS");
        container.add(txtAbertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 50));

        comboSelecionarStatus.setBackground(new java.awt.Color(16, 16, 16));
        comboSelecionarStatus.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        comboSelecionarStatus.setForeground(new java.awt.Color(255, 255, 255));
        comboSelecionarStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ABERTOS", "PENDENTES", "FECHADOS" }));
        comboSelecionarStatus.setToolTipText("SELECIONE O STATUS");
        comboSelecionarStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        container.add(comboSelecionarStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 150, 30));

        btBuscar.setBackground(new java.awt.Color(16, 16, 16));
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeBuscar.png"))); // NOI18N
        btBuscar.setToolTipText("BUSCAR");
        btBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), null, null));
        btBuscar.setFocusPainted(false);
        btBuscar.setFocusable(false);
        btBuscar.setIconTextGap(0);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        container.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 40, 33));

        txtFiltro.setBackground(new java.awt.Color(255, 255, 255));
        txtFiltro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFiltro.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltro.setText("STATUS");
        txtFiltro.setToolTipText("");
        container.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 150, -1));

        barraPesquisa.setBackground(new java.awt.Color(51, 51, 51));
        barraPesquisa.setForeground(new java.awt.Color(51, 51, 51));
        barraPesquisa.setPreferredSize(new java.awt.Dimension(0, 1));
        container.add(barraPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 340, 10));

        btBuscar1.setBackground(new java.awt.Color(16, 16, 16));
        btBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeBuscar.png"))); // NOI18N
        btBuscar1.setToolTipText("BUSCAR");
        btBuscar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), null, null));
        btBuscar1.setFocusPainted(false);
        btBuscar1.setFocusable(false);
        btBuscar1.setIconTextGap(0);
        btBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar1ActionPerformed(evt);
            }
        });
        container.add(btBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 40, 33));

        jTextField1.setBackground(new java.awt.Color(16, 16, 16));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Pesquisar por #");
        jTextField1.setBorder(null);
        container.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 340, 30));

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

    private void tbAbertosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAbertosMouseClicked
        try {
            carregarTicket(tbAbertos);
        } catch (SQLException ex) {
            System.out.println("ex");
        }
    }//GEN-LAST:event_tbAbertosMouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        buscarTickets();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator barraPesquisa;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btBuscar1;
    private javax.swing.JComboBox<String> comboSelecionarStatus;
    private javax.swing.JPanel container;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pHeader;
    private javax.swing.JTable tbAbertos;
    private javax.swing.JLabel txtAbertos;
    private javax.swing.JLabel txtFiltro;
    // End of variables declaration//GEN-END:variables
    // efeito hover nos botões
    private void efeitoHover(JPanel painel, int r, int g, int b) {
        painel.setBackground(new java.awt.Color(r, g, b));
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

    private void mostrarTickets() {
        DefaultTableModel modeloTabelaPendentes = (DefaultTableModel) tbAbertos.getModel();
        TicketConnections t = new TicketConnections();
        String status = "";

        modeloTabelaPendentes.setNumRows(0);
        for (Ticket ticket : t.listarTodosTickets()) {

            switch (ticket.getStatus()) {
                case 1:
                    status = "ABERTO";
                    break;

                case 2:
                    status = "PENDENTE";
                    break;

                case 3:
                    status = "FECHADO";
                    break;
            }
            modeloTabelaPendentes.addRow(new Object[]{
                ticket.getId(), ticket.getTitulo(), ticket.getData(), status
            });
            corNaLinha();
        }
    }

    // inserindo cor no status do chamado
    private void corNaLinha() {
        String aberto = "ABERTO";
        String pendente = "PENDENTE";
        String fechado = "FECHADO";
        tbAbertos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                this.setHorizontalAlignment(CENTER);
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (value.equals(aberto)) {
                    setForeground(Color.GREEN.darker());
                } else if (value.equals(pendente)) {
                    setForeground(Color.YELLOW);
                } else if (value.equals(fechado)) {
                    setForeground(Color.RED);
                } else {
                    setForeground(Color.WHITE);
                }

                return label;
            }
        });
    }

    // realizando busca dos chamados através do filtro
    private void buscarTickets() {
        DefaultTableModel modeloTabelaPendentes = (DefaultTableModel) tbAbertos.getModel();
        TicketConnections t = new TicketConnections();
        String status = "";
        int sttNumber = 0;

        String stt = (String) comboSelecionarStatus.getSelectedItem();

        switch (stt) {
            case "ABERTOS":
                sttNumber = 1;
                break;
            case "PENDENTES":
                sttNumber = 2;
                break;
            case "FECHADOS":
                sttNumber = 3;
                break;
            case "TODOS":
                sttNumber = 4;
                break;
        }

        modeloTabelaPendentes.setNumRows(0);

        if (sttNumber == 4) {
            mostrarTickets();
        } else {
            for (Ticket ticket : t.listarTicketsEspecificos(sttNumber)) {

                switch (ticket.getStatus()) {
                    case 1:
                        status = "ABERTO";
                        break;

                    case 2:
                        status = "PENDENTE";
                        break;

                    case 3:
                        status = "FECHADO";
                        break;
                }
                modeloTabelaPendentes.addRow(new Object[]{
                    ticket.getId(), ticket.getTitulo(), ticket.getData(), status
                });
                corNaLinha();
            }
        }
    }

    // passa a view InfoTicket a coluna e linha da tabela pra realizar a busca, além do tipo de usuário (Admin ou operador)
    private void carregarTicket(JTable table) throws SQLException {
        int validar = (int) table.getValueAt(table.getSelectedRow(), 0);
        InfoTicket infos = new InfoTicket();
        infos.mostrarDadosTicket(validar, nivel);
        trocarTela(infos);
    }

    // resgata o nível do usuário
    public void inicializarTicketsView(String nivelUsuario) {
         nivel = nivelUsuario;
    }
}
