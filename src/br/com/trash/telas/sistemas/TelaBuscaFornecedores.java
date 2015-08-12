/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas;

import br.com.trash.controle.defineNiveis;
import br.com.trash.controle.fornecedoresBean;
import br.com.trash.entidades.Fornecedores;
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
public class TelaBuscaFornecedores extends javax.swing.JFrame {
    
    fornecedoresBean fb=new fornecedoresBean();
    DefaultTableModel modelo = null;
    persistenciaSelect ps=new persistenciaSelect();
    int linhaSelecionada = 0;
    String query="SELECT f FROM Fornecedores f WHERE f.";
    List<fornecedoresBean> t = new ArrayList<>();
    String pegaCodigo=null;
    int passaCodigo=0;

    /**
     * 
     */
    public TelaBuscaFornecedores() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        campoRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoMunicipio = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botaoBuscar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        campoTelemovel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDataInclusao = new javax.swing.JTextField();
        campoNIF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SYS Waste Magament");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Fornecedores", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        jLabel1.setText("Código:");

        jLabel2.setText("Razão Social:");

        jLabel3.setText("Município:");

        jLabel4.setText("Data da Inclusão:");

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/8171_16x16.png"))); // NOI18N
        botaoBuscar.setText("Pesquisar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(botaoBuscar);

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11292_16x16.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(botaoCancelar);

        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11387_16x16.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel5.add(botaoLimpar);

        jLabel5.setText("Bairro:");

        jLabel6.setText("Telemóvel:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("NR. NIF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNIF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoDataInclusao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTelemovel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoBairro)
                            .addComponent(campoRazaoSocial)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoMunicipio))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelemovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(campoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        listaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Razão Social", "Município", "Bairro", "Telemóvel", "Data", "NR. NIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        listaTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        listaTabela.getColumnModel().getColumn(1).setResizable(false);
        listaTabela.getColumnModel().getColumn(2).setResizable(false);
        listaTabela.getColumnModel().getColumn(3).setResizable(false);
        listaTabela.getColumnModel().getColumn(4).setResizable(false);
        listaTabela.getColumnModel().getColumn(5).setResizable(false);
        listaTabela.getColumnModel().getColumn(6).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
       campoCod.setText("");
       campoBairro.setText("");
       campoDataInclusao.setText("");
       campoMunicipio.setText("");
       campoNIF.setText("");
       campoRazaoSocial.setText("");
       campoTelemovel.setText("");
       modelo.setNumRows(0);
      
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
      modelo = (DefaultTableModel) listaTabela.getModel();
       modelo.setNumRows(0);
        int verificaCamposVazios=0;
      int cod;
      String codigo=campoCod.getText();
      if(codigo.isEmpty()){
          cod=0;
          verificaCamposVazios++;
      }else{
          cod= Integer.parseInt(codigo);
      }
      fb.setCod(cod);
      fb.setRazao(campoRazaoSocial.getText());
      if(fb.getRazao().isEmpty()){
          verificaCamposVazios++;
      }
      fb.setMunicipio(campoMunicipio.getText());
      if(fb.getMunicipio().isEmpty()){
          verificaCamposVazios++;
      }
      fb.setBairro(campoBairro.getText());
      if(fb.getBairro().isEmpty()){
          verificaCamposVazios++;
      }
      fb.setTelemovel1(campoTelemovel.getText());
      if(fb.getTelemovel1().isEmpty()){
          verificaCamposVazios++;
      }
      fb.setNif(campoNIF.getText());
      if(fb.getNif().isEmpty()){
          verificaCamposVazios++;
      }
      fb.setDataInclusao(campoDataInclusao.getText());
      if(fb.getDataInclusao().isEmpty()){
          verificaCamposVazios++;
      }
      boolean testaAnd=false; //Variavel responsavel pelo teste das queries, para ver se vao ter o AND
      if(fb.getCod()!=0 && testaAnd==false){
        query+="idfornecedores = :idfornecedores";
        testaAnd=true;  //Defino ela como true para ter o controle dos ANDS nas queries
      }
      if(fb.getRazao().isEmpty()==false && testaAnd==true){
        query+=" AND f.razaoSocial = :razaoSocial";
      }else
          if(fb.getRazao().isEmpty()==false && testaAnd==false){
            query+="razaoSocial = :razaoSocial";  
          }
      if(fb.getMunicipio().isEmpty()==false && testaAnd==true){
        query+=" AND f.municipio = :municipio";
        testaAnd=true;
      }else
          if(fb.getMunicipio().isEmpty()==false && testaAnd==false){
            query+="municipio = :municipio";
            testaAnd=true;
          }
      if(fb.getBairro().isEmpty()==false && testaAnd==true){
        query+=" AND f.bairro = :bairro";
      }else 
          if(fb.getBairro().isEmpty()==false && testaAnd==false){
            query+="bairro = :bairro";
            testaAnd=true;
      }
      if(fb.getTelemovel1().isEmpty()==false && testaAnd==true){
        query+=" AND f.telemovel1 = :telemovel1 AND f.telemovel2 = :telemovel2";
      }else 
         if(fb.getTelemovel1().isEmpty()==false && testaAnd==false){
            query+="telemovel1 = :telemovel1 AND f.telemovel2 = :telemovel2";
            testaAnd=true;
      }     
      if(fb.getNif().isEmpty()==false && testaAnd==true){
        query+=" AND f.nif = :nif";
      }else 
           if(fb.getNif().isEmpty()==false && testaAnd==false){
           query+="nif = :nif";
           testaAnd=true;
      }
      if(fb.getDataInclusao().isEmpty()==false && testaAnd==true){
        query+=" AND f.datainclusao = :datainclusao";
      }else 
          if(fb.getDataInclusao().isEmpty()==false && testaAnd==false){
            query+="datainclusao = :datainclusao";
            testaAnd=true;
      }
      if(verificaCamposVazios==7){
          JOptionPane.showMessageDialog(null, "Favor preencher um campo!");
      }else{
        selectBuscaFornecedores(fb, query);
        campoCod.setText("");
        campoRazaoSocial.setText("");
        campoMunicipio.setText("");
        campoBairro.setText("");
        campoTelemovel.setText("");
        campoNIF.setText("");
        campoDataInclusao.setText("");
      }
      query="SELECT f FROM Fornecedores f WHERE f.";
    }//GEN-LAST:event_botaoBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaBuscaFornecedores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoDataInclusao;
    private javax.swing.JTextField campoMunicipio;
    private javax.swing.JTextField campoNIF;
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JTextField campoTelemovel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable listaTabela;
    // End of variables declaration//GEN-END:variables

    public void selectBuscaFornecedores(fornecedoresBean fb, String testeQuery) {
        //defino o modelo para a tabela
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
        EntityManager manager = factory.createEntityManager();
        modelo = (DefaultTableModel) listaTabela.getModel();
        try{
        Query query2 = manager.createQuery(testeQuery, Fornecedores.class);
        //Estruturas condicionais para a comparação para setar os 
        //parametros para a busca
        if(fb.getCod()!=0){
            query2.setParameter("idfornecedores", fb.getCod()); 
        }
        if(fb.getRazao().isEmpty()==false){
            query2.setParameter("razaoSocial", fb.getRazao()); 
        }
        if(fb.getMunicipio().isEmpty()==false){
            query2.setParameter("municipio", fb.getMunicipio()); 
        }
        if(fb.getBairro().isEmpty()==false){
            query2.setParameter("bairro", fb.getBairro()); 
        }
        if(fb.getTelemovel1().isEmpty()==false){
            query2.setParameter("telemovel1", fb.getTelemovel1()); 
            query2.setParameter("telemovel2", fb.getTelemovel1());
        }
        if(fb.getDataInclusao().isEmpty()==false){
            query2.setParameter("datainclusao", fb.getDataInclusao()); 
        }
        if(fb.getNif().isEmpty()==false){
            query2.setParameter("nif", fb.getNif()); 
        }
         //começo a manipulação com minhas classes entidades
            List<Fornecedores> fornecedoresR=query2.getResultList();
            //Retorno uma lista com os resultados 
            if(fornecedoresR.isEmpty()==false){ //comparação para ver se ha resultados
                for (Fornecedores fornecedores : fornecedoresR) { //estou os valores da lista
                    fornecedoresBean f=new fornecedoresBean();
                    passaCodigo=fornecedores.getIdfornecedores();
                    int codF=fornecedores.getIdfornecedores();
                    String razao=fornecedores.getRazaoSocial(); 
                    String municipio=fornecedores.getMunicipio();
                    String bairro=fornecedores.getBairro();
                    String telemovel=fornecedores.getTelemovel1();
                    String dataInclusao =fornecedores.getDatainclusao();
                    String nif=fornecedores.getNif();

                    f.setCod(codF);
                    f.setRazao(razao);
                    f.setMunicipio(municipio);
                    f.setBairro(bairro);
                    f.setTelemovel1(telemovel);
                    f.setDataInclusao(dataInclusao);
                    f.setNif(nif);

                    modelo.addRow(new Object[] {
                    f.getCod(),
                    f.getRazao(),
                    f.getMunicipio(),
                    f.getBairro(),
                    f.getTelemovel1(),
                    f.getDataInclusao(),
                    f.getNif()
                });
                }
           }else{
               JOptionPane.showMessageDialog(null, "Não há resultados para essa busca!");
            }
        }
        finally{
            manager.close();
            factory.close(); 
        }
    }
    
    public void selecionaDados() {
        defineNiveis dn=new defineNiveis();
        linhaSelecionada = listaTabela.getSelectedRow();
        pegaCodigo=listaTabela.getValueAt(linhaSelecionada, 0).toString();
        passaCodigo=Integer.parseInt(pegaCodigo);
        dn.abreTelaAlteraFornecedores(passaCodigo);
        dispose();
    }
    

}