package Telas;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class View1 extends javax.swing.JFrame {  
    ConvertBases convert = new ConvertBases();
    String Texto="", selecao;;    
    int valor;       
    public View1() {
        initComponents();    
        setIcon();
        setExtendedState(MAXIMIZED_BOTH);
        ENTRADA.requestFocus(); 
        ENCODING.setText(System.getProperty("file.encoding"));  
        CARREGANDO.setVisible(false);
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PAINEL1 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ENTRADA = new javax.swing.JEditorPane();
        jToolBar1 = new javax.swing.JToolBar();
        LIMPAR = new javax.swing.JButton();
        CODIFICAR = new javax.swing.JButton();
        DESCODIFICAR = new javax.swing.JButton();
        LOCALIZAR = new javax.swing.JButton();
        SAIR = new javax.swing.JButton();
        LEGENDA_ENTRADA = new javax.swing.JLabel();
        LEGENDA_SAIDA = new javax.swing.JLabel();
        SELECAO = new javax.swing.JComboBox<>();
        COPIAR_ENTRADA = new javax.swing.JButton();
        COPIAR_SAIDA = new javax.swing.JButton();
        QTD_PALAVRAS_ENTRADA = new javax.swing.JLabel();
        QTD_CARACTERES_ENTRADA = new javax.swing.JLabel();
        ROLAGEM_SAIDA = new javax.swing.JScrollPane();
        SAIDA = new javax.swing.JEditorPane();
        COLAR_SAIDA = new javax.swing.JLabel();
        COLAR_ENTRADA = new javax.swing.JLabel();
        ERRO_SAIDA = new javax.swing.JLabel();
        QTD_CARACTERES_SAIDA = new javax.swing.JLabel();
        RODAPE = new javax.swing.JPanel();
        ESTADO = new javax.swing.JLabel();
        ENCODING = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        INVERTER_SAIDA = new javax.swing.JCheckBox();
        INVERTER_ENTRADA = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        CARREGANDO = new javax.swing.JLabel();
        MENU = new javax.swing.JMenuBar();
        ARQUIVO = new javax.swing.JMenu();
        MENU_IMPORTAR = new javax.swing.JMenuItem();
        MENU_EXPORTAR = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        MENU_HISTÓRICO = new javax.swing.JMenuItem();
        MENU_SAIR = new javax.swing.JMenuItem();
        EDITAR = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        FERRAMENTAS = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        AJUDA = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sunrise Converter 1.4.1");
        setLocation(new java.awt.Point(150, 0));
        setPreferredSize(new java.awt.Dimension(1300, 706));

        PAINEL1.setBackground(new java.awt.Color(28, 28, 28));
        PAINEL1.setForeground(new java.awt.Color(58, 58, 58));
        PAINEL1.setToolTipText("");
        PAINEL1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PAINEL1.setName(""); // NOI18N
        PAINEL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setBackground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/impressao.png"))); // NOI18N
        PAINEL1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, 190));

        jScrollPane2.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ENTRADA.setBackground(new java.awt.Color(45, 45, 45));
        ENTRADA.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(45, 45, 45)));
        ENTRADA.setContentType(""); // NOI18N
        ENTRADA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ENTRADA.setForeground(new java.awt.Color(204, 204, 204));
        ENTRADA.setToolTipText("");
        ENTRADA.setAlignmentX(20.0F);
        ENTRADA.setAlignmentY(20.0F);
        ENTRADA.setCaretColor(new java.awt.Color(255, 255, 255));
        ENTRADA.setDisabledTextColor(new java.awt.Color(255, 0, 255));
        ENTRADA.setMargin(new java.awt.Insets(20, 20, 20, 20));
        ENTRADA.setName("Caixa de entrada"); // NOI18N
        ENTRADA.setNextFocusableComponent(ENTRADA);
        ENTRADA.setSelectionColor(new java.awt.Color(151, 41, 148));
        ENTRADA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ENTRADAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ENTRADAMouseExited(evt);
            }
        });
        ENTRADA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ENTRADAKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ENTRADAKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(ENTRADA);
        ENTRADA.getAccessibleContext().setAccessibleName("");
        ENTRADA.getAccessibleContext().setAccessibleDescription("Olá, Mundo!");
        ENTRADA.getAccessibleContext().setAccessibleParent(ENTRADA);

        PAINEL1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 400, 400));

        jToolBar1.setBackground(new java.awt.Color(30, 30, 30));
        jToolBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        LIMPAR.setBackground(new java.awt.Color(30, 30, 30));
        LIMPAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LIMPAR.setForeground(new java.awt.Color(204, 204, 204));
        LIMPAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-limpar.png"))); // NOI18N
        LIMPAR.setMnemonic('L');
        LIMPAR.setText("Limpar");
        LIMPAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LIMPAR.setContentAreaFilled(false);
        LIMPAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LIMPAR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        LIMPAR.setMargin(null);
        LIMPAR.setMaximumSize(new java.awt.Dimension(143, 63));
        LIMPAR.setOpaque(true);
        LIMPAR.setPreferredSize(new java.awt.Dimension(140, 63));
        LIMPAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LIMPARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LIMPARMouseExited(evt);
            }
        });
        LIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPARActionPerformed(evt);
            }
        });
        jToolBar1.add(LIMPAR);

        CODIFICAR.setBackground(new java.awt.Color(30, 30, 30));
        CODIFICAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CODIFICAR.setForeground(new java.awt.Color(204, 204, 204));
        CODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-converter.png"))); // NOI18N
        CODIFICAR.setMnemonic('C');
        CODIFICAR.setText("Codificar");
        CODIFICAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CODIFICAR.setContentAreaFilled(false);
        CODIFICAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CODIFICAR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CODIFICAR.setMargin(null);
        CODIFICAR.setMaximumSize(new java.awt.Dimension(143, 63));
        CODIFICAR.setOpaque(true);
        CODIFICAR.setPreferredSize(new java.awt.Dimension(140, 63));
        CODIFICAR.setSelected(true);
        CODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CODIFICARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CODIFICARMouseExited(evt);
            }
        });
        CODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIFICARActionPerformed(evt);
            }
        });
        jToolBar1.add(CODIFICAR);

        DESCODIFICAR.setBackground(new java.awt.Color(30, 30, 30));
        DESCODIFICAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DESCODIFICAR.setForeground(new java.awt.Color(204, 204, 204));
        DESCODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-reverter.png"))); // NOI18N
        DESCODIFICAR.setMnemonic('D');
        DESCODIFICAR.setText("Descodificar");
        DESCODIFICAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DESCODIFICAR.setContentAreaFilled(false);
        DESCODIFICAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DESCODIFICAR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DESCODIFICAR.setMargin(null);
        DESCODIFICAR.setMaximumSize(new java.awt.Dimension(143, 63));
        DESCODIFICAR.setOpaque(true);
        DESCODIFICAR.setPreferredSize(new java.awt.Dimension(140, 63));
        DESCODIFICAR.setVerifyInputWhenFocusTarget(false);
        DESCODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DESCODIFICARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DESCODIFICARMouseExited(evt);
            }
        });
        DESCODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESCODIFICARActionPerformed(evt);
            }
        });
        jToolBar1.add(DESCODIFICAR);

        LOCALIZAR.setBackground(new java.awt.Color(30, 30, 30));
        LOCALIZAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LOCALIZAR.setForeground(new java.awt.Color(204, 204, 204));
        LOCALIZAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-pesquisar.png"))); // NOI18N
        LOCALIZAR.setMnemonic('O');
        LOCALIZAR.setText("Localizar");
        LOCALIZAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LOCALIZAR.setContentAreaFilled(false);
        LOCALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOCALIZAR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        LOCALIZAR.setMargin(null);
        LOCALIZAR.setMaximumSize(new java.awt.Dimension(143, 63));
        LOCALIZAR.setOpaque(true);
        LOCALIZAR.setPreferredSize(new java.awt.Dimension(140, 63));
        LOCALIZAR.setVerifyInputWhenFocusTarget(false);
        LOCALIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LOCALIZARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOCALIZARMouseExited(evt);
            }
        });
        LOCALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALIZARActionPerformed(evt);
            }
        });
        jToolBar1.add(LOCALIZAR);

        SAIR.setBackground(new java.awt.Color(30, 30, 30));
        SAIR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SAIR.setForeground(new java.awt.Color(204, 204, 204));
        SAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-sair.png"))); // NOI18N
        SAIR.setMnemonic('S');
        SAIR.setText("Sair");
        SAIR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SAIR.setContentAreaFilled(false);
        SAIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAIR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        SAIR.setMargin(null);
        SAIR.setMaximumSize(new java.awt.Dimension(143, 63));
        SAIR.setOpaque(true);
        SAIR.setPreferredSize(new java.awt.Dimension(140, 63));
        SAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SAIRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SAIRMouseExited(evt);
            }
        });
        SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(SAIR);

        PAINEL1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 40));

        LEGENDA_ENTRADA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LEGENDA_ENTRADA.setForeground(new java.awt.Color(204, 204, 204));
        LEGENDA_ENTRADA.setText("Entrada");
        PAINEL1.add(LEGENDA_ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, 30));

        LEGENDA_SAIDA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LEGENDA_SAIDA.setForeground(new java.awt.Color(204, 204, 204));
        LEGENDA_SAIDA.setText("Saída");
        PAINEL1.add(LEGENDA_SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 150, 40, 30));

        SELECAO.setBackground(new java.awt.Color(45, 45, 45));
        SELECAO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SELECAO.setForeground(new java.awt.Color(204, 204, 204));
        SELECAO.setMaximumRowCount(9);
        SELECAO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caractere - > Binário", "Caractere - > Inteiro", "Caractere - > Octal", "Caractere - > Hexadecimal", "Inteiro - > Binário", "Inteiro - > Hexadecimal", "Inteiro - > Octal", "Hexadecimal - > Binário", "Hexadecimal - > Octal", "Octal - > Binário" }));
        SELECAO.setAlignmentX(10.0F);
        SELECAO.setAlignmentY(10.0F);
        SELECAO.setAutoscrolls(true);
        SELECAO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SELECAO.setMinimumSize(new java.awt.Dimension(180, 170));
        SELECAO.setOpaque(false);
        SELECAO.setPreferredSize(new java.awt.Dimension(199, 70));
        SELECAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELECAOActionPerformed(evt);
            }
        });
        PAINEL1.add(SELECAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 180, 40));

        COPIAR_ENTRADA.setBackground(new java.awt.Color(63, 63, 63));
        COPIAR_ENTRADA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        COPIAR_ENTRADA.setForeground(new java.awt.Color(204, 204, 204));
        COPIAR_ENTRADA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-copiar.png"))); // NOI18N
        COPIAR_ENTRADA.setMnemonic('X');
        COPIAR_ENTRADA.setBorder(null);
        COPIAR_ENTRADA.setContentAreaFilled(false);
        COPIAR_ENTRADA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        COPIAR_ENTRADA.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        COPIAR_ENTRADA.setMargin(null);
        COPIAR_ENTRADA.setMaximumSize(new java.awt.Dimension(143, 63));
        COPIAR_ENTRADA.setPreferredSize(new java.awt.Dimension(140, 63));
        COPIAR_ENTRADA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COPIAR_ENTRADAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COPIAR_ENTRADAMouseExited(evt);
            }
        });
        COPIAR_ENTRADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COPIAR_ENTRADAActionPerformed(evt);
            }
        });
        PAINEL1.add(COPIAR_ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 30, 30));

        COPIAR_SAIDA.setBackground(new java.awt.Color(63, 63, 63));
        COPIAR_SAIDA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        COPIAR_SAIDA.setForeground(new java.awt.Color(204, 204, 204));
        COPIAR_SAIDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-copiar.png"))); // NOI18N
        COPIAR_SAIDA.setMnemonic('Z');
        COPIAR_SAIDA.setBorder(null);
        COPIAR_SAIDA.setContentAreaFilled(false);
        COPIAR_SAIDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        COPIAR_SAIDA.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        COPIAR_SAIDA.setMargin(null);
        COPIAR_SAIDA.setMaximumSize(new java.awt.Dimension(143, 63));
        COPIAR_SAIDA.setPreferredSize(new java.awt.Dimension(140, 63));
        COPIAR_SAIDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COPIAR_SAIDAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COPIAR_SAIDAMouseExited(evt);
            }
        });
        COPIAR_SAIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COPIAR_SAIDAActionPerformed(evt);
            }
        });
        PAINEL1.add(COPIAR_SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 190, 30, 30));

        QTD_PALAVRAS_ENTRADA.setForeground(new java.awt.Color(204, 204, 204));
        PAINEL1.add(QTD_PALAVRAS_ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 110, 30));

        QTD_CARACTERES_ENTRADA.setForeground(new java.awt.Color(204, 204, 204));
        PAINEL1.add(QTD_CARACTERES_ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 110, 30));

        ROLAGEM_SAIDA.setBackground(new java.awt.Color(153, 153, 153));
        ROLAGEM_SAIDA.setForeground(new java.awt.Color(153, 153, 153));
        ROLAGEM_SAIDA.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        SAIDA.setBackground(new java.awt.Color(45, 45, 45));
        SAIDA.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 45, 45), 4)));
        SAIDA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SAIDA.setForeground(new java.awt.Color(154, 22, 150));
        SAIDA.setAlignmentX(1.0F);
        SAIDA.setAlignmentY(1.0F);
        SAIDA.setCaretColor(new java.awt.Color(255, 255, 255));
        SAIDA.setMargin(new java.awt.Insets(10, 10, 10, 10));
        SAIDA.setMinimumSize(new java.awt.Dimension(102, 25));
        SAIDA.setSelectionColor(new java.awt.Color(204, 204, 204));
        SAIDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SAIDAMouseEntered(evt);
            }
        });
        SAIDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SAIDAKeyPressed(evt);
            }
        });
        ROLAGEM_SAIDA.setViewportView(SAIDA);

        PAINEL1.add(ROLAGEM_SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 190, 390, 400));

        COLAR_SAIDA.setBackground(new java.awt.Color(28, 28, 28));
        COLAR_SAIDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-colar.png"))); // NOI18N
        COLAR_SAIDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COLAR_SAIDAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COLAR_SAIDAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COLAR_SAIDAMouseExited(evt);
            }
        });
        PAINEL1.add(COLAR_SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 238, -1, 30));

        COLAR_ENTRADA.setBackground(new java.awt.Color(28, 28, 28));
        COLAR_ENTRADA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-colar.png"))); // NOI18N
        COLAR_ENTRADA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COLAR_ENTRADAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COLAR_ENTRADAMouseExited(evt);
            }
        });
        PAINEL1.add(COLAR_ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 238, -1, 30));

        ERRO_SAIDA.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ERRO_SAIDA.setForeground(new java.awt.Color(255, 0, 0));
        ERRO_SAIDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ERRO_SAIDA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PAINEL1.add(ERRO_SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 180, 30));

        QTD_CARACTERES_SAIDA.setForeground(new java.awt.Color(204, 204, 204));
        QTD_CARACTERES_SAIDA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PAINEL1.add(QTD_CARACTERES_SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 596, 120, 30));

        RODAPE.setBackground(new java.awt.Color(104, 33, 102));

        ESTADO.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ESTADO.setForeground(new java.awt.Color(255, 255, 255));
        ESTADO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ESTADO.setText("Estado");

        ENCODING.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ENCODING.setForeground(new java.awt.Color(255, 255, 255));
        ENCODING.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Portguês (Brasil)");

        javax.swing.GroupLayout RODAPELayout = new javax.swing.GroupLayout(RODAPE);
        RODAPE.setLayout(RODAPELayout);
        RODAPELayout.setHorizontalGroup(
            RODAPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RODAPELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 940, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ENCODING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        RODAPELayout.setVerticalGroup(
            RODAPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RODAPELayout.createSequentialGroup()
                .addGroup(RODAPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ENCODING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(ESTADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PAINEL1.add(RODAPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1571, -1));

        INVERTER_SAIDA.setBackground(new java.awt.Color(28, 28, 28));
        INVERTER_SAIDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INVERTER_SAIDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inverter-ícone.png"))); // NOI18N
        INVERTER_SAIDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                INVERTER_SAIDAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                INVERTER_SAIDAMouseExited(evt);
            }
        });
        INVERTER_SAIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVERTER_SAIDAActionPerformed(evt);
            }
        });
        PAINEL1.add(INVERTER_SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 275, 34, 45));

        INVERTER_ENTRADA.setBackground(new java.awt.Color(28, 28, 28));
        INVERTER_ENTRADA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INVERTER_ENTRADA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inverter-ícone.png"))); // NOI18N
        INVERTER_ENTRADA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                INVERTER_ENTRADAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                INVERTER_ENTRADAMouseExited(evt);
            }
        });
        INVERTER_ENTRADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVERTER_ENTRADAActionPerformed(evt);
            }
        });
        PAINEL1.add(INVERTER_ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 275, 34, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CARREGANDOGIF.gif"))); // NOI18N
        PAINEL1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 50, 40));

        CARREGANDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CARREGANDOGIF.gif"))); // NOI18N
        CARREGANDO.setText("jLabel3");
        PAINEL1.add(CARREGANDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 160, 60));

        MENU.setBackground(new java.awt.Color(30, 30, 30));
        MENU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        MENU.setForeground(new java.awt.Color(204, 204, 204));

        ARQUIVO.setBorder(null);
        ARQUIVO.setForeground(new java.awt.Color(204, 204, 204));
        ARQUIVO.setMnemonic('A');
        ARQUIVO.setText("Arquivo");
        ARQUIVO.setBorderPainted(true);
        ARQUIVO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ARQUIVO.setMargin(new java.awt.Insets(0, 15, 0, 15));

        MENU_IMPORTAR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        MENU_IMPORTAR.setBackground(new java.awt.Color(63, 63, 63));
        MENU_IMPORTAR.setForeground(new java.awt.Color(204, 204, 204));
        MENU_IMPORTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo_doc-ícone.png"))); // NOI18N
        MENU_IMPORTAR.setText("Importar Texto");
        MENU_IMPORTAR.setBorder(null);
        MENU_IMPORTAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MENU_IMPORTAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MENU_IMPORTAR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MENU_IMPORTAR.setIconTextGap(0);
        MENU_IMPORTAR.setMargin(new java.awt.Insets(10, 10, 10, 10));
        MENU_IMPORTAR.setMinimumSize(new java.awt.Dimension(300, 0));
        MENU_IMPORTAR.setPreferredSize(new java.awt.Dimension(200, 50));
        MENU_IMPORTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_IMPORTARActionPerformed(evt);
            }
        });
        ARQUIVO.add(MENU_IMPORTAR);

        MENU_EXPORTAR.setBackground(new java.awt.Color(63, 63, 63));
        MENU_EXPORTAR.setBorder(null);
        MENU_EXPORTAR.setForeground(new java.awt.Color(204, 204, 204));
        MENU_EXPORTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exportar-ícone.png"))); // NOI18N
        MENU_EXPORTAR.setText("Exportar Texto");
        MENU_EXPORTAR.setOpaque(true);

        jMenuItem5.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem5.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem5.setText("Texto.txt");
        jMenuItem5.setOpaque(true);
        jMenuItem5.setPreferredSize(new java.awt.Dimension(157, 33));
        MENU_EXPORTAR.add(jMenuItem5);

        jMenuItem13.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem13.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem13.setText("PDF.pdf");
        jMenuItem13.setOpaque(true);
        jMenuItem13.setPreferredSize(new java.awt.Dimension(157, 33));
        MENU_EXPORTAR.add(jMenuItem13);

        jMenuItem14.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem14.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem14.setText("Word.docx");
        jMenuItem14.setOpaque(true);
        jMenuItem14.setPreferredSize(new java.awt.Dimension(157, 33));
        MENU_EXPORTAR.add(jMenuItem14);

        ARQUIVO.add(MENU_EXPORTAR);

        MENU_HISTÓRICO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        MENU_HISTÓRICO.setBackground(new java.awt.Color(63, 63, 63));
        MENU_HISTÓRICO.setForeground(new java.awt.Color(204, 204, 204));
        MENU_HISTÓRICO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/histórico-ícone.png"))); // NOI18N
        MENU_HISTÓRICO.setText("Histórico");
        MENU_HISTÓRICO.setBorder(null);
        MENU_HISTÓRICO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MENU_HISTÓRICO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MENU_HISTÓRICO.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MENU_HISTÓRICO.setIconTextGap(0);
        MENU_HISTÓRICO.setMargin(new java.awt.Insets(10, 10, 10, 10));
        MENU_HISTÓRICO.setMinimumSize(new java.awt.Dimension(300, 0));
        MENU_HISTÓRICO.setPreferredSize(new java.awt.Dimension(200, 50));
        MENU_HISTÓRICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_HISTÓRICOActionPerformed(evt);
            }
        });
        ARQUIVO.add(MENU_HISTÓRICO);

        MENU_SAIR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        MENU_SAIR.setBackground(new java.awt.Color(63, 63, 63));
        MENU_SAIR.setForeground(new java.awt.Color(204, 204, 204));
        MENU_SAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar-ícone.png"))); // NOI18N
        MENU_SAIR.setText("Sair");
        MENU_SAIR.setBorder(null);
        MENU_SAIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MENU_SAIR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MENU_SAIR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MENU_SAIR.setIconTextGap(0);
        MENU_SAIR.setMargin(new java.awt.Insets(10, 10, 10, 10));
        MENU_SAIR.setMinimumSize(new java.awt.Dimension(300, 0));
        MENU_SAIR.setPreferredSize(new java.awt.Dimension(200, 50));
        MENU_SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_SAIRActionPerformed(evt);
            }
        });
        ARQUIVO.add(MENU_SAIR);

        MENU.add(ARQUIVO);

        EDITAR.setForeground(new java.awt.Color(204, 204, 204));
        EDITAR.setMnemonic('E');
        EDITAR.setText("Editar");
        EDITAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EDITAR.setMargin(new java.awt.Insets(0, 15, 0, 15));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem1.setText("Personalizar");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.setPreferredSize(new java.awt.Dimension(181, 30));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        EDITAR.add(jMenuItem1);

        MENU.add(EDITAR);

        FERRAMENTAS.setForeground(new java.awt.Color(204, 204, 204));
        FERRAMENTAS.setMnemonic('F');
        FERRAMENTAS.setText("Ferramentas");
        FERRAMENTAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FERRAMENTAS.setMargin(new java.awt.Insets(4, 4, 4, 4));
        FERRAMENTAS.setMinimumSize(new java.awt.Dimension(121, 30));

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem7.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem7.setText("Conversor de Unidades");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuItem7.setMinimumSize(new java.awt.Dimension(0, 300));
        jMenuItem7.setPreferredSize(new java.awt.Dimension(227, 50));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        FERRAMENTAS.add(jMenuItem7);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem10.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem10.setText("Calculadora Desenvolvedor");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuItem10.setMinimumSize(new java.awt.Dimension(300, 0));
        jMenuItem10.setPreferredSize(new java.awt.Dimension(227, 50));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        FERRAMENTAS.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem9.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem9.setText("Calculadora Usuário");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem9.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuItem9.setMinimumSize(new java.awt.Dimension(0, 300));
        jMenuItem9.setPreferredSize(new java.awt.Dimension(227, 50));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        FERRAMENTAS.add(jMenuItem9);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem12.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem12.setText("Tabela Verdade");
        jMenuItem12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem12.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuItem12.setMinimumSize(new java.awt.Dimension(0, 300));
        jMenuItem12.setPreferredSize(new java.awt.Dimension(227, 50));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        FERRAMENTAS.add(jMenuItem12);

        MENU.add(FERRAMENTAS);

        AJUDA.setForeground(new java.awt.Color(204, 204, 204));
        AJUDA.setMnemonic('J');
        AJUDA.setText("Ajuda");
        AJUDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AJUDA.setMargin(new java.awt.Insets(0, 15, 0, 15));

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem8.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/problema-ícone.png"))); // NOI18N
        jMenuItem8.setText("Relatar Problema");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem8.setMinimumSize(new java.awt.Dimension(0, 300));
        jMenuItem8.setPreferredSize(new java.awt.Dimension(250, 50));
        AJUDA.add(jMenuItem8);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem11.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem11.setText("Saiba mais...");
        jMenuItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem11.setMinimumSize(new java.awt.Dimension(0, 300));
        jMenuItem11.setPreferredSize(new java.awt.Dimension(151, 50));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        AJUDA.add(jMenuItem11);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem4.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/manual-ícone.png"))); // NOI18N
        jMenuItem4.setText("Manual");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.setPreferredSize(new java.awt.Dimension(151, 50));
        AJUDA.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem3.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/update-ícone.png"))); // NOI18N
        jMenuItem3.setText("Verificar Atualizações");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.setMinimumSize(new java.awt.Dimension(0, 300));
        jMenuItem3.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        AJUDA.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(63, 63, 63));
        jMenuItem2.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre-ícone.png"))); // NOI18N
        jMenuItem2.setText("Sobre");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.setMinimumSize(new java.awt.Dimension(0, 300));
        jMenuItem2.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        AJUDA.add(jMenuItem2);

        MENU.add(AJUDA);

        setJMenuBar(MENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAINEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAINEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Runnable t1 = new Runnable() {
        @Override
        public void run() {				
            int qtd_caracteres_saida;        
                
            selecao = (String) SELECAO.getSelectedItem();        
            Texto = ENTRADA.getText();          
            
            if (ENTRADA.getText().compareTo("")!=0) {
                switch (selecao) {
                    case "Caractere - > Binário":
                        Texto = convert.isCaracBin(Texto);             
                    break;
                    case "Inteiro - > Binário":
                        valor = Integer.valueOf(Texto);
                        Texto = convert.isIntBin(valor);            
                    break;
                    case "Inteiro - > Hexadecimal":
                        valor = Integer.valueOf(Texto);
                        Texto = convert.isIntHexa(valor);                    
                    break;  
                
                    case "Caractere - > Inteiro":                   
                            Texto = convert.isCaracInt(Texto);                                                                    
                    break;
                    default:
                    break;
                }                                
                SAIDA.setText(Texto);
                ENTRADA.setText("");
                ENTRADA.requestFocus();             
            }           
                
            qtd_caracteres_saida = convert.QtdCarac(SAIDA.getText());        
            QTD_CARACTERES_SAIDA.setText(qtd_caracteres_saida+" Caracteres"); 
            CARREGANDO.setVisible(false);
	}	
    };
    
    private Runnable t2 = new Runnable() {
	public void run() {			
            CARREGANDO.setVisible(true);
	}
    };
    
    private void CODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIFICARActionPerformed
        new Thread(t1).start();        
        new Thread(t2).start();        
    }//GEN-LAST:event_CODIFICARActionPerformed

            
    private void LIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPARActionPerformed
        SAIDA.setText("");
        ENTRADA.setText("");
        QTD_PALAVRAS_ENTRADA.setText("0 Palavras");
        QTD_CARACTERES_ENTRADA.setText("0 Caracteres");
        QTD_CARACTERES_SAIDA.setText("0 Caracteres");
        QTD_CARACTERES_SAIDA.setText("0 Caracteres");
        ERRO_SAIDA.setText("");
        
    }//GEN-LAST:event_LIMPARActionPerformed

    private void DESCODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESCODIFICARActionPerformed
        selecao = (String) SELECAO.getSelectedItem();       
        Texto = SAIDA.getText();
                    
        if (SAIDA.getText().compareTo("")!=0) {
            if (selecao.equals("Caractere - > Binário")) {            
                Texto = convert.isBinCarac(Texto);
            
                if (Texto.equals("erro")) {
                    ERRO_SAIDA.setText("Caracteres invalidos!");
                }
            } else if (selecao.equals("Inteiro - > Binário")) {            
                    Texto = convert.isBinInt(Texto);

                    if (Texto.equals("erro")) {
                        ERRO_SAIDA.setText("Caracteres invalidos!");
                    }                    
            } else if (selecao.equals("Inteiro - > Hexadecimal")) {
                    Texto = convert.isHexaInt(Texto);
            } else if (selecao.equals("Caractere - > Inteiro")) {                                                                      
                    Texto = convert.isIntCarac(Texto);                    
                    if (Texto.equals("erro")) {
                        ERRO_SAIDA.setText("Caracteres invalidos!");
                    }                    
            }            
            
            ENTRADA.setText(Texto);
            SAIDA.setText("");       
        }
    }//GEN-LAST:event_DESCODIFICARActionPerformed

    private void COPIAR_SAIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COPIAR_SAIDAActionPerformed
        // TODO add your handling code here:
        String myString = SAIDA.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_COPIAR_SAIDAActionPerformed

    private void LIMPARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPARMouseEntered
        // TODO add your handling code here:
        LIMPAR.setBackground(new java.awt.Color(104,33,102));        
        LIMPAR.setContentAreaFilled(false);
        LIMPAR.setOpaque(true);
        LIMPAR.setToolTipText("Limpar conteúdos nos campos");
    }//GEN-LAST:event_LIMPARMouseEntered

    private void LIMPARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPARMouseExited
        // TODO add your handling code here:                
        LIMPAR.setBackground(new java.awt.Color(30, 30, 30));
        LIMPAR.setContentAreaFilled(false);
        LIMPAR.setOpaque(true);
    }//GEN-LAST:event_LIMPARMouseExited

    private void CODIFICARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CODIFICARMouseEntered
        // TODO add your handling code here:
        CODIFICAR.setBackground(new java.awt.Color(104,33,102));
        CODIFICAR.setContentAreaFilled(false);
        CODIFICAR.setOpaque(true);               
        CODIFICAR.setToolTipText("Convertera texto de entrada na base selecionada.");
    }//GEN-LAST:event_CODIFICARMouseEntered

    private void CODIFICARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CODIFICARMouseExited
        // TODO add your handling code here:
        CODIFICAR.setBackground(new java.awt.Color(30, 30, 30));
        CODIFICAR.setContentAreaFilled(false);
        CODIFICAR.setOpaque(true);
    }//GEN-LAST:event_CODIFICARMouseExited

    private void DESCODIFICARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DESCODIFICARMouseEntered
        // TODO add your handling code here:
        DESCODIFICAR.setBackground(new java.awt.Color(104,33,102));
        DESCODIFICAR.setContentAreaFilled(false);
        DESCODIFICAR.setOpaque(true);
        DESCODIFICAR.setToolTipText("Desconvertera texto de entrada na base selecionada.");
    }//GEN-LAST:event_DESCODIFICARMouseEntered

    private void DESCODIFICARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DESCODIFICARMouseExited
        // TODO add your handling code here:
        DESCODIFICAR.setBackground(new java.awt.Color(30, 30, 30));
        DESCODIFICAR.setContentAreaFilled(false);
        DESCODIFICAR.setOpaque(true);
    }//GEN-LAST:event_DESCODIFICARMouseExited

    private void COPIAR_SAIDAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COPIAR_SAIDAMouseEntered
        // TODO add your handling code here:
        COPIAR_SAIDA.setBackground(new java.awt.Color(104,33,102));
        COPIAR_SAIDA.setContentAreaFilled(false);
        COPIAR_SAIDA.setOpaque(true);
        COPIAR_SAIDA.setToolTipText("Copiar texto para área de transferência");
    }//GEN-LAST:event_COPIAR_SAIDAMouseEntered

    private void COPIAR_SAIDAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COPIAR_SAIDAMouseExited
        // TODO add your handling code here:
        COPIAR_SAIDA.setBackground(new java.awt.Color(35, 35, 35));
        COPIAR_SAIDA.setContentAreaFilled(false);
        COPIAR_SAIDA.setOpaque(true);
    }//GEN-LAST:event_COPIAR_SAIDAMouseExited

    private void SAIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAIRMouseEntered
        // TODO add your handling code here:
        SAIR.setBackground(new java.awt.Color(104,33,102));
        SAIR.setContentAreaFilled(false);
        SAIR.setOpaque(true);
        SAIR.setToolTipText("Encerrara a aplicação.");
    }//GEN-LAST:event_SAIRMouseEntered

    private void SAIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAIRMouseExited
        // TODO add your handling code here:
        SAIR.setBackground(new java.awt.Color(30, 30, 30));
        SAIR.setContentAreaFilled(false);
        SAIR.setOpaque(true);
    }//GEN-LAST:event_SAIRMouseExited

    private void SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRActionPerformed
        // TODO add your handling code here:                
        System.exit(0);
        
    }//GEN-LAST:event_SAIRActionPerformed

    private void ENTRADAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRADAMouseExited
        // TODO add your handling code here:
        LOGO.setVisible(true);
    }//GEN-LAST:event_ENTRADAMouseExited

    private void ENTRADAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ENTRADAKeyPressed
        // TODO add your handling code here:                
        ESTADO.setText("Digitando...");        
        
        int qtd_palavras_entrada,   qtd_caracteres_entrada;
                
        qtd_palavras_entrada = convert.QtdPalavras(ENTRADA.getText());
        qtd_caracteres_entrada = convert.QtdCarac(ENTRADA.getText());                
        
        if (ENTRADA.getText().length()==0)
            QTD_PALAVRAS_ENTRADA.setText("0 Palavras");
        else QTD_PALAVRAS_ENTRADA.setText(qtd_palavras_entrada+" Palavras");
        
        if (ENTRADA.getText().length()==0)
            QTD_CARACTERES_ENTRADA.setText("0 Caracteres");
        else QTD_CARACTERES_ENTRADA.setText(qtd_caracteres_entrada+" Caracteres");                                                                
    }//GEN-LAST:event_ENTRADAKeyPressed

    private void ENTRADAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ENTRADAKeyReleased
        // TODO add your handling code here:
        ESTADO.setText("");
    }//GEN-LAST:event_ENTRADAKeyReleased

    private void MENU_SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_SAIRActionPerformed
        // TODO add your handling code here:        
        System.exit(0);
    }//GEN-LAST:event_MENU_SAIRActionPerformed

    private void LOCALIZARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOCALIZARMouseEntered
        // TODO add your handling code here:
        LOCALIZAR.setBackground(new java.awt.Color(104,33,102));
        LOCALIZAR.setContentAreaFilled(false);
        LOCALIZAR.setOpaque(true);
        LOCALIZAR.setToolTipText("Procurar nomes específicos.");
    }//GEN-LAST:event_LOCALIZARMouseEntered

    private void LOCALIZARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOCALIZARMouseExited
        // TODO add your handling code here:
        LOCALIZAR.setBackground(new java.awt.Color(30, 30, 30));
        LOCALIZAR.setContentAreaFilled(false);
        LOCALIZAR.setOpaque(true);
    }//GEN-LAST:event_LOCALIZARMouseExited

    private void LOCALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALIZARActionPerformed
        // TODO add your handling code here:        
        new ViewFuturasAtualizações().setVisible(true);
    }//GEN-LAST:event_LOCALIZARActionPerformed

    private void ENTRADAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRADAMouseEntered
        // TODO add your handling code here:
        LOGO.setVisible(false);        
        ENTRADA.setToolTipText("Informar texto no qual deseja converter para qualquer base.");       
    }//GEN-LAST:event_ENTRADAMouseEntered

    private void SAIDAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAIDAMouseEntered
        // TODO add your handling code here:
        SAIDA.setToolTipText("Informar texto no qual deseja converter para qualquer base.");
    }//GEN-LAST:event_SAIDAMouseEntered

    private void COPIAR_ENTRADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COPIAR_ENTRADAActionPerformed
        // TODO add your handling code here:
        String myString = ENTRADA.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_COPIAR_ENTRADAActionPerformed

    private void COPIAR_ENTRADAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COPIAR_ENTRADAMouseExited
        // TODO add your handling code here:
        COPIAR_ENTRADA.setBackground(new java.awt.Color(35, 35, 35));
        COPIAR_ENTRADA.setContentAreaFilled(false);
        COPIAR_ENTRADA.setOpaque(true);
    }//GEN-LAST:event_COPIAR_ENTRADAMouseExited

    private void COPIAR_ENTRADAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COPIAR_ENTRADAMouseEntered
        // TODO add your handling code here:
        COPIAR_ENTRADA.setBackground(new java.awt.Color(104,33,102));
        COPIAR_ENTRADA.setContentAreaFilled(false);
        COPIAR_ENTRADA.setOpaque(true);
        COPIAR_ENTRADA.setToolTipText("Copiar texto para área de transferência.");
    }//GEN-LAST:event_COPIAR_ENTRADAMouseEntered

    private void COLAR_ENTRADAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COLAR_ENTRADAMouseEntered
        // TODO add your handling code here:
        COLAR_ENTRADA.setBackground(new java.awt.Color(104,33,102));        
        COLAR_ENTRADA.setOpaque(true);
        COLAR_ENTRADA.setToolTipText("Colar texto para o campo de saída.");
    }//GEN-LAST:event_COLAR_ENTRADAMouseEntered

    private void COLAR_SAIDAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COLAR_SAIDAMouseEntered
        // TODO add your handling code here:
        COLAR_SAIDA.setBackground(new java.awt.Color(104,33,102));        
        COLAR_SAIDA.setOpaque(true);        
        COLAR_SAIDA.setToolTipText("Colar texto para o campo de saída.");
    }//GEN-LAST:event_COLAR_SAIDAMouseEntered

    private void COLAR_SAIDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COLAR_SAIDAMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_COLAR_SAIDAMouseClicked

    private void COLAR_SAIDAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COLAR_SAIDAMouseExited
        // TODO add your handling code here:        
    COLAR_SAIDA.setBackground(new java.awt.Color(35,35,35));        
    }//GEN-LAST:event_COLAR_SAIDAMouseExited

    private void COLAR_ENTRADAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COLAR_ENTRADAMouseExited
        // TODO add your handling code here:
    COLAR_ENTRADA.setBackground(new java.awt.Color(35,35,35));        
    }//GEN-LAST:event_COLAR_ENTRADAMouseExited

    private void SELECAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELECAOActionPerformed
        // TODO add your handling code here:
        SAIDA.setText("");
        ENTRADA.setText("");
    }//GEN-LAST:event_SELECAOActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new ViewUpdate().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new ViewSobre().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new ViewConversorDeUnidades().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new ViewCalculadoraUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        new ViewCalculadoraDesenvolvedor().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Desktop d = Desktop.getDesktop(); try{ d.browse(new URI("https://canaltech.com.br/produtos/como-funciona-o-sistema-binario/")); } catch(IOException | URISyntaxException e){}
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ViewCores().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void SAIDAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SAIDAKeyPressed
        // TODO add your handling code here:
        int qtd_caracteres_saida = convert.QtdCarac(SAIDA.getText());                
        
        if (SAIDA.getText().length()==0)
            QTD_CARACTERES_SAIDA.setText("0 Caracteres");
        else QTD_CARACTERES_SAIDA.setText(qtd_caracteres_saida+" Caracteres"); 
    }//GEN-LAST:event_SAIDAKeyPressed

    private Runnable InverterEntrada = new Runnable() {
        @Override
        public void run() {
            String texto = convert.isInvert(ENTRADA.getText());
            ENTRADA.setText(texto);
            CARREGANDO.setVisible(false);
        }
    };
    
    private Runnable InverterSaida = new Runnable() {
        @Override
        public void run() {
            String texto = convert.isInvert(SAIDA.getText());
            SAIDA.setText(texto);
            CARREGANDO.setVisible(false);
        }
    };
    
    private void INVERTER_SAIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INVERTER_SAIDAActionPerformed
        // TODO add your handling code here:
        new Thread(InverterSaida).start();        
        CARREGANDO.setVisible(true);
    }//GEN-LAST:event_INVERTER_SAIDAActionPerformed

    private void INVERTER_ENTRADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INVERTER_ENTRADAActionPerformed
        // TODO add your handling code here:
        new Thread(InverterEntrada).start();        
        CARREGANDO.setVisible(true);
    }//GEN-LAST:event_INVERTER_ENTRADAActionPerformed

    private void INVERTER_ENTRADAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INVERTER_ENTRADAMouseEntered
        // TODO add your handling code here:
        INVERTER_ENTRADA.setBackground(new java.awt.Color(104,33,102));                
        INVERTER_ENTRADA.setToolTipText("Inverter texto de entrada");
    }//GEN-LAST:event_INVERTER_ENTRADAMouseEntered

    private void INVERTER_ENTRADAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INVERTER_ENTRADAMouseExited
        // TODO add your handling code here:
        INVERTER_ENTRADA.setBackground(new java.awt.Color(28,28,28));                
    }//GEN-LAST:event_INVERTER_ENTRADAMouseExited

    private void INVERTER_SAIDAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INVERTER_SAIDAMouseEntered
        // TODO add your handling code here:        
        INVERTER_SAIDA.setBackground(new java.awt.Color(104,33,102));                
        INVERTER_SAIDA.setToolTipText("Inverter texto de saida");
    }//GEN-LAST:event_INVERTER_SAIDAMouseEntered

    private void INVERTER_SAIDAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INVERTER_SAIDAMouseExited
        // TODO add your handling code here:
        INVERTER_SAIDA.setBackground(new java.awt.Color(28,28,28));                
    }//GEN-LAST:event_INVERTER_SAIDAMouseExited

    private void MENU_IMPORTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_IMPORTARActionPerformed
        // TODO add your handling code here:
        JFileChooser SELETOR = new JFileChooser();
        int retorno =  SELETOR.showOpenDialog(this);
        SELETOR.setDialogTitle("Importar arquivo");
        SELETOR.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text", ".txt", ".docx");
        SELETOR.setFileFilter(filter);
        
        if (retorno==JFileChooser.APPROVE_OPTION) {
            File arquivo = SELETOR.getSelectedFile();            
            System.out.println(arquivo);
            
        }
        
        
        
    }//GEN-LAST:event_MENU_IMPORTARActionPerformed

    private void MENU_HISTÓRICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_HISTÓRICOActionPerformed
        // TODO add your handling code here:
        new ViewFuturasAtualizações().setVisible(true);
    }//GEN-LAST:event_MENU_HISTÓRICOActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        new ViewFuturasAtualizações().setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {                        
        });
    }       
    private void setIcon() {
         URL caminhoImagem = this.getClass().getClassLoader().getResource("imagens/LOGO1.png");
         Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
         setIconImage(iconeTitulo);
    }        
    
    public void TransportaPalavra(ViewCalculadoraUsuario veioDaCalculadora, String nome) {        
        ENTRADA.setText(nome);        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AJUDA;
    private javax.swing.JMenu ARQUIVO;
    private javax.swing.JLabel CARREGANDO;
    private javax.swing.JButton CODIFICAR;
    private javax.swing.JLabel COLAR_ENTRADA;
    private javax.swing.JLabel COLAR_SAIDA;
    private javax.swing.JButton COPIAR_ENTRADA;
    private javax.swing.JButton COPIAR_SAIDA;
    private javax.swing.JButton DESCODIFICAR;
    private javax.swing.JMenu EDITAR;
    private javax.swing.JLabel ENCODING;
    private javax.swing.JEditorPane ENTRADA;
    private javax.swing.JLabel ERRO_SAIDA;
    private javax.swing.JLabel ESTADO;
    private javax.swing.JMenu FERRAMENTAS;
    private javax.swing.JCheckBox INVERTER_ENTRADA;
    private javax.swing.JCheckBox INVERTER_SAIDA;
    private javax.swing.JLabel LEGENDA_ENTRADA;
    private javax.swing.JLabel LEGENDA_SAIDA;
    private javax.swing.JButton LIMPAR;
    private javax.swing.JButton LOCALIZAR;
    private javax.swing.JLabel LOGO;
    private javax.swing.JMenuBar MENU;
    private javax.swing.JMenu MENU_EXPORTAR;
    private javax.swing.JMenuItem MENU_HISTÓRICO;
    private javax.swing.JMenuItem MENU_IMPORTAR;
    private javax.swing.JMenuItem MENU_SAIR;
    private javax.swing.JPanel PAINEL1;
    private javax.swing.JLabel QTD_CARACTERES_ENTRADA;
    private javax.swing.JLabel QTD_CARACTERES_SAIDA;
    private javax.swing.JLabel QTD_PALAVRAS_ENTRADA;
    private javax.swing.JPanel RODAPE;
    private javax.swing.JScrollPane ROLAGEM_SAIDA;
    private javax.swing.JEditorPane SAIDA;
    private javax.swing.JButton SAIR;
    private javax.swing.JComboBox<String> SELECAO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
      
}
 
