package view;

import controller.UserConnections;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modal.Fail;
import model.User;
import utils.HoverEffect;

public class Dashboard extends javax.swing.JFrame {

        User usuario = new User();
        HoverEffect he = new HoverEffect();
        public Dashboard() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icone-32x32.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userMenu = new javax.swing.JPopupMenu();
        nivelUsuario = new javax.swing.JMenuItem();
        deslogar = new javax.swing.JMenuItem();
        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        pTickets = new javax.swing.JPanel();
        btTickets = new javax.swing.JLabel();
        pHome = new javax.swing.JPanel();
        btHome = new javax.swing.JLabel();
        pEmail = new javax.swing.JPanel();
        btEmail = new javax.swing.JLabel();
        pConfig = new javax.swing.JPanel();
        btConfig = new javax.swing.JLabel();
        pInfo = new javax.swing.JPanel();
        btSobre = new javax.swing.JLabel();
        txtExtras = new javax.swing.JLabel();
        txtPrincipal = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        iconeFotoUser = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        iconeUsuario = new javax.swing.JLabel();
        pNovo = new javax.swing.JPanel();
        btNovo = new javax.swing.JLabel();
        newletter = new javax.swing.JLabel();
        atualizacoes = new javax.swing.JLabel();
        manual = new javax.swing.JLabel();
        pSair = new javax.swing.JPanel();
        btSair = new javax.swing.JLabel();

        userMenu.setBackground(new java.awt.Color(10, 10, 10));
        userMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userMenu.setForeground(new java.awt.Color(204, 204, 204));
        userMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        userMenu.setMinimumSize(new java.awt.Dimension(183, 62));

