package Telas;

public class ViewCalculadoraUsuario extends javax.swing.JFrame {

    View1 view = new View1();    
    
    public ViewCalculadoraUsuario() {
        initComponents();
    }

    String operacao;
    double vlr_1, vlr_2, resultado;
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
        BTNVIRGULA = new javax.swing.JButton();
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
        BTNDIVISAO = new javax.swing.JButton();
        BTNMULTIPLICACAO = new javax.swing.JButton();
        BTNPERCENTUAL = new javax.swing.JButton();
        BTNRAIZ = new javax.swing.JButton();
        BTNPOTENCIA = new javax.swing.JButton();
        BTNEXCLUIR = new javax.swing.JButton();
        MODO_DESENVOLVEDOR = new javax.swing.JButton();
        TRANSPORTA = new javax.swing.JButton();
        SUBVISOR = new javax.swing.JLabel();
        VISOR = new javax.swing.JTextField();
        HISTÓRICO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora do Usuário");
        setLocation(new java.awt.Point(300, 50));
        setMinimumSize(new java.awt.Dimension(340, 600));
        setPreferredSize(new java.awt.Dimension(305, 610));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        PAINEL3.setBackground(new java.awt.Color(45, 45, 45));
        PAINEL3.setPreferredSize(new java.awt.Dimension(70, 75));
        PAINEL3.setLayout(null);

        BTNLIMPAR.setBackground(new java.awt.Color(55, 55, 55));
        BTNLIMPAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNLIMPAR.setForeground(new java.awt.Color(153, 153, 153));
        BTNLIMPAR.setText("CE");
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
        BTNLIMPAR.setBounds(14, 486, 70, 65);

