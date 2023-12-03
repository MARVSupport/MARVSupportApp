package view;

import controller.TicketConnections;
import java.sql.Connection;
import modal.Fail;
import modal.Sucess;
import utils.CurrentDate;

public class HomeView extends javax.swing.JPanel {
    //imports

    Connection conexao;
    Fail fail = new Fail();
    Sucess ok = new Sucess();
    TicketConnections tc = new TicketConnections();

    public HomeView() {
        initComponents();
        iniciarData();
        inicializarTicketsView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFechados = new javax.swing.JPanel();
        txtFechados = new javax.swing.JLabel();
        pAbertos = new javax.swing.JPanel();
        txtAbertos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pPendentes = new javax.swing.JPanel();
        txtPendentes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        painelGrafico = new javax.swing.JPanel();
        pendentes = new javax.swing.JPanel();
        fechados = new javax.swing.JPanel();
        abertos = new javax.swing.JPanel();
        pendentes1 = new javax.swing.JPanel();
        fechados1 = new javax.swing.JPanel();
        abertos1 = new javax.swing.JPanel();
        pendentes2 = new javax.swing.JPanel();
        fechados2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pVerde = new javax.swing.JPanel();
        pVermelho = new javax.swing.JPanel();
        pAmarelo = new javax.swing.JPanel();
        txtData = new javax.swing.JLabel();

        setBackground(new java.awt.Color(16, 16, 16));
        setMaximumSize(new java.awt.Dimension(1060, 650));
        setMinimumSize(new java.awt.Dimension(1060, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pFechados.setBackground(new java.awt.Color(18, 18, 18));
        pFechados.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(102, 0, 0)));

        txtFechados.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtFechados.setForeground(new java.awt.Color(255, 255, 255));
        txtFechados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechados.setText("427");
        txtFechados.setToolTipText("");

        javax.swing.GroupLayout pFechadosLayout = new javax.swing.GroupLayout(pFechados);
        pFechados.setLayout(pFechadosLayout);
        pFechadosLayout.setHorizontalGroup(
            pFechadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFechados, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        pFechadosLayout.setVerticalGroup(
            pFechadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFechados, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        add(pFechados, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 209, 120));

        pAbertos.setBackground(new java.awt.Color(18, 18, 18));
        pAbertos.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(0, 153, 0)));

        txtAbertos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtAbertos.setForeground(new java.awt.Color(255, 255, 255));
        txtAbertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAbertos.setText("13");
        txtAbertos.setToolTipText("");

        javax.swing.GroupLayout pAbertosLayout = new javax.swing.GroupLayout(pAbertos);
        pAbertos.setLayout(pAbertosLayout);
        pAbertosLayout.setHorizontalGroup(
            pAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAbertos, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        pAbertosLayout.setVerticalGroup(
            pAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAbertos, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        add(pAbertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 209, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEJA BEM-VINDO(A)!");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 370, -1));

        pPendentes.setBackground(new java.awt.Color(18, 18, 18));
        pPendentes.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(204, 204, 0)));

        txtPendentes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtPendentes.setForeground(new java.awt.Color(255, 255, 255));
        txtPendentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPendentes.setText("61");
        txtPendentes.setToolTipText("");

        javax.swing.GroupLayout pPendentesLayout = new javax.swing.GroupLayout(pPendentes);
        pPendentes.setLayout(pPendentesLayout);
        pPendentesLayout.setHorizontalGroup(
            pPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        pPendentesLayout.setVerticalGroup(
            pPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        add(pPendentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 209, 120));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ABERTOS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 209, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PENDENTES");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 209, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FECHADOS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 209, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("STATUS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 150, 50));

