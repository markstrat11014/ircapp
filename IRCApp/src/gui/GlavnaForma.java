/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.Program;
import domen.VirtuelnaMasina;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
        napuniListuVirtuelnimMasinama();
    }

    DefaultListModel dlm = new DefaultListModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card0 = new javax.swing.JPanel();
        jpnlPutanja = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtxtPutanjaDoFoldera = new javax.swing.JTextField();
        jbtnIzaberiPutanjuDoFoldera = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtxtKorisnikovNazivVM = new javax.swing.JTextField();
        jpnlVM = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtxtOpis = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listVM = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jpnlCheckBoksevi = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpnlInstalacija = new javax.swing.JPanel();
        jbtnInstalacija = new javax.swing.JButton();
        cardAdministracija = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnlDodavanjeVM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtDodavanjeVMNazivVM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmnAdmin = new javax.swing.JMenuItem();
        jmnMasine = new javax.swing.JMenuItem();
        jmnIzlaz = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmnOAplikaciji = new javax.swing.JMenuItem();
        jmnONama = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("VirtualIRC");
        setMinimumSize(new java.awt.Dimension(1000, 0));
        setPreferredSize(new java.awt.Dimension(600, 974));
        getContentPane().setLayout(new java.awt.CardLayout());

        card0.setPreferredSize(new java.awt.Dimension(604, 974));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Izaberite putanju:");

        jtxtPutanjaDoFoldera.setEditable(false);
        jtxtPutanjaDoFoldera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtPutanjaDoFoldera.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jbtnIzaberiPutanjuDoFoldera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnIzaberiPutanjuDoFoldera.setText("...");
        jbtnIzaberiPutanjuDoFoldera.setPreferredSize(new java.awt.Dimension(57, 34));
        jbtnIzaberiPutanjuDoFoldera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzaberiPutanjuDoFolderaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Naziv virtualne masine:");

        jtxtKorisnikovNazivVM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtKorisnikovNazivVM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxtKorisnikovNazivVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtKorisnikovNazivVMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlPutanjaLayout = new javax.swing.GroupLayout(jpnlPutanja);
        jpnlPutanja.setLayout(jpnlPutanjaLayout);
        jpnlPutanjaLayout.setHorizontalGroup(
            jpnlPutanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPutanjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlPutanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlPutanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPutanjaDoFoldera)
                    .addComponent(jtxtKorisnikovNazivVM))
                .addGap(18, 18, 18)
                .addComponent(jbtnIzaberiPutanjuDoFoldera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnlPutanjaLayout.setVerticalGroup(
            jpnlPutanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPutanjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlPutanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnlPutanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtPutanjaDoFoldera, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnIzaberiPutanjuDoFoldera, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlPutanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtKorisnikovNazivVM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Izaberite virtuelnu mašinu:");

        jScrollPane5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtxtOpis.setEditable(false);
        jtxtOpis.setBackground(new java.awt.Color(240, 240, 240));
        jtxtOpis.setColumns(20);
        jtxtOpis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtOpis.setLineWrap(true);
        jtxtOpis.setRows(5);
        jtxtOpis.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(jtxtOpis);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Opis virtuelne mašine:");

        jScrollPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        listVM.setBackground(new java.awt.Color(240, 240, 240));
        listVM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listVM.setModel(dlm);
        listVM.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listVM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listVMMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listVM);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpnlCheckBoksevi.setLayout(new javax.swing.BoxLayout(jpnlCheckBoksevi, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(jpnlCheckBoksevi);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Izaberite programe:");

        javax.swing.GroupLayout jpnlVMLayout = new javax.swing.GroupLayout(jpnlVM);
        jpnlVM.setLayout(jpnlVMLayout);
        jpnlVMLayout.setHorizontalGroup(
            jpnlVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlVMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlVMLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnlVMLayout.setVerticalGroup(
            jpnlVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlVMLayout.createSequentialGroup()
                .addGroup(jpnlVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3)))
        );

        jbtnInstalacija.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnInstalacija.setText("Instalacija");
        jbtnInstalacija.setMaximumSize(new java.awt.Dimension(120, 34));
        jbtnInstalacija.setMinimumSize(new java.awt.Dimension(120, 25));
        jbtnInstalacija.setPreferredSize(new java.awt.Dimension(120, 34));
        jbtnInstalacija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInstalacijaActionPerformed(evt);
            }
        });
        jpnlInstalacija.add(jbtnInstalacija);

        javax.swing.GroupLayout card0Layout = new javax.swing.GroupLayout(card0);
        card0.setLayout(card0Layout);
        card0Layout.setHorizontalGroup(
            card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(card0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnlInstalacija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlPutanja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlVM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        card0Layout.setVerticalGroup(
            card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card0Layout.createSequentialGroup()
                .addComponent(jpnlPutanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlVM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlInstalacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(card0, "card2");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Naziv VM");

        jtxtDodavanjeVMNazivVM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Opis VM");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tip OS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "windows", "linux", "mac" }));

        jButton1.setText("Dodaj VM");

        jButton2.setText("Odustani");

        javax.swing.GroupLayout jpnlDodavanjeVMLayout = new javax.swing.GroupLayout(jpnlDodavanjeVM);
        jpnlDodavanjeVM.setLayout(jpnlDodavanjeVMLayout);
        jpnlDodavanjeVMLayout.setHorizontalGroup(
            jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlDodavanjeVMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlDodavanjeVMLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlDodavanjeVMLayout.createSequentialGroup()
                        .addGroup(jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtDodavanjeVMNazivVM)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpnlDodavanjeVMLayout.setVerticalGroup(
            jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDodavanjeVMLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtDodavanjeVMNazivVM, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlDodavanjeVMLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlDodavanjeVMLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addGroup(jpnlDodavanjeVMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dodavanje VM", jpnlDodavanjeVM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Brisanje VM", jPanel3);

        javax.swing.GroupLayout cardAdministracijaLayout = new javax.swing.GroupLayout(cardAdministracija);
        cardAdministracija.setLayout(cardAdministracijaLayout);
        cardAdministracijaLayout.setHorizontalGroup(
            cardAdministracijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        cardAdministracijaLayout.setVerticalGroup(
            cardAdministracijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(cardAdministracija, "card3");

        jMenu3.setText("File");

        jmnAdmin.setText("Administrator");
        jmnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnAdminActionPerformed(evt);
            }
        });
        jMenu3.add(jmnAdmin);

        jmnMasine.setText("Moje mašine");
        jmnMasine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnMasineActionPerformed(evt);
            }
        });
        jMenu3.add(jmnMasine);

        jmnIzlaz.setText("Izlaz");
        jmnIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnIzlazActionPerformed(evt);
            }
        });
        jMenu3.add(jmnIzlaz);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Help");

        jmnOAplikaciji.setText("O aplikaciji");
        jMenu4.add(jmnOAplikaciji);

        jmnONama.setText("O nama");
        jMenu4.add(jmnONama);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(989, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInstalacijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInstalacijaActionPerformed
        String vm = listVM.getSelectedValue();
        String korisnikovoImeVM = jtxtKorisnikovNazivVM.getText();
        if (vm == null || jtxtPutanjaDoFoldera.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this, "Odaberite virtuelnu mašinu i putanju do foldera u kome želite da je sačuvate!",
                    "Greška", JOptionPane.ERROR_MESSAGE
            );
        } else if (Kontroler.proveriDaLiSeUFolderuNalaziVagrantfile(jtxtPutanjaDoFoldera.getText())) {
            JOptionPane.showMessageDialog(
                    this, "U folderu koji ste izabrali već postoji Vagrantfile. Izaberite neki drugi folder!",
                    "Greška", JOptionPane.ERROR_MESSAGE
            );

            jtxtPutanjaDoFoldera.setText("");
        } else if (korisnikovoImeVM.equals("") || korisnikovoImeVM.length() < 3){
            JOptionPane.showMessageDialog(
                    this, "Naziv Vase virtualne masine mora imati bar tri karaktera.",
                    "Greška", JOptionPane.ERROR_MESSAGE
            );
        }else {
            Kontroler.instalacija(vm, korisnikovoImeVM);
        }

    }//GEN-LAST:event_jbtnInstalacijaActionPerformed

    private void jmnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnAdminActionPerformed
        Kontroler.otvoriAdminLog();
    }//GEN-LAST:event_jmnAdminActionPerformed

    private void listVMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVMMouseClicked
        List<VirtuelnaMasina> vmL = new LinkedList<>();
        vmL = Kontroler.vratiListuVMIzBaze();
        for (VirtuelnaMasina vm : vmL) {
            if (listVM.getSelectedValue().equals(vm.getIme())) {
                jtxtOpis.setText(vm.getOpis());
            }
        }
    }//GEN-LAST:event_listVMMouseClicked

    private void jmnIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnIzlazActionPerformed
        Kontroler.zatvoriAplikaciju();
    }//GEN-LAST:event_jmnIzlazActionPerformed

    private void jbtnIzaberiPutanjuDoFolderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzaberiPutanjuDoFolderaActionPerformed
        String putanjaDoFoldera = Kontroler.otvoriProzorZaIzborPutanje();

        Kontroler.namestiPutanjuDoFoldera(putanjaDoFoldera);
        jtxtPutanjaDoFoldera.setText(putanjaDoFoldera);
    }//GEN-LAST:event_jbtnIzaberiPutanjuDoFolderaActionPerformed

    private void jmnMasineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnMasineActionPerformed
        Kontroler.pokreniMojeMasineProzor();    
    }//GEN-LAST:event_jmnMasineActionPerformed

    private void jtxtKorisnikovNazivVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtKorisnikovNazivVMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtKorisnikovNazivVMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel card0;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel cardAdministracija;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnInstalacija;
    private javax.swing.JButton jbtnIzaberiPutanjuDoFoldera;
    private javax.swing.JMenuItem jmnAdmin;
    private javax.swing.JMenuItem jmnIzlaz;
    private javax.swing.JMenuItem jmnMasine;
    private javax.swing.JMenuItem jmnOAplikaciji;
    private javax.swing.JMenuItem jmnONama;
    private javax.swing.JPanel jpnlCheckBoksevi;
    private javax.swing.JPanel jpnlDodavanjeVM;
    private javax.swing.JPanel jpnlInstalacija;
    private javax.swing.JPanel jpnlPutanja;
    private javax.swing.JPanel jpnlVM;
    private javax.swing.JTextField jtxtKorisnikovNazivVM;
    private javax.swing.JTextField jtxtDodavanjeVMNazivVM;
    private javax.swing.JTextArea jtxtOpis;
    private javax.swing.JTextField jtxtPutanjaDoFoldera;
    private javax.swing.JList<String> listVM;
    // End of variables declaration//GEN-END:variables

    public void sakrijSvePanele() {
        card0.setVisible(false);
        cardAdministracija.setVisible(false);
    }

    public JPanel getJPanelCheckBoksevi() {
        return jpnlCheckBoksevi;
    }

    private void prikaziCard0() {
        sakrijSvePanele();
        card0.setVisible(true);
    }
    
    
    public void prikaziCardAdministracija() {
        sakrijSvePanele();
        cardAdministracija.setVisible(true);
    }

    public JTextField getTxtPutanjaDoFoldera() {
        return jtxtPutanjaDoFoldera;
    }

    public void generisiCheckBokseve(List<Program> listaPrograma) {
        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        for (Program p : listaPrograma) {
            JCheckBox jcb = new JCheckBox(p.getIme());
            jcb.setFont(font);
            jpnlCheckBoksevi.add(jcb);
            Kontroler.dodajCheckBoksUListu(jcb);
        }
    }

    public JPanel getJpnlCheckBoksevi() {
        return jpnlCheckBoksevi;
    }

    public void setJpnlCheckBoksevi(JPanel jpnlCheckBoksevi) {
        this.jpnlCheckBoksevi = jpnlCheckBoksevi;
    }

    public void napuniListuVirtuelnimMasinama() {

        List<VirtuelnaMasina> listaSvihVM = new LinkedList<>();
        listaSvihVM = Kontroler.vratiListuVMIzBaze();
        
        for (VirtuelnaMasina virtuelnaMasina : listaSvihVM) {
            dlm.addElement(virtuelnaMasina.getIme());
        }
    }

}
