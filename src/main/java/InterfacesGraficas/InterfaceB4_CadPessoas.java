package InterfacesGraficas;

import Entities.Pessoa;
import Entities.PessoaDAO;
import javax.swing.JOptionPane;

public class InterfaceB4_CadPessoas extends javax.swing.JFrame {

    public InterfaceB4_CadPessoas() {
        initComponents();
        setLocationRelativeTo(null);
        txtIdade.setDocument(new SoNumeros());
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
        pessoas = new javax.swing.JLabel();
        linhaTitulo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        caixaDeTextoNome = new javax.swing.JLabel();
        idade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        caixaDeTextoIdade = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        caixaDeTextoEndereco = new javax.swing.JLabel();
        profissao = new javax.swing.JLabel();
        comboBoxProfissao = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JLabel();
        btnCadastrarClicado = new javax.swing.JLabel();
        telaPessoas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SES COVID-19");
        setIconImage(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\iconeGrandeSESCOVID.png").getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaPanel.setBackground(new java.awt.Color(255, 255, 255));
        telaPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        telaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraMenuPanel.setBackground(new java.awt.Color(255, 255, 255));
        barraMenuPanel.setMaximumSize(new java.awt.Dimension(1000, 89));
        barraMenuPanel.setPreferredSize(new java.awt.Dimension(1000, 89));
        barraMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSESCOVID.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\logoSESCOVID.png")); // NOI18N
        barraMenuPanel.add(logoSESCOVID, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 11, -1, -1));

        SES.setFont(new java.awt.Font("Faustina", 0, 38)); // NOI18N
        SES.setForeground(new java.awt.Color(255, 255, 255));
        SES.setText("SES");
        barraMenuPanel.add(SES, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 4, 80, 40));

        COVID.setFont(new java.awt.Font("Faustina", 0, 38)); // NOI18N
        COVID.setForeground(new java.awt.Color(255, 255, 255));
        COVID.setText("COVID-19");
        barraMenuPanel.add(COVID, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 36, 180, 40));

        btnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\iconeSair.png")); // NOI18N
        btnSair.setToolTipText("Voltar");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        barraMenuPanel.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 28, -1, -1));

        barraMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BarraDeMenu\\barraMenu.png")); // NOI18N
        barraMenuPanel.add(barraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        telaPanel.add(barraMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        corpoPanel.setBackground(new java.awt.Color(255, 255, 255));
        corpoPanel.setMaximumSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pessoas.setFont(new java.awt.Font("Inter SemiBold", 0, 30)); // NOI18N
        pessoas.setForeground(new java.awt.Color(0, 0, 0));
        pessoas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pessoas.setText("Pessoas");
        corpoPanel.add(pessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 60, 324, 46));

        linhaTitulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\linhaTitulo.png")); // NOI18N
        linhaTitulo.setText("jLabel1");
        corpoPanel.add(linhaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 110, 641, 1));

        nome.setFont(new java.awt.Font("Inter Medium", 0, 20)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setText("Nome");
        corpoPanel.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 140, -1, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setBorder(null);
        corpoPanel.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 183, 248, 39));

        caixaDeTextoNome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\caixaDeTexto.png")); // NOI18N
        corpoPanel.add(caixaDeTextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 180, -1, -1));

        idade.setFont(new java.awt.Font("Inter Medium", 0, 20)); // NOI18N
        idade.setForeground(new java.awt.Color(0, 0, 0));
        idade.setText("Idade");
        corpoPanel.add(idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 140, -1, -1));

        txtIdade.setBackground(new java.awt.Color(255, 255, 255));
        txtIdade.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(0, 0, 0));
        txtIdade.setBorder(null);
        corpoPanel.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 183, 248, 39));

        caixaDeTextoIdade.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\caixaDeTexto.png")); // NOI18N
        corpoPanel.add(caixaDeTextoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 180, -1, -1));

        endereco.setFont(new java.awt.Font("Inter Medium", 0, 20)); // NOI18N
        endereco.setForeground(new java.awt.Color(0, 0, 0));
        endereco.setText("Endereço");
        corpoPanel.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 260, -1, -1));

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setBorder(null);
        corpoPanel.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 305, 248, 35));

        caixaDeTextoEndereco.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\caixaDeTexto.png")); // NOI18N
        corpoPanel.add(caixaDeTextoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 300, -1, -1));

        profissao.setFont(new java.awt.Font("Inter Medium", 0, 16)); // NOI18N
        profissao.setForeground(new java.awt.Color(0, 0, 0));
        profissao.setText("Profissão está na área da saúde?");
        corpoPanel.add(profissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 260, -1, -1));

        comboBoxProfissao.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxProfissao.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        comboBoxProfissao.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxProfissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SIM", "NAO" }));
        comboBoxProfissao.setBorder(null);
        corpoPanel.add(comboBoxProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 300, 265, 53));

        btnCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\CadastrarRemover\\iconeCadastrar.png")); // NOI18N
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        corpoPanel.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        btnCadastrarClicado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BotoesClicados\\cadastrar.jpg")); // NOI18N
        corpoPanel.add(btnCadastrarClicado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        telaPessoas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\telaPessoas.png")); // NOI18N
        telaPessoas.setPreferredSize(new java.awt.Dimension(1000, 511));
        corpoPanel.add(telaPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        telaPanel.add(corpoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, -1, -1));

        getContentPane().add(telaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        InterfaceB1_TelaAdm inter = new InterfaceB1_TelaAdm();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        btnCadastrar.setVisible(false);
        if(txtIdade.getText().equals("")){
            txtIdade.setText("0");
        }
        
        String name = txtNome.getText();
        Integer age = Integer.parseInt(txtIdade.getText());
        String adress = txtEndereco.getText();
        boolean saude;

        //TESTANDO SE TEM ALGUM CAMPO VAZIO
        if (name.equals("") || adress.equals("") || age == 0) {
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos.", "Campo vazio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //TESTANDO SE O CAMPO DE SELEÇÃO FOI USADO CORRETAMENTE
            if (comboBoxProfissao.getSelectedItem().equals("-")) {
                JOptionPane.showMessageDialog(null, "Favor selecionar se a pessoa é da área da saúde.", "Seleção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (comboBoxProfissao.getSelectedItem().equals("SIM")) {
                    saude = true;
                } else {
                    saude = false;
                }
                Pessoa nova = new Pessoa(name, age, saude, adress);
                PessoaDAO cria = new PessoaDAO();
                cria.createPessoa(nova);
            }
        }
        txtNome.setText("");
        txtIdade.setText(null);
        txtEndereco.setText("");
        comboBoxProfissao.setSelectedItem("-");
        btnCadastrar.setVisible(true);
    }//GEN-LAST:event_btnCadastrarMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceB4_CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceB4_CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceB4_CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceB4_CadPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceB4_CadPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COVID;
    private javax.swing.JLabel SES;
    private javax.swing.JLabel barraMenu;
    private javax.swing.JPanel barraMenuPanel;
    private javax.swing.JLabel btnCadastrar;
    private javax.swing.JLabel btnCadastrarClicado;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel caixaDeTextoEndereco;
    private javax.swing.JLabel caixaDeTextoIdade;
    private javax.swing.JLabel caixaDeTextoNome;
    private javax.swing.JComboBox<String> comboBoxProfissao;
    private javax.swing.JPanel corpoPanel;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel idade;
    private javax.swing.JLabel linhaTitulo;
    private javax.swing.JLabel logoSESCOVID;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel pessoas;
    private javax.swing.JLabel profissao;
    private javax.swing.JPanel telaPanel;
    private javax.swing.JLabel telaPessoas;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
