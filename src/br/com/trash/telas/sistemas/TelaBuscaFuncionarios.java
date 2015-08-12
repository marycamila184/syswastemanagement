/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas;

import br.com.trash.controle.defineNiveis;
import br.com.trash.controle.funcionariosBean;
import br.com.trash.entidades.Funcionarios;
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
public class TelaBuscaFuncionarios extends javax.swing.JFrame {
    funcionariosBean fb=new funcionariosBean();
    DefaultTableModel modelo = null;
    persistenciaSelect ps=new persistenciaSelect();
    int linhaSelecionada = 0;
    List<funcionariosBean> t = new ArrayList<>();
    String pegaCodigo=null;
    int passaCodigo=0;
    
    String query="SELECT f FROM Funcionarios f WHERE f.";
  
    /**
     * 
     */
    public TelaBuscaFuncionarios() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTurnos = new javax.swing.ButtonGroup();
        buttonGroupFuncao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoContribuinte = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        checkboxTurnoDiurno = new javax.swing.JRadioButton();
        checkboxTurnoNoturno = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        checkboxFuncaoFiscal = new javax.swing.JRadioButton();
        checkboxFuncaoFuncionarios = new javax.swing.JRadioButton();
        checkboxFuncaoSupervisores = new javax.swing.JRadioButton();
        campoDataInclusao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTabela = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        checkboxStatus = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SYS Waste Magament");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Funcionários", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Contribuinte:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turnos", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        buttonGroupTurnos.add(checkboxTurnoDiurno);
        checkboxTurnoDiurno.setText("Diurno");

