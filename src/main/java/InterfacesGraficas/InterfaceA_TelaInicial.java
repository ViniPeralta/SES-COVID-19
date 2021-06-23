package InterfacesGraficas;

import Entities.Usuario;
import Entities.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InterfaceA_TelaInicial extends javax.swing.JFrame {

    Timer delay;

    public InterfaceA_TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        iconeOcultar.setVisible(true);
        iconeMostrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela = new javax.swing.JPanel();
        iconeGrandeSESCOVID = new javax.swing.JLabel();
        SES = new javax.swing.JLabel();
        COVID = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        iconeOcultar = new javax.swing.JLabel();
        iconeMostrar = new javax.swing.JLabel();
        BEMVINDO = new javax.swing.JLabel();
        linhaBemVindo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        linhaUsuario = new javax.swing.JLabel();
        linhaSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JLabel();
        btnEntrarClicado = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SES COVID-19");
        setBackground(new java.awt.Color(120, 120, 120));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\iconeGrandeSESCOVID.png").getImage());
        setMinimumSize(new java.awt.Dimension(650, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tela.setBackground(new java.awt.Color(255, 255, 255));
        Tela.setMaximumSize(new java.awt.Dimension(1000, 600));
        Tela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeGrandeSESCOVID.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\iconeGrandeSESCOVID.png")); // NOI18N
        Tela.add(iconeGrandeSESCOVID, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 159, -1, -1));

        SES.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\SES.png")); // NOI18N
        Tela.add(SES, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 131, 70));

        COVID.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\COVID-19.png")); // NOI18N
        Tela.add(COVID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 340, 80));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeOcultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\OlhoFechado.jpeg")); // NOI18N
        iconeOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeOcultarMouseClicked(evt);
            }
        });
        loginPanel.add(iconeOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 333, -1, -1));

        iconeMostrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\OlhoAberto.jpeg")); // NOI18N
        iconeMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeMostrarMouseClicked(evt);
            }
        });
        loginPanel.add(iconeMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 333, -1, -1));

        BEMVINDO.setFont(new java.awt.Font("Faustina", 1, 50)); // NOI18N
        BEMVINDO.setForeground(new java.awt.Color(0, 0, 0));
        BEMVINDO.setText("BEM-VINDO!");
        loginPanel.add(BEMVINDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, 310, 55));

        linhaBemVindo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\linhaBemVindo.png")); // NOI18N
        loginPanel.add(linhaBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 145, -1, -1));

        usuario.setFont(new java.awt.Font("Inter Medium", 0, 30)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("Usuário");
        loginPanel.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 179, 120, -1));

        senha.setFont(new java.awt.Font("Inter Medium", 0, 30)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("Senha");
        loginPanel.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 291, 100, 40));

        linhaUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\linhaTexto.png")); // NOI18N
        loginPanel.add(linhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 256, -1, 1));

        linhaSenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\linhaTexto.png")); // NOI18N
        loginPanel.add(linhaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 367, -1, 1));

        btnEntrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\btnEntrar.png")); // NOI18N
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        loginPanel.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        btnEntrarClicado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BotoesClicados\\entrar.jpg")); // NOI18N
        loginPanel.add(btnEntrarClicado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Amazon Ember", 0, 22)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(null);
        loginPanel.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 211, 257, 45));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Amazon Ember", 0, 22)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setBorder(null);
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        loginPanel.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 322, 230, 45));

        Tela.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 420, 600));

        getContentPane().add(Tela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 1016, 639);
    }// </editor-fold>//GEN-END:initComponents


    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        btnEntrar.setVisible(false);
        validaUsuario();
        txtSenha.setText("");
        txtUsuario.setText("");
        btnEntrar.setVisible(true);
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        btnEntrar.setEnabled(true);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validaUsuario();
        }
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void iconeMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMostrarMouseClicked
        iconeOcultar.setVisible(true);
        iconeMostrar.setVisible(false);
        txtSenha.setEchoChar('\u2022');
    }//GEN-LAST:event_iconeMostrarMouseClicked

    private void iconeOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeOcultarMouseClicked
        iconeOcultar.setVisible(false);
        iconeMostrar.setVisible(true);
        txtSenha.setEchoChar('\u0000');
    }//GEN-LAST:event_iconeOcultarMouseClicked

    private void validaUsuario() {
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

        Usuario login = new Usuario(usuario, senha);
        login.setUsuario(usuario);
        login.setSenha(senha);
        UsuarioDAO valida = new UsuarioDAO();

        if (usuario.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o seu usuário e senha", "Campo Vazio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (valida.loginUsuario(login) == true) {
                if (login.getCargo().equals("ADM")) {
                    InterfaceB1_TelaAdm telaAdm = new InterfaceB1_TelaAdm();
                    telaAdm.setVisible(true);
                    dispose();
                } else {
                    InterfaceC1_TelaAtend telaAtendente = new InterfaceC1_TelaAtend();
                    telaAtendente.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos!", "Tente novamente.", JOptionPane.ERROR_MESSAGE);
            }
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
            java.util.logging.Logger.getLogger(InterfaceA_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceA_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceA_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceA_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceA_TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BEMVINDO;
    private javax.swing.JLabel COVID;
    private javax.swing.JLabel SES;
    private javax.swing.JPanel Tela;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel btnEntrarClicado;
    private javax.swing.JLabel iconeGrandeSESCOVID;
    private javax.swing.JLabel iconeMostrar;
    private javax.swing.JLabel iconeOcultar;
    private javax.swing.JLabel linhaBemVindo;
    private javax.swing.JLabel linhaSenha;
    private javax.swing.JLabel linhaUsuario;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
