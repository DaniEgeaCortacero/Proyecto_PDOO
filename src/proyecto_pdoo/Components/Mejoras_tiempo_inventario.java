package proyecto_pdoo.Components;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import proyecto_pdoo.Mejoras;
import proyecto_pdoo.Vista;

/**
 *
 * @author forza
 */
public class Mejoras_tiempo_inventario extends javax.swing.JPanel {

    private int precio;
    
    /**
     * Creates new form Upgrades_buy
     */
    public Mejoras_tiempo_inventario(String nombre, String descripcion, int precio) {
        initComponents();
        label_nombre.setText(nombre);
        label_descripcion.setText(descripcion);
        this.precio = precio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nombre = new javax.swing.JLabel();
        boton_vender = new javax.swing.JButton();
        panel_descripcion = new javax.swing.JPanel();
        label_descripcion = new javax.swing.JLabel();
        boton_pausar = new javax.swing.JButton();
        boton_reanudar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(431, 142));

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nombre.setText("NAME");

        boton_vender.setBackground(new java.awt.Color(255, 0, 0));
        boton_vender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_vender.setForeground(new java.awt.Color(255, 255, 255));
        boton_vender.setText("VENDER");
        boton_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_venderActionPerformed(evt);
            }
        });

        panel_descripcion.setLayout(new java.awt.CardLayout());

        label_descripcion.setText("Description");
        label_descripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel_descripcion.add(label_descripcion, "card2");

        boton_pausar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_pausar.setText("PAUSAR");
        boton_pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pausarActionPerformed(evt);
            }
        });

        boton_reanudar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_reanudar.setText("REANUDAR");
        boton_reanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reanudarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(boton_pausar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(boton_reanudar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_vender, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_vender)
                    .addComponent(boton_pausar)
                    .addComponent(boton_reanudar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_venderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_venderActionPerformed

    private void boton_pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pausarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_pausarActionPerformed

    private void boton_reanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reanudarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reanudarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_pausar;
    private javax.swing.JButton boton_reanudar;
    private javax.swing.JButton boton_vender;
    private javax.swing.JLabel label_descripcion;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JPanel panel_descripcion;
    // End of variables declaration//GEN-END:variables

    //------------------------------GETTERS Y SETTERS-----------------------------------
    
    //-----Boton vender
    
    public JButton getBoton_vender() {
        return boton_vender;
    }

    public void setBoton_vender(JButton boton_comprar) {
        this.boton_vender = boton_comprar;
    }
    
    
    //-----Boton pausar

    public JButton getBoton_pausar() {
        return boton_pausar;
    }

    public void setBoton_pausar(JButton boton_pausar) {
        this.boton_pausar = boton_pausar;
    }

    
    //-----Boton reanudar
    
    public JButton getBoton_reanudar() {
        return boton_reanudar;
    }

    public void setBoton_reanudar(JButton boton_reanudar) {
        this.boton_reanudar = boton_reanudar;
    }
    

    //-----Label descripcion
    
    public JLabel getLabel_descripcion() {
        return label_descripcion;
    }

    public void setLabel_descripcion(JLabel label_descripcion) {
        this.label_descripcion = label_descripcion;
    }

    
    //-----Label nombre
    
    public JLabel getLabel_nombre() {
        return label_nombre;
    }

    public void setLabel_nombre(JLabel label_nombre) {
        this.label_nombre = label_nombre;
    }

    
    //-----Panel descripcion
    
    public JPanel getPanel_descripcion() {
        return panel_descripcion;
    }

    public void setPanel_descripcion(JPanel panel_descripcion) {
        this.panel_descripcion = panel_descripcion;
    }

    
    
}
