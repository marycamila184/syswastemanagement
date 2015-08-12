/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas;

import br.com.trash.controle.defineNiveis;
import br.com.trash.controle.osBean;
import br.com.trash.entidades.Ordemdeservico;
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
public class TelaBuscaOrdemDeServico extends javax.swing.JFrame {
    osBean osb=new osBean();
    DefaultTableModel modelo = null;
    persistenciaSelect ps=new persistenciaSelect();
    int linhaSelecionada = 0;
    String testequery="SELECT o FROM Ordemdeservico o WHERE o.";
    String pegaCodigo=null;
    int passaCodigo=0;
    
    /**
     * 
     */
    public TelaBuscaOrdemDeServico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoCodOs = new javax.swing.JTextField();
        campoDataRealizada = new javax.swing.JTextField();
        campoSetor = new javax.swing.JTextField();
        campoFuncionario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Ordem de Serviço", 0, 0, new java.awt.Font("SansSerif", 0, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btPesquisar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/8171_16x16.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(btPesquisar);

        btCancelar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11292_16x16.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btCancelar);

        btLimpar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11387_16x16.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel3.add(btLimpar);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Cód. OS:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Data realizada:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Setor:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Funcionário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCodOs, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoSetor)
                                    .addComponent(campoFuncionario)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoDataRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDataRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(campoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. OS", "Data", "Setor", "Funcionário"
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
        listaTabela.getColumnModel().getColumn(0).setPreferredWidth(35);
        listaTabela.getColumnModel().getColumn(1).setResizable(false);
        listaTabela.getColumnModel().getColumn(1).setPreferredWidth(30);
        listaTabela.getColumnModel().getColumn(2).setResizable(false);
        listaTabela.getColumnModel().getColumn(2).setPreferredWidth(40);
        listaTabela.getColumnModel().getColumn(3).setResizable(false);
        listaTabela.getColumnModel().getColumn(3).setPreferredWidth(35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        campoCodOs.setText("");
        campoDataRealizada.setText("");
        campoFuncionario.setText("");
        campoSetor.setText("");
        modelo.setNumRows(0);
               
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
       modelo = (DefaultTableModel) listaTabela.getModel();
       modelo.setNumRows(0);
        int verificaCamposVazios=0;
      int cod;
      int codS=0;
      int codf=0;
      String codigo=campoCodOs.getText();
      if(codigo.isEmpty()){
          cod=0;
          verificaCamposVazios++;
      }else{
          cod= Integer.parseInt(codigo);
      }
      osb.setCodOS(cod);
      osb.setDataOS(campoDataRealizada.getText());
      if(osb.getDataOS().isEmpty()){
          verificaCamposVazios++;
      }
      String set=campoSetor.getText();
      if(set.isEmpty()){
          verificaCamposVazios++;
      }else{
          codS=ps.selectSetor(set);
      }
      osb.setCodSetor(codS);
      String f=campoFuncionario.getText();
      if(f.isEmpty()){
          verificaCamposVazios++;
      }else{
          codf=ps.selectFuncionario(f);
      }
      osb.setCodfuncOS(codf);
       boolean testaAnd=false; 
       if(osb.getCodOS()!=0 && testaAnd==false){
        testequery+="codos = :codos";
        testaAnd=true;  //Defino ela como true para ter o controle dos ANDS nas queries
      }
      if(osb.getDataOS().isEmpty()==false && testaAnd==true){
        testequery+=" AND o.dataOS = :dataOS";
      }else
          if(osb.getDataOS().isEmpty()==false && testaAnd==false){
            testequery+="dataOS = :dataOS";  
          }
      if(osb.getCodSetor()!=0 && testaAnd==true){
        testequery+=" AND o.codsetor = :codsetor";
      }else
          if(osb.getCodSetor()!=0 && testaAnd==false){
            testequery+="codsetor = :codsetor";  
          }
      if(osb.getCodfuncOS()!=0 && testaAnd==true){
        testequery+=" AND o.codfuncionarioOS = :codfuncionarioOS";
      }else
          if(osb.getCodfuncOS()!=0 && testaAnd==false){
            testequery+="codfuncionarioOS = :codfuncionarioOS";  
          }
      if(verificaCamposVazios==4){
          JOptionPane.showMessageDialog(null, "Favor preencher um campo!");
      }else{
        selectBuscaFornecedores(osb, testequery);
        campoCodOs.setText("");
        campoDataRealizada.setText("");
        campoFuncionario.setText("");
        campoSetor.setText("");
        
      }
      testequery="SELECT o FROM Ordemdeservico o WHERE o.";
    }//GEN-LAST:event_btPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaOrdemDeServico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JTextField campoCodOs;
    private javax.swing.JTextField campoDataRealizada;
    private javax.swing.JTextField campoFuncionario;
    private javax.swing.JTextField campoSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaTabela;
    // End of variables declaration//GEN-END:variables

    private void selectBuscaFornecedores(osBean osb, String testequery) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
        EntityManager manager = factory.createEntityManager();
        modelo = (DefaultTableModel) listaTabela.getModel();
        try{
            Query query2 = manager.createQuery(testequery, Ordemdeservico.class);
            if(osb.getCodOS()!=0){
                query2.setParameter("codos", osb.getCodOS()); 
            }
             if(osb.getDataOS().isEmpty()==false){
                  query2.setParameter("dataOS", osb.getDataOS()); 
             }
             if(osb.getCodSetor()!=0){
                query2.setParameter("codsetor", osb.getCodSetor()); 
            }
            if(osb.getCodfuncOS()!=0){
                query2.setParameter("codfuncionarioOS", osb.getCodfuncOS()); 
            }
            List<Ordemdeservico> os=query2.getResultList();  //Retorno uma lista com os resultados 
            if(os.isEmpty()==false){
                for (Ordemdeservico o : os) {
                    osBean s=new osBean();
                    int codos=o.getCodos();
                    String data=o.getDataOS();
                    int setor=o.getCodsetor();
                    int func=o.getCodfuncionarioOS();
                    
                    s.setCodOS(codos);
                    s.setDataOS(data);
                    s.setCodSetor(setor);
                    s.setCodfuncOS(func);
                    
                    String nomeF=ps.selectComboFuncionario(s.getCodfuncOS());
                    String set=ps.selectComboSetor(s.getCodfuncOS());
                    
                    modelo.addRow(new Object[] {
                    s.getCodOS(),
                    s.getDataOS(),
                    set,
                    nomeF
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
    
    public void selecionaDados() {
        defineNiveis dn=new defineNiveis();
        linhaSelecionada = listaTabela.getSelectedRow();
        pegaCodigo=listaTabela.getValueAt(linhaSelecionada, 0).toString();
        passaCodigo=Integer.parseInt(pegaCodigo);
        dn.abreTelaVisualizaOS(passaCodigo);
        
    }
}
