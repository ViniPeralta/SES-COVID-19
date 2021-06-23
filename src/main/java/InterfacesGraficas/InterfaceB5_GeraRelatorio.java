package InterfacesGraficas;

import Entities.Pessoa;
import Entities.PessoaDAO;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class InterfaceB5_GeraRelatorio extends javax.swing.JFrame {

    String dataInicial, dataFinal, total, p1, p2, p3, p4, ma90, ma70me90, ma50me70, me50;
    Timer delay;

    public InterfaceB5_GeraRelatorio() {
        initComponents();
        setLocationRelativeTo(null);
        ListaVacinados.setVisible(false);
        btnGerarPDF.setVisible(false);

        DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
        MyHeaderRender.setBackground(new Color(1, 99, 27));
        MyHeaderRender.setForeground(Color.WHITE);
        MyHeaderRender.setHorizontalAlignment(JLabel.CENTER);
        MyHeaderRender.setPreferredSize(new Dimension(100, 35));
        MyHeaderRender.setHorizontalAlignment(JLabel.CENTER);
        TableVacinados.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(MyHeaderRender);
        TableVacinados.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(MyHeaderRender);
        TableVacinados.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(MyHeaderRender);
        TableVacinados.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(MyHeaderRender);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableVacinados.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        TableVacinados.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        TableVacinados.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        TableVacinados.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        ListaVacinados.getViewport().setBackground(Color.WHITE);

        delay = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    btnGerarRelatorio.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
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
        inicial = new javax.swing.JLabel();
        dfinal = new javax.swing.JLabel();
        DataInicial = new javax.swing.JFormattedTextField();
        caixaDeTextoDataInicial = new javax.swing.JLabel();
        DataFinal = new javax.swing.JFormattedTextField();
        caixaDeTextoDataFinal = new javax.swing.JLabel();
        btnGerarRelatorio = new javax.swing.JLabel();
        btnGerarRelatorioClicado = new javax.swing.JLabel();
        btnGerarPDF = new javax.swing.JLabel();
        ListaVacinados = new javax.swing.JScrollPane();
        TableVacinados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SES COVID-19");
        setIconImage(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\TelaLogin\\iconeGrandeSESCOVID.png").getImage());
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaPanel.setBackground(new java.awt.Color(255, 255, 255));
        telaPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        telaPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        telaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        corpoPanel.setPreferredSize(new java.awt.Dimension(1000, 511));
        corpoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicial.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        inicial.setForeground(new java.awt.Color(0, 0, 0));
        inicial.setText("Digite a data incial:");
        corpoPanel.add(inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        dfinal.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        dfinal.setForeground(new java.awt.Color(0, 0, 0));
        dfinal.setText("e a data final:");
        corpoPanel.add(dfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        DataInicial.setBackground(new java.awt.Color(255, 255, 255));
        DataInicial.setBorder(null);
        DataInicial.setForeground(new java.awt.Color(0, 0, 0));
        try {
            DataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DataInicial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        DataInicial.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        corpoPanel.add(DataInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 40, 150, 40));

        caixaDeTextoDataInicial.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\caixaDeTextoData.png")); // NOI18N
        corpoPanel.add(caixaDeTextoDataInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 37, -1, -1));

        DataFinal.setBackground(new java.awt.Color(255, 255, 255));
        DataFinal.setBorder(null);
        DataFinal.setForeground(new java.awt.Color(0, 0, 0));
        try {
            DataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DataFinal.setFont(new java.awt.Font("Amazon Ember", 0, 20)); // NOI18N
        DataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DataFinalKeyReleased(evt);
            }
        });
        corpoPanel.add(DataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 150, 40));

        caixaDeTextoDataFinal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\caixaDeTextoData.png")); // NOI18N
        corpoPanel.add(caixaDeTextoDataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 37, -1, -1));

        btnGerarRelatorio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\iconeGerear.png")); // NOI18N
        btnGerarRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerarRelatorioMouseClicked(evt);
            }
        });
        corpoPanel.add(btnGerarRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        btnGerarRelatorioClicado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\BotoesClicados\\gerar relatorio.jpg")); // NOI18N
        corpoPanel.add(btnGerarRelatorioClicado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        btnGerarPDF.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Administrador\\botaoPDF.jpg")); // NOI18N
        btnGerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerarPDFMouseClicked(evt);
            }
        });
        corpoPanel.add(btnGerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        ListaVacinados.setBackground(new java.awt.Color(255, 255, 255));
        ListaVacinados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListaVacinados.setForeground(new java.awt.Color(255, 255, 255));

        TableVacinados.setBackground(new java.awt.Color(255, 255, 255));
        TableVacinados.setFont(new java.awt.Font("Amazon Ember", 0, 15)); // NOI18N
        TableVacinados.setForeground(new java.awt.Color(0, 0, 0));
        TableVacinados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Área da Saúde", "Data Vacinação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableVacinados.setGridColor(new java.awt.Color(0, 0, 0));
        TableVacinados.setRowHeight(25);
        TableVacinados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TableVacinados.setShowGrid(true);
        TableVacinados.getTableHeader().setReorderingAllowed(false);
        ListaVacinados.setViewportView(TableVacinados);
        if (TableVacinados.getColumnModel().getColumnCount() > 0) {
            TableVacinados.getColumnModel().getColumn(0).setResizable(false);
            TableVacinados.getColumnModel().getColumn(1).setResizable(false);
            TableVacinados.getColumnModel().getColumn(2).setResizable(false);
            TableVacinados.getColumnModel().getColumn(3).setResizable(false);
        }

        corpoPanel.add(ListaVacinados, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 730, 230));

        telaPanel.add(corpoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, -1, -1));

        getContentPane().add(telaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerarRelatorioMouseClicked
        btnGerarRelatorio.setVisible(false);
        gerarRelatorio();
        delay.start();
        delay.restart();
    }//GEN-LAST:event_btnGerarRelatorioMouseClicked

    private void DataFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DataFinalKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            gerarRelatorio();
        }
    }//GEN-LAST:event_DataFinalKeyReleased

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        InterfaceB1_TelaAdm inter = new InterfaceB1_TelaAdm();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnGerarPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerarPDFMouseClicked
        gerarPDF();
    }//GEN-LAST:event_btnGerarPDFMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceB5_GeraRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceB5_GeraRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceB5_GeraRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceB5_GeraRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceB5_GeraRelatorio().setVisible(true);
            }
        });
    }

    public void readLista() {
        DefaultTableModel modelo = (DefaultTableModel) TableVacinados.getModel();
        SimpleDateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
        modelo.setRowCount(0);

        String saude; //STRING PARA DEFINIR SE A PESSOA É OU NÃO DA ÁREA SAÚDE 
        int prior1 = 0; //PESSOAS VACINADAS PRIORIDADE NIVEL 1
        int prior2 = 0; //PESSOAS VACINADAS PRIORIDADE NIVEL 2 
        int prior3 = 0; //PESSOAS VACINADAS PRIORIDADE NIVEL 3
        int prior4 = 0; //PESSOAS VACINADAS PRIORIDADE NIVEL 4

        PessoaDAO vacinados = new PessoaDAO();
        for (Pessoa p : vacinados.listVacinadosFiltro(dataInicial, dataFinal)) {
            if (p.getIdade() > 70 && p.isAreasaude() == true) {
                prior1++;
                saude = "Sim";
            } else if (p.getIdade() > 70) {
                prior2++;
                saude = "Não";
            } else if (p.isAreasaude() == true) {
                prior3++;
                saude = "Sim";
            } else {
                prior4++;
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
        ListaVacinados.setVisible(true);
        btnGerarPDF.setVisible(true);
        int x = TableVacinados.getRowCount(); //TOTAL DE PESSOAS VACINADAS NO PERIODO
        int porcniv1 = prior1 * 100 / x; //PORCENTAGEM DE PESSOAS PRIOR NIVEL 1
        int porcniv2 = prior2 * 100 / x; //PORCENTAGEM DE PESSOAS PRIOR NIVEL 2
        int porcniv3 = prior3 * 100 / x; //PORCENTAGEM DE PESSOAS PRIOR NIVEL 3
        int porcniv4 = prior4 * 100 / x; //PORCENTAGEM DE PESSOAS PRIOR NIVEL 4

        //TEXTOS PARA QTD PESSOAS POR NIVEL + PORCENTAGEM DO TOTAL
        p1 = "NÍVEL DE PRIORIDADE 1:  " + prior1 + " PESSOA(S) " + "(" + porcniv1 + "%)";
        p2 = "NÍVEL DE PRIORIDADE 2:  " + prior2 + " PESSOA(S) " + "(" + porcniv2 + "%)";
        p3 = "NÍVEL DE PRIORIDADE 3:  " + prior3 + " PESSOA(S) " + "(" + porcniv3 + "%)";
        p4 = "NÍVEL DE PRIORIDADE 4:  " + prior4 + " PESSOA(S) " + "(" + porcniv4 + "%)";
        //TEXTO TOTAL PESSOAS VACINADAS
        total = "TOTAL DE VACINADOS NO PERÍODO: " + x;

        //CALCULANDO A MEDIA POR IDADE
        try {
            Date inipadBR = formatBR.parse(DataInicial.getText());
            Date finpadBR = formatBR.parse(DataFinal.getText());

            long dias = (finpadBR.getTime() - inipadBR.getTime()) / 86400000;

            int maiorigual90 = 0;
            int maiorigual70menor90 = 0;
            int maiorigual50menor70 = 0;
            int menor50 = 0;

            PessoaDAO media = new PessoaDAO();
            for (Pessoa p : media.listVacinadosFiltro(dataInicial, dataFinal)) {
                if (p.getIdade() >= 90) {
                    maiorigual90++;
                } else if (p.getIdade() >= 70 && p.getIdade() < 90) {
                    maiorigual70menor90++;
                } else if (p.getIdade() >= 50 && p.getIdade() < 70) {
                    maiorigual50menor70++;
                } else {
                    menor50++;
                }
            }
            //STRINGS MEDIAS
            ma90 = "IDADE >= 90: " + maiorigual90 / dias + " VACINADOS POR DIA";
            ma70me90 = "70 =< IDADE < 90: " + maiorigual70menor90 / dias + " VACINADOS POR DIA";
            ma50me70 = "50 =< IDADE < 70: " + maiorigual50menor70 / dias + " VACINADOS POR DIA";
            me50 = "IDADE < 50: " + menor50 / dias + " VACINADOS POR DIA";

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void gerarRelatorio() {
        //PADROES DE DATA BR & SQL
        SimpleDateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatSQL = new SimpleDateFormat("yyyy-MM-dd");

        try {
            //PEGANDO A STRING DIGITADA PELO USUARIO E TRANSFORMANDO EM DATE
            Date inipadBR = formatBR.parse(DataInicial.getText());
            Date finpadBR = formatBR.parse(DataFinal.getText());

            //TRANSFORMANDO A DATA ACIMA EM STRING NO PADRAO SQL
            dataInicial = formatSQL.format(inipadBR);
            dataFinal = formatSQL.format(finpadBR);

            readLista();
        } catch (ParseException ex) {
            Logger.getLogger(InterfaceB5_GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Favor digitar a data inicial e final.\nFormato: dd/MM/yyyy", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void gerarPDF() {
        Document relatorio = new Document(PageSize.A4, 10, 10, 10, 10);
        Font fonteTitulo = new Font(Font.FontFamily.COURIER, 20, Font.BOLD);
        Font fonteNormal = new Font(Font.FontFamily.COURIER, 10);
        Font fonteTextos = new Font(Font.FontFamily.COURIER, 15);
        Font fonteCelulasColunas = new Font(Font.FontFamily.COURIER, 13, Font.BOLD);
        Font fonteCelulasLinhas = new Font(Font.FontFamily.COURIER, 13);
        SimpleDateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatPDF = new SimpleDateFormat("dd-MM-yy");
        SimpleDateFormat formatRelatorio = new SimpleDateFormat("dd/MM/yyyy" + " - " + "HH:mm:ss");

        try {
            //DEFININDO LOCAL E NOME PADRÃO PARA O ARQUIVO
            Date inipadBR = formatBR.parse(DataInicial.getText());
            Date finpadBR = formatBR.parse(DataFinal.getText());
            String inipadPDF = formatPDF.format(inipadBR);
            String finpadPDF = formatPDF.format(finpadBR);
            PdfWriter.getInstance(relatorio, new FileOutputStream("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\RelatoriosSES\\Relatorio " + inipadPDF + " a " + finpadPDF + ".pdf"));

            //IMPORTANDO O LOGO SES COVID-19
            Image barramenu = Image.getInstance("C:\\Users\\Vinic\\OneDrive\\Área de Trabalho\\Faculdade\\2021\\1o Semestre\\Projeto - Fila de vacinação Covid-19\\Imagens\\Logo.jpeg");
            barramenu.scaleAbsolute(150f, 50f);
            barramenu.setAlignment(Element.ALIGN_CENTER);

            //DEFININDO PARAGRAFOS A SEREM ADICIONADOS
            Paragraph txtRelatorio = new Paragraph("Relatório de Vacinação", fonteTitulo);
            txtRelatorio.setAlignment(Element.ALIGN_CENTER);

            Paragraph txtPrioridades = new Paragraph("Vacinados no período por prioridade", fonteTitulo);
            txtPrioridades.setAlignment(Element.ALIGN_CENTER);

            Paragraph txtMedia = new Paragraph("Média de vacinados no período por idade", fonteTitulo);
            txtMedia.setAlignment(Element.ALIGN_CENTER);

            Paragraph txttotal = new Paragraph(total, fonteTextos);
            txttotal.setAlignment(Element.ALIGN_CENTER);

            Paragraph txtp1 = new Paragraph(p1, fonteTextos);
            txtp1.setAlignment(Element.ALIGN_CENTER);

            Paragraph txtp2 = new Paragraph(p2, fonteTextos);
            txtp2.setAlignment(Element.ALIGN_CENTER);

            Paragraph txtp3 = new Paragraph(p3, fonteTextos);
            txtp3.setAlignment(Element.ALIGN_CENTER);

            Paragraph txtp4 = new Paragraph(p4, fonteTextos);
            txtp4.setAlignment(Element.ALIGN_CENTER);

            Paragraph txt90 = new Paragraph(ma90, fonteTextos);
            txt90.setAlignment(Element.ALIGN_CENTER);

            Paragraph txt70 = new Paragraph(ma70me90, fonteTextos);
            txt70.setAlignment(Element.ALIGN_CENTER);

            Paragraph txt50 = new Paragraph(ma50me70, fonteTextos);
            txt50.setAlignment(Element.ALIGN_CENTER);

            Paragraph txt49 = new Paragraph(me50, fonteTextos);
            txt49.setAlignment(Element.ALIGN_CENTER);

            Paragraph periodo = new Paragraph("Período: " + DataInicial.getText() + " à " + DataFinal.getText(), fonteNormal);
            periodo.setAlignment(Element.ALIGN_CENTER);

            Date atual = new Date(System.currentTimeMillis());
            String datagerado = formatRelatorio.format(atual);
            Paragraph gerado = new Paragraph("Gerado em " + datagerado, fonteNormal);
            gerado.setAlignment(Element.ALIGN_CENTER);

            //CRIANDO UMA TABELA DE PESSOAS VACINADAS NO PERÍODO PARA O PDF
            PdfPTable tabela = new PdfPTable(4);
            tabela.setHorizontalAlignment(Element.ALIGN_CENTER);
            //PEGANDO OS VALORES DAS COLUNAS
            for (int coluna = 0; coluna < 4; coluna++) {
                PdfPCell celcoluna = new PdfPCell();
                celcoluna.setBackgroundColor(BaseColor.LIGHT_GRAY);

                Paragraph dadocoluna = new Paragraph(TableVacinados.getColumnName(coluna), fonteCelulasColunas);
                dadocoluna.setAlignment(Element.ALIGN_CENTER);
                celcoluna.addElement(dadocoluna);

                tabela.addCell(celcoluna);
            }
            //PEGANDO OS VALORES DAS LINHAS
            for (int linha = 0; linha < TableVacinados.getRowCount(); linha++) {
                for (int coluna = 0; coluna < 4; coluna++) {
                    PdfPCell cellinha = new PdfPCell();

                    Paragraph dadolinha = new Paragraph(TableVacinados.getValueAt(linha, coluna).toString(), fonteCelulasLinhas);
                    dadolinha.setAlignment(Element.ALIGN_CENTER);
                    cellinha.addElement(dadolinha);

                    tabela.addCell(cellinha);
                }
            }

            relatorio.open();

            relatorio.add(barramenu);
            relatorio.add(txtRelatorio);
            relatorio.add(periodo);
            relatorio.add(gerado);
            relatorio.add(Chunk.NEWLINE);
            relatorio.add(Chunk.NEWLINE);
            relatorio.add(tabela);
            relatorio.add(Chunk.NEXTPAGE);
            relatorio.add(txtPrioridades);
            relatorio.add(Chunk.NEWLINE);
            relatorio.add(txttotal);
            relatorio.add(Chunk.NEWLINE);
            relatorio.add(txtp1);
            relatorio.add(txtp2);
            relatorio.add(txtp3);
            relatorio.add(txtp4);
            relatorio.add(Chunk.NEWLINE);
            relatorio.add(Chunk.NEWLINE);
            relatorio.add(txtMedia);
            relatorio.add(Chunk.NEWLINE);
            relatorio.add(txt90);
            relatorio.add(txt70);
            relatorio.add(txt50);
            relatorio.add(txt49);

        } catch (DocumentException ex) {
            ex.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(InterfaceB5_GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            relatorio.close();
            JOptionPane.showMessageDialog(null, "Relatório em PDF gerado na pasta RelatoriosSES!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COVID;
    private javax.swing.JFormattedTextField DataFinal;
    private javax.swing.JFormattedTextField DataInicial;
    private javax.swing.JScrollPane ListaVacinados;
    private javax.swing.JLabel SES;
    private javax.swing.JTable TableVacinados;
    private javax.swing.JLabel barraMenu;
    private javax.swing.JPanel barraMenuPanel;
    private javax.swing.JLabel btnGerarPDF;
    private javax.swing.JLabel btnGerarRelatorio;
    private javax.swing.JLabel btnGerarRelatorioClicado;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel caixaDeTextoDataFinal;
    private javax.swing.JLabel caixaDeTextoDataInicial;
    private javax.swing.JPanel corpoPanel;
    private javax.swing.JLabel dfinal;
    private javax.swing.JLabel inicial;
    private javax.swing.JLabel logoSESCOVID;
    private javax.swing.JPanel telaPanel;
    // End of variables declaration//GEN-END:variables
}
