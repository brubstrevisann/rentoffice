/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.tela;

import br.com.rentoffice.dominio.EscritorioB;
import br.com.rentoffice.dominio.EscritorioD;
import br.com.rentoffice.dominio.EscritorioP;
import br.com.rentoffice.dominio.Locador;

import br.com.rentoffice.dominio.Usuario;

import br.com.rentoffice.repositorio.Repositorio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class frmLocador extends javax.swing.JFrame {

    /**
     * Creates new form frmAdministrador
     */
    public frmLocador(Usuario usario) {
        initComponents();
        jLabel8.setText("Bem vindo:  " + usario.getNomeUsuario());
    }

    public frmLocador() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNomeProp = new javax.swing.JTextField();
        txtLocalEs = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JComboBox<>();
        txtDiaria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultar = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(28, 28, 28));

        txtNomeProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePropActionPerformed(evt);
            }
        });

        txtLocalEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalEsActionPerformed(evt);
            }
        });

        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Básico", "Padrão", "Plus" }));
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        try{
            javax.swing.text.MaskFormatter diaria = new javax.swing.text.MaskFormatter("R$##,##");

            txtDiaria = new javax.swing.JFormattedTextField(diaria);
        }catch(Exception e){
        }

        tableConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Local", "Categoria", "Diaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableConsultar);

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar Cadastrados");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nome do escritorio:");

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Categoria:");

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Nome do proprietário:");

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Endereço do escritorio:");

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Valor da diaria:");

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("jLabel8");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cadastrar Escritório");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar)
                            .addComponent(btnAlterar)
                            .addComponent(btnCadastrar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocalEs, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeProp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 82, Short.MAX_VALUE)
                                        .addComponent(txtDiaria, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(554, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed


    private void txtLocalEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalEsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalEsActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        DefaultTableModel modeloTable = (DefaultTableModel) tableConsultar.getModel();

        //REMOVER lINHAS
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }

        for (EscritorioB escritorio : Repositorio.escritorioBDFake) {
            modeloTable.addRow(new Object[]{escritorio.getNomeEscritorioB(),
                escritorio.getCategoriaB(),
                escritorio.getDiariaEscritorioB()});
        }
        for (EscritorioD escritorio : Repositorio.escritorioDFake) {
            modeloTable.addRow(new Object[]{escritorio.getNomeEscritorioD(),
                escritorio.getCategoriaD(),
                escritorio.getDiariaEscritorioD()});
        }
        for (EscritorioP escritorio : Repositorio.escritorioPDFake) {
            modeloTable.addRow(new Object[]{escritorio.getNomeEscritorioP(),
                escritorio.getCategoriaP(),
                escritorio.getDiariaEscritorioP()});
        }

        for (int i = Repositorio.escritorioBDFake.size(); i < 4; i++) {
            modeloTable.addRow(new Object[]{"", "", ""});
        }
        //jScrollPane1.setViewportView(tableConsultar);

        //EscritorioB exibirescritorio = new EscritorioB();
        //  JOptionPane.showMessageDialog("Bem vindo cliente: " + exibirescritorio.setNomeEscritorioB);
        //exibirescritorio.setNomeEscritorioB("");
        //exibirescritorio.setDiariaEscritorioB("");

    }//GEN-LAST:event_btnConsultarActionPerformed


    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        EscritorioB novoLocalB = new EscritorioB();
        novoLocalB.setProprietarioEscritorioB(txtNomeProp.getText());
        novoLocalB.setNomeEscritorioB(txtLocalEs.getText());
        novoLocalB.setDiariaEscritorioB(txtDiaria.getText());
        novoLocalB.setEnderecoEscritorioB(txtEndereco.getText());

        EscritorioD novoLocalD = new EscritorioD();
        novoLocalD.setProprietarioEscritorioD(txtNomeProp.getText());
        novoLocalD.setNomeEscritorioD(txtLocalEs.getText());
        novoLocalD.setDiariaEscritorioD(txtDiaria.getText());
        novoLocalD.setEnderecoEscritorioD(txtEndereco.getText());

        EscritorioP novoLocalP = new EscritorioP();
        novoLocalP.setProprietarioEscritorioP(txtNomeProp.getText());
        novoLocalP.setNomeEscritorioP(txtLocalEs.getText());
        novoLocalP.setDiariaEscritorioP(txtDiaria.getText());
        novoLocalP.setEnderecoEscritorioP(txtEndereco.getText());

        if ((txtLocalEs.getText() == null || txtDiaria.getText().trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos !");
        } else {

            if (txtCategoria.getSelectedItem().equals("Básico")) {

                Repositorio.escritorioBDFake.add(novoLocalB);
                txtNomeProp.setText("");
                txtLocalEs.setText("");
                txtDiaria.setText("");
                txtEndereco.setText("");
            }

            if (txtCategoria.getSelectedItem().equals("Padrão")) {

                Repositorio.escritorioDFake.add(novoLocalD);
                txtNomeProp.setText("");
                txtLocalEs.setText("");
                txtDiaria.setText("");
                txtEndereco.setText("");
            }

            if (txtCategoria.getSelectedItem().equals("Plus")) {

                Repositorio.escritorioPDFake.add(novoLocalP);
                txtNomeProp.setText("");
                txtLocalEs.setText("");
                txtDiaria.setText("");
                txtEndereco.setText("");
            }
            JOptionPane.showMessageDialog(null, "Escritório cadastrado com sucesso");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login frm = new Login();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomePropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePropActionPerformed

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
            java.util.logging.Logger.getLogger(Locador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Locador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Locador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Locador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLocador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableConsultar;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JTextField txtDiaria;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLocalEs;
    private javax.swing.JTextField txtNomeProp;
    // End of variables declaration//GEN-END:variables
    frmLocador locador;

}
