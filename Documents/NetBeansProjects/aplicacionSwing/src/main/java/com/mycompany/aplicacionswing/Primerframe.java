/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacionswing;

import java.awt.Color;

/**
 *
 * @author Jazmi
 */
public class Primerframe extends javax.swing.JFrame {

    /**
     * Creates new form Primerframe
     */
    public Primerframe() {
        initComponents();
        this.getContentPane().setBackground(Color.pink);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        NombresUsuario = new javax.swing.JTextField();
        labellista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listanombres = new javax.swing.JTextArea();
        Botonenviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        titulo.setBackground(new java.awt.Color(255, 153, 153));
        titulo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        titulo.setText(" LISTA DE ESTUDIANTES");

        labelnombre.setBackground(new java.awt.Color(255, 153, 153));
        labelnombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        labelnombre.setText("INGRESAR NOMBRE:");

        NombresUsuario.setBackground(new java.awt.Color(255, 204, 204));
        NombresUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresUsuarioActionPerformed(evt);
            }
        });

        labellista.setBackground(new java.awt.Color(255, 153, 153));
        labellista.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        labellista.setText("NOMBRE DE LOS ESTUDIANTES");

        listanombres.setBackground(new java.awt.Color(255, 204, 204));
        listanombres.setColumns(20);
        listanombres.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        listanombres.setRows(5);
        jScrollPane1.setViewportView(listanombres);

        Botonenviar.setBackground(new java.awt.Color(255, 102, 102));
        Botonenviar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Botonenviar.setActionCommand("AGREGAR");
        Botonenviar.setLabel("AGREGAR");
        Botonenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonenviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(labellista)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelnombre)
                        .addGap(18, 18, 18)
                        .addComponent(NombresUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(Botonenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(NombresUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Botonenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labellista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombresUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresUsuarioActionPerformed

    private void BotonenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonenviarActionPerformed
        enviarlista();
        String Estudiantes=NombresUsuario.getText();
        listanombres.append(Estudiantes+"\n");
        NombresUsuario.setText(null);
        
    }//GEN-LAST:event_BotonenviarActionPerformed
    public void enviarlista(){
    }
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
            java.util.logging.Logger.getLogger(Primerframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Primerframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Primerframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Primerframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primerframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonenviar;
    private javax.swing.JTextField NombresUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labellista;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JTextArea listanombres;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
