/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.VirtuelnaMasina;
import gui.table_model.IzaberiVMTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import kontroler.Kontroler;

/**
 *
 * @author vagrant
 */
public class GlavnaForma extends javax.swing.JFrame {

    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Kontroler.zatvoriAplikaciju();
            }

        });

        prikaziAdministraciju(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card0 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblIzaberiVM = new javax.swing.JTable();
        jbtnPronadji = new javax.swing.JButton();
        jtxtPronadji = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnDalje = new javax.swing.JButton();
        jpnlAdministracija = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtnDodajVM = new javax.swing.JButton();
        jbtnIzmeniVM = new javax.swing.JButton();
        jbtnObrisiVM = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jtblIzaberiVM.setModel(new IzaberiVMTableModel());
        jScrollPane1.setViewportView(jtblIzaberiVM);

        jbtnPronadji.setText("pronadji");
        jbtnPronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPronadjiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Izaberite virtuelnu masinu");

        jbtnDalje.setText("Dalje...");
        jbtnDalje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDaljeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtPronadji)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnPronadji, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnDalje, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtPronadji)
                    .addComponent(jbtnPronadji, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDalje)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administracija");

        jbtnDodajVM.setText("Dodaj virtuelnu masinu");

        jbtnIzmeniVM.setText("Izmeni");

        jbtnObrisiVM.setText("Obrisi VM");

        javax.swing.GroupLayout jpnlAdministracijaLayout = new javax.swing.GroupLayout(jpnlAdministracija);
        jpnlAdministracija.setLayout(jpnlAdministracijaLayout);
        jpnlAdministracijaLayout.setHorizontalGroup(
            jpnlAdministracijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnlAdministracijaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlAdministracijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDodajVM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnIzmeniVM, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jbtnObrisiVM, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlAdministracijaLayout.setVerticalGroup(
            jpnlAdministracijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlAdministracijaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDodajVM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnIzmeniVM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnObrisiVM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout card0Layout = new javax.swing.GroupLayout(card0);
        card0.setLayout(card0Layout);
        card0Layout.setHorizontalGroup(
            card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card0Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpnlAdministracija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        card0Layout.setVerticalGroup(
            card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlAdministracija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(card0, "card2");

        jMenu1.setText("File");

        jMenuItem1.setText("Admin test");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(990, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDaljeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDaljeActionPerformed
        int selektovaniRed = jtblIzaberiVM.getSelectedRow();

        IzaberiVMTableModel iVM = (IzaberiVMTableModel) jtblIzaberiVM.getModel();

        if (selektovaniRed == -1) {
            JOptionPane.showMessageDialog(this, "Izaberite VM", "Greska", JOptionPane.ERROR_MESSAGE);
        } else {
            VirtuelnaMasina vm = iVM.vratiVM(selektovaniRed);
            JOptionPane.showMessageDialog(this, vm);
        }
    }//GEN-LAST:event_jbtnDaljeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Kontroler.otvoriAdminLog();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jbtnPronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPronadjiActionPerformed
        Kontroler.search(getTxtPronadji().getText());
    }//GEN-LAST:event_jbtnPronadjiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel card0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDalje;
    private javax.swing.JButton jbtnDodajVM;
    private javax.swing.JButton jbtnIzmeniVM;
    private javax.swing.JButton jbtnObrisiVM;
    private javax.swing.JButton jbtnPronadji;
    private javax.swing.JPanel jpnlAdministracija;
    private javax.swing.JTable jtblIzaberiVM;
    private javax.swing.JTextField jtxtPronadji;
    // End of variables declaration//GEN-END:variables

    public void prikaziAdministraciju(boolean b) {
        jpnlAdministracija.setVisible(b);
    }

    public javax.swing.JTextField getTxtPronadji() {
        return jtxtPronadji;
    }

    public IzaberiVMTableModel getIzaberiVMTableModel() {
        return (IzaberiVMTableModel) jtblIzaberiVM.getModel();
    }

}
