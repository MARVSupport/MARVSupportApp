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
/**
 * VIEW - Sobre o projeto
 *
 * @author Victor Silva
 * @version 1.0.2
 */
public class About extends javax.swing.JPanel {

// classe view - sobre o projeto
    public About() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        txtAbertos = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        txtAbertos1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(1060, 650));
        setMinimumSize(new java.awt.Dimension(1060, 650));

        container.setBackground(new java.awt.Color(16, 16, 16));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAbertos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAbertos.setForeground(new java.awt.Color(255, 255, 255));
        txtAbertos.setText("DESENVOLVIDO POR:");
        container.add(txtAbertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 50));

        Logo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-32x32.png"))); // NOI18N
        Logo.setText("MARVSupport");
        container.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, -1));

        copyright.setBackground(new java.awt.Color(0, 0, 0));
        copyright.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        copyright.setForeground(new java.awt.Color(153, 153, 153));
        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("2023© MARVSupport");
        copyright.setToolTipText("2023© MARVSupport");
        container.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, 20));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(16, 16, 16));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Victor Silva\nRebeca Louise\nJéssica Castro\nNatália Fernandes\nTaise Ferreira\nJosé Soares\nMarlon Henrique");
        jTextPane1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextPane1.setSelectionColor(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(jTextPane1);

        container.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 450, 150));

        txtAbertos1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtAbertos1.setForeground(new java.awt.Color(255, 255, 255));
        txtAbertos1.setText("SOBRE");
        container.add(txtAbertos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 50));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(16, 16, 16));
        jTextPane2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("O Software da MARV é uma ferramenta versátil que permite à sua equipe de suporte ou atendimento ao cliente receber, priorizar e resolver rapidamente as solicitações e incidentes dos clientes ou usuários. Com recursos avançados, este software é a solução ideal para organizações de todos os tamanhos que desejam aprimorar a experiência do cliente e a eficiência operacional.");
        jTextPane2.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextPane2.setSelectionColor(new java.awt.Color(0, 204, 204));
        jScrollPane2.setViewportView(jTextPane2);

        container.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 450, 140));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel container;
    private javax.swing.JLabel copyright;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel txtAbertos;
    private javax.swing.JLabel txtAbertos1;
    // End of variables declaration//GEN-END:variables
}