        buttonGroupTurnos.add(checkboxTurnoNoturno);
        checkboxTurnoNoturno.setText("Noturno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(checkboxTurnoDiurno)
                .addGap(57, 57, 57)
                .addComponent(checkboxTurnoNoturno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(checkboxTurnoDiurno)
                .addComponent(checkboxTurnoNoturno))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funções", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        buttonGroupFuncao.add(checkboxFuncaoFiscal);
        checkboxFuncaoFiscal.setText("Fiscais");

        buttonGroupFuncao.add(checkboxFuncaoFuncionarios);
        checkboxFuncaoFuncionarios.setText("Funcionários");

        buttonGroupFuncao.add(checkboxFuncaoSupervisores);
        checkboxFuncaoSupervisores.setText("Supervisores");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkboxFuncaoFuncionarios)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkboxFuncaoFiscal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkboxFuncaoSupervisores)
                        .addGap(42, 42, 42))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxFuncaoFiscal)
                    .addComponent(checkboxFuncaoSupervisores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkboxFuncaoFuncionarios))
        );

        jLabel4.setText("Data da Inclusão:");

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/8171_16x16.png"))); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        jPanel5.add(botaoPesquisar);

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

        listaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Contribuinte", "Data ", "Status", "Turnos", "Funções"
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
        jScrollPane2.setViewportView(listaTabela);
        listaTabela.getColumnModel().getColumn(0).setResizable(false);
        listaTabela.getColumnModel().getColumn(0).setPreferredWidth(40);
        listaTabela.getColumnModel().getColumn(1).setResizable(false);
        listaTabela.getColumnModel().getColumn(2).setResizable(false);
        listaTabela.getColumnModel().getColumn(3).setResizable(false);
        listaTabela.getColumnModel().getColumn(4).setResizable(false);
        listaTabela.getColumnModel().getColumn(5).setResizable(false);
        listaTabela.getColumnModel().getColumn(6).setResizable(false);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status do Funcionário:", 0, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        checkboxStatus.setText("Inativo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(checkboxStatus)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkboxStatus, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoContribuinte, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoDataInclusao, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoContribuinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTabelaMouseClicked
        selecionaDados();
    }//GEN-LAST:event_listaTabelaMouseClicked

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
       modelo = (DefaultTableModel) listaTabela.getModel();
       modelo.setNumRows(0);
       int verificaCampoVazios=0;
       int status=0;
       String turno="";
       String funcao="";
       int cod;
      String codigo=campoCod.getText();
      if(codigo.isEmpty()){
          cod=0;
          verificaCampoVazios++;
      }else{
          cod= Integer.parseInt(codigo);
      }
      fb.setCodfunc(cod);
      fb.setContribuinte(campoContribuinte.getText());
      if(fb.getContribuinte().isEmpty()){
          verificaCampoVazios++;
      }
      fb.setNome(campoNome.getText());
      if(fb.getNome().isEmpty()){
          verificaCampoVazios++;
      }
      fb.setDataInclusao(campoDataInclusao.getText());
      if(fb.getDataInclusao().isEmpty()){
          verificaCampoVazios++;
      }
      if(checkboxStatus.isSelected()){
          status=1;
      }else
        if(checkboxStatus.isSelected()==false){
          status=0;
          verificaCampoVazios++;
      }
      fb.setStatus(status);
      if(checkboxTurnoDiurno.isSelected()){
          turno="Diurno";
      }else 
          if(checkboxTurnoNoturno.isSelected()){
              turno="Noturno";
          }else
              if(checkboxTurnoDiurno.isSelected()==false && checkboxTurnoNoturno.isSelected()==false){
                  verificaCampoVazios++;
              }
       fb.setTurno(turno);
       if(checkboxFuncaoFiscal.isSelected()){
           funcao="Fiscal";
       }else
           if(checkboxFuncaoFuncionarios.isSelected()){
               funcao="Funcionario";
           }else
               if(checkboxFuncaoSupervisores.isSelected()){
                   funcao="Supervisor";
               }else
                   if(checkboxFuncaoFiscal.isSelected()==false && checkboxFuncaoFuncionarios.isSelected()==false && checkboxFuncaoSupervisores.isSelected()==false){
                       verificaCampoVazios++;
                   }
       fb.setFuncao(funcao);
       boolean testaAnd=false; //Variavel responsavel pelo teste das queries, para ver se vao ter o AND
       if(fb.getCodfunc()!=0 && testaAnd==false){
            query+="idfunc = :idfunc";
            testaAnd=true;  //Defino ela como true para ter o controle dos ANDS nas queries
       }
       if(fb.getNome().isEmpty()==false && testaAnd==true){
            query+=" AND f.nome = :nome";
       }else
          if(fb.getNome().isEmpty()==false && testaAnd==false){
            query+="nome = :nome";  
            testaAnd=true;
          }
       if(fb.getContribuinte().isEmpty()==false && testaAnd==true){
        query+=" AND f.contribuinte = :contribuinte";
        
      }else
          if(fb.getContribuinte().isEmpty()==false && testaAnd==false){
            query+="contribuinte = :contribuinte";
            testaAnd=true;
          }
       if(fb.getDataInclusao().isEmpty()==false && testaAnd==true){
        query+=" AND f.datainclusao = :datainclusao";
        
      }else 
          if(fb.getDataInclusao().isEmpty()==false && testaAnd==false){
            query+="datainclusao = :datainclusao";
            testaAnd=true;
          }
       if(fb.getStatus()==1 && testaAnd==true){
            query+=" AND f.statusfunc = :statusfunc";
       }else
          if(fb.getStatus()==1 && testaAnd==false){
            query+="statusfunc = :statusfunc";  
            testaAnd=true;
          }
       if(fb.getTurno().isEmpty()==false && testaAnd==true){
            query+=" AND f.turno = :turno";
       }else
          if(fb.getTurno().isEmpty()==false && testaAnd==false){
            query+="turno = :turno";  
            testaAnd=true;
          }
       if(fb.getFuncao().isEmpty()==false && testaAnd==true){
            query+=" AND f.funcao = :funcao";
       }else
          if(fb.getFuncao().isEmpty()==false && testaAnd==false){
            query+="funcao = :funcao";  
            testaAnd=true;
          }
       if(verificaCampoVazios==7){
           JOptionPane.showMessageDialog(null, "Favor preenchder um campo!");
       }else{
        selectBuscaFuncionarios(fb, query);
        campoCod.setText("");
        campoContribuinte.setText("");
        campoNome.setText("");
        campoDataInclusao.setText("");
        checkboxStatus.setSelected(false);
        checkboxTurnoDiurno.setSelected(false);
        checkboxTurnoNoturno.setSelected(false);
        checkboxFuncaoFiscal.setSelected(false);
        checkboxFuncaoFuncionarios.setSelected(false);
        checkboxFuncaoSupervisores.setSelected(false);
        query="SELECT f FROM Funcionarios f WHERE f."; //Coloco o valor inicial daquery novamente 
        
       }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
       campoCod.setText("");
       campoContribuinte.setText("");
       campoNome.setText("");
       campoDataInclusao.setText("");
       checkboxStatus.setSelected(false);  //limpar radio
       checkboxTurnoDiurno.setSelected(false);
       checkboxTurnoNoturno.setSelected(false);
       checkboxFuncaoFiscal.setSelected(false);
       checkboxFuncaoFuncionarios.setSelected(false);
       checkboxFuncaoSupervisores.setSelected(false);  
       modelo.setNumRows(0);
    }//GEN-LAST:event_botaoLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaFuncionarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.ButtonGroup buttonGroupFuncao;
    private javax.swing.ButtonGroup buttonGroupTurnos;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoContribuinte;
    private javax.swing.JTextField campoDataInclusao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JRadioButton checkboxFuncaoFiscal;
    private javax.swing.JRadioButton checkboxFuncaoFuncionarios;
    private javax.swing.JRadioButton checkboxFuncaoSupervisores;
    private javax.swing.JCheckBox checkboxStatus;
    private javax.swing.JRadioButton checkboxTurnoDiurno;
    private javax.swing.JRadioButton checkboxTurnoNoturno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaTabela;
    // End of variables declaration//GEN-END:variables

    private void selectBuscaFuncionarios(funcionariosBean fb, String testeQuery) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
        EntityManager manager = factory.createEntityManager();
        String statusF;
        //defino o modelo para a tabela
        modelo = (DefaultTableModel) listaTabela.getModel();
        Query query = manager.createQuery(testeQuery, Funcionarios.class);
        if(fb.getCodfunc()!=0){
            query.setParameter("idfunc", fb.getCodfunc()); 
        }
        if(fb.getNome().isEmpty()==false){
            query.setParameter("nome", fb.getNome()); 
        }
        if(fb.getContribuinte().isEmpty()==false){
            query.setParameter("contribuinte", fb.getContribuinte()); 
        }
        if(fb.getDataInclusao().isEmpty()==false){
            query.setParameter("datainclusao", fb.getDataInclusao()); 
        }
        if(fb.getStatus()!=0){
            query.setParameter("statusfunc", fb.getStatus()); 
        }
        if(fb.getTurno().isEmpty()==false){
            query.setParameter("turno", fb.getTurno()); 
        }
        if(fb.getFuncao().isEmpty()==false){
            query.setParameter("funcao", fb.getFuncao()); 
        }
        try{
        List<Funcionarios> funcionariosR=query.getResultList();  //Retorno uma lista com os resultados 
        if(funcionariosR.isEmpty()==false){
            for (Funcionarios funcionarios : funcionariosR) {
                    funcionariosBean f=new funcionariosBean();
                    int codF=funcionarios.getIdfunc();
                    String nome=funcionarios.getNome(); 
                    String contribuinte=funcionarios.getContribuinte();
                    String dataInclusao=funcionarios.getDatainclusao();
                    int status=funcionarios.getStatusfunc();
                    String turno =funcionarios.getTurno();
                    String funcao=funcionarios.getFuncao();

                    f.setCodfunc(codF);
                    f.setNome(nome);
                    f.setContribuinte(contribuinte);
                    f.setDataInclusao(dataInclusao);
                    f.setStatus(status);
                    f.setTurno(turno);
                    f.setFuncao(funcao);

                    if(f.getStatus()==1){
                        statusF="Ativo";
                    }else{
                        statusF="Inativo";
                    }
                    
                    modelo.addRow(new Object[] {
                    f.getCodfunc(),
                    f.getNome(),
                    f.getContribuinte(),
                    f.getDataInclusao(),
                    statusF,
                    f.getTurno(),
                    f.getFuncao()
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
        dn.abreTelaAlteraFuncionarios(passaCodigo);
    }
    
    
}
