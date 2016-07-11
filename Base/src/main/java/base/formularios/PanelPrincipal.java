package base.formularios;

import base.utilidades.Utils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Paché
 */
public class PanelPrincipal extends JFrame {

    private static final Logger log = Logger.getLogger(PanelPrincipal.class);

    public PanelPrincipal() {
        initComponents();
    }

    private void preferencias() {
//        this.getContentPane().removeAll();
//        this.add(new PanelPreferencias());
//        refrescarPanel();
    }

    private void acercaDe() {
        JOptionPane.showMessageDialog(null, "Software desarrollado por NullPointer. \nSi tiene dudas escríbanos a "
                + "contacto@nullpointer.cl", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }

    private void refrescarPanel() {
        this.paintAll(this.getGraphics());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        itemPreferencias = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        item2 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        item3 = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setText("Panel 1 :-D");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        getContentPane().add(panelPrincipal, "card2");

        barraMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        menuSistema.setText("Sistema");

        itemPreferencias.setText("Preferencias");
        itemPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPreferenciasActionPerformed(evt);
            }
        });
        menuSistema.add(itemPreferencias);
        menuSistema.add(jSeparator1);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuSistema.add(itemSalir);

        barraMenu.add(menuSistema);

        menu2.setText("Cosas");

        item2.setText("Muchas cosas");
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });
        menu2.add(item2);

        barraMenu.add(menu2);

        menu3.setText("Ejemplo");

        item3.setText("Mas ejemplos");
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });
        menu3.add(item3);

        barraMenu.add(menu3);

        menuAyuda.setText("Ayuda");

        itemAcercaDe.setText("Acerca de");
        itemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(itemAcercaDe);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        Utils.cerrarAplicacion();
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercaDeActionPerformed
        acercaDe();
    }//GEN-LAST:event_itemAcercaDeActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item3ActionPerformed

    private void itemPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPreferenciasActionPerformed
        preferencias();
    }//GEN-LAST:event_itemPreferenciasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem item2;
    private javax.swing.JMenuItem item3;
    private javax.swing.JMenuItem itemAcercaDe;
    private javax.swing.JMenuItem itemPreferencias;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
