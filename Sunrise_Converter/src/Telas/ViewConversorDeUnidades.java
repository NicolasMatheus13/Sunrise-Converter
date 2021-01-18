package Telas;

public class ViewConversorDeUnidades extends javax.swing.JFrame {

    ConvertUnidades convert = new ConvertUnidades();
    String selecao;
    int valor;
        
    public ViewConversorDeUnidades() {        
        initComponents();        
        FORMATO1.setText("bit");
        FORMATO2.setText("Byte");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PAINEL4 = new javax.swing.JPanel();
        SELETOR = new javax.swing.JComboBox<>();
        ENTRADA = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        FORMATO2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        FORMATO1 = new javax.swing.JTextPane();
        LIMPAR = new javax.swing.JLabel();
        SAIDA = new javax.swing.JLabel();
        CONVERTER = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de Unidades");
        setLocation(new java.awt.Point(300, 200));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        PAINEL4.setBackground(new java.awt.Color(45, 45, 45));
        PAINEL4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 22, 150), 2));
        PAINEL4.setMinimumSize(new java.awt.Dimension(530, 110));
        PAINEL4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SELETOR.setBackground(new java.awt.Color(55, 55, 55));
        SELETOR.setForeground(new java.awt.Color(204, 204, 204));
        SELETOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bit -> Byte", "bit -> Kilobyte", "bit -> Megabyte", "bit -> Gigabyte", "bit -> Terabyte", "bit -> Petabyte", "bit -> Yotobyte", "Byte -> bit", "Byte -> Kilobyte", "Byte -> Megabyte", "Byte -> Gigabyte", "Byte -> Terabyte", "Byte -> Petabyte", "Byte -> Yotobyte", "Kilobyte -> bit", "Kilobyte -> Byte", "Kilobyte -> Megabyte", "Kilobyte -> Gigabyte", "Kilobyte -> Terabyte", "Kilobyte -> Petabyte", "Kilobyte -> Yotobyte", "Megabyt -> bit", "Megabyte -> Byte", "Megabyte -> Kilobyte", "Megabyte -> Gigabyte", "Megabyte -> Terabyte", "Megabyte -> Petabyte", "Megabyte -> Yotobyte", "Gigabyte ->  bit", "Gigabyte -> Byte", "Gigabyte -> Kilobyte", "Gigabyte -> Megabyte", "Gigabyte -> Terabyte", "Gigabyte -> Petabyte", "Gigabyte -> Yotobyte", "Terabyte -> bit", "Terabyte -> Byte", "Terabyte -> Kilobyte", "Terabyte -> Megabyte", "Terabyte -> Gigabyte", "Terabyte -> Petabyte", "Terabyte -> Hexabyte", "Terabyte -> Yotobyte", "Petabyte -> bit", "Petabyte -> Byte", "Petabyte -> Kilobyte", "Petabyte -> Megabyte", "Petabyte -> Gigabyte", "Petabyte -> Terabyte", "Petabyte -> Hexabyte", "Petabyte -> Yotobyte", "Yotobyte -> bit", "Yotobyte -> Byte", "Yotobyte -> Kilobyte", "Yotobyte -> Megabyte", "Yotobyte -> Gigabyte", "Yotobyte -> Terabyte", "Yotobyte -> Hexabyte", "Yotobyte -> Yotobyte" }));
        SELETOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELETORActionPerformed(evt);
            }
        });
        PAINEL4.add(SELETOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 137, 29));

        ENTRADA.setBackground(new java.awt.Color(55, 55, 55));
        ENTRADA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ENTRADA.setForeground(new java.awt.Color(204, 204, 204));
        ENTRADA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ENTRADA.setCaretColor(new java.awt.Color(255, 255, 255));
        ENTRADA.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PAINEL4.add(ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 197, 30));

        FORMATO2.setEditable(false);
        FORMATO2.setBackground(new java.awt.Color(45, 45, 45));
        FORMATO2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FORMATO2.setForeground(new java.awt.Color(204, 0, 204));
        FORMATO2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        FORMATO2.setMinimumSize(new java.awt.Dimension(20, 25));
        jScrollPane2.setViewportView(FORMATO2);

        PAINEL4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 50, 30));

        jScrollPane3.setForeground(new java.awt.Color(154, 22, 150));

        FORMATO1.setEditable(false);
        FORMATO1.setBackground(new java.awt.Color(45, 45, 45));
        FORMATO1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FORMATO1.setForeground(new java.awt.Color(204, 0, 204));
        FORMATO1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        FORMATO1.setMinimumSize(new java.awt.Dimension(20, 25));
        FORMATO1.setSelectionColor(new java.awt.Color(45, 45, 45));
        jScrollPane3.setViewportView(FORMATO1);

        PAINEL4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 30));

        LIMPAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LIMPAR.setForeground(new java.awt.Color(153, 153, 153));
        LIMPAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-limpar.png"))); // NOI18N
        LIMPAR.setText("Limpar");
        LIMPAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        LIMPAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LIMPAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LIMPARMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LIMPARMousePressed(evt);
            }
        });
        PAINEL4.add(LIMPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 30));

        SAIDA.setBackground(new java.awt.Color(55, 55, 55));
        SAIDA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        SAIDA.setForeground(new java.awt.Color(204, 204, 204));
        SAIDA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SAIDA.setOpaque(true);
        PAINEL4.add(SAIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 180, 30));

        CONVERTER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-converter.png"))); // NOI18N
        CONVERTER.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        CONVERTER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CONVERTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CONVERTERMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CONVERTERMousePressed(evt);
            }
        });
        PAINEL4.add(CONVERTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 30));

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Conversão de unidades de Memória ");
        PAINEL4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("A calculadora possibilita a conversão de diferentes unidades de medida.");
        PAINEL4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAINEL4, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAINEL4, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SELETORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELETORActionPerformed
        // TODO add your handling code here:                
        ENTRADA.setText("");
        SAIDA.setText("");
        selecao = (String)SELETOR.getSelectedItem();    
        switch (selecao) {
            case "bit -> Byte":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("bit");
                FORMATO2.setText("Byte");
            break;                
            case "bit -> Kilobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("bit");
                FORMATO2.setText("KB");
            break;
            case "bit -> Megabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("bit");
                FORMATO2.setText("MB");
            break;            
            case "bit -> Gigabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("bit");
                FORMATO2.setText("GB");
            break;
            case "bit -> Terabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("bit");
                FORMATO2.setText("TB");
            break;
            case "bit -> Petabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("bit");
                FORMATO2.setText("PB");
            break;
            case "bit -> Yotobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("bit");
                FORMATO2.setText("YB");
            break;
            case "Byte -> bit":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("Byte");
                FORMATO2.setText("bit");
            break;                
            case "Byte -> Kilobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("Byte");
                FORMATO2.setText("KB");
            break;
            case "Byte -> Megabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("Byte");
                FORMATO2.setText("MB");
            break;            
            case "Byte -> Gigabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("Byte");
                FORMATO2.setText("GB");
            break;
            case "Byte -> Terabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("Byte");
                FORMATO2.setText("TB");
            break;
            case "Byte -> Petabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("Byte");
                FORMATO2.setText("PB");
            break;
            case "Byte -> Yotobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("Byte");
                FORMATO2.setText("YB");
            break;            
            case "Kilobyte -> bit":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("KB");
                FORMATO2.setText("bit");
            break;                                      
            case "Kilobyte -> Byte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("KB");
                FORMATO2.setText("Byte");
            break;
            case "Kilobyte -> Megabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("KB");
                FORMATO2.setText("MB");
            break;            
            case "Kilobyte -> Gigabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("KB");
                FORMATO2.setText("GB");
            break;
            case "Kilobyte -> Terabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("KB");
                FORMATO2.setText("TB");
            break;
            case "Kilobyte -> Yotobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("KB");
                FORMATO2.setText("YB");
            break;            
            case "Megabyt -> bit":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("MB");
                FORMATO2.setText("bit");
            break;
            case "Megabyte -> Byte":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("MB");
                FORMATO2.setText("Byte");
            break;                
            case "Megabyte -> Kilobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("MB");
                FORMATO2.setText("KB");
            break;
            case "Megabyte -> Gigabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("MB");
                FORMATO2.setText("GB");
            break;            
            case "Megabyte -> Terabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("MB");
                FORMATO2.setText("TB");
            break;
            case "Megabyte -> Petabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("MB");
                FORMATO2.setText("PB");
            break;
            case "Megabyte -> Yotobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("MB");
                FORMATO2.setText("YB");
            break;                                   
            case "Gigabyte ->  bit":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("GB");
                FORMATO2.setText("Byte");
            break;                
            case "Gigabyte -> Byte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("GB");
                FORMATO2.setText("Byte");
            break;
            case "Gigabyte -> Kilobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("GB");
                FORMATO2.setText("KB");
            break;            
            case "Gigabyte -> Megabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("GB");
                FORMATO2.setText("MB");
            break;
            case "Gigabyte -> Terabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("GB");
                FORMATO2.setText("TB");
            break;
            case "Gigabyte -> Petabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("GB");
                FORMATO2.setText("PB");
            break;
            case "Gigabyte -> Yotobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("GB");
                FORMATO2.setText("YB");
            break;          
            case "Terabyte -> bit":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("bit");
            break;                
            case "Terabyte -> Byte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("Byte");
            break;
            case "Terabyte -> Kilobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("KB");
            break;            
            case "Terabyte -> Megabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("MB");
            break;
            case "Terabyte -> Gigabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("GB");
            break;
            case "Terabyte -> Petabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("PB");
            break;
            case "Terabyte -> Hexabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("HB");
            break;            
            case "Terabyte -> Yotobyte":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("TB");
                FORMATO2.setText("YB");
            break;                     
            case "Petabyte -> bit":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("bit");
            break;
            case "Petabyte -> Byte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("Byte");
            break;            
            case "Petabyte -> Kilobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("KB");
            break;
            case "Petabyte -> Megabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("MB");
            break;
            case "Petabyte -> Gigabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("GB");
            break;            
            case "Petabyte -> Terabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("TB");
            break;            
            case "Petabyte -> Hexabyte":
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("HB");
            break;                
            case "Petabyte -> Yotobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("PB");
                FORMATO2.setText("YB");
            break;           
            case "Yotobyte -> bit":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("YB");
                FORMATO2.setText("bit");
            break;            
            case "Yotobyte -> Byte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("YB");
                FORMATO2.setText("Byte");
            break;
            case "Yotobyte -> Kilobyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("YB");
                FORMATO2.setText("KB");
            break;
            case "Yotobyte -> Megabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("YB");
                FORMATO2.setText("MB");
            break;
            case "Yotobyte -> Gigabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("YB");
                FORMATO2.setText("GB");
            break;            
            case "Yotobyte -> Terabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("YB");
                FORMATO2.setText("TB");
            break;
            case "Yotobyte -> Hexabyte":                
                ENTRADA.setText("");
                SAIDA.setText("");
                FORMATO1.setText("YB");
                FORMATO2.setText("HB");
            break;
        }   
    }//GEN-LAST:event_SELETORActionPerformed

    private void LIMPARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPARMousePressed
        // TODO add your handling code here:
        ENTRADA.setText("");
        SAIDA.setText("");
    }//GEN-LAST:event_LIMPARMousePressed

    private void LIMPARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPARMouseEntered
        // TODO add your handling code here: 
        LIMPAR.setToolTipText("Converter");
    }//GEN-LAST:event_LIMPARMouseEntered

    private void CONVERTERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONVERTERMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CONVERTERMouseEntered

    private void CONVERTERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONVERTERMousePressed
        // TODO add your handling code here:
        valor = Integer.parseInt(ENTRADA.getText());
        if (selecao.equals("bit - > Byte")) {
            SAIDA.setText(convert.bitByte(valor)+" Byte");
        } else if (selecao.equals("Byte - > bit")) {
            SAIDA.setText(convert.Bytebit(valor)+" Bit");
        } else if (selecao.equals("bit - > Kilobyte")) {
            SAIDA.setText(convert.bitKilo(valor)+" Kilobyte");
        }
    }//GEN-LAST:event_CONVERTERMousePressed

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
            java.util.logging.Logger.getLogger(ViewConversorDeUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConversorDeUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConversorDeUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConversorDeUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewConversorDeUnidades().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CONVERTER;
    private javax.swing.JTextField ENTRADA;
    private javax.swing.JTextPane FORMATO1;
    private javax.swing.JTextPane FORMATO2;
    private javax.swing.JLabel LIMPAR;
    private javax.swing.JPanel PAINEL4;
    private javax.swing.JLabel SAIDA;
    private javax.swing.JComboBox<String> SELETOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
