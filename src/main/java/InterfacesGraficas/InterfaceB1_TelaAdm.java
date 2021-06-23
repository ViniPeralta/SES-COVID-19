package InterfacesGraficas;

public class InterfaceB1_TelaAdm extends javax.swing.JFrame {

    public InterfaceB1_TelaAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaPanel = new javax.swing.JPanel();
        barraMenuPanel = new javax.swing.JPanel();
        logoSESCOVID = new javax.swing.JLabel();
        SES = new javax.swing.JLabel();
        COVID = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        barraMenu = new javax.swing.JLabel();
        corpoPanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JLabel();
        btnAtendente = new javax.swing.JLabel();
        btnPessoas = new javax.swing.JLabel();
        btnVacinacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SES COVID-19");
        setIconImage(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Documentos\\NetBeansProjects\\SisteamSESCOVID19\\src\\main\\java\\Interface\\Imagens\\BarraDeMenu\\iconeSESCOVID.png").getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaPanel.setBackground(new java.awt.Color(255, 255, 255));
        telaPanel.setForeground(new java.awt.Color(255, 255, 255));
        telaPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        telaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraMenuPanel.setLayout(null);

        logoSESCOVID.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\logoSESCOVID.png")); // NOI18N
        barraMenuPanel.add(logoSESCOVID);
        logoSESCOVID.setBounds(388, 11, 60, 65);

        SES.setFont(new java.awt.Font("Faustina", 0, 38)); // NOI18N
        SES.setForeground(new java.awt.Color(255, 255, 255));
        SES.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SES.setText("SES");
        barraMenuPanel.add(SES);
        SES.setBounds(452, 4, 90, 40);

        COVID.setFont(new java.awt.Font("Faustina", 0, 38)); // NOI18N
        COVID.setForeground(new java.awt.Color(255, 255, 255));
        COVID.setText("COVID-19");
        barraMenuPanel.add(COVID);
        COVID.setBounds(452, 36, 190, 40);

        btnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\iconeSair.png")); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        barraMenuPanel.add(btnSair);
        btnSair.setBounds(910, 28, 60, 36);

        barraMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\barraMenu.png")); // NOI18N
        barraMenuPanel.add(barraMenu);
        barraMenu.setBounds(0, 0, 1000, 89);

        telaPanel.add(barraMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 89));

        corpoPanel.setBackground(new java.awt.Color(255, 255, 255));
        corpoPanel.setMaximumSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setPreferredSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setLayout(null);

        btnAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\iconeAdmin.png")); // NOI18N
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });
        corpoPanel.add(btnAdmin);
        btnAdmin.setBounds(34, 60, 445, 159);

        btnAtendente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\iconeAtendente.png")); // NOI18N
        btnAtendente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtendenteMouseClicked(evt);
            }
        });
        corpoPanel.add(btnAtendente);
        btnAtendente.setBounds(531, 60, 445, 159);

        btnPessoas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\iconePessoas.png")); // NOI18N
        btnPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPessoasMouseClicked(evt);
            }
        });
        corpoPanel.add(btnPessoas);
        btnPessoas.setBounds(34, 280, 445, 159);

        btnVacinacao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\iconeVacinação.png")); // NOI18N
        btnVacinacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVacinacaoMouseClicked(evt);
            }
        });
        corpoPanel.add(btnVacinacao);
        btnVacinacao.setBounds(531, 280, 445, 159);

        telaPanel.add(corpoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, -1, -1));

        getContentPane().add(telaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        InterfaceA_TelaInicial inter = new InterfaceA_TelaInicial();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        InterfaceB2_CadRemAdm inter = new InterfaceB2_CadRemAdm();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnAtendenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtendenteMouseClicked
        InterfaceB3_CadRemAtendente inter = new InterfaceB3_CadRemAtendente();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtendenteMouseClicked

    private void btnPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPessoasMouseClicked
        InterfaceB4_CadPessoas inter = new InterfaceB4_CadPessoas();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPessoasMouseClicked

    private void btnVacinacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVacinacaoMouseClicked
        InterfaceB5_GeraRelatorio inter = new InterfaceB5_GeraRelatorio();
        inter.setVisible(true);
        dispose();        
    }//GEN-LAST:event_btnVacinacaoMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceB1_TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceB1_TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceB1_TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceB1_TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceB1_TelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COVID;
    private javax.swing.JLabel SES;
    private javax.swing.JLabel barraMenu;
    private javax.swing.JPanel barraMenuPanel;
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnAtendente;
    private javax.swing.JLabel btnPessoas;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel btnVacinacao;
    private javax.swing.JPanel corpoPanel;
    private javax.swing.JLabel logoSESCOVID;
    private javax.swing.JPanel telaPanel;
    // End of variables declaration//GEN-END:variables
}
