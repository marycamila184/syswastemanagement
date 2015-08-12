/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas;

import br.com.trash.controle.defineNiveis;
import br.com.trash.controle.subservicosBean;
import br.com.trash.entidades.Servicos;
import br.com.trash.entidades.Subservicos;
import br.com.trash.persistencia.persistenciaSelect;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARY
 */
public class TelaBuscaSubservicos extends javax.swing.JFrame {
    
    DefaultTableModel modelo = null;
    persistenciaSelect ps=new persistenciaSelect();
    int linhaSelecionada = 0;
    String query="SELECT s FROM Subservicos s WHERE s.";
    subservicosBean ssb=new subservicosBean();
    List<subservicosBean> t = new ArrayList<>();
    String pegaCodigo=null;
    int passaCodigo=0;
    /**
     * 
     */
    public TelaBuscaSubservicos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        servicosQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Servicos s");
        servicosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : servicosQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SYS Waste Magament");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Subserviço", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        jLabel2.setText("Descrição:");

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/8171_16x16.png"))); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoPesquisar);

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11292_16x16.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCancelar);

        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11387_16x16.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel2.add(botaoLimpar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        listaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Subserviço", "Descrição", "Descrição Serviço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listaTabela);
        listaTabela.getColumnModel().getColumn(0).setResizable(false);
        listaTabela.getColumnModel().getColumn(0).setPreferredWidth(30);
        listaTabela.getColumnModel().getColumn(1).setResizable(false);
        listaTabela.getColumnModel().getColumn(2).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
     
        campoDescricao.setText("");
        modelo.setNumRows(0);
       
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
       modelo = (DefaultTableModel) listaTabela.getModel();
       modelo.setNumRows(0);
        int verificaCamposVazios=0;
        ssb.setDescricao(campoDescricao.getText());
        if(ssb.getDescricao().isEmpty()==false){
            query+="descricao = :descricao";  
       }
        if(ssb.getDescricao().isEmpty()){
             verificaCamposVazios++;
        }if(verificaCamposVazios==1){
            JOptionPane.showMessageDialog(null, "Favor preencher o campo!");
        }else{
            selectBuscaSubservicos(ssb, query);
            query="SELECT s FROM Subservicos s WHERE s."; //Coloco o valor inicial daquery novamente 
            campoDescricao.setText("");
         }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscaSubservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaSubservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaSubservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaSubservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaBuscaSubservicos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField campoDescricao;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaTabela;
    private java.util.List<br.com.trash.entidades.Servicos> servicosList;
    private javax.persistence.Query servicosQuery;
    // End of variables declaration//GEN-END:variables
    public void selecionaDados() {
        defineNiveis dn=new defineNiveis();
        linhaSelecionada = listaTabela.getSelectedRow();
        pegaCodigo=listaTabela.getValueAt(linhaSelecionada, 0).toString();
        passaCodigo=Integer.parseInt(pegaCodigo);
        dn.abreTelaAlteraSubServicos(passaCodigo);
        dispose();
    }

    private void selectBuscaSubservicos(subservicosBean ssb, String testeQuery) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
        EntityManager manager = factory.createEntityManager();
        String descricaoServiço = null;
        modelo = (DefaultTableModel) listaTabela.getModel();
        Query query2 = manager.createQuery(testeQuery, Subservicos.class);
        if(ssb.getDescricao().isEmpty()==false){
            query2.setParameter("descricao", ssb.getDescricao()); 
        }
        try{
        List<Subservicos> subservicosR=query2.getResultList();  //Retorno uma lista com os resultados 
        if(subservicosR.isEmpty()==false){
            for (Subservicos s : subservicosR) {
                subservicosBean sb=new subservicosBean();
                int cod=s.getCodsubservico();
                String descricao=s.getDescricao();
                int codS=s.getCodsubservico();
                
                ssb.setCodSubServico(cod);
                ssb.setDescricao(descricao);
                
                Query queryServico = manager.createNamedQuery("Servicos.findByCodservicos");
                queryServico.setParameter("codservicos", codS); //Seto o primeiro parametro da query
                List<Servicos> servicosCod=queryServico.getResultList();
                if(servicosCod!=null){
                    for (Servicos servicos : servicosCod) {
                        descricao=servicos.getDescricao();
                    }
                }
                
                modelo.addRow(new Object[] {
                    ssb.getCodSubServico(),
                    ssb.getDescricao(),
                    descricao
                });
                
            }
        }else{
           JOptionPane.showMessageDialog(null, "Não há resultados para essa busca!");
        }
        }finally{
            manager.close();
            factory.close();
        } 
    }
    
}
