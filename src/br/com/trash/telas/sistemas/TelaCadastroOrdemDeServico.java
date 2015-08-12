/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas;
    
import br.com.trash.persistencia.persistenciaInsert;
import br.com.trash.persistencia.persistenciaSelect;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MARY
 */
public class TelaCadastroOrdemDeServico extends javax.swing.JFrame {
    persistenciaSelect ps=new persistenciaSelect();
    persistenciaInsert pi=new persistenciaInsert();
    /**
     *
     */
    public TelaCadastroOrdemDeServico() {
        initComponents();
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        servicosQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Servicos s");
        servicosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : servicosQuery.getResultList();
        fornecedoresQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Fornecedores f");
        fornecedoresList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : fornecedoresQuery.getResultList();
        setoresQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Setores s");
        setoresList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : setoresQuery.getResultList();
        funcionariosQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Funcionarios f");
        funcionariosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : funcionariosQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoCodOs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboservico = new javax.swing.JComboBox();
        campoNomeServico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combooperadora = new javax.swing.JComboBox();
        campoNomeOperadora = new javax.swing.JTextField();
        combosetor = new javax.swing.JComboBox();
        campoNomeSeto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combofuncionario = new javax.swing.JComboBox();
        campoNomeFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastra Ordem de Serviço", 0, 0, new java.awt.Font("SansSerif", 0, 12))); // NOI18N

        jLabel1.setText("Código da OS: ");

        jLabel2.setText("Data:");

        jLabel3.setText("Cód. do Serviço:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, servicosList, comboservico);
        bindingGroup.addBinding(jComboBoxBinding);

        comboservico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboservicoItemStateChanged(evt);
            }
        });

        campoNomeServico.setEnabled(false);

        jLabel5.setText("Cód. da Operadora:");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, fornecedoresList, combooperadora);
        bindingGroup.addBinding(jComboBoxBinding);

        combooperadora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combooperadoraItemStateChanged(evt);
            }
        });

        campoNomeOperadora.setEnabled(false);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, setoresList, combosetor);
        bindingGroup.addBinding(jComboBoxBinding);

        combosetor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combosetorItemStateChanged(evt);
            }
        });

        campoNomeSeto.setEnabled(false);

        jLabel6.setText("Cód do Setor:");

        jPanel2.setLayout(new java.awt.GridLayout());

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11292_16x16.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCancelar);

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/7881_16x16.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoSalvar);

        jLabel7.setText("Cód do Funcionário:");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, funcionariosList, combofuncionario);
        bindingGroup.addBinding(jComboBoxBinding);

        combofuncionario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combofuncionarioItemStateChanged(evt);
            }
        });

        campoNomeFuncionario.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodOs, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboservico, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combosetor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combooperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combofuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNomeSeto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNomeOperadora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNomeServico, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combooperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNomeOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combosetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNomeSeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combofuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboservicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboservicoItemStateChanged
      Object cod=comboservico.getSelectedItem();
      String codS=""+cod;
      int codServ=Integer.parseInt(codS);
      String descricao=ps.selectComboServico(codServ);
      campoNomeServico.setText(descricao);
      
    }//GEN-LAST:event_comboservicoItemStateChanged

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void combooperadoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combooperadoraItemStateChanged
       Object cod=combooperadora.getSelectedItem();
      String codO=""+cod;
      int codOp=Integer.parseInt(codO);
      String descricao=ps.selectComboFornecedor(codOp);
      campoNomeOperadora.setText(descricao);
    }//GEN-LAST:event_combooperadoraItemStateChanged

    private void combosetorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combosetorItemStateChanged
      Object cod=combosetor.getSelectedItem();
      String codSet=""+cod;
      int codSetor=Integer.parseInt(codSet);
      String descricao=ps.selectComboSetor(codSetor);
      campoNomeSeto.setText(descricao);
    }//GEN-LAST:event_combosetorItemStateChanged

    private void combofuncionarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combofuncionarioItemStateChanged
      Object cod=combofuncionario.getSelectedItem();
      String codFunc=""+cod;
      int codF=Integer.parseInt(codFunc);
      String descricao=ps.selectComboFuncionario(codF);
      campoNomeFuncionario.setText(descricao);
    }//GEN-LAST:event_combofuncionarioItemStateChanged

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
      Date date = new Date(); 
        String data=campoData.getText();
       Object cod=comboservico.getSelectedItem();
      String codS=""+cod;
      int codServ=Integer.parseInt(codS);
      
      Object codOperadora=combooperadora.getSelectedItem();
      String codO=""+codOperadora;
      int codOp=Integer.parseInt(codO);
      
      Object codFuncionario=combofuncionario.getSelectedItem();
      String codFunc=""+codFuncionario;
      int codF=Integer.parseInt(codFunc);
      
      Object codSetor=combosetor.getSelectedItem();
      String codSet=""+codSetor;
      int codSetores=Integer.parseInt(codSet);
        
      String codOS=campoCodOs.getText();
      int codos=Integer.parseInt(codOS); 
      
      boolean os=ps.selectCodOS(codos);
      String dataInclusao=dateFormat.format(date);
      if(os==true){
          pi.insertOS(codServ, codOp, codF, codSetores, codos, data, dataInclusao);
          JOptionPane.showMessageDialog(null, "Cadastro inserido com sucesso!");
      }else{
            JOptionPane.showMessageDialog(null, "Este código já existe! Digite outro!");
            campoCodOs.setText("");
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    /**
     * @param args 
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
            java.util.logging.Logger.getLogger(TelaCadastroOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroOrdemDeServico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCodOs;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoNomeFuncionario;
    private javax.swing.JTextField campoNomeOperadora;
    private javax.swing.JTextField campoNomeServico;
    private javax.swing.JTextField campoNomeSeto;
    private javax.swing.JComboBox combofuncionario;
    private javax.swing.JComboBox combooperadora;
    private javax.swing.JComboBox comboservico;
    private javax.swing.JComboBox combosetor;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<br.com.trash.entidades.Fornecedores> fornecedoresList;
    private javax.persistence.Query fornecedoresQuery;
    private java.util.List<br.com.trash.entidades.Funcionarios> funcionariosList;
    private javax.persistence.Query funcionariosQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.util.List<br.com.trash.entidades.Servicos> servicosList;
    private javax.persistence.Query servicosQuery;
    private java.util.List<br.com.trash.entidades.Setores> setoresList;
    private javax.persistence.Query setoresQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
