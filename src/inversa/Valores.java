/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversa;

import javax.swing.JOptionPane;

/**
 *
 * @author Batman
 */
public class Valores extends javax.swing.JFrame {

    /**
     * Creates new form Valores
     */
    //---------------------------------------------------------------------

   //----------------------------------------------------------------------
    public Valores() {
        initComponents();
         this.setLocationRelativeTo(null);
       
    }
    
    public int grad;
    double resultado;
    public Calculos q;
    
    //--------------------------------------------------------------------
    
    //------------------------------------------------------------------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtDisplay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gradito = new javax.swing.JButton();
        txtgrado = new javax.swing.JTextField();
        contador = new javax.swing.JButton();
        Txtcoeficiente = new javax.swing.JTextField();
        btnIntegrar = new javax.swing.JButton();
        resul = new javax.swing.JTextField();
        Txtinf = new javax.swing.JTextField();
        lblgrado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        partes = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        Txtsup = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 3, 36)); // NOI18N
        jLabel1.setText("TRANSFORMADA INVERSA");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 448, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        jLabel2.setText("∫");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 90, -1, 142));

        TxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(TxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 132, 331, 47));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("dx");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 142, -1, -1));

        gradito.setText("Grado");
        gradito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                graditoMouseClicked(evt);
            }
        });
        getContentPane().add(gradito, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 244, -1, -1));
        getContentPane().add(txtgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 248, 81, -1));

        contador.setText("Coeficiente");
        contador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contadorMouseClicked(evt);
            }
        });
        getContentPane().add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 288, -1, -1));
        getContentPane().add(Txtcoeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 292, 81, -1));

        btnIntegrar.setText("Resultado");
        btnIntegrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntegrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnIntegrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 288, -1, -1));
        getContentPane().add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 150, 30));

        Txtinf.setText("0");
        Txtinf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtinfActionPerformed(evt);
            }
        });
        getContentPane().add(Txtinf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 29, -1));

        lblgrado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(lblgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 20, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("x");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 20, 20));

        partes.setText("100");
        getContentPane().add(partes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 67, -1));

        jTextField1.setText("X");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, 30));

        Txtsup.setText("1");
        getContentPane().add(Txtsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDisplayActionPerformed

    private void graditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graditoMouseClicked
        // TODO add your handling code here:
       grad=Integer.parseInt(txtgrado.getText());
       q = new Calculos(grad+1);
       txtgrado.setText(null);
       lblgrado.setText(""+ grad);
    }//GEN-LAST:event_graditoMouseClicked

    private void contadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contadorMouseClicked
        // TODO add your handling code here:
        if(grad>0){
            q.a(grad, Float.parseFloat(Txtcoeficiente.getText()));
            Txtcoeficiente.setText(null);
            grad -=1;
            lblgrado.setText(""+grad+"");
            Txtcoeficiente.requestFocus();
        }else{
            q.a(grad, Float.parseFloat(Txtcoeficiente.getText()));
            TxtDisplay.setText(q.ver());
        }
       
    }//GEN-LAST:event_contadorMouseClicked

    private void btnIntegrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntegrarMouseClicked
        // TODO add your handling code here:
      resultado=q.simpson(Float.parseFloat(Txtinf.getText()),
      Float.parseFloat(Txtsup.getText()), Integer.parseInt(partes.getText()));
      resul.setText(Double.toString(resultado));
      
    }//GEN-LAST:event_btnIntegrarMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void TxtinfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtinfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtinfActionPerformed

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
            java.util.logging.Logger.getLogger(Valores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Valores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Valores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Valores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Valores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDisplay;
    private javax.swing.JTextField Txtcoeficiente;
    private javax.swing.JTextField Txtinf;
    private javax.swing.JTextField Txtsup;
    private javax.swing.JButton btnIntegrar;
    private javax.swing.JButton contador;
    private javax.swing.JButton gradito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblgrado;
    private javax.swing.JTextField partes;
    private javax.swing.JTextField resul;
    private javax.swing.JTextField txtgrado;
    // End of variables declaration//GEN-END:variables
}
