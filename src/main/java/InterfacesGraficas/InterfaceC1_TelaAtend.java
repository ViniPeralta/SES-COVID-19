package InterfacesGraficas;

import Entities.Pessoa;
import Entities.PessoaDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class InterfaceC1_TelaAtend extends javax.swing.JFrame {

    public InterfaceC1_TelaAtend() {
        initComponents();
        setLocationRelativeTo(null);
        listaConfirmadaPanel.setVisible(false);
        readFilaVacinar();
        DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
        MyHeaderRender.setBackground(new Color(1, 99, 27));
        MyHeaderRender.setForeground(Color.WHITE);
        MyHeaderRender.setHorizontalAlignment(JLabel.CENTER);
        MyHeaderRender.setFont(new Font("Inter", Font.BOLD, 50));
        MyHeaderRender.setPreferredSize(new Dimension(100, 35));
        MyHeaderRender.setHorizontalAlignment(JLabel.CENTER);
        FilaVacinacao.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(MyHeaderRender);
        FilaVacinacao.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(MyHeaderRender);
        FilaVacinacao.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(MyHeaderRender);
        FilaVacinacao.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(MyHeaderRender);
        tableVacinados.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(MyHeaderRender);
        tableVacinados.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(MyHeaderRender);
        tableVacinados.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(MyHeaderRender);
        tableVacinados.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(MyHeaderRender);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        FilaVacinacao.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        FilaVacinacao.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        FilaVacinacao.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        FilaVacinacao.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tableVacinados.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tableVacinados.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tableVacinados.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tableVacinados.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        TabelaFila.getViewport().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaPanel = new javax.swing.JPanel();
        barraMenuPanel = new javax.swing.JPanel();
        logoSESCOVID = new javax.swing.JLabel();
        SES = new javax.swing.JLabel();
        COVID = new javax.swing.JLabel();
        btnSair2 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JLabel();
        corpoPanel = new javax.swing.JPanel();
        filaPraVacinarPanel = new javax.swing.JPanel();
        TabelaFila = new javax.swing.JScrollPane();
        FilaVacinacao = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JLabel();
        listaConfirmadaPanel = new javax.swing.JPanel();
        scrollPane2 = new javax.swing.JScrollPane();
        tableVacinados = new javax.swing.JTable();
        abaFilaPraVacinar = new javax.swing.JPanel();
        vacinadosON = new javax.swing.JLabel();
        vacinadosOFF = new javax.swing.JLabel();
        abaListaConfirmada = new javax.swing.JPanel();
        confirmadosOFF = new javax.swing.JLabel();
        confirmadosON = new javax.swing.JLabel();
        tela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SES COVID-19");
        setIconImage(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\iconeGrandeSESCOVID.png").getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaPanel.setBackground(new java.awt.Color(255, 255, 255));
        telaPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        telaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraMenuPanel.setMaximumSize(new java.awt.Dimension(1000, 89));
        barraMenuPanel.setPreferredSize(new java.awt.Dimension(1000, 89));
        barraMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSESCOVID.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\logoSESCOVID.png")); // NOI18N
        barraMenuPanel.add(logoSESCOVID, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 11, 60, 65));

        SES.setFont(new java.awt.Font("Faustina", 0, 38)); // NOI18N
        SES.setForeground(new java.awt.Color(255, 255, 255));
        SES.setText("SES");
        barraMenuPanel.add(SES, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 4, 90, 40));

        COVID.setFont(new java.awt.Font("Faustina", 0, 38)); // NOI18N
        COVID.setForeground(new java.awt.Color(255, 255, 255));
        COVID.setText("COVID-19");
        barraMenuPanel.add(COVID, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 36, 180, 40));

        btnSair2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\iconeSair.png")); // NOI18N
        btnSair2.setToolTipText("Sair");
        btnSair2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSair2MouseClicked(evt);
            }
        });
        barraMenuPanel.add(btnSair2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 28, -1, -1));

        barraMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\barraMenu.png")); // NOI18N
        barraMenuPanel.add(barraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        telaPanel.add(barraMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        corpoPanel.setMaximumSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setPreferredSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filaPraVacinarPanel.setBackground(new java.awt.Color(255, 255, 255));
        filaPraVacinarPanel.setMaximumSize(new java.awt.Dimension(940, 397));
        filaPraVacinarPanel.setPreferredSize(new java.awt.Dimension(940, 397));
        filaPraVacinarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaFila.setAlignmentX(20.0F);

        FilaVacinacao.setBackground(new java.awt.Color(255, 255, 255));
        FilaVacinacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FilaVacinacao.setFont(new java.awt.Font("Amazon Ember", 0, 15)); // NOI18N
        FilaVacinacao.setForeground(new java.awt.Color(0, 0, 0));
        FilaVacinacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Profissional da Saúde", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FilaVacinacao.setAutoscrolls(false);
        FilaVacinacao.setRowHeight(25);
        FilaVacinacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FilaVacinacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FilaVacinacao.setShowGrid(true);
        TabelaFila.setViewportView(FilaVacinacao);

        filaPraVacinarPanel.add(TabelaFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 820, 270));

        btnConfirmar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Atendente\\btnConfirmar.png")); // NOI18N
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        filaPraVacinarPanel.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 320, -1, -1));

        corpoPanel.add(filaPraVacinarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, -1, -1));

        listaConfirmadaPanel.setBackground(new java.awt.Color(255, 255, 255));
        listaConfirmadaPanel.setMaximumSize(new java.awt.Dimension(940, 397));
        listaConfirmadaPanel.setPreferredSize(new java.awt.Dimension(940, 397));
        listaConfirmadaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane2.setMaximumSize(new java.awt.Dimension(922, 350));
        scrollPane2.setPreferredSize(new java.awt.Dimension(922, 350));

        tableVacinados.setBackground(new java.awt.Color(255, 255, 255));
        tableVacinados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableVacinados.setFont(new java.awt.Font("Amazon Ember", 0, 15)); // NOI18N
        tableVacinados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Profissional da Saúde", "Data de Vacinação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVacinados.setRowHeight(25);
        tableVacinados.setShowGrid(true);
        tableVacinados.getTableHeader().setReorderingAllowed(false);
        scrollPane2.setViewportView(tableVacinados);
        if (tableVacinados.getColumnModel().getColumnCount() > 0) {
            tableVacinados.getColumnModel().getColumn(0).setResizable(false);
            tableVacinados.getColumnModel().getColumn(1).setResizable(false);
            tableVacinados.getColumnModel().getColumn(2).setResizable(false);
            tableVacinados.getColumnModel().getColumn(3).setResizable(false);
        }

        listaConfirmadaPanel.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, -1, -1));

        corpoPanel.add(listaConfirmadaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, -1, -1));

        abaFilaPraVacinar.setMaximumSize(new java.awt.Dimension(470, 54));
        abaFilaPraVacinar.setPreferredSize(new java.awt.Dimension(470, 54));
        abaFilaPraVacinar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vacinadosON.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Atendente\\vacinadosON.png")); // NOI18N
        abaFilaPraVacinar.add(vacinadosON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        vacinadosOFF.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Atendente\\vacinadosOFF.png")); // NOI18N
        vacinadosOFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vacinadosOFFMouseClicked(evt);
            }
        });
        abaFilaPraVacinar.add(vacinadosOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        corpoPanel.add(abaFilaPraVacinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, -1, -1));

        abaListaConfirmada.setMaximumSize(new java.awt.Dimension(470, 54));
        abaListaConfirmada.setPreferredSize(new java.awt.Dimension(470, 54));
        abaListaConfirmada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmadosOFF.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Atendente\\confirmadosOFF.png")); // NOI18N
        confirmadosOFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmadosOFFMouseClicked(evt);
            }
        });
        abaListaConfirmada.add(confirmadosOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        confirmadosON.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Atendente\\confirmadosON.png")); // NOI18N
        abaListaConfirmada.add(confirmadosON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        corpoPanel.add(abaListaConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 31, -1, -1));

        tela.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\tela.png")); // NOI18N
        corpoPanel.add(tela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        telaPanel.add(corpoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, -1, -1));

        getContentPane().add(telaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSair2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSair2MouseClicked
        InterfaceA_TelaInicial inter = new InterfaceA_TelaInicial();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSair2MouseClicked

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        if (FilaVacinacao.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a pessoa que será vacinada.", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Object idade = FilaVacinacao.getValueAt(FilaVacinacao.getSelectedRow(), 1);
            String idadec = idade.toString();
            Object name = FilaVacinacao.getValueAt(FilaVacinacao.getSelectedRow(), 0);
            String nome = name.toString();
            Pessoa vacinada = new Pessoa(nome);
            vacinada.setNome(nome);

            int x = JOptionPane.showConfirmDialog(null, "Você confirma a vacinação da seguinte pessoa?\n\n"
                    + nome + ", " + idadec + " anos.", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (x == JOptionPane.YES_OPTION) {
                PessoaDAO registra = new PessoaDAO();
                registra.registraVacinacao(vacinada);
                readFilaVacinar();
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void confirmadosOFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmadosOFFMouseClicked
        confirmadosOFF.setVisible(false);
        vacinadosON.setVisible(false);
        listaConfirmadaPanel.setVisible(true);
        filaPraVacinarPanel.setVisible(false);
        readFilaVacinados();
    }//GEN-LAST:event_confirmadosOFFMouseClicked

    private void vacinadosOFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vacinadosOFFMouseClicked
        confirmadosOFF.setVisible(true);
        vacinadosON.setVisible(true);
        listaConfirmadaPanel.setVisible(false);
        filaPraVacinarPanel.setVisible(true);
        readFilaVacinar();
    }//GEN-LAST:event_vacinadosOFFMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceC1_TelaAtend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceC1_TelaAtend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceC1_TelaAtend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceC1_TelaAtend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceC1_TelaAtend().setVisible(true);
            }
        });
    }

    public void readFilaVacinar() {
        DefaultTableModel modelo = (DefaultTableModel) FilaVacinacao.getModel();
        modelo.setRowCount(0);
        String saude;
        PessoaDAO nova = new PessoaDAO();
        for (Pessoa p : nova.listPessoas()) {
            if (p.isAreasaude() == true) {
                saude = "Sim";
            } else {
                saude = "Não";
            }
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getIdade(),
                saude,
                p.getEndereco()
            });
        }
    }

    public void readFilaVacinados() {
        DefaultTableModel modelo = (DefaultTableModel) tableVacinados.getModel();
        SimpleDateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
        modelo.setRowCount(0);
        String saude;

        PessoaDAO vacinados = new PessoaDAO();
        for (Pessoa p : vacinados.listVacinados()) {
            if (p.isAreasaude() == true) {
                saude = "Sim";
            } else {
                saude = "Não";
            }

            String data = formatBR.format(p.getDataVacinacao());
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getIdade(),
                saude,
                data
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COVID;
    private javax.swing.JTable FilaVacinacao;
    private javax.swing.JLabel SES;
    private javax.swing.JScrollPane TabelaFila;
    private javax.swing.JPanel abaFilaPraVacinar;
    private javax.swing.JPanel abaListaConfirmada;
    private javax.swing.JLabel barraMenu;
    private javax.swing.JPanel barraMenuPanel;
    private javax.swing.JLabel btnConfirmar;
    private javax.swing.JLabel btnSair2;
    private javax.swing.JLabel confirmadosOFF;
    private javax.swing.JLabel confirmadosON;
    private javax.swing.JPanel corpoPanel;
    private javax.swing.JPanel filaPraVacinarPanel;
    private javax.swing.JPanel listaConfirmadaPanel;
    private javax.swing.JLabel logoSESCOVID;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTable tableVacinados;
    private javax.swing.JLabel tela;
    private javax.swing.JPanel telaPanel;
    private javax.swing.JLabel vacinadosOFF;
    private javax.swing.JLabel vacinadosON;
    // End of variables declaration//GEN-END:variables
}
