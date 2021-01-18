package Telas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ViewCalculadoraDesenvolvedor extends javax.swing.JFrame {

    View1 view = new View1();  
    ConvertBases convert = new ConvertBases();
    
    public ViewCalculadoraDesenvolvedor() {
        initComponents();
        RAND.addMouseListener(new MouseAdapter(){     
                   @Override
                    public void mouseClicked(MouseEvent e){
                        if(e.getClickCount() == 2){
                            new ViewRandom().setVisible(true);
                        } 
                    }
                });        
    }

    String operacao;
    String vlr_1, vlr_2;
    int vlr1, vlr2, resultado;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PAINEL3 = new javax.swing.JPanel();
        BTNLIMPAR = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTN0 = new javax.swing.JButton();
        BTNIGUAL = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTNSOMA = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTNSUBTRACAO = new javax.swing.JButton();
        NOT = new javax.swing.JButton();
        BTNEXCLUIR = new javax.swing.JButton();
        RAND = new javax.swing.JButton();
        SUBVISOR = new javax.swing.JLabel();
        VISOR = new javax.swing.JTextField();
        HISTÓRICO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BTNMULTIPLICACAO1 = new javax.swing.JButton();
        BTNDIVISAO1 = new javax.swing.JButton();
        AND = new javax.swing.JButton();
        OR = new javax.swing.JButton();
        XOR = new javax.swing.JButton();
        TRANSPORTA = new javax.swing.JButton();
        ASCII = new javax.swing.JButton();
        LOG2 = new javax.swing.JButton();
        LOG8 = new javax.swing.JButton();
        LOG10 = new javax.swing.JButton();
        LOG16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora do Desenvolvedor");
        setLocation(new java.awt.Point(300, 50));
        setMinimumSize(new java.awt.Dimension(520, 550));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        PAINEL3.setBackground(new java.awt.Color(45, 45, 45));
        PAINEL3.setPreferredSize(new java.awt.Dimension(40, 52));
        PAINEL3.setLayout(null);

        BTNLIMPAR.setBackground(new java.awt.Color(55, 55, 55));
        BTNLIMPAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNLIMPAR.setForeground(new java.awt.Color(153, 153, 153));
        BTNLIMPAR.setText("CE");
        BTNLIMPAR.setMaximumSize(new java.awt.Dimension(61, 23));
        BTNLIMPAR.setMinimumSize(new java.awt.Dimension(61, 23));
        BTNLIMPAR.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNLIMPAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNLIMPARMouseEntered(evt);
            }
        });
        BTNLIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLIMPARActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNLIMPAR);
        BTNLIMPAR.setBounds(100, 430, 70, 65);

        BTN3.setBackground(new java.awt.Color(55, 55, 55));
        BTN3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN3.setForeground(new java.awt.Color(153, 153, 153));
        BTN3.setText("11");
        BTN3.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN3.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN3.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN3);
        BTN3.setBounds(180, 360, 70, 65);

        BTN0.setBackground(new java.awt.Color(55, 55, 55));
        BTN0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN0.setForeground(new java.awt.Color(153, 153, 153));
        BTN0.setText("0");
        BTN0.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN0.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN0.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN0ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN0);
        BTN0.setBounds(20, 430, 70, 65);

        BTNIGUAL.setBackground(new java.awt.Color(55, 55, 55));
        BTNIGUAL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNIGUAL.setForeground(new java.awt.Color(153, 153, 153));
        BTNIGUAL.setText("=");
        BTNIGUAL.setMaximumSize(new java.awt.Dimension(61, 23));
        BTNIGUAL.setMinimumSize(new java.awt.Dimension(61, 23));
        BTNIGUAL.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIGUALActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNIGUAL);
        BTNIGUAL.setBounds(180, 430, 70, 65);

        BTN1.setBackground(new java.awt.Color(55, 55, 55));
        BTN1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN1.setForeground(new java.awt.Color(153, 153, 153));
        BTN1.setText("1");
        BTN1.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN1.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN1.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN1);
        BTN1.setBounds(20, 360, 69, 65);

        BTN2.setBackground(new java.awt.Color(55, 55, 55));
        BTN2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN2.setForeground(new java.awt.Color(153, 153, 153));
        BTN2.setText("10");
        BTN2.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN2.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN2.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN2);
        BTN2.setBounds(100, 360, 70, 65);

        BTNSOMA.setBackground(new java.awt.Color(55, 55, 55));
        BTNSOMA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNSOMA.setForeground(new java.awt.Color(153, 153, 153));
        BTNSOMA.setText("+");
        BTNSOMA.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNSOMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSOMAActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNSOMA);
        BTNSOMA.setBounds(420, 430, 70, 65);

        BTN7.setBackground(new java.awt.Color(55, 55, 55));
        BTN7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN7.setForeground(new java.awt.Color(153, 153, 153));
        BTN7.setText("111");
        BTN7.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN7.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN7.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN7);
        BTN7.setBounds(20, 220, 70, 65);

        BTN4.setBackground(new java.awt.Color(55, 55, 55));
        BTN4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN4.setForeground(new java.awt.Color(153, 153, 153));
        BTN4.setText("100");
        BTN4.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN4.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN4.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN4);
        BTN4.setBounds(20, 290, 70, 65);

        BTN5.setBackground(new java.awt.Color(55, 55, 55));
        BTN5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN5.setForeground(new java.awt.Color(153, 153, 153));
        BTN5.setText("101");
        BTN5.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN5.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN5.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN5);
        BTN5.setBounds(100, 290, 70, 65);

        BTN8.setBackground(new java.awt.Color(55, 55, 55));
        BTN8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN8.setForeground(new java.awt.Color(153, 153, 153));
        BTN8.setText("1000");
        BTN8.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN8);
        BTN8.setBounds(100, 220, 70, 65);

        BTN9.setBackground(new java.awt.Color(55, 55, 55));
        BTN9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN9.setForeground(new java.awt.Color(153, 153, 153));
        BTN9.setText("1001");
        BTN9.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN9);
        BTN9.setBounds(180, 220, 70, 65);

        BTN6.setBackground(new java.awt.Color(55, 55, 55));
        BTN6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN6.setForeground(new java.awt.Color(153, 153, 153));
        BTN6.setText("110");
        BTN6.setMaximumSize(new java.awt.Dimension(61, 23));
        BTN6.setMinimumSize(new java.awt.Dimension(61, 23));
        BTN6.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN6);
        BTN6.setBounds(180, 290, 70, 65);

        BTNSUBTRACAO.setBackground(new java.awt.Color(55, 55, 55));
        BTNSUBTRACAO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNSUBTRACAO.setForeground(new java.awt.Color(153, 153, 153));
        BTNSUBTRACAO.setText("-");
        BTNSUBTRACAO.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNSUBTRACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSUBTRACAOActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNSUBTRACAO);
        BTNSUBTRACAO.setBounds(420, 360, 70, 65);

        NOT.setBackground(new java.awt.Color(55, 55, 55));
        NOT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NOT.setForeground(new java.awt.Color(153, 153, 153));
        NOT.setText("NOT");
        NOT.setMaximumSize(new java.awt.Dimension(45, 23));
        NOT.setMinimumSize(new java.awt.Dimension(45, 23));
        NOT.setPreferredSize(new java.awt.Dimension(70, 65));
        NOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOTActionPerformed(evt);
            }
        });
        PAINEL3.add(NOT);
        NOT.setBounds(260, 430, 70, 65);

        BTNEXCLUIR.setBackground(new java.awt.Color(45, 45, 45));
        BTNEXCLUIR.setForeground(new java.awt.Color(204, 204, 204));
        BTNEXCLUIR.setText("C");
        BTNEXCLUIR.setBorderPainted(false);
        BTNEXCLUIR.setContentAreaFilled(false);
        BTNEXCLUIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNEXCLUIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNEXCLUIRMouseEntered(evt);
            }
        });
        BTNEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEXCLUIRActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNEXCLUIR);
        BTNEXCLUIR.setBounds(10, 170, 70, 30);

        RAND.setBackground(new java.awt.Color(45, 45, 45));
        RAND.setForeground(new java.awt.Color(153, 153, 153));
        RAND.setText("Rand");
        RAND.setBorder(null);
        RAND.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RAND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RANDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RANDMouseExited(evt);
            }
        });
        RAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RANDActionPerformed(evt);
            }
        });
        PAINEL3.add(RAND);
        RAND.setBounds(230, 170, 50, 35);

        SUBVISOR.setBackground(new java.awt.Color(38, 38, 38));
        SUBVISOR.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        SUBVISOR.setForeground(new java.awt.Color(204, 204, 204));
        SUBVISOR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SUBVISOR.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(154, 22, 150)), javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(38, 38, 38))));
        SUBVISOR.setOpaque(true);
        PAINEL3.add(SUBVISOR);
        SUBVISOR.setBounds(10, 44, 480, 50);

        VISOR.setEditable(false);
        VISOR.setBackground(new java.awt.Color(38, 38, 38));
        VISOR.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        VISOR.setForeground(new java.awt.Color(204, 204, 204));
        VISOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        VISOR.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(154, 22, 150)), javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(38, 38, 38))));
        VISOR.setDisabledTextColor(new java.awt.Color(38, 38, 38));
        PAINEL3.add(VISOR);
        VISOR.setBounds(10, 90, 480, 80);

        HISTÓRICO.setBackground(new java.awt.Color(45, 45, 45));
        HISTÓRICO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/histórico-ícone.png"))); // NOI18N
        HISTÓRICO.setOpaque(true);
        HISTÓRICO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HISTÓRICOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HISTÓRICOMouseExited(evt);
            }
        });
        PAINEL3.add(HISTÓRICO);
        HISTÓRICO.setBounds(460, 170, 30, 30);

        jLabel1.setBackground(new java.awt.Color(154, 22, 150));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("     Modo Desenvolvedor");
        jLabel1.setOpaque(true);
        PAINEL3.add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 26);

        BTNMULTIPLICACAO1.setBackground(new java.awt.Color(55, 55, 55));
        BTNMULTIPLICACAO1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNMULTIPLICACAO1.setForeground(new java.awt.Color(153, 153, 153));
        BTNMULTIPLICACAO1.setText("*");
        BTNMULTIPLICACAO1.setMaximumSize(new java.awt.Dimension(45, 23));
        BTNMULTIPLICACAO1.setMinimumSize(new java.awt.Dimension(45, 23));
        BTNMULTIPLICACAO1.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNMULTIPLICACAO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMULTIPLICACAO1ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNMULTIPLICACAO1);
        BTNMULTIPLICACAO1.setBounds(420, 220, 70, 65);

        BTNDIVISAO1.setBackground(new java.awt.Color(55, 55, 55));
        BTNDIVISAO1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNDIVISAO1.setForeground(new java.awt.Color(153, 153, 153));
        BTNDIVISAO1.setText("/");
        BTNDIVISAO1.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNDIVISAO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDIVISAO1ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNDIVISAO1);
        BTNDIVISAO1.setBounds(420, 290, 70, 65);

        AND.setBackground(new java.awt.Color(55, 55, 55));
        AND.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AND.setForeground(new java.awt.Color(153, 153, 153));
        AND.setText("AND");
        AND.setMaximumSize(new java.awt.Dimension(45, 23));
        AND.setMinimumSize(new java.awt.Dimension(45, 23));
        AND.setPreferredSize(new java.awt.Dimension(70, 65));
        AND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANDActionPerformed(evt);
            }
        });
        PAINEL3.add(AND);
        AND.setBounds(260, 220, 70, 65);

        OR.setBackground(new java.awt.Color(55, 55, 55));
        OR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OR.setForeground(new java.awt.Color(153, 153, 153));
        OR.setText("OR");
        OR.setMaximumSize(new java.awt.Dimension(45, 23));
        OR.setMinimumSize(new java.awt.Dimension(45, 23));
        OR.setPreferredSize(new java.awt.Dimension(70, 65));
        OR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORActionPerformed(evt);
            }
        });
        PAINEL3.add(OR);
        OR.setBounds(260, 290, 70, 65);

        XOR.setBackground(new java.awt.Color(55, 55, 55));
        XOR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        XOR.setForeground(new java.awt.Color(153, 153, 153));
        XOR.setText("XOR");
        XOR.setMaximumSize(new java.awt.Dimension(45, 23));
        XOR.setMinimumSize(new java.awt.Dimension(45, 23));
        XOR.setPreferredSize(new java.awt.Dimension(70, 65));
        XOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XORActionPerformed(evt);
            }
        });
        PAINEL3.add(XOR);
        XOR.setBounds(260, 360, 70, 65);

        TRANSPORTA.setBackground(new java.awt.Color(45, 45, 45));
        TRANSPORTA.setForeground(new java.awt.Color(153, 153, 153));
        TRANSPORTA.setText("Transporta");
        TRANSPORTA.setBorder(null);
        TRANSPORTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TRANSPORTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TRANSPORTAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TRANSPORTAMouseExited(evt);
            }
        });
        TRANSPORTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSPORTAActionPerformed(evt);
            }
        });
        PAINEL3.add(TRANSPORTA);
        TRANSPORTA.setBounds(70, 170, 70, 35);

        ASCII.setBackground(new java.awt.Color(45, 45, 45));
        ASCII.setForeground(new java.awt.Color(153, 153, 153));
        ASCII.setText("ASCII");
        ASCII.setBorder(null);
        ASCII.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASCII.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ASCIIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ASCIIMouseExited(evt);
            }
        });
        PAINEL3.add(ASCII);
        ASCII.setBounds(150, 170, 70, 35);

        LOG2.setBackground(new java.awt.Color(55, 55, 55));
        LOG2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LOG2.setForeground(new java.awt.Color(153, 153, 153));
        LOG2.setText("Log2");
        LOG2.setMaximumSize(new java.awt.Dimension(45, 23));
        LOG2.setMinimumSize(new java.awt.Dimension(45, 23));
        LOG2.setPreferredSize(new java.awt.Dimension(70, 65));
        LOG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOG2ActionPerformed(evt);
            }
        });
        PAINEL3.add(LOG2);
        LOG2.setBounds(340, 220, 70, 65);

        LOG8.setBackground(new java.awt.Color(55, 55, 55));
        LOG8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LOG8.setForeground(new java.awt.Color(153, 153, 153));
        LOG8.setText("Log8");
        LOG8.setMaximumSize(new java.awt.Dimension(45, 23));
        LOG8.setMinimumSize(new java.awt.Dimension(45, 23));
        LOG8.setPreferredSize(new java.awt.Dimension(70, 65));
        LOG8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOG8ActionPerformed(evt);
            }
        });
        PAINEL3.add(LOG8);
        LOG8.setBounds(340, 290, 70, 65);

        LOG10.setBackground(new java.awt.Color(55, 55, 55));
        LOG10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LOG10.setForeground(new java.awt.Color(153, 153, 153));
        LOG10.setText("Log10");
        LOG10.setMaximumSize(new java.awt.Dimension(45, 23));
        LOG10.setMinimumSize(new java.awt.Dimension(45, 23));
        LOG10.setPreferredSize(new java.awt.Dimension(70, 65));
        LOG10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOG10ActionPerformed(evt);
            }
        });
        PAINEL3.add(LOG10);
        LOG10.setBounds(340, 360, 70, 65);

        LOG16.setBackground(new java.awt.Color(55, 55, 55));
        LOG16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LOG16.setForeground(new java.awt.Color(153, 153, 153));
        LOG16.setText("Log16");
        LOG16.setMaximumSize(new java.awt.Dimension(45, 23));
        LOG16.setMinimumSize(new java.awt.Dimension(45, 23));
        LOG16.setPreferredSize(new java.awt.Dimension(70, 65));
        LOG16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOG16ActionPerformed(evt);
            }
        });
        PAINEL3.add(LOG16);
        LOG16.setBounds(340, 430, 70, 65);

        getContentPane().add(PAINEL3);
        PAINEL3.setBounds(0, 0, 510, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"1");                
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"10");                
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"11");        
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"100");        
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"101");        
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"110");        
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"111");        
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"1000");        
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"1001");        
    }//GEN-LAST:event_BTN9ActionPerformed

    private void BTN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN0ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"0");        
    }//GEN-LAST:event_BTN0ActionPerformed

    private void BTNLIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLIMPARActionPerformed
        // TODO add your handling code here:
        VISOR.setText("");
        SUBVISOR.setText("");        
    }//GEN-LAST:event_BTNLIMPARActionPerformed

    private void NOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOTActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(""+VISOR.getText()+" x");
        operacao="MULTIPLICACAO";        
        vlr_1 = VISOR.getText();
        VISOR.setText("");
        
    }//GEN-LAST:event_NOTActionPerformed

    private void BTNSUBTRACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSUBTRACAOActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(""+VISOR.getText()+" -");
        operacao="SUBTRACAO";                
        vlr_1 = VISOR.getText();
        VISOR.setText("");
    }//GEN-LAST:event_BTNSUBTRACAOActionPerformed

    private void BTNSOMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSOMAActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(""+VISOR.getText()+" +");        
        operacao="SOMA";                
        vlr_1 = VISOR.getText();
        VISOR.setText("");
    }//GEN-LAST:event_BTNSOMAActionPerformed

    private void BTNIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIGUALActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(SUBVISOR.getText()+" "+VISOR.getText());        
        vlr_2 = VISOR.getText();
        
        vlr1 = Integer.parseInt(convert.isBinInt(vlr_1));
        vlr2 = Integer.parseInt(convert.isBinInt(vlr_2));
        
        switch (operacao) {
            case "SOMA":
                resultado = vlr1+vlr2;
                break;
            case "SUBTRACAO":
                resultado = vlr1-vlr2;
                break;
            case "MULTIPLICACAO":
                resultado = vlr1*vlr2;           
                break;
            case "DIVISAO":
                resultado = vlr1/vlr2;
                break;
            case "PERCENTUAL":
                resultado = vlr1*vlr2/100;
                break;
            default:
                break;
        }
                          
         String result = convert.isIntBin(resultado);
         VISOR.setText(""+result);            
    }//GEN-LAST:event_BTNIGUALActionPerformed

    private void BTNEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEXCLUIRActionPerformed
        // TODO add your handling code here:
        String texto = VISOR.getText();
        char caracter = texto.charAt(texto.length()-1);
        String carac=""+caracter;
        texto = texto.replaceAll(carac, "");
        VISOR.setText(texto);
    }//GEN-LAST:event_BTNEXCLUIRActionPerformed

    private void RANDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RANDMouseEntered
        // TODO add your handling code here:
        RAND.setForeground(new java.awt.Color(255,255,255));
        RAND.setToolTipText("Copia valores para conversor de bases");
    }//GEN-LAST:event_RANDMouseEntered

    private void RANDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RANDMouseExited
        // TODO add your handling code here:
        RAND.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_RANDMouseExited

    private void RANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RANDActionPerformed
        // TODO add your handling code here:              
        Random gerador = new Random();
        ViewRandom random = new ViewRandom();           
        int valor = Integer.parseInt(random.LIMITE.getText());       
        VISOR.setText(String.valueOf(gerador.nextInt(valor)));             
    }//GEN-LAST:event_RANDActionPerformed
    
    private void HISTÓRICOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HISTÓRICOMouseEntered
        // TODO add your handling code here:
        HISTÓRICO.setBackground(new java.awt.Color(104,33,102));        
        HISTÓRICO.setToolTipText("Histórico de cálculos anteriores");
    }//GEN-LAST:event_HISTÓRICOMouseEntered

    private void HISTÓRICOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HISTÓRICOMouseExited
        // TODO add your handling code here:
        HISTÓRICO.setBackground(new java.awt.Color(45,45,45));        
    }//GEN-LAST:event_HISTÓRICOMouseExited

    private void BTNEXCLUIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEXCLUIRMouseEntered
        // TODO add your handling code here:
        BTNEXCLUIR.setToolTipText("Exclui");
    }//GEN-LAST:event_BTNEXCLUIRMouseEntered

    private void BTNLIMPARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNLIMPARMouseEntered
        // TODO add your handling code here:
        BTNLIMPAR.setToolTipText("Limpar conteúdos no visor da calculadora");
    }//GEN-LAST:event_BTNLIMPARMouseEntered

    private void BTNMULTIPLICACAO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMULTIPLICACAO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNMULTIPLICACAO1ActionPerformed

    private void BTNDIVISAO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDIVISAO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNDIVISAO1ActionPerformed

    private void ANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANDActionPerformed

    private void ORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ORActionPerformed

    private void XORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XORActionPerformed

    private void TRANSPORTAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRANSPORTAMouseEntered
        // TODO add your handling code here:
        TRANSPORTA.setForeground(new java.awt.Color(255,255,255));
        TRANSPORTA.setToolTipText("Copia valores para conversor.");
    }//GEN-LAST:event_TRANSPORTAMouseEntered

    private void TRANSPORTAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRANSPORTAMouseExited
        // TODO add your handling code here:
        TRANSPORTA.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_TRANSPORTAMouseExited

    private void TRANSPORTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSPORTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRANSPORTAActionPerformed

    private void ASCIIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ASCIIMouseEntered
        // TODO add your handling code here:
        ASCII.setForeground(new java.awt.Color(255,255,255));
        ASCII.setToolTipText("Tabela ASCII");
    }//GEN-LAST:event_ASCIIMouseEntered

    private void ASCIIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ASCIIMouseExited
        // TODO add your handling code here:
        ASCII.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_ASCIIMouseExited

    private void LOG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOG2ActionPerformed

    private void LOG8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOG8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOG8ActionPerformed

    private void LOG10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOG10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOG10ActionPerformed

    private void LOG16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOG16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOG16ActionPerformed
          
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadoraDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadoraDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadoraDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadoraDesenvolvedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {         
            public void run() {
                new ViewCalculadoraDesenvolvedor().setVisible(true);                                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AND;
    private javax.swing.JButton ASCII;
    private javax.swing.JButton BTN0;
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private javax.swing.JButton BTNDIVISAO1;
    private javax.swing.JButton BTNEXCLUIR;
    private javax.swing.JButton BTNIGUAL;
    private javax.swing.JButton BTNLIMPAR;
    private javax.swing.JButton BTNMULTIPLICACAO1;
    private javax.swing.JButton BTNSOMA;
    private javax.swing.JButton BTNSUBTRACAO;
    private javax.swing.JLabel HISTÓRICO;
    private javax.swing.JButton LOG10;
    private javax.swing.JButton LOG16;
    private javax.swing.JButton LOG2;
    private javax.swing.JButton LOG8;
    private javax.swing.JButton NOT;
    private javax.swing.JButton OR;
    private javax.swing.JPanel PAINEL3;
    private javax.swing.JButton RAND;
    private javax.swing.JLabel SUBVISOR;
    private javax.swing.JButton TRANSPORTA;
    private javax.swing.JTextField VISOR;
    private javax.swing.JButton XOR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void View1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