        BTN3.setBackground(new java.awt.Color(55, 55, 55));
        BTN3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN3.setForeground(new java.awt.Color(153, 153, 153));
        BTN3.setText("3");
        BTN3.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN3);
        BTN3.setBounds(166, 415, 70, 65);

        BTN0.setBackground(new java.awt.Color(55, 55, 55));
        BTN0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN0.setForeground(new java.awt.Color(153, 153, 153));
        BTN0.setText("0");
        BTN0.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN0ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN0);
        BTN0.setBounds(90, 486, 70, 65);

        BTNIGUAL.setBackground(new java.awt.Color(55, 55, 55));
        BTNIGUAL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNIGUAL.setForeground(new java.awt.Color(153, 153, 153));
        BTNIGUAL.setText("=");
        BTNIGUAL.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIGUALActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNIGUAL);
        BTNIGUAL.setBounds(242, 486, 70, 65);

        BTNVIRGULA.setBackground(new java.awt.Color(55, 55, 55));
        BTNVIRGULA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNVIRGULA.setForeground(new java.awt.Color(153, 153, 153));
        BTNVIRGULA.setText(",");
        BTNVIRGULA.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNVIRGULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVIRGULAActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNVIRGULA);
        BTNVIRGULA.setBounds(166, 486, 70, 65);

        BTN1.setBackground(new java.awt.Color(55, 55, 55));
        BTN1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN1.setForeground(new java.awt.Color(153, 153, 153));
        BTN1.setText("1");
        BTN1.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN1);
        BTN1.setBounds(14, 415, 70, 65);

        BTN2.setBackground(new java.awt.Color(55, 55, 55));
        BTN2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN2.setForeground(new java.awt.Color(153, 153, 153));
        BTN2.setText("2");
        BTN2.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN2);
        BTN2.setBounds(90, 415, 70, 65);

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
        BTNSOMA.setBounds(242, 415, 70, 65);

        BTN7.setBackground(new java.awt.Color(55, 55, 55));
        BTN7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN7.setForeground(new java.awt.Color(153, 153, 153));
        BTN7.setText("7");
        BTN7.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN7);
        BTN7.setBounds(14, 273, 70, 65);

        BTN4.setBackground(new java.awt.Color(55, 55, 55));
        BTN4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN4.setForeground(new java.awt.Color(153, 153, 153));
        BTN4.setText("4");
        BTN4.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN4);
        BTN4.setBounds(14, 344, 70, 65);

        BTN5.setBackground(new java.awt.Color(55, 55, 55));
        BTN5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN5.setForeground(new java.awt.Color(153, 153, 153));
        BTN5.setText("5");
        BTN5.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN5);
        BTN5.setBounds(90, 344, 70, 65);

        BTN8.setBackground(new java.awt.Color(55, 55, 55));
        BTN8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN8.setForeground(new java.awt.Color(153, 153, 153));
        BTN8.setText("8");
        BTN8.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN8);
        BTN8.setBounds(90, 273, 70, 65);

        BTN9.setBackground(new java.awt.Color(55, 55, 55));
        BTN9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN9.setForeground(new java.awt.Color(153, 153, 153));
        BTN9.setText("9");
        BTN9.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN9);
        BTN9.setBounds(166, 273, 70, 65);

        BTN6.setBackground(new java.awt.Color(55, 55, 55));
        BTN6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN6.setForeground(new java.awt.Color(153, 153, 153));
        BTN6.setText("6");
        BTN6.setPreferredSize(new java.awt.Dimension(70, 65));
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        PAINEL3.add(BTN6);
        BTN6.setBounds(166, 344, 70, 65);

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
        BTNSUBTRACAO.setBounds(242, 344, 70, 65);

        BTNDIVISAO.setBackground(new java.awt.Color(55, 55, 55));
        BTNDIVISAO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNDIVISAO.setForeground(new java.awt.Color(153, 153, 153));
        BTNDIVISAO.setText("/");
        BTNDIVISAO.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNDIVISAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDIVISAOActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNDIVISAO);
        BTNDIVISAO.setBounds(242, 273, 70, 65);

        BTNMULTIPLICACAO.setBackground(new java.awt.Color(55, 55, 55));
        BTNMULTIPLICACAO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNMULTIPLICACAO.setForeground(new java.awt.Color(153, 153, 153));
        BTNMULTIPLICACAO.setText("*");
        BTNMULTIPLICACAO.setMaximumSize(new java.awt.Dimension(45, 23));
        BTNMULTIPLICACAO.setMinimumSize(new java.awt.Dimension(45, 23));
        BTNMULTIPLICACAO.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNMULTIPLICACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMULTIPLICACAOActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNMULTIPLICACAO);
        BTNMULTIPLICACAO.setBounds(242, 207, 70, 60);

        BTNPERCENTUAL.setBackground(new java.awt.Color(55, 55, 55));
        BTNPERCENTUAL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNPERCENTUAL.setForeground(new java.awt.Color(153, 153, 153));
        BTNPERCENTUAL.setText("%");
        BTNPERCENTUAL.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNPERCENTUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPERCENTUALActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNPERCENTUAL);
        BTNPERCENTUAL.setBounds(166, 207, 70, 60);

        BTNRAIZ.setBackground(new java.awt.Color(55, 55, 55));
        BTNRAIZ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNRAIZ.setForeground(new java.awt.Color(153, 153, 153));
        BTNRAIZ.setText("√");
        BTNRAIZ.setMaximumSize(new java.awt.Dimension(45, 23));
        BTNRAIZ.setMinimumSize(new java.awt.Dimension(45, 23));
        BTNRAIZ.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNRAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRAIZActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNRAIZ);
        BTNRAIZ.setBounds(90, 207, 70, 60);

        BTNPOTENCIA.setBackground(new java.awt.Color(55, 55, 55));
        BTNPOTENCIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNPOTENCIA.setForeground(new java.awt.Color(153, 153, 153));
        BTNPOTENCIA.setText("X²");
        BTNPOTENCIA.setPreferredSize(new java.awt.Dimension(70, 65));
        BTNPOTENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPOTENCIAActionPerformed(evt);
            }
        });
        PAINEL3.add(BTNPOTENCIA);
        BTNPOTENCIA.setBounds(14, 207, 70, 60);

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
        BTNEXCLUIR.setBounds(10, 160, 70, 35);

        MODO_DESENVOLVEDOR.setBackground(new java.awt.Color(45, 45, 45));
        MODO_DESENVOLVEDOR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MODO_DESENVOLVEDOR.setForeground(new java.awt.Color(204, 204, 204));
        MODO_DESENVOLVEDOR.setText("</>");
        MODO_DESENVOLVEDOR.setBorderPainted(false);
        MODO_DESENVOLVEDOR.setContentAreaFilled(false);
        MODO_DESENVOLVEDOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MODO_DESENVOLVEDOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MODO_DESENVOLVEDORMouseEntered(evt);
            }
        });
        MODO_DESENVOLVEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODO_DESENVOLVEDORActionPerformed(evt);
            }
        });
        PAINEL3.add(MODO_DESENVOLVEDOR);
        MODO_DESENVOLVEDOR.setBounds(90, 160, 70, 35);

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
        TRANSPORTA.setBounds(170, 160, 70, 35);

        SUBVISOR.setBackground(new java.awt.Color(38, 38, 38));
        SUBVISOR.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        SUBVISOR.setForeground(new java.awt.Color(204, 204, 204));
        SUBVISOR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SUBVISOR.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(154, 22, 150)), javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(38, 38, 38))));
        SUBVISOR.setOpaque(true);
        PAINEL3.add(SUBVISOR);
        SUBVISOR.setBounds(10, 30, 298, 50);

        VISOR.setEditable(false);
        VISOR.setBackground(new java.awt.Color(38, 38, 38));
        VISOR.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        VISOR.setForeground(new java.awt.Color(204, 204, 204));
        VISOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        VISOR.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(154, 22, 150)), javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(38, 38, 38))));
        VISOR.setDisabledTextColor(new java.awt.Color(38, 38, 38));
        PAINEL3.add(VISOR);
        VISOR.setBounds(10, 70, 298, 80);

        HISTÓRICO.setBackground(new java.awt.Color(45, 45, 45));
        HISTÓRICO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/histórico-ícone.png"))); // NOI18N
        HISTÓRICO.setOpaque(true);
        HISTÓRICO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HISTÓRICOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HISTÓRICOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HISTÓRICOMouseExited(evt);
            }
        });
        PAINEL3.add(HISTÓRICO);
        HISTÓRICO.setBounds(260, 160, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAINEL3, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAINEL3, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"1");        
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"2");        
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"3");
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"4");
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"5");
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"6");
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"7");
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"8");
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+"9");
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

    private void BTNVIRGULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVIRGULAActionPerformed
        // TODO add your handling code here:
        VISOR.setText(VISOR.getText()+".");        
    }//GEN-LAST:event_BTNVIRGULAActionPerformed

    private void BTNMULTIPLICACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMULTIPLICACAOActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(""+VISOR.getText()+" x");
        operacao="MULTIPLICACAO";        
        vlr_1 = Double.parseDouble(VISOR.getText());
        VISOR.setText("");
        
    }//GEN-LAST:event_BTNMULTIPLICACAOActionPerformed

    private void BTNDIVISAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDIVISAOActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(""+VISOR.getText()+" /");
        operacao="DIVISAO";                
        vlr_1 = Double.parseDouble(VISOR.getText());        
        VISOR.setText("");
    }//GEN-LAST:event_BTNDIVISAOActionPerformed

    private void BTNSUBTRACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSUBTRACAOActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(""+VISOR.getText()+" -");
        operacao="SUBTRACAO";                
        vlr_1 = Double.parseDouble(VISOR.getText());        
        VISOR.setText("");
    }//GEN-LAST:event_BTNSUBTRACAOActionPerformed

    private void BTNSOMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSOMAActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(""+VISOR.getText()+" +");        
        operacao="SOMA";                
        vlr_1 = Double.parseDouble(VISOR.getText());        
        VISOR.setText("");
    }//GEN-LAST:event_BTNSOMAActionPerformed

    private void BTNIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIGUALActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText(SUBVISOR.getText()+" "+VISOR.getText());
        
        vlr_2 = Double.parseDouble(VISOR.getText());        
        switch (operacao) {
            case "SOMA":
                resultado = vlr_1+vlr_2;
                break;
            case "SUBTRACAO":
                resultado = vlr_1-vlr_2;
                break;
            case "MULTIPLICACAO":
                resultado = vlr_1*vlr_2;           
                break;
            case "DIVISAO":
                resultado = vlr_1/vlr_2;
                break;
            case "PERCENTUAL":
                resultado = vlr_1*vlr_2/100;
                break;
            default:
                break;
        }
        
         VISOR.setText(""+resultado);            
    }//GEN-LAST:event_BTNIGUALActionPerformed

    private void BTNPERCENTUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPERCENTUALActionPerformed
        // TODO add your handling code here:        
        SUBVISOR.setText(VISOR.getText()+"%");        
        operacao="PERCENTUAL";
        vlr_1 = Double.parseDouble(VISOR.getText()); 
        VISOR.setText("");
    }//GEN-LAST:event_BTNPERCENTUALActionPerformed

    private void BTNRAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRAIZActionPerformed
        // TODO add your handling code here 
        SUBVISOR.setText("");
        SUBVISOR.setText("√"+VISOR.getText());        
        vlr_1 = Double.parseDouble(VISOR.getText());
        resultado = Math.sqrt(vlr_1);
        VISOR.setText("");
        VISOR.setText(""+resultado);              
    }//GEN-LAST:event_BTNRAIZActionPerformed

    private void BTNPOTENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPOTENCIAActionPerformed
        // TODO add your handling code here:
        SUBVISOR.setText("");
        SUBVISOR.setText(VISOR.getText()+"²");        
        vlr_1 = Double.parseDouble(VISOR.getText());
        resultado = Math.pow(vlr_1, 2);
        VISOR.setText("");        
        VISOR.setText(""+resultado);                      
    }//GEN-LAST:event_BTNPOTENCIAActionPerformed

    private void BTNEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEXCLUIRActionPerformed
        // TODO add your handling code here:
        String texto = VISOR.getText();
        char caracter = texto.charAt(texto.length()-1);
        String carac=""+caracter;
        texto = texto.replaceAll(carac, "");
        VISOR.setText(texto);
    }//GEN-LAST:event_BTNEXCLUIRActionPerformed

    private void MODO_DESENVOLVEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODO_DESENVOLVEDORActionPerformed
        // TODO add your handling code here:
        new ViewCalculadoraDesenvolvedor().setVisible(true);
    }//GEN-LAST:event_MODO_DESENVOLVEDORActionPerformed

    private void TRANSPORTAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRANSPORTAMouseEntered
        // TODO add your handling code here:
        TRANSPORTA.setForeground(new java.awt.Color(255,255,255));
        TRANSPORTA.setToolTipText("Copia valores para conversor de bases");
    }//GEN-LAST:event_TRANSPORTAMouseEntered

    private void TRANSPORTAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRANSPORTAMouseExited
        // TODO add your handling code here:
        TRANSPORTA.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_TRANSPORTAMouseExited

    private void TRANSPORTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSPORTAActionPerformed
        // TODO add your handling code here:                                
        view.TransportaPalavra(this, VISOR.getText());        
    }//GEN-LAST:event_TRANSPORTAActionPerformed

    private void HISTÓRICOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HISTÓRICOMouseClicked
        // TODO add your handling code here:        
        
    }//GEN-LAST:event_HISTÓRICOMouseClicked

    private void HISTÓRICOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HISTÓRICOMouseEntered
        // TODO add your handling code here:
        HISTÓRICO.setBackground(new java.awt.Color(104,33,102));        
        HISTÓRICO.setToolTipText("Histórico de cálculos anteriores");
    }//GEN-LAST:event_HISTÓRICOMouseEntered

    private void HISTÓRICOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HISTÓRICOMouseExited
        // TODO add your handling code here:
        HISTÓRICO.setBackground(new java.awt.Color(45,45,45));        
    }//GEN-LAST:event_HISTÓRICOMouseExited

    private void MODO_DESENVOLVEDORMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODO_DESENVOLVEDORMouseEntered
        // TODO add your handling code here:
        MODO_DESENVOLVEDOR.setToolTipText("Modo desenvolvedor");
    }//GEN-LAST:event_MODO_DESENVOLVEDORMouseEntered

    private void BTNEXCLUIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEXCLUIRMouseEntered
        // TODO add your handling code here:
        BTNEXCLUIR.setToolTipText("Exclui");
    }//GEN-LAST:event_BTNEXCLUIRMouseEntered

    private void BTNLIMPARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNLIMPARMouseEntered
        // TODO add your handling code here:
        BTNLIMPAR.setToolTipText("Limpar conteúdos no visor da calculadora");
    }//GEN-LAST:event_BTNLIMPARMouseEntered

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
            java.util.logging.Logger.getLogger(ViewCalculadoraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadoraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadoraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadoraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCalculadoraUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton BTNDIVISAO;
    private javax.swing.JButton BTNEXCLUIR;
    private javax.swing.JButton BTNIGUAL;
    private javax.swing.JButton BTNLIMPAR;
    private javax.swing.JButton BTNMULTIPLICACAO;
    private javax.swing.JButton BTNPERCENTUAL;
    private javax.swing.JButton BTNPOTENCIA;
    private javax.swing.JButton BTNRAIZ;
    private javax.swing.JButton BTNSOMA;
    private javax.swing.JButton BTNSUBTRACAO;
    private javax.swing.JButton BTNVIRGULA;
    private javax.swing.JLabel HISTÓRICO;
    private javax.swing.JButton MODO_DESENVOLVEDOR;
    private javax.swing.JPanel PAINEL3;
    private javax.swing.JLabel SUBVISOR;
    private javax.swing.JButton TRANSPORTA;
    private javax.swing.JTextField VISOR;
    // End of variables declaration//GEN-END:variables

    private void View1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
