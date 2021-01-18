package Telas;

import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewSplashScreen extends javax.swing.JFrame {

    public ViewSplashScreen() {
        initComponents();
        setIcon(); 
        
        new Thread() {
            @Override
            public void run() {
                for(int i=0; i<110; i++) {
                    try {
                        sleep(40);
                        CARREGANDO.setValue(i);
                        
                        if (CARREGANDO.getValue()<=15) {
                            STATUS.setText("Importando classes");
                        } else if (CARREGANDO.getValue()<=20) { 
                            STATUS.setText("Importando objetos");                            
                        } else if (CARREGANDO.getValue()<=30) {                                                         
                            STATUS.setText("Importando métodos");                            
                        } else if (CARREGANDO.getValue()==35) {
                            Thread.sleep(500);
                        } else if (CARREGANDO.getValue()<=35) {                             
                            STATUS.setText("Carregando arquivos");
                        } else if (CARREGANDO.getValue()<=40) { 
                            STATUS.setText("Carregando arquivos.");
                        } else if (CARREGANDO.getValue()<=50) { 
                            STATUS.setText("Carregando arquivos..");
                        } else if (CARREGANDO.getValue()<=60) { 
                            STATUS.setText("Carregando arquivos...");
                        } else if (CARREGANDO.getValue()<=65) { 
                            STATUS.setText("Inicializando variáveis");
                        } else if (CARREGANDO.getValue()<=73) { 
                            STATUS.setText("Construindo interface");
                        } else if (CARREGANDO.getValue()<=87) { 
                            STATUS.setText("Carregando");
                        } else if (CARREGANDO.getValue()<=90) { 
                            STATUS.setText("Carregando.");
                        } else if (CARREGANDO.getValue()<=93) { 
                            STATUS.setText("Carregando..");
                        } else if (CARREGANDO.getValue()<=96) { 
                            STATUS.setText("Carregando...");
                        } else if (CARREGANDO.getValue()<=101) { 
                            STATUS.setText("Carregando.");
                        } else if (CARREGANDO.getValue()==104) {
                            Thread.sleep(500);
                            STATUS.setText("Carregando..");
                        } else if (CARREGANDO.getValue()<=107) {
                            STATUS.setText("Carregando..");                            
                        }                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ViewSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }                                                 
                new View1().setVisible(true);                
                dispose();
            }                                    
        }.start();                     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SPLASH = new javax.swing.JPanel();
        CARREGANDO = new javax.swing.JProgressBar();
        STATUS = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setUndecorated(true);

        SPLASH.setBackground(new java.awt.Color(230, 233, 232));
        SPLASH.setPreferredSize(new java.awt.Dimension(589, 420));

        CARREGANDO.setBackground(new java.awt.Color(230, 233, 232));
        CARREGANDO.setForeground(new java.awt.Color(154, 22, 150));
        CARREGANDO.setBorderPainted(false);
        CARREGANDO.setMinimumSize(new java.awt.Dimension(10, 10));

        STATUS.setForeground(new java.awt.Color(51, 51, 51));
        STATUS.setText("Carregando...");
        STATUS.setPreferredSize(new java.awt.Dimension(34, 67));

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Splash.png"))); // NOI18N

        javax.swing.GroupLayout SPLASHLayout = new javax.swing.GroupLayout(SPLASH);
        SPLASH.setLayout(SPLASHLayout);
        SPLASHLayout.setHorizontalGroup(
            SPLASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
            .addGroup(SPLASHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
            .addComponent(CARREGANDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SPLASHLayout.setVerticalGroup(
            SPLASHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPLASHLayout.createSequentialGroup()
                .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CARREGANDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SPLASH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SPLASH, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */                  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewSplashScreen().setVisible(true);                                                
            }
        });
    }  

    private void setIcon() {
         URL caminhoImagem = this.getClass().getClassLoader().getResource("imagens/LOGO1.png");
         Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
         setIconImage(iconeTitulo);
    }        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JProgressBar CARREGANDO;
    private javax.swing.JPanel SPLASH;
    private javax.swing.JLabel STATUS;
    // End of variables declaration//GEN-END:variables
}
