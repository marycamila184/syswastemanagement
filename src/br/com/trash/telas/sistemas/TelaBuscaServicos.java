/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas;

import br.com.trash.controle.defineNiveis;
import br.com.trash.controle.servicosBean;
import br.com.trash.entidades.Servicos;
import br.com.trash.persistencia.persistenciaSelect;
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
public class TelaBuscaServicos extends javax.swing.JFrame {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
    EntityManager manager = factory.createEntityManager();
    DefaultTableModel modelo = null;
    persistenciaSelect ps=new persistenciaSelect();
    int linhaSelecionada = 0;
    String pegaCodigo=null;
    int passaCodigo=0;
    servicosBean sb=new servicosBean();
    String query="SELECT s FROM Servicos s WHERE s.";
    /**
     * 
     */
    public TelaBuscaServicos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SYS Waste Magament");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Serviços", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        jLabel2.setText("Descrição:");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/8171_16x16.png"))); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoPesquisar);

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11292_16x16.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCancelar);

        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11387_16x16.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel1.add(botaoLimpar);

        listaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "UND Mensal", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaTabela);
        listaTabela.getColumnModel().getColumn(0).setResizable(false);
        listaTabela.getColumnModel().getColumn(0).setPreferredWidth(40);
        listaTabela.getColumnModel().getColumn(1).setResizable(false);
        listaTabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        listaTabela.getColumnModel().getColumn(2).setResizable(false);
        listaTabela.getColumnModel().getColumn(2).setPreferredWidth(30);
        listaTabela.getColumnModel().getColumn(3).setResizable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDescricao))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
       campoDescricao.setText("");
       modelo.setNumRows(0);
     
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
       modelo = (DefaultTableModel) listaTabela.getModel();
       modelo.setNumRows(0);
        int verificaCamposVazios=0;
        sb.setDescricao(campoDescricao.getText());
        if(sb.getDescricao().isEmpty()==false){
            query+="descricao = :descricao";  
       }
        if(sb.getDescricao().isEmpty()){
             verificaCamposVazios++;
        }if(verificaCamposVazios==1){
            JOptionPane.showMessageDialog(null, "Favor preencher o campo!");
        }else{
            selectBuscaServicos(sb, query);
            query="SELECT s FROM Servicos s WHERE s."; //Coloco o valor inicial daquery novamente 
            campoDescricao.setText("");
         }
         
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void comboboxCodSerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxCodSerMouseClicked
       
    }//GEN-LAST:event_comboboxCodSerMouseClicked

    private void listaTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTabelaMouseClicked
        selecionaDados();
    }//GEN-LAST:event_listaTabelaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaBuscaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaBuscaServicos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaTabela;
    // End of variables declaration//GEN-END:variables
    public void selecionaDados() {
        defineNiveis dn=new defineNiveis();
        linhaSelecionada = listaTabela.getSelectedRow();
        pegaCodigo=listaTabela.getValueAt(linhaSelecionada, 0).toString();
        passaCodigo=Integer.parseInt(pegaCodigo);
        dn.abreTelaAlteraServicos(passaCodigo);
        dispose();
    }
    
    private void selectBuscaServicos(servicosBean sb, String testeQuery) {
        modelo = (DefaultTableModel) listaTabela.getModel();
        Query query2 = manager.createQuery(testeQuery, Servicos.class);
        if(sb.getDescricao().isEmpty()==false){
            query2.setParameter("descricao", sb.getDescricao()); 
        }
        try{
        List<Servicos> servicosR=query2.getResultList();  //Retorno uma lista com os resultados 
        if(servicosR.isEmpty()==false){
            for (Servicos servicos : servicosR) {
                servicosBean s=new servicosBean();
                int cod=servicos.getCodservicos();
                String descricao=servicos.getDescricao();
                String undM=servicos.getUnd();
                int qtde=servicos.getQtde();
                
                s.setCod(cod);
                s.setDescricao(descricao);
                s.setUndMensal(undM);
                s.setQtde(qtde);
                
                modelo.addRow(new Object[] {
                    s.getCod(),
                    s.getDescricao(),
                    s.getUndMensal(),
                    s.getQtde()
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
