/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Segitiga_Keliling extends javax.swing.JPanel {

    /**
     * Creates new form Segitiga_Keliling
     */
    String sisi, hasil;
    public Segitiga_Keliling() {
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

        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        persegiKelHas = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(380, 310));
        setLayout(null);

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
        jTextField1.setBounds(130, 80, 190, 30);

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

        persegiKelHas.setText("Keliling");
        add(persegiKelHas);
        persegiKelHas.setBounds(30, 230, 70, 14);

        label1.setText("Sisi");
        add(label1);
        label1.setBounds(30, 90, 50, 14);
        add(jLabel2);
        jLabel2.setBounds(130, 220, 190, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        sisi = jTextField1.getText();
        float ss = Float.parseFloat(sisi);
        float Hsl = ss+ss+ss;
        hasil =String.valueOf(Hsl);
        if(sisi.equals("")){
            JOptionPane.showMessageDialog(null, "Text field tidak boleh kosong");
        }
        else{
            jLabel2.setText(hasil);
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseReleased
        jToggleButton1.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jToggleButton1MouseReleased

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        jTextField1.setText("");
        jLabel2.setText("");
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseReleased
        jToggleButton2.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jToggleButton2MouseReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char Input= evt.getKeyChar();
        if(!(Character.isDigit(Input)))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel persegiKelHas;
    // End of variables declaration//GEN-END:variables
}
