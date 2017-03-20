/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.UserVMs;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import kontroler.Kontroler;

/**
 *
 * @author stanimirovic.marko
 */
public class MojeMasine extends javax.swing.JFrame {

    /**
     * Creates new form MojeMasine
     */
    public MojeMasine() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Kontroler.zatvoriMojeMasine();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlMojeMasine = new javax.swing.JList<>();
        jbtnPokreni = new javax.swing.JButton();
        jbtnZaustavi = new javax.swing.JButton();
        jbtnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Moje mašine");
        setResizable(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlMojeMasine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMojeMasine.setModel(dlm);
        jlMojeMasine.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jlMojeMasine);

        jbtnPokreni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnPokreni.setText("Pokreni");
        jbtnPokreni.setMaximumSize(new java.awt.Dimension(84, 29));
        jbtnPokreni.setMinimumSize(new java.awt.Dimension(84, 29));
        jbtnPokreni.setPreferredSize(new java.awt.Dimension(84, 29));
        jbtnPokreni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPokreniActionPerformed(evt);
            }
        });

        jbtnZaustavi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnZaustavi.setText("Zaustavi");
        jbtnZaustavi.setPreferredSize(new java.awt.Dimension(84, 29));
        jbtnZaustavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnZaustaviActionPerformed(evt);
            }
        });

        jbtnObrisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnObrisi.setText("Obriši");
        jbtnObrisi.setMaximumSize(new java.awt.Dimension(84, 29));
        jbtnObrisi.setPreferredSize(new java.awt.Dimension(84, 29));
        jbtnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jbtnPokreni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnZaustavi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPokreni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnZaustavi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPokreniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPokreniActionPerformed
        String izabranaVM = jlMojeMasine.getSelectedValue();
        if (izabranaVM == null) {
            JOptionPane.showMessageDialog(
                    this, "Morate da odaberete masinu za pokretanje!",
                    "Upozorenje", JOptionPane.WARNING_MESSAGE);
        } else {
            Kontroler.pokreniMasinuMojeMasine(izabranaVM);
        }
    }//GEN-LAST:event_jbtnPokreniActionPerformed

    private void jbtnZaustaviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnZaustaviActionPerformed
        String izabranaVM = jlMojeMasine.getSelectedValue();
        if (izabranaVM == null) {
            JOptionPane.showMessageDialog(
                    this, "Morate da odaberete masinu koju zelite da zaustavite!",
                    "Upozorenje", JOptionPane.WARNING_MESSAGE);
        } else {
            Kontroler.zaustaviMasinuMojeMasine(izabranaVM);
        }
    }//GEN-LAST:event_jbtnZaustaviActionPerformed

    private void jbtnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiActionPerformed
        String izabranaVM = jlMojeMasine.getSelectedValue();
        if (izabranaVM == null) {
            JOptionPane.showMessageDialog(
                    this, "Morate da odaberete masinu koju zelite da obrisete!",
                    "Upozorenje", JOptionPane.WARNING_MESSAGE);
        } else {
            Kontroler.obrisiMasinuMojeMasine(izabranaVM);
        }
    }//GEN-LAST:event_jbtnObrisiActionPerformed

    /**
     * @param args the command line arguments
     */
    DefaultListModel dlm = new DefaultListModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnObrisi;
    private javax.swing.JButton jbtnPokreni;
    private javax.swing.JButton jbtnZaustavi;
    private javax.swing.JList<String> jlMojeMasine;
    // End of variables declaration//GEN-END:variables

    
    public void ucitajMasine(List<UserVMs> listaKorisnikovihMasina) {
        for (UserVMs masina : listaKorisnikovihMasina) {
            dlm.addElement(masina.getNaziv() + " " + masina.getPath());
        }
    }
}