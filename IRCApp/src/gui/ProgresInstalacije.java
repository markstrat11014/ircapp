/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import kontroler.Kontroler;
import util.Konzola;

/**
 *
 * @author stanimirovic.marko
 */
public class ProgresInstalacije extends javax.swing.JFrame {

    /**
     * Creates new form ProgresInstalacije
     */
    public ProgresInstalacije() {
        initComponents();
        jtxtAreaKonzola.setText("");
        this.setResizable(false);
        kontroler.Kontroler.setEnabledGlavnaForma(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnPrekini = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaKonzola = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Instalacija");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbtnPrekini.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnPrekini.setText("Stop");
        jbtnPrekini.setBorderPainted(false);
        jbtnPrekini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrekiniActionPerformed(evt);
            }
        });

        jtxtAreaKonzola.setEditable(false);
        jtxtAreaKonzola.setColumns(20);
        jtxtAreaKonzola.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jtxtAreaKonzola.setForeground(new java.awt.Color(102, 102, 102));
        jtxtAreaKonzola.setLineWrap(true);
        jtxtAreaKonzola.setRows(5);
        jtxtAreaKonzola.setBorder(null);
        jScrollPane1.setViewportView(jtxtAreaKonzola);
        jtxtAreaKonzola.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jbtnPrekini, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jbtnPrekini, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPrekiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrekiniActionPerformed

        if (jbtnPrekini.getText().equalsIgnoreCase("stop")) {
            int izbor = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da prekinete proces instalacije?", "Prekid instalacije", JOptionPane.YES_NO_OPTION);
            if (izbor == JOptionPane.YES_OPTION) {
                Konzola.prekiniIzvrsavanjeKonzole();
                Kontroler.izbrisiFolder(Konzola.PUTANJA_DO_FOLDERA);
            }
        }
        
        kontroler.Kontroler.setEnabledGlavnaForma(true);
        this.dispose();
    }//GEN-LAST:event_jbtnPrekiniActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setTextJTxtAreaKonzola(String tekst) {
        jtxtAreaKonzola.append(tekst);
        jtxtAreaKonzola.setCaretPosition(jtxtAreaKonzola.getText().length());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnPrekini;
    private javax.swing.JTextArea jtxtAreaKonzola;
    // End of variables declaration//GEN-END:variables

    public void setNewNameForJbtnKonzola(String naziv) {
        if (naziv.equalsIgnoreCase("ok")) {
            jbtnPrekini.setText(naziv);
        }
    }
    
    public void setSTOPFalse() {
        jbtnPrekini.setVisible(false);
    }
}
