package br.com.trash.telas.sistemas;

import br.com.trash.controle.defineNiveis;
import br.com.trash.controle.fornecedoresBean;
import br.com.trash.controle.servicosBean;
import br.com.trash.controle.setoresBean;
import br.com.trash.entidades.Servicos;
import br.com.trash.entidades.Setores;
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
public class TelaBuscaSetores extends javax.swing.JFrame {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
    EntityManager manager = factory.createEntityManager();
    fornecedoresBean fb=new fornecedoresBean();
    DefaultTableModel modelo = null;
    persistenciaSelect ps=new persistenciaSelect();
    int linhaSelecionada = 0;
    List<fornecedoresBean> t = new ArrayList<>();
    String pegaCodigo=null;
    int passaCodigo=0;
    setoresBean sb=new setoresBean();
    String query="SELECT s FROM Setores s WHERE s.";
    /**
     *
     */
    public TelaBuscaSetores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
   
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        campoMunicipio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoCodSetores = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoSigla = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDataInclusao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SYS Waste Magamente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Setores", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        listaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Município", "Descrição", "Sigla", "Data Inclusão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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
        listaTabela.getColumnModel().getColumn(2).setResizable(false);
        listaTabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        listaTabela.getColumnModel().getColumn(3).setResizable(false);
        listaTabela.getColumnModel().getColumn(3).setPreferredWidth(20);

        jLabel1.setText("Município:");

        jLabel2.setText("Código:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Sigla:");

        jLabel5.setText("Data da Inclusão:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCodSetores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoSigla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodSetores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTabelaMouseClicked
        selecionaDados();
    }//GEN-LAST:event_listaTabelaMouseClicked

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        int verificaCamposVazios=0;
        modelo = (DefaultTableModel) listaTabela.getModel();
        modelo.setNumRows(0);
        int cod;
        String codigo=campoCodSetores.getText();
        if(codigo.isEmpty()){
            cod=0;
            verificaCamposVazios++;
        }else{
          cod= Integer.parseInt(codigo);
        }
        sb.setCod(cod);
        sb.setMunicipio(campoMunicipio.getText());
        if(sb.getMunicipio().isEmpty()){
            verificaCamposVazios++;
        }
        sb.setSigla(campoSigla.getText());
        if(sb.getSigla().isEmpty()){
            verificaCamposVazios++;
        }
        sb.setDescricao(campoDescricao.getText());
        if(sb.getDescricao().isEmpty()){
            verificaCamposVazios++;
        }
        sb.setDataInclusao(campoDataInclusao.getText());
        if(sb.getDataInclusao().isEmpty()){
            verificaCamposVazios++;
        }
        boolean testaAnd=false;
        if(sb.getCod()!=0 && testaAnd==false){
            query+="codsetores = :codsetores";
            testaAnd=true;  //Defino ela como true para ter o controle dos ANDS nas queries
       }
       if(sb.getMunicipio().isEmpty()==false && testaAnd==true){
            query+=" AND s.municipio = :municipio";
       }else
          if(sb.getMunicipio().isEmpty()==false && testaAnd==false){
            query+="municipio = :municipio";  
            testaAnd=true;
          }
       if(sb.getDescricao().isEmpty()==false && testaAnd==true){
           query+=" AND s.descricao = :descricao";
        }else
          if(sb.getDescricao().isEmpty()==false && testaAnd==false){
            query+="descricao = :descricao";
            testaAnd=true;
          }
       if(sb.getSigla().isEmpty()==false && testaAnd==true){
           query+=" AND s.sigla = :sigla";
        }else
          if(sb.getSigla().isEmpty()==false && testaAnd==false){
            query+="sigla = :sigla";
            testaAnd=true;
          }
       if(sb.getDataInclusao().isEmpty()==false && testaAnd==true){
           query+=" AND s.datainclusao = :datainclusao";
        }else
          if(sb.getDataInclusao().isEmpty()==false && testaAnd==false){
            query+="datainclusao = :datainclusao";
            testaAnd=true;
          }
       if(verificaCamposVazios==5){
           JOptionPane.showMessageDialog(null, "Preenche um campo!");
       }else{
            selectBuscaSetores(sb, query);
            query="SELECT s FROM Setores s WHERE s."; //Coloco o valor inicial daquery novamente 
             //fazer o select para ver se ja possui usuario para alteração
             campoCodSetores.setText("");
             campoMunicipio.setText("");
             campoSigla.setText("");
             campoDescricao.setText("");
             campoDataInclusao.setText(""); 
       }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoCodSetores.setText("");
        campoMunicipio.setText("");
        campoSigla.setText("");
        campoDescricao.setText("");
        campoDataInclusao.setText("");  
        modelo.setNumRows(0);
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscaSetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaSetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaSetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaSetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaBuscaSetores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField campoCodSetores;
    private javax.swing.JTextField campoDataInclusao;
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
        dn.abreTelaAlteraSetores(passaCodigo);
        dispose();
    }

    private void selectBuscaSetores(setoresBean sb, String testeQuery) {
        modelo = (DefaultTableModel) listaTabela.getModel();
        Query query2 = manager.createQuery(testeQuery, Servicos.class);
        if(sb.getCod()!=0){
            query2.setParameter("codsetores", sb.getCod()); 
        }
        if(sb.getMunicipio().isEmpty()==false){
            query2.setParameter("municipio", sb.getMunicipio()); 
        }
        if(sb.getDescricao().isEmpty()==false){
            query2.setParameter("descricao", sb.getDescricao()); 
        }
        if(sb.getSigla().isEmpty()==false){
            query2.setParameter("bairro", sb.getSigla()); 
        }
        if(sb.getDataInclusao().isEmpty()==false){
            query2.setParameter("bairro", sb.getDataInclusao()); 
        }
        List<Setores> setoresR=query2.getResultList();  //Retorno uma lista com os resultados 
        if(setoresR!=null){
            for (Setores setor : setoresR) {
                setoresBean s=new setoresBean();
                int cod=setor.getCodsetores();
                String municipio=setor.getMunicipio();
                String descricao=setor.getDescricao();
                String sigla=setor.getSigla();
                String dataInclusao=setor.getDatainclusao();
                
                s.setCod(cod);
                s.setDescricao(descricao);
                s.setDataInclusao(dataInclusao);
                s.setSigla(sigla);
                s.setMunicipio(municipio);
                
                modelo.addRow(new Object[] {
                    s.getCod(),
                    s.getMunicipio(),
                    s.getDescricao(),
                    s.getSigla(),
                    s.getDataInclusao()
                });
                
            }
    
        }else{
           JOptionPane.showMessageDialog(null, "Não há resultados para essa busca!");
        } 
    }
}