        nivelUsuario.setBackground(new java.awt.Color(10, 10, 10));
        nivelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nivelUsuario.setForeground(new java.awt.Color(204, 204, 204));
        nivelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeUsuario.png"))); // NOI18N
        nivelUsuario.setText("NivelUsuario");
        nivelUsuario.setBorder(null);
        nivelUsuario.setBorderPainted(false);
        nivelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nivelUsuario.setIconTextGap(10);
        nivelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelUsuarioActionPerformed(evt);
            }
        });
        userMenu.add(nivelUsuario);

        deslogar.setBackground(new java.awt.Color(10, 10, 10));
        deslogar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deslogar.setForeground(new java.awt.Color(204, 204, 204));
        deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeSaida.png"))); // NOI18N
        deslogar.setText("Deslogar");
        deslogar.setBorder(null);
        deslogar.setBorderPainted(false);
        deslogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deslogar.setIconTextGap(10);
        deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deslogarMouseClicked(evt);
            }
        });
        deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogarActionPerformed(evt);
            }
        });
        userMenu.add(deslogar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MARVSupport | Dashboard");
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(10, 10, 10));
        background.setForeground(new java.awt.Color(10, 10, 10));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(16, 16, 16));
        menu.setForeground(new java.awt.Color(16, 16, 16));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pTickets.setBackground(new java.awt.Color(16, 16, 16));
        pTickets.setMaximumSize(new java.awt.Dimension(200, 40));
        pTickets.setMinimumSize(new java.awt.Dimension(200, 40));

        btTickets.setBackground(new java.awt.Color(16, 16, 16));
        btTickets.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btTickets.setForeground(new java.awt.Color(255, 255, 255));
        btTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeTickets.png"))); // NOI18N
        btTickets.setText("TICKETS");
        btTickets.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(16, 16, 16)));
        btTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTickets.setIconTextGap(12);
        btTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTicketsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTicketsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTicketsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pTicketsLayout = new javax.swing.GroupLayout(pTickets);
        pTickets.setLayout(pTicketsLayout);
        pTicketsLayout.setHorizontalGroup(
            pTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pTicketsLayout.setVerticalGroup(
            pTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(pTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, -1));

        pHome.setBackground(new java.awt.Color(16, 16, 16));
        pHome.setMaximumSize(new java.awt.Dimension(200, 40));
        pHome.setMinimumSize(new java.awt.Dimension(200, 40));
        pHome.setRequestFocusEnabled(false);

        btHome.setBackground(new java.awt.Color(16, 16, 16));
        btHome.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btHome.setForeground(new java.awt.Color(255, 255, 255));
        btHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btHome.setText("HOME");
        btHome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(0, 204, 204)));
        btHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btHome.setIconTextGap(12);
        btHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pHomeLayout = new javax.swing.GroupLayout(pHome);
        pHome.setLayout(pHomeLayout);
        pHomeLayout.setHorizontalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btHome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pHomeLayout.setVerticalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btHome, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(pHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        pEmail.setBackground(new java.awt.Color(16, 16, 16));

        btEmail.setBackground(new java.awt.Color(16, 16, 16));
        btEmail.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btEmail.setForeground(new java.awt.Color(255, 255, 255));
        btEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/email.png"))); // NOI18N
        btEmail.setText("EMAIL");
        btEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(16, 16, 16)));
        btEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEmail.setIconTextGap(12);
        btEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEmailMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pEmailLayout = new javax.swing.GroupLayout(pEmail);
        pEmail.setLayout(pEmailLayout);
        pEmailLayout.setHorizontalGroup(
            pEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pEmailLayout.setVerticalGroup(
            pEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(pEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        pConfig.setBackground(new java.awt.Color(16, 16, 16));
        pConfig.setMaximumSize(new java.awt.Dimension(200, 40));
        pConfig.setMinimumSize(new java.awt.Dimension(200, 40));

        btConfig.setBackground(new java.awt.Color(16, 16, 16));
        btConfig.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btConfig.setForeground(new java.awt.Color(255, 255, 255));
        btConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeSuporte.png"))); // NOI18N
        btConfig.setText("CONFIGURAÇÕES");
        btConfig.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(16, 16, 16)));
        btConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConfig.setIconTextGap(12);
        btConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btConfigMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pConfigLayout = new javax.swing.GroupLayout(pConfig);
        pConfig.setLayout(pConfigLayout);
        pConfigLayout.setHorizontalGroup(
            pConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pConfigLayout.setVerticalGroup(
            pConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(pConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, -1));

        pInfo.setBackground(new java.awt.Color(16, 16, 16));

        btSobre.setBackground(new java.awt.Color(16, 16, 16));
        btSobre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btSobre.setForeground(new java.awt.Color(255, 255, 255));
        btSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        btSobre.setText("SOBRE");
        btSobre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(16, 16, 16)));
        btSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSobre.setIconTextGap(12);
        btSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSobreMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSobre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSobre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(pInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        txtExtras.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        txtExtras.setForeground(new java.awt.Color(255, 255, 255));
        txtExtras.setText("EXTRAS");
        menu.add(txtExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 80, -1));

        txtPrincipal.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        txtPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        txtPrincipal.setText("PRINCIPAL");
        menu.add(txtPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        nomeUsuario.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        nomeUsuario.setForeground(new java.awt.Color(0, 204, 204));
        nomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeUsuario.setText("Nome completo");
        nomeUsuario.setToolTipText("");
        nomeUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nomeUsuario.setIconTextGap(-10);
        nomeUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 200, -1));

        iconeFotoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeFotoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeNomeCompleto.png"))); // NOI18N
        iconeFotoUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        menu.add(iconeFotoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 100));

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 650));

        container.setBackground(new java.awt.Color(16, 16, 16));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        background.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 1070, 650));

        nav.setBackground(new java.awt.Color(16, 16, 16));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-32x32.png"))); // NOI18N
        Logo.setText("MARVSupport");
        nav.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 14, 170, -1));

        copyright.setBackground(new java.awt.Color(0, 0, 0));
        copyright.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        copyright.setForeground(new java.awt.Color(153, 153, 153));
        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("2023© MARVSupport");
        copyright.setToolTipText("2023© MARVSupport");
        nav.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 140, 20));

        iconeUsuario.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        iconeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        iconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioIcone.png"))); // NOI18N
        iconeUsuario.setText("nomeUsuario");
        iconeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeUsuarioMouseClicked(evt);
            }
        });
        nav.add(iconeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 190, 40));

        pNovo.setBackground(new java.awt.Color(0, 204, 204));

        btNovo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btNovo.setForeground(new java.awt.Color(255, 255, 255));
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeAddWhite.png"))); // NOI18N
        btNovo.setText("NOVO");
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovo.setVerifyInputWhenFocusTarget(false);
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNovoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNovoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pNovoLayout = new javax.swing.GroupLayout(pNovo);
        pNovo.setLayout(pNovoLayout);
        pNovoLayout.setHorizontalGroup(
            pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pNovoLayout.setVerticalGroup(
            pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        nav.add(pNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 90, 40));

        newletter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newletter.setForeground(new java.awt.Color(153, 153, 153));
        newletter.setText("NewsLatter");
        newletter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newletter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newletterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newletterMouseExited(evt);
            }
        });
        nav.add(newletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        atualizacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atualizacoes.setForeground(new java.awt.Color(153, 153, 153));
        atualizacoes.setText("Atualizações");
        atualizacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atualizacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atualizacoesMouseExited(evt);
            }
        });
        nav.add(atualizacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        manual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manual.setForeground(new java.awt.Color(153, 153, 153));
        manual.setText("Manual de utilização");
        manual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manualMouseExited(evt);
            }
        });
        nav.add(manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        pSair.setBackground(new java.awt.Color(16, 16, 16));

        btSair.setBackground(new java.awt.Color(16, 16, 16));
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

        nav.add(pSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 0, -1, -1));

        background.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iconeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeUsuarioMouseClicked
        userMenu.show(this, 1050, 50);
    }//GEN-LAST:event_iconeUsuarioMouseClicked

    private void btNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseClicked

        novoTicket();
    }//GEN-LAST:event_btNovoMouseClicked

    private void btNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseEntered
        he.efeitoHover(pNovo, 0, 153, 153);
    }//GEN-LAST:event_btNovoMouseEntered

    private void btNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseExited
         he.efeitoHover(pNovo, 0, 204, 204);
    }//GEN-LAST:event_btNovoMouseExited

    private void newletterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newletterMouseEntered

         he.efeitoHoverTextos(newletter, 230, 230, 230);
    }//GEN-LAST:event_newletterMouseEntered

    private void newletterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newletterMouseExited
        he.efeitoHoverTextos(newletter, 153, 153, 153);
    }//GEN-LAST:event_newletterMouseExited

    private void atualizacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizacoesMouseEntered
        he.efeitoHoverTextos(atualizacoes, 230, 230, 230);
    }//GEN-LAST:event_atualizacoesMouseEntered

    private void atualizacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizacoesMouseExited
        he.efeitoHoverTextos(atualizacoes, 153, 153, 153);
    }//GEN-LAST:event_atualizacoesMouseExited

    private void manualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manualMouseEntered
        he.efeitoHoverTextos(manual, 230, 230, 230);
    }//GEN-LAST:event_manualMouseEntered

    private void manualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manualMouseExited
        he.efeitoHoverTextos(manual, 153, 153, 153);
    }//GEN-LAST:event_manualMouseExited

    private void btTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTicketsMouseClicked
        TicketsView tv = new TicketsView();
        trocarAba(btTickets, tv);
    }//GEN-LAST:event_btTicketsMouseClicked

    private void btTicketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTicketsMouseEntered
        he.efeitoHover(pTickets, 18, 18, 18);
    }//GEN-LAST:event_btTicketsMouseEntered

    private void btTicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTicketsMouseExited
        he.efeitoHover(pTickets, 16, 16, 16);
    }//GEN-LAST:event_btTicketsMouseExited

    private void btHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseClicked
        HomeView hv = new HomeView();
        trocarAba(btHome, hv);
    }//GEN-LAST:event_btHomeMouseClicked

    private void btHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseEntered
        he.efeitoHover(pHome, 18, 18, 18);
    }//GEN-LAST:event_btHomeMouseEntered

    private void btHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseExited
        he.efeitoHover(pHome, 16, 16, 16);
    }//GEN-LAST:event_btHomeMouseExited

    private void btEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmailMouseEntered
        he.efeitoHover(pEmail, 18, 18, 18);
    }//GEN-LAST:event_btEmailMouseEntered

    private void btEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmailMouseExited
        he.efeitoHover(pEmail, 16, 16, 16);
    }//GEN-LAST:event_btEmailMouseExited

    private void btConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfigMouseEntered
       he.efeitoHover(pConfig, 18, 18, 18);
    }//GEN-LAST:event_btConfigMouseEntered

    private void btConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfigMouseExited
        he.efeitoHover(pConfig, 16, 16, 16);
    }//GEN-LAST:event_btConfigMouseExited

    private void btSobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSobreMouseEntered
        he.efeitoHover(pInfo, 18, 18, 18);
    }//GEN-LAST:event_btSobreMouseEntered

    private void btSobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSobreMouseExited

        he.efeitoHover(pInfo, 16, 16, 16);
    }//GEN-LAST:event_btSobreMouseExited

    private void nivelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelUsuarioActionPerformed

    private void deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslogarMouseClicked

    }//GEN-LAST:event_deslogarMouseClicked

    private void deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogarActionPerformed

    }//GEN-LAST:event_deslogarActionPerformed

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
       he. efeitoHover(pSair, 153, 0, 0);
        btSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        he.efeitoHover(pSair, 16,16,16);
        btSair.setForeground(Color.GRAY);
    }//GEN-LAST:event_btSairMouseExited

    private void btSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMousePressed
        System.exit(0);
    }//GEN-LAST:event_btSairMousePressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel atualizacoes;
    private javax.swing.JPanel background;
    private javax.swing.JLabel btConfig;
    private javax.swing.JLabel btEmail;
    private javax.swing.JLabel btHome;
    private javax.swing.JLabel btNovo;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel btSobre;
    private javax.swing.JLabel btTickets;
    private javax.swing.JPanel container;
    private javax.swing.JLabel copyright;
    private javax.swing.JMenuItem deslogar;
    private javax.swing.JLabel iconeFotoUser;
    private javax.swing.JLabel iconeUsuario;
    private javax.swing.JLabel manual;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel newletter;
    private javax.swing.JMenuItem nivelUsuario;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPanel pConfig;
    private javax.swing.JPanel pEmail;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pNovo;
    private javax.swing.JPanel pSair;
    private javax.swing.JPanel pTickets;
    private javax.swing.JLabel txtExtras;
    private javax.swing.JLabel txtPrincipal;
    private javax.swing.JPopupMenu userMenu;
    // End of variables declaration//GEN-END:variables
    // importando objetos que serão usados repetidas vezes
    Fail fail = new Fail();
    Color bordaSelecionado = new java.awt.Color(0, 204, 204);
    Color bordaNormal = new java.awt.Color(16, 16, 16);

    // método de trocar a aba e marcar selecionada
    private void trocarAba(JLabel label, JPanel painel) {
        btHome.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, bordaNormal));
        btTickets.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, bordaNormal));
        btEmail.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, bordaNormal));
        btConfig.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, bordaNormal));
        btSobre.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, bordaNormal));
        label.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, bordaSelecionado));
        trocarTela(painel);
    }

    // método pra trocar de aba clicando na opção
    private void trocarTela(JPanel painel) {
        painel.setSize(1060, 650);
        painel.setLocation(0, 0);
        container.removeAll();
        container.add(painel, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }

    // mostrar tela home dashboard
    public void mostrarHome() {
        HomeView home = new HomeView();
        trocarAba(btHome, home);
    }
    
    // novo ticket botões
    
    private void novoTicket(){
        NewTicket nt = new NewTicket();
        nt.resgatarUsuario(usuario);
        trocarAba(btTickets, nt);  
    }

    // inicializando dashboard
    public void inicializar(User user) {
        iconeUsuario.setText("Bem-Vindo(a), \n" + user.getUsuario());
        usuario = user;
        UserConnections conUser = new UserConnections();
        ResultSet resultadoBusca = conUser.verificarNivelUsuario(user);

        try {
            while (resultadoBusca.next()) {
                user.setNivel(resultadoBusca.getInt("nivel"));
                int nivel = user.getNivel();
                switch (nivel) {
                    case 1:
                        nivelUsuario.setText("Operador(a)");
                        break;
                    case 2:
                        nivelUsuario.setText("Administrador(a)");
                        break;
                }
                mostrarHome();

            }
        } catch (SQLException ex) {
        }
        ResultSet resultadoBuscaNome = conUser.verificarDados(user);
        try {
            while(resultadoBuscaNome.next()){
                user.setNome(resultadoBuscaNome.getString("nomecompleto"));
                nomeUsuario.setText(user.getNome());
            }
            
        } catch (SQLException e) {
        }
        HomeView home = new HomeView();
        trocarAba(btHome, home);
        mostrarHome();
    }
}
