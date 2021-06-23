package InterfacesGraficas;

import Entities.Usuario;
import Entities.UsuarioDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class InterfaceB2_CadRemAdm extends javax.swing.JFrame {

    public InterfaceB2_CadRemAdm() {
        initComponents();
        setLocationRelativeTo(null);
        remover.setVisible(false);
        DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
        MyHeaderRender.setBackground(new Color(1, 99, 27));
        MyHeaderRender.setForeground(Color.WHITE);
        MyHeaderRender.setHorizontalAlignment(JLabel.CENTER);
        MyHeaderRender.setFont(new Font("Inter", Font.BOLD, 50));
        MyHeaderRender.setPreferredSize(new Dimension(100, 35));
        MyHeaderRender.setHorizontalAlignment(JLabel.CENTER);
        ADMtable.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(MyHeaderRender);
        ADMtable.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(MyHeaderRender);
        ADMtable.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(MyHeaderRender);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        ADMtable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        ADMtable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        ADMtable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        scrollPane.getViewport().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaPanel = new javax.swing.JPanel();
        barraMenuPanel = new javax.swing.JPanel();
        logoSESCOVID = new javax.swing.JLabel();
        SES = new javax.swing.JLabel();
        COVID = new javax.swing.JLabel();
        btnSair1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JLabel();
        corpoPanel = new javax.swing.JPanel();
        remover = new javax.swing.JPanel();
        administrador2 = new javax.swing.JLabel();
        linhaTitulo2 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        ADMtable = new javax.swing.JTable();
        btnDeletar = new javax.swing.JLabel();
        btnDeletarClicado = new javax.swing.JLabel();
        cadastrar = new javax.swing.JPanel();
        administrador = new javax.swing.JLabel();
        linhaTitulo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        caixaDeTextoNome = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        caixaDeTextoUsuario = new javax.swing.JLabel();
        fone = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();
        caixaDeTextoFone = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        caixaDeTextoSenha = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JLabel();
        btnCadastrarClicado = new javax.swing.JLabel();
        abaCadastrar = new javax.swing.JPanel();
        cadastrarON = new javax.swing.JLabel();
        cadastrarOFF = new javax.swing.JLabel();
        abaRemover = new javax.swing.JPanel();
        removerOFF = new javax.swing.JLabel();
        removerON = new javax.swing.JLabel();
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
        barraMenuPanel.add(SES, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 4, 80, 40));

        COVID.setFont(new java.awt.Font("Faustina", 0, 38)); // NOI18N
        COVID.setForeground(new java.awt.Color(255, 255, 255));
        COVID.setText("COVID-19");
        barraMenuPanel.add(COVID, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 36, 180, 40));

        btnSair1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\iconeSair.png")); // NOI18N
        btnSair1.setToolTipText("Voltar");
        btnSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSair1MouseClicked(evt);
            }
        });
        barraMenuPanel.add(btnSair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 28, -1, -1));

        barraMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\barraMenu.png")); // NOI18N
        barraMenuPanel.add(barraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        telaPanel.add(barraMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        corpoPanel.setMaximumSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setPreferredSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        remover.setBackground(new java.awt.Color(255, 255, 255));
        remover.setMaximumSize(new java.awt.Dimension(940, 397));
        remover.setPreferredSize(new java.awt.Dimension(940, 397));
        remover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        administrador2.setFont(new java.awt.Font("Inter SemiBold", 0, 30)); // NOI18N
        administrador2.setForeground(new java.awt.Color(0, 0, 0));
        administrador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administrador2.setText("Administrador");
        remover.add(administrador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 3, 324, 46));

        linhaTitulo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\linhaTitulo.png")); // NOI18N
        remover.add(linhaTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 45, 641, 1));

        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPane.setMaximumSize(new java.awt.Dimension(641, 257));
        scrollPane.setPreferredSize(new java.awt.Dimension(641, 257));

        ADMtable.setBackground(new java.awt.Color(255, 255, 255));
        ADMtable.setFont(new java.awt.Font("Amazon Ember", 0, 15)); // NOI18N
        ADMtable.setForeground(new java.awt.Color(0, 0, 0));
        ADMtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Nome", "Fone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ADMtable.setGridColor(new java.awt.Color(0, 0, 0));
        ADMtable.setRowHeight(25);
        ADMtable.setShowGrid(true);
        ADMtable.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(ADMtable);
        if (ADMtable.getColumnModel().getColumnCount() > 0) {
            ADMtable.getColumnModel().getColumn(0).setResizable(false);
            ADMtable.getColumnModel().getColumn(1).setResizable(false);
            ADMtable.getColumnModel().getColumn(2).setResizable(false);
        }

        remover.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 60, -1, -1));

        btnDeletar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\iconeDeletar.png")); // NOI18N
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
            }
        });
        remover.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        btnDeletarClicado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BotoesClicados\\deletar.jpg")); // NOI18N
        remover.add(btnDeletarClicado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        corpoPanel.add(remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, -1, -1));

        cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        cadastrar.setMaximumSize(new java.awt.Dimension(940, 387));
        cadastrar.setPreferredSize(new java.awt.Dimension(940, 397));
        cadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        administrador.setFont(new java.awt.Font("Inter SemiBold", 0, 30)); // NOI18N
        administrador.setForeground(new java.awt.Color(0, 0, 0));
        administrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administrador.setText("Administrador");
        administrador.setMaximumSize(new java.awt.Dimension(324, 46));
        administrador.setPreferredSize(new java.awt.Dimension(324, 46));
        cadastrar.add(administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 10, -1, -1));

        linhaTitulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\linhaTitulo.png")); // NOI18N
        cadastrar.add(linhaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 60, 641, 1));

        nome.setFont(new java.awt.Font("Inter Medium", 0, 20)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setText("Nome");
        cadastrar.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 80, -1, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        txtNome.setBorder(null);
        cadastrar.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 115, 248, 36));

        caixaDeTextoNome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\caixaDeTexto.png")); // NOI18N
        cadastrar.add(caixaDeTextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 110, -1, -1));

        usuario.setFont(new java.awt.Font("Inter Medium", 0, 20)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("Usuário");
        cadastrar.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 80, 90, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        txtUsuario.setBorder(null);
        cadastrar.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 115, 248, 36));

        caixaDeTextoUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\caixaDeTexto.png")); // NOI18N
        cadastrar.add(caixaDeTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 110, -1, -1));

        fone.setFont(new java.awt.Font("Inter Medium", 0, 20)); // NOI18N
        fone.setForeground(new java.awt.Color(0, 0, 0));
        fone.setText("Fone");
        cadastrar.add(fone, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 190, 60, -1));

        txtFone.setBackground(new java.awt.Color(255, 255, 255));
        txtFone.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        txtFone.setBorder(null);
        cadastrar.add(txtFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 225, 248, 36));

        caixaDeTextoFone.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\caixaDeTexto.png")); // NOI18N
        cadastrar.add(caixaDeTextoFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 220, -1, -1));

        senha.setFont(new java.awt.Font("Inter Medium", 0, 20)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("Senha");
        cadastrar.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 190, 71, -1));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        txtSenha.setBorder(null);
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        cadastrar.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 225, 248, 36));

        caixaDeTextoSenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\caixaDeTexto.png")); // NOI18N
        cadastrar.add(caixaDeTextoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 220, -1, -1));

        btnCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\iconeCadastrar.png")); // NOI18N
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        cadastrar.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 267, -1));

        btnCadastrarClicado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BotoesClicados\\cadastrar.jpg")); // NOI18N
        cadastrar.add(btnCadastrarClicado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 267, -1));

        corpoPanel.add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, -1, -1));

        abaCadastrar.setMaximumSize(new java.awt.Dimension(470, 54));
        abaCadastrar.setPreferredSize(new java.awt.Dimension(470, 54));
        abaCadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarON.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\cadastrarON.png")); // NOI18N
        abaCadastrar.add(cadastrarON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cadastrarOFF.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\cadastrarOFF.png")); // NOI18N
        cadastrarOFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarOFFMouseClicked(evt);
            }
        });
        abaCadastrar.add(cadastrarOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        corpoPanel.add(abaCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, -1, -1));

        abaRemover.setMaximumSize(new java.awt.Dimension(470, 54));
        abaRemover.setPreferredSize(new java.awt.Dimension(470, 54));
        abaRemover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removerOFF.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\removerOFF.png")); // NOI18N
        removerOFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerOFFMouseClicked(evt);
            }
        });
        abaRemover.add(removerOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        removerON.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\removerON.png")); // NOI18N
        abaRemover.add(removerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        corpoPanel.add(abaRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 31, -1, -1));

        tela.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\tela.png")); // NOI18N
        corpoPanel.add(tela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        telaPanel.add(corpoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, -1, -1));

        getContentPane().add(telaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removerOFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerOFFMouseClicked
        removerOFF.setVisible(false);
        cadastrarON.setVisible(false);
        cadastrar.setVisible(false);
        remover.setVisible(true);
        readLista();

        txtNome.setText("");
        txtUsuario.setText("");
        txtFone.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_removerOFFMouseClicked

    private void cadastrarOFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarOFFMouseClicked
        removerOFF.setVisible(true);
        cadastrarON.setVisible(true);
        cadastrar.setVisible(true);
        remover.setVisible(false);
    }//GEN-LAST:event_cadastrarOFFMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        btnCadastrar.setVisible(false);
        cadastraADM();
        btnCadastrar.setVisible(true);
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastraADM();
        }
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked
        btnDeletar.setVisible(false);

        if (ADMtable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um Administrador!", "Seleção Vazia", JOptionPane.ERROR_MESSAGE);
        } else {
            String user = ADMtable.getValueAt(ADMtable.getSelectedRow(), 0).toString();
            String name = ADMtable.getValueAt(ADMtable.getSelectedRow(), 1).toString();
            String phone = ADMtable.getValueAt(ADMtable.getSelectedRow(), 2).toString();

            String s = String.format("Você quer deletar o seguinte Administrador?"
                    + "\nUsuário: %s\nNome: %s\nFone: %s", user, name, phone);
            int x = JOptionPane.showConfirmDialog(null, s, "Confirmação", JOptionPane.YES_NO_OPTION);

            if (x == JOptionPane.YES_OPTION) {
                Usuario novo = new Usuario(user);
                UsuarioDAO deleta = new UsuarioDAO();

                deleta.deleteAdm(novo);
                JOptionPane.showMessageDialog(null, "Administrador deletado!", "Succeso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        readLista();
        btnDeletar.setVisible(true);
    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSair1MouseClicked
        InterfaceB1_TelaAdm inter = new InterfaceB1_TelaAdm();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSair1MouseClicked

    private void cadastraADM() {
        String user = txtUsuario.getText();
        String password = txtSenha.getText();
        String name = txtNome.getText();
        String phone = txtFone.getText();
        String cargo = "ADM";

        if (user.equals("") || password.equals("") || name.equals("") || phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos", "Campo vazio", JOptionPane.INFORMATION_MESSAGE);

        } else {
            Usuario adm = new Usuario(user, password, name, phone, cargo);
            adm.setUsuario(user);
            adm.setSenha(password);
            adm.setNome(name);
            adm.setFone(phone);
            adm.setCargo(cargo);

            UsuarioDAO cria = new UsuarioDAO();
            cria.createAdm(adm);
        }
        txtUsuario.setText("");
        txtSenha.setText("");
        txtNome.setText("");
        txtFone.setText("");
    }

    public void readLista() {
        DefaultTableModel modelo = (DefaultTableModel) ADMtable.getModel();
        modelo.setRowCount(0);

        UsuarioDAO novo = new UsuarioDAO();
        for (Usuario p : novo.listAdm()) {
            modelo.addRow(new Object[]{
                p.getUsuario(),
                p.getNome(),
                p.getFone()
            });
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceB2_CadRemAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceB2_CadRemAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceB2_CadRemAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceB2_CadRemAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceB2_CadRemAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ADMtable;
    private javax.swing.JLabel COVID;
    private javax.swing.JLabel SES;
    private javax.swing.JPanel abaCadastrar;
    private javax.swing.JPanel abaRemover;
    private javax.swing.JLabel administrador;
    private javax.swing.JLabel administrador2;
    private javax.swing.JLabel barraMenu;
    private javax.swing.JPanel barraMenuPanel;
    private javax.swing.JLabel btnCadastrar;
    private javax.swing.JLabel btnCadastrarClicado;
    private javax.swing.JLabel btnDeletar;
    private javax.swing.JLabel btnDeletarClicado;
    private javax.swing.JLabel btnSair1;
    private javax.swing.JPanel cadastrar;
    private javax.swing.JLabel cadastrarOFF;
    private javax.swing.JLabel cadastrarON;
    private javax.swing.JLabel caixaDeTextoFone;
    private javax.swing.JLabel caixaDeTextoNome;
    private javax.swing.JLabel caixaDeTextoSenha;
    private javax.swing.JLabel caixaDeTextoUsuario;
    private javax.swing.JPanel corpoPanel;
    private javax.swing.JLabel fone;
    private javax.swing.JLabel linhaTitulo;
    private javax.swing.JLabel linhaTitulo2;
    private javax.swing.JLabel logoSESCOVID;
    private javax.swing.JLabel nome;
    private javax.swing.JPanel remover;
    private javax.swing.JLabel removerOFF;
    private javax.swing.JLabel removerON;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel tela;
    private javax.swing.JPanel telaPanel;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
