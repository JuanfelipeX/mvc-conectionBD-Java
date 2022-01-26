/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author pipes
 */
public class FrmPelicula extends javax.swing.JFrame {

    /**
     * Creates new form FrmPelicula
     */
    public FrmPelicula() {
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

        jPanel1 = new javax.swing.JPanel();
        nombrePeliculajLabel = new javax.swing.JLabel();
        textoPrincipaljLabel = new javax.swing.JLabel();
        anioPeliculajTextField = new javax.swing.JTextField();
        anioPeliculajLabel = new javax.swing.JLabel();
        nombrePeliculajTextField = new javax.swing.JTextField();
        generoPeliculajLabel = new javax.swing.JLabel();
        resumenPeliculajTextField = new javax.swing.JTextField();
        resumenPeliculajLabel = new javax.swing.JLabel();
        directorPeliculajLabel = new javax.swing.JLabel();
        directorPeliculajTextField = new javax.swing.JTextField();
        duracionPeliculajLabel = new javax.swing.JLabel();
        generoPeliculajTextField = new javax.swing.JTextField();
        duracionPeliculajTextField = new javax.swing.JTextField();
        guardarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 187, 187));
        jPanel1.setToolTipText("");

        nombrePeliculajLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombrePeliculajLabel.setForeground(new java.awt.Color(60, 63, 65));
        nombrePeliculajLabel.setText("Nombre de la pelicula");

        textoPrincipaljLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textoPrincipaljLabel.setForeground(new java.awt.Color(60, 63, 65));
        textoPrincipaljLabel.setText(" Peliculas Premier");

        anioPeliculajTextField.setEditable(false);
        anioPeliculajTextField.setForeground(new java.awt.Color(60, 63, 65));
        anioPeliculajTextField.setToolTipText("");
        anioPeliculajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioPeliculajTextFieldActionPerformed(evt);
            }
        });

        anioPeliculajLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        anioPeliculajLabel.setForeground(new java.awt.Color(60, 63, 65));
        anioPeliculajLabel.setText("Anio de la pelicula");

        nombrePeliculajTextField.setEditable(false);
        nombrePeliculajTextField.setForeground(new java.awt.Color(60, 63, 65));
        nombrePeliculajTextField.setToolTipText("");
        nombrePeliculajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePeliculajTextFieldActionPerformed(evt);
            }
        });

        generoPeliculajLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        generoPeliculajLabel.setForeground(new java.awt.Color(60, 63, 65));
        generoPeliculajLabel.setText("Genero");

        resumenPeliculajTextField.setEditable(false);
        resumenPeliculajTextField.setForeground(new java.awt.Color(60, 63, 65));
        resumenPeliculajTextField.setToolTipText("");
        resumenPeliculajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenPeliculajTextFieldActionPerformed(evt);
            }
        });

        resumenPeliculajLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resumenPeliculajLabel.setForeground(new java.awt.Color(60, 63, 65));
        resumenPeliculajLabel.setText("Resumen");

        directorPeliculajLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        directorPeliculajLabel.setForeground(new java.awt.Color(60, 63, 65));
        directorPeliculajLabel.setText("Director de la pelicula");

        directorPeliculajTextField.setEditable(false);
        directorPeliculajTextField.setForeground(new java.awt.Color(60, 63, 65));
        directorPeliculajTextField.setToolTipText("");
        directorPeliculajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorPeliculajTextFieldActionPerformed(evt);
            }
        });

        duracionPeliculajLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        duracionPeliculajLabel.setForeground(new java.awt.Color(60, 63, 65));
        duracionPeliculajLabel.setText("Duracion");

        generoPeliculajTextField.setEditable(false);
        generoPeliculajTextField.setForeground(new java.awt.Color(60, 63, 65));
        generoPeliculajTextField.setToolTipText("");
        generoPeliculajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoPeliculajTextFieldActionPerformed(evt);
            }
        });

        duracionPeliculajTextField.setEditable(false);
        duracionPeliculajTextField.setForeground(new java.awt.Color(60, 63, 65));
        duracionPeliculajTextField.setToolTipText("");
        duracionPeliculajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionPeliculajTextFieldActionPerformed(evt);
            }
        });

        guardarjButton.setText("Guardar");
        guardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textoPrincipaljLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directorPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generoPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duracionPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resumenPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anioPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(duracionPeliculajTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(generoPeliculajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directorPeliculajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anioPeliculajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrePeliculajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resumenPeliculajTextField))
                        .addGap(163, 163, 163))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(guardarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textoPrincipaljLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrePeliculajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioPeliculajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directorPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directorPeliculajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoPeliculajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duracionPeliculajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracionPeliculajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumenPeliculajLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumenPeliculajTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(guardarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anioPeliculajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioPeliculajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioPeliculajTextFieldActionPerformed

    private void nombrePeliculajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePeliculajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePeliculajTextFieldActionPerformed

    private void resumenPeliculajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenPeliculajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resumenPeliculajTextFieldActionPerformed

    private void directorPeliculajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorPeliculajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorPeliculajTextFieldActionPerformed

    private void generoPeliculajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoPeliculajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoPeliculajTextFieldActionPerformed

    private void duracionPeliculajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionPeliculajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracionPeliculajTextFieldActionPerformed

    private void guardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anioPeliculajLabel;
    private javax.swing.JTextField anioPeliculajTextField;
    private javax.swing.JLabel directorPeliculajLabel;
    private javax.swing.JTextField directorPeliculajTextField;
    private javax.swing.JLabel duracionPeliculajLabel;
    private javax.swing.JTextField duracionPeliculajTextField;
    private javax.swing.JLabel generoPeliculajLabel;
    private javax.swing.JTextField generoPeliculajTextField;
    private javax.swing.JButton guardarjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombrePeliculajLabel;
    private javax.swing.JTextField nombrePeliculajTextField;
    private javax.swing.JLabel resumenPeliculajLabel;
    private javax.swing.JTextField resumenPeliculajTextField;
    private javax.swing.JLabel textoPrincipaljLabel;
    // End of variables declaration//GEN-END:variables
}
