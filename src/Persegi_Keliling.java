
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Persegi_Keliling extends javax.swing.JPanel {

    /**
     * Creates new form Persegi_Keliling
     */
    String Panjang, Lebar, Hasil;
    public Persegi_Keliling() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        persegiKelLeb = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        persegiKelPan = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        persegiKelHas = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        add(jLabel1);
        jLabel1.setBounds(130, 220, 190, 30);

        persegiKelLeb.setText("Lebar");
        add(persegiKelLeb);
        persegiKelLeb.setBounds(30, 110, 50, 14);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(130, 20, 190, 30);

        persegiKelPan.setText("Panjang");
        add(persegiKelPan);
        persegiKelPan.setBounds(30, 20, 50, 14);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(130, 100, 190, 30);

        persegiKelHas.setText("Keliling");
        add(persegiKelHas);
        persegiKelHas.setBounds(30, 230, 70, 14);

        jToggleButton1.setText("Hitung");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseReleased(evt);
            }
        });
        add(jToggleButton1);
        jToggleButton1.setBounds(130, 180, 90, 23);

        jToggleButton2.setText("Ulangi");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseReleased(evt);
            }
        });
        add(jToggleButton2);
        jToggleButton2.setBounds(220, 180, 90, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        Panjang = jTextField1.getText();
        Lebar = jTextField2.getText();
        float Pjg = Float.parseFloat(Panjang);
        float Lbr = Float.parseFloat(Lebar);
        float Hsl = 2*(Pjg+Lbr);
        Hasil =String.valueOf(Hsl);
        jLabel1.setText(Hasil);
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        jTextField1.setText("");
        jTextField2.setText("");
        jLabel1.setText("");
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseReleased
         jToggleButton1.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jToggleButton1MouseReleased

    private void jToggleButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseReleased
         jToggleButton2.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jToggleButton2MouseReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char Input= evt.getKeyChar();
        if(!(Character.isDigit(Input)))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char Input= evt.getKeyChar();
        if(!(Character.isDigit(Input)))
            evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel persegiKelHas;
    private javax.swing.JLabel persegiKelLeb;
    private javax.swing.JLabel persegiKelPan;
    // End of variables declaration//GEN-END:variables
}
