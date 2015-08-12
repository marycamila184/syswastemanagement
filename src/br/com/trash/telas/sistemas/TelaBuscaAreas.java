/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas;

import br.com.trash.controle.areasBean;
import br.com.trash.controle.defineNiveis;
import br.com.trash.entidades.Areas;
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
public class TelaBuscaAreas extends javax.swing.JFrame {
    areasBean ab=new areasBean();
    DefaultTableModel modelo = null;
    persistenciaSelect ps=new persistenciaSelect();
    int linhaSelecionada = 0;
    String query="SELECT a FROM Areas a WHERE a.";
    String pegaCodigo=null;
    List<areasBean> a = new ArrayList<>();
    int passaCodigo=0;
    /**
     * 
     */
    public TelaBuscaAreas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaTabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        campoCodArea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCodSetor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoSigla = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        campoMunicipio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Area", "Descrição", "Setor", "Sigla", "Município"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        listaTabela.getColumnModel().getColumn(0).setPreferredWidth(25);
        listaTabela.getColumnModel().getColumn(1).setResizable(false);
        listaTabela.getColumnModel().getColumn(1).setPreferredWidth(35);
        listaTabela.getColumnModel().getColumn(2).setResizable(false);
        listaTabela.getColumnModel().getColumn(2).setPreferredWidth(25);
        listaTabela.getColumnModel().getColumn(3).setResizable(false);
        listaTabela.getColumnModel().getColumn(3).setPreferredWidth(25);
        listaTabela.getColumnModel().getColumn(4).setResizable(false);
        listaTabela.getColumnModel().getColumn(4).setPreferredWidth(35);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Areas", 0, 0, new java.awt.Font("SansSerif", 0, 12))); // NOI18N

        jLabel1.setText("Cód. da Area:");

        jLabel2.setText("Cód. do Setor:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Sigla:");

        jLabel5.setText("Município:");

        jPanel2.setLayout(new java.awt.GridLayout());

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campoCodArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(campoCodSetor, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(campoSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoDescricao)
                            .addComponent(campoMunicipio)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCodSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(campoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        modelo = (DefaultTableModel) listaTabela.getModel();
        modelo.setNumRows(0);
        campoCodArea.setText("");
        campoCodSetor.setText("");
        campoDescricao.setText("");
        campoMunicipio.setText("");
        campoSigla.setText("");
        
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        modelo = (DefaultTableModel) listaTabela.getModel();
        modelo.setNumRows(0);
        int verificaCampoVazios=0;
        int codArea;
        int codSetor;
        String codigoA=campoCodArea.getText();
        if(codigoA.isEmpty()){
            codArea=0;
            verificaCampoVazios++;
        }else{
            codArea=Integer.parseInt(codigoA);
        }
        ab.setCodarea(codArea);
        String codigoS=campoCodSetor.getText();
        if(codigoS.isEmpty()){
            codSetor=0;
            verificaCampoVazios++;
        }else{
            codSetor=Integer.parseInt(codigoS);
        }
        ab.setCodsetor(codSetor);
        ab.setDescricao(campoDescricao.getText());
        if(ab.getDescricao().isEmpty()){
          verificaCampoVazios++;
        }
        ab.setMunicipio(campoMunicipio.getText());
        if(ab.getMunicipio().isEmpty()){
          verificaCampoVazios++;
        }
        ab.setSigla(campoSigla.getText());
        if(ab.getSigla().isEmpty()){
          verificaCampoVazios++;
        }
        boolean testaAnd=false;
        if(ab.getCodarea()!=0 && testaAnd==false){
            query+="codarea = :codarea";
            testaAnd=true;  //Defino ela como true para ter o controle dos ANDS nas queries
       }
       if(ab.getCodsetor()!=0 && testaAnd==false){
            query+=" AND a.codareasetor = :codareasetor";
       }else
          if(ab.getCodsetor()!=0 && testaAnd==false){
            query+="codareasetor = :codareasetor";  
            testaAnd=true;
          }
        if(ab.getDescricao().isEmpty()==false && testaAnd==true){
            query+=" AND a.descricao = :descricao";
       }else
          if(ab.getDescricao().isEmpty()==false && testaAnd==false){
            query+="descricao = :descricao";  
            testaAnd=true;
          }
        if(ab.getSigla().isEmpty()==false && testaAnd==true){
            query+=" AND a.sigla = :sigla";
       }else
          if(ab.getSigla().isEmpty()==false && testaAnd==false){
            query+="sigla = :sigla";  
            testaAnd=true;
          }
        if(ab.getMunicipio().isEmpty()==false && testaAnd==true){
            query+=" AND a.municipio = :municipio";
       }else
          if(ab.getMunicipio().isEmpty()==false && testaAnd==false){
            query+="municipio = :municipio";  
            testaAnd=true;
          }
        if(verificaCampoVazios==5){
           JOptionPane.showMessageDialog(null, "Favor preenchder um campo!");
       }else{
            selectBuscaAreas(ab, query);
            campoCodArea.setText("");
            campoCodSetor.setText("");
            campoDescricao.setText("");
            campoMunicipio.setText("");
            campoSigla.setText("");
            query="SELECT a FROM Areas a WHERE a.";
        }
        
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void listaTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTabelaMouseClicked
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaBuscaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaAreas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField campoCodArea;
    private javax.swing.JTextField campoCodSetor;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoMunicipio;
    private javax.swing.JTextField campoSigla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
        dn.abreTelaAlteraAreas(passaCodigo);
    }

    private void selectBuscaAreas(areasBean ab, String testeQuery) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
        EntityManager manager = factory.createEntityManager();
        modelo = (DefaultTableModel) listaTabela.getModel();
        Query query = manager.createQuery(testeQuery, Areas.class);
        if(ab.getCodarea()!=0){
            query.setParameter("codarea", ab.getCodarea()); 
        }
        if(ab.getCodsetor()!=0){
            query.setParameter("codareasetor", ab.getCodsetor()); 
        }
        if(ab.getDescricao().isEmpty()==false){
            query.setParameter("descricao", ab.getDescricao()); 
        }
        if(ab.getSigla().isEmpty()==false){
            query.setParameter("sigla", ab.getSigla()); 
        }
        if(ab.getMunicipio().isEmpty()==false){
            query.setParameter("municipio", ab.getMunicipio()); 
        }
        
        try{
        List<Areas> areasR=query.getResultList();  //Retorno uma lista com os resultados 
        if(areasR.isEmpty()==false){
            for (Areas a : areasR) {
                    areasBean areaB=new areasBean();
                    int codA=a.getCodarea();
                    int codS=a.getCodareasetor();
                    String desc=a.getDescricao();
                    String mun=a.getMunicipio();
                    String s=a.getSigla();
                    
                    areaB.setCodarea(codA);
                    areaB.setCodsetor(codS);
                    areaB.setDescricao(desc);
                    areaB.setMunicipio(mun);
                    areaB.setSigla(s);
                   
                    modelo.addRow(new Object[] {
                    areaB.getCodarea(),
                    areaB.getDescricao(),
                    areaB.getCodsetor(),
                    areaB.getSigla(),
                    areaB.getMunicipio()
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