        painelGrafico.setBackground(new java.awt.Color(18, 18, 18));
        painelGrafico.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(20, 20, 20)));

        pendentes.setBackground(new java.awt.Color(204, 204, 0));
        pendentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pendentes.setPreferredSize(new java.awt.Dimension(60, 19));

        javax.swing.GroupLayout pendentesLayout = new javax.swing.GroupLayout(pendentes);
        pendentes.setLayout(pendentesLayout);
        pendentesLayout.setHorizontalGroup(
            pendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pendentesLayout.setVerticalGroup(
            pendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        fechados.setBackground(new java.awt.Color(102, 0, 0));
        fechados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechados.setPreferredSize(new java.awt.Dimension(60, 19));

        javax.swing.GroupLayout fechadosLayout = new javax.swing.GroupLayout(fechados);
        fechados.setLayout(fechadosLayout);
        fechadosLayout.setHorizontalGroup(
            fechadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        fechadosLayout.setVerticalGroup(
            fechadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        abertos.setBackground(new java.awt.Color(0, 153, 0));
        abertos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abertos.setPreferredSize(new java.awt.Dimension(60, 19));

        pendentes1.setBackground(new java.awt.Color(204, 204, 0));
        pendentes1.setPreferredSize(new java.awt.Dimension(19, 50));
        pendentes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechados1.setBackground(new java.awt.Color(102, 0, 0));
        fechados1.setPreferredSize(new java.awt.Dimension(19, 50));
        fechados1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abertos1.setBackground(new java.awt.Color(0, 153, 0));
        abertos1.setPreferredSize(new java.awt.Dimension(19, 50));
        abertos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pendentes2.setBackground(new java.awt.Color(204, 204, 0));
        pendentes2.setPreferredSize(new java.awt.Dimension(19, 50));
        pendentes2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        abertos1.add(pendentes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 105, -1, -1));

        fechados2.setBackground(new java.awt.Color(102, 0, 0));
        fechados2.setPreferredSize(new java.awt.Dimension(19, 50));
        fechados2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        abertos1.add(fechados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        javax.swing.GroupLayout abertosLayout = new javax.swing.GroupLayout(abertos);
        abertos.setLayout(abertosLayout);
        abertosLayout.setHorizontalGroup(
            abertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abertosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(abertos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(pendentes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(fechados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        abertosLayout.setVerticalGroup(
            abertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abertosLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(abertos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(abertosLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(pendentes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(abertosLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(fechados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGraficoLayout.createSequentialGroup()
                .addGroup(painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(375, 375, 375))
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGraficoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(abertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(fechados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        add(painelGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 440, 160));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GRÁFICO");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 210, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ABERTOS");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FECHADOS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PENDENTES");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        pVerde.setBackground(new java.awt.Color(0, 153, 0));
        pVerde.setMaximumSize(new java.awt.Dimension(16, 16));
        pVerde.setPreferredSize(new java.awt.Dimension(16, 16));

        javax.swing.GroupLayout pVerdeLayout = new javax.swing.GroupLayout(pVerde);
        pVerde.setLayout(pVerdeLayout);
        pVerdeLayout.setHorizontalGroup(
            pVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        pVerdeLayout.setVerticalGroup(
            pVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(pVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        pVermelho.setBackground(new java.awt.Color(102, 0, 0));
        pVermelho.setMaximumSize(new java.awt.Dimension(16, 16));
        pVermelho.setMinimumSize(new java.awt.Dimension(16, 16));

        javax.swing.GroupLayout pVermelhoLayout = new javax.swing.GroupLayout(pVermelho);
        pVermelho.setLayout(pVermelhoLayout);
        pVermelhoLayout.setHorizontalGroup(
            pVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        pVermelhoLayout.setVerticalGroup(
            pVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(pVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        pAmarelo.setBackground(new java.awt.Color(204, 204, 0));
        pAmarelo.setMaximumSize(new java.awt.Dimension(16, 16));
        pAmarelo.setMinimumSize(new java.awt.Dimension(16, 16));

        javax.swing.GroupLayout pAmareloLayout = new javax.swing.GroupLayout(pAmarelo);
        pAmarelo.setLayout(pAmareloLayout);
        pAmareloLayout.setHorizontalGroup(
            pAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        pAmareloLayout.setVerticalGroup(
            pAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(pAmarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        txtData.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("01/01/2001");
        add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 84, 440, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abertos;
    private javax.swing.JPanel abertos1;
    private javax.swing.JPanel fechados;
    private javax.swing.JPanel fechados1;
    private javax.swing.JPanel fechados2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pAbertos;
    private javax.swing.JPanel pAmarelo;
    private javax.swing.JPanel pFechados;
    private javax.swing.JPanel pPendentes;
    private javax.swing.JPanel pVerde;
    private javax.swing.JPanel pVermelho;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JPanel pendentes;
    private javax.swing.JPanel pendentes1;
    private javax.swing.JPanel pendentes2;
    private javax.swing.JLabel txtAbertos;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtFechados;
    private javax.swing.JLabel txtPendentes;
    // End of variables declaration//GEN-END:variables
// verificando a data completa através da classe CurrentDate
    private void iniciarData() {
        CurrentDate data = new CurrentDate();
        txtData.setText("Exibindo atualizações de " + data.verificarDataCompleta());
    }

    // verificando e calculando quantidade mínima, máxima e meio termo para analisar e mostrar no gráfico
    private void mostrarGrafico() {
        int qntMin = 8;
        int qntMedia = 100;
        int qntMax = 150;
        int max = 380;
        int meio = 150;
        int min = 60;
        int zero = 15;
        int valorAberto = Integer.parseInt(txtAbertos.getText());
        int valorPendente = Integer.parseInt(txtPendentes.getText());
        int valorFechados = Integer.parseInt(txtFechados.getText());
        abertos.setToolTipText(txtAbertos.getText());
        pendentes.setToolTipText(txtPendentes.getText());
        fechados.setToolTipText(txtFechados.getText());
        // VALOR ABERTO
        if (valorAberto == 0) {
            abertos.setPreferredSize(new java.awt.Dimension(zero, 19));
        } else if (valorAberto > qntMin && valorAberto < qntMax) {
            abertos.setPreferredSize(new java.awt.Dimension(meio, 19));
        } else if (valorAberto >= qntMax) {
            abertos.setPreferredSize(new java.awt.Dimension(max, 19));
        } else {
            abertos.setPreferredSize(new java.awt.Dimension(min, 19));
        }
        // VALOR PENDENTE
        if (valorPendente == 0) {
            pendentes.setPreferredSize(new java.awt.Dimension(zero, 19));
        } else if (valorPendente > qntMin && valorPendente < qntMax) {
            pendentes.setPreferredSize(new java.awt.Dimension(meio, 19));
        } else if (valorPendente >= qntMax) {
            pendentes.setPreferredSize(new java.awt.Dimension(max, 19));
        } else {
            pendentes.setPreferredSize(new java.awt.Dimension(min, 19));
        }
        //VALOR FECHADO
        if (valorFechados == 0) {
            fechados.setPreferredSize(new java.awt.Dimension(zero, 19));
        } else if (valorFechados > qntMin && valorFechados < qntMax) {
            fechados.setPreferredSize(new java.awt.Dimension(meio, 19));
        } else if (valorFechados >= qntMax) {
            fechados.setPreferredSize(new java.awt.Dimension(max, 19));
        } else {
            fechados.setPreferredSize(new java.awt.Dimension(min, 19));
        }
    }
// exibindo informações ao abrir essa aba
    private void inicializarTicketsView() {
        contagemTickets();
        mostrarGrafico();
    }

    //contagem de tickets
    private void contagemTickets() {
        txtAbertos.setText(tc.qntTotalTicket(1));
        txtAbertos.setToolTipText(txtAbertos.getText());
        txtPendentes.setText(tc.qntTotalTicket(2));
        txtPendentes.setToolTipText(txtPendentes.getText());
        txtFechados.setText(tc.qntTotalTicket(3));
        txtFechados.setToolTipText(txtFechados.getText());
    }
}
