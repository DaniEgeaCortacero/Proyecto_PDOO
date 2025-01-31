package proyecto_pdoo;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import proyecto_pdoo.Components.*;

/**
 *
 * @author forza
 */
public class Vista extends javax.swing.JFrame {
    
    private ObjetoClicker obj;
    
    /**
     * Creates new form Vista
     */
    public Vista(ObjetoClicker obj) {
        initComponents();
        this.obj = obj;
        
        setButtonClicker();
        setjLabelCoins();
        setjLabelExp();
        setjLabelExpClick();
        setjLabelCoinsClick();
        loadUpgrades();
        reloadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Generic = new javax.swing.JPanel();
        panel_Data = new javax.swing.JPanel();
        label_coins = new javax.swing.JLabel();
        label_coins_image = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        label_level = new javax.swing.JLabel();
        label_maxExp = new javax.swing.JLabel();
        label_minExp = new javax.swing.JLabel();
        label_exp = new javax.swing.JLabel();
        label_exp_image = new javax.swing.JLabel();
        label_coinsClick_image = new javax.swing.JLabel();
        label_expClick = new javax.swing.JLabel();
        label_expClick_image = new javax.swing.JLabel();
        label_coinsClick = new javax.swing.JLabel();
        panel_Upgrades = new javax.swing.JPanel();
        panel_Game = new javax.swing.JPanel();
        panel_Clicker = new javax.swing.JPanel();
        button_Clicker = new javax.swing.JButton();
        panel_Inventory = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clicker_PDOO");

        panel_Generic.setLayout(new java.awt.BorderLayout());

        panel_Data.setBackground(new java.awt.Color(255, 255, 255));
        panel_Data.setPreferredSize(new java.awt.Dimension(1014, 118));

        label_coins.setFont(new java.awt.Font("Unispace", 0, 20)); // NOI18N
        label_coins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_coins.setText("0");
        label_coins.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label_coins.setPreferredSize(new java.awt.Dimension(50, 16));

        label_coins_image.setText("Img coins");

        label_level.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label_level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_level.setText("0");
        label_level.setToolTipText("");

        label_maxExp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_maxExp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_maxExp.setText("120");

        label_minExp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_minExp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_minExp.setText("0");

        label_exp.setFont(new java.awt.Font("Unispace", 0, 20)); // NOI18N
        label_exp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exp.setText("0");
        label_exp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label_exp.setPreferredSize(new java.awt.Dimension(50, 16));

        label_exp_image.setText("Img exp");

        label_coinsClick_image.setText("Img expClick");

        label_expClick.setFont(new java.awt.Font("Unispace", 0, 20)); // NOI18N
        label_expClick.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_expClick.setText("0");

        label_expClick_image.setText("Img expClick");

        label_coinsClick.setFont(new java.awt.Font("Unispace", 0, 20)); // NOI18N
        label_coinsClick.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_coinsClick.setText("0");

        javax.swing.GroupLayout panel_DataLayout = new javax.swing.GroupLayout(panel_Data);
        panel_Data.setLayout(panel_DataLayout);
        panel_DataLayout.setHorizontalGroup(
            panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DataLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label_coins_image, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DataLayout.createSequentialGroup()
                        .addComponent(label_coinsClick_image, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_coinsClick, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addComponent(label_coins, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_DataLayout.createSequentialGroup()
                        .addComponent(label_minExp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_maxExp, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addComponent(progress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DataLayout.createSequentialGroup()
                        .addComponent(label_exp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(panel_DataLayout.createSequentialGroup()
                        .addComponent(label_expClick, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(label_expClick_image, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(label_exp_image, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_DataLayout.setVerticalGroup(
            panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DataLayout.createSequentialGroup()
                        .addComponent(label_coins_image, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DataLayout.createSequentialGroup()
                        .addComponent(label_exp_image, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DataLayout.createSequentialGroup()
                        .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_expClick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_coinsClick, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label_expClick_image, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_coinsClick_image, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(label_coins, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(label_exp, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(panel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_maxExp)
                            .addComponent(label_minExp))
                        .addContainerGap())))
        );

        panel_Generic.add(panel_Data, java.awt.BorderLayout.PAGE_START);

        panel_Upgrades.setBackground(new java.awt.Color(51, 204, 255));
        panel_Upgrades.setMinimumSize(new java.awt.Dimension(1167, 100));
        panel_Upgrades.setLayout(new java.awt.GridLayout(1, 4));
        panel_Generic.add(panel_Upgrades, java.awt.BorderLayout.PAGE_END);

        panel_Game.setBackground(new java.awt.Color(255, 255, 255));
        panel_Game.setLayout(new javax.swing.BoxLayout(panel_Game, javax.swing.BoxLayout.LINE_AXIS));

        panel_Clicker.setBackground(new java.awt.Color(204, 255, 204));
        panel_Clicker.setMaximumSize(new java.awt.Dimension(900, 32767));
        panel_Clicker.setPreferredSize(new java.awt.Dimension(400, 405));
        panel_Clicker.setLayout(new java.awt.GridBagLayout());

        button_Clicker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/ButtonClicker.png"))); // NOI18N
        button_Clicker.setBorderPainted(false);
        button_Clicker.setContentAreaFilled(false);
        button_Clicker.setMaximumSize(new java.awt.Dimension(1000, 1000));
        button_Clicker.setMinimumSize(new java.awt.Dimension(200, 200));
        button_Clicker.setPreferredSize(new java.awt.Dimension(400, 400));
        button_Clicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ClickerActionPerformed(evt);
            }
        });
        panel_Clicker.add(button_Clicker, new java.awt.GridBagConstraints());
        button_Clicker.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                ImageIcon icon = new ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/ButtonClicker2.png"));
                int ancho = button_Clicker.getWidth();
                int alto = button_Clicker.getHeight();
                ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
                button_Clicker.setIcon(icono);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                ImageIcon icon = new ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/ButtonClicker.png"));
                int ancho = button_Clicker.getWidth();
                int alto = button_Clicker.getHeight();
                ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
                button_Clicker.setIcon(icono);
            }
        });

        panel_Game.add(panel_Clicker);

        panel_Inventory.setBackground(new java.awt.Color(255, 255, 255));
        panel_Inventory.setMaximumSize(new java.awt.Dimension(400, 32767));

        javax.swing.GroupLayout panel_InventoryLayout = new javax.swing.GroupLayout(panel_Inventory);
        panel_Inventory.setLayout(panel_InventoryLayout);
        panel_InventoryLayout.setHorizontalGroup(
            panel_InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        panel_InventoryLayout.setVerticalGroup(
            panel_InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        panel_Game.add(panel_Inventory);

        panel_Generic.add(panel_Game, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel_Generic, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ClickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ClickerActionPerformed
       
        obj.doClick();
        
        reloadData();
        progress.setValue(obj.getExp().getnExp());
        
    }//GEN-LAST:event_button_ClickerActionPerformed

    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vista().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Clicker;
    private javax.swing.JLabel label_coins;
    private javax.swing.JLabel label_coinsClick;
    private javax.swing.JLabel label_coinsClick_image;
    private javax.swing.JLabel label_coins_image;
    private javax.swing.JLabel label_exp;
    private javax.swing.JLabel label_expClick;
    private javax.swing.JLabel label_expClick_image;
    private javax.swing.JLabel label_exp_image;
    private javax.swing.JLabel label_level;
    private javax.swing.JLabel label_maxExp;
    private javax.swing.JLabel label_minExp;
    private javax.swing.JPanel panel_Clicker;
    private javax.swing.JPanel panel_Data;
    private javax.swing.JPanel panel_Game;
    private javax.swing.JPanel panel_Generic;
    private javax.swing.JPanel panel_Inventory;
    private javax.swing.JPanel panel_Upgrades;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables

    
    
    /**
     * Este método redimensiona la imagen del botón clicker.
     */
    private void setButtonClicker(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/ButtonClicker.png"));
        int ancho = button_Clicker.getWidth();
        int alto = button_Clicker.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        button_Clicker.setIcon(icono);
    }
    
    
    /**
     * Este método redimensiona la imagen de las monedas.
     */
    private void setjLabelCoins(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/amountCoins.png"));
        int ancho = label_coins_image.getWidth();
        int alto = label_coins_image.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        label_coins_image.setIcon(icono);
    }
    
    /**
     * Este método redimensiona la imagen de la experiencia.
     */
    private void setjLabelExp(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/experiencia.png"));
        int ancho = label_exp_image.getWidth();
        int alto = label_exp_image.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        label_exp_image.setIcon(icono);
    }
    
    /**
     * Este método redimensiona la imagen de la experiencia por clic.
     */
    private void setjLabelExpClick(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/expClick.png"));
        int ancho = label_expClick_image.getWidth();
        int alto = label_expClick_image.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        label_expClick_image.setIcon(icono);
    }
    
    /**
     * Este método redimensiona la imagen de las monedas por clic.
     */
    private void setjLabelCoinsClick(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/proyecto_pdoo/Resources/coinsClick.png"));
        int ancho = label_coinsClick_image.getWidth();
        int alto = label_coinsClick_image.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        label_coinsClick_image.setIcon(icono);
    }
    
    
    /**
     * Carga las mejoras en el panel Upgrades.
     */
    private void loadUpgrades(){
        List<Mejoras> mejoras = obj.getMejoras();
        for(Mejoras mejora : mejoras){
            Mejoras_compra item = new Mejoras_compra(mejora, this);
            this.panel_Upgrades.add(item);
            item.setVisible(true);
        }
        this.panel_Upgrades.validate();
        this.panel_Upgrades.repaint();
        this.panel_Upgrades.setVisible(true);
        this.validate();
        this.repaint();
    }
    
    /**
     * Recarga los datos del panel datos.
     */
    public void reloadData(){ //Clase Vista
        
        //--------Experiencia y nivel
        
        label_minExp.setText(obj.getExp().getExpLevel()+"");
        label_maxExp.setText(obj.getExp().getExpNextLevel()+"");
        label_level.setText(obj.getExp().getLevel()+"");
        progress.setMinimum(obj.getExp().getExpLevel());
        progress.setMaximum(obj.getExp().getExpNextLevel());
        
        label_exp.setText(obj.getExp().getnExp()+"");
        label_expClick.setText(obj.getExp().getnExpClick()+"");
        
        //--------Monedas
        
        label_coins.setText(""+obj.getMonedas().getCoins());
        label_coinsClick.setText(""+obj.getMonedas().getCoinsClick());
        
        this.getGraphics();
        this.repaint();
    }
    
    public JPanel getPanelInventory(){
        return this.panel_Inventory;
    }
}
