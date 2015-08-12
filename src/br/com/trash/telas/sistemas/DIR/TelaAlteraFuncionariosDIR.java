/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.telas.sistemas.DIR;

import br.com.trash.controle.funcionariosBean;
import br.com.trash.entidades.Funcionarios;
import br.com.trash.persistencia.persistenciaUpdate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


/**
 *
 * @author Wendel
 */
public class TelaAlteraFuncionariosDIR extends javax.swing.JFrame {
    int codUpdate=0;
    persistenciaUpdate pu=new persistenciaUpdate();
    /**
     * 
     */
    public TelaAlteraFuncionariosDIR() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoMorada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTelemovel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoContribuinte = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        campoUser = new javax.swing.JTextField();
        checkboxAlteraSenha = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        comboboxNivel = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        comboboxTurno = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        radiobotaoFuncionario = new javax.swing.JRadioButton();
        radiobotaoFiscal = new javax.swing.JRadioButton();
        radiobotaoSupervisor = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        checkboxStatus = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoUserInclusao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoDataInclusao = new javax.swing.JFormattedTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        campoUserAltera = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campodataAltera = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SYS Waste Management");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Funcionários", 2, 0, new java.awt.Font("SansSerif", 1, 12)))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Código:");

        campoCod.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Morada:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Telemóvel:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("N° Contribuinte:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Login", 2, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N
        jPanel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Usuário:");

        campoSenha.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        campoSenha.setEnabled(false);
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Senha:");

        campoUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        campoUser.setEnabled(false);

        checkboxAlteraSenha.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkboxAlteraSenha.setText("Alterar Senha no primeiro Acesso");
        checkboxAlteraSenha.setEnabled(false);

        jLabel10.setText("Nível de Acesso:");

        comboboxNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "comum", "diretoria" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboboxNivel, 0, 149, Short.MAX_VALUE)
                    .addComponent(campoUser))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(checkboxAlteraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(campoUser)
                        .addComponent(jLabel7))
                    .addComponent(campoSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxAlteraSenha)
                    .addComponent(comboboxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/11292_16x16.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        jPanel4.add(botaoCancelar);

        botaoSalvar.setFont(botaoSalvar.getFont().deriveFont((float)12));
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trash/imagens/7881_16x16.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(botaoSalvar);

        comboboxTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha o Turno", "Diurno: 07:00 as 15:00", "Noturno 23:00 as 05:00", "" }));
        comboboxTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxTurnoActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Cadastro", 2, 0, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        buttonGroup1.add(radiobotaoFuncionario);
        radiobotaoFuncionario.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        radiobotaoFuncionario.setText("Funcionário");
        radiobotaoFuncionario.setEnabled(false);

        buttonGroup1.add(radiobotaoFiscal);
        radiobotaoFiscal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        radiobotaoFiscal.setText("Fiscal ");
        radiobotaoFiscal.setEnabled(false);

        buttonGroup1.add(radiobotaoSupervisor);
        radiobotaoSupervisor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radiobotaoSupervisor.setText("Supervisor");
        radiobotaoSupervisor.setEnabled(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status Cadastro", 2, 0, new java.awt.Font("SansSerif", 0, 12))); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        checkboxStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkboxStatus.setSelected(true);
        checkboxStatus.setText("       Ativo");
        checkboxStatus.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel7.add(checkboxStatus);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiobotaoSupervisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiobotaoFiscal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiobotaoFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(radiobotaoFiscal)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(radiobotaoFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(radiobotaoSupervisor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro efetuado:", 0, 0, new java.awt.Font("SansSerif", 0, 12))); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Usuário:");

        campoUserInclusao.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Data de Inclusão:");

        campoDataInclusao.setEnabled(false);
        campoDataInclusao.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        campoDataInclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataInclusaoActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterado", 0, 0, new java.awt.Font("SansSerif", 0, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Usuário:");

        campoUserAltera.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel12.setText("Data de Alteração:");

        campodataAltera.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(campoUserAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campodataAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campodataAltera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(campoUserAltera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(campoUserInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUserInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoNome)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoMorada)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(campoTelemovel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoContribuinte, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(comboboxTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTelemovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoContribuinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Controle");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxTurnoActionPerformed

    private void campoDataInclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataInclusaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataInclusaoActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String funcao="";
        int status=0;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        Date date = new Date(); 
        String dataAltera=dateFormat.format(date);
        String nome=campoNome.getText();
        String morada=campoMorada.getText();
        String telemovel=campoTelemovel.getText();
        String contribuinte=campoContribuinte.getText();
        Object turno=comboboxTurno.getSelectedItem();
        String t=""+turno;
        Object nivel=comboboxNivel.getSelectedItem();
        String n=""+nivel;
        if(checkboxStatus.isSelected()){
            status=1;
        }
        pu.updateTelaAlteraFuncionariosDIR(codUpdate, dataAltera, nome, morada, telemovel, contribuinte, 
                t, n, funcao, status);
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
            java.util.logging.Logger.getLogger(TelaAlteraFuncionariosDIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraFuncionariosDIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraFuncionariosDIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraFuncionariosDIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaAlteraFuncionariosDIR().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoContribuinte;
    private javax.swing.JFormattedTextField campoDataInclusao;
    private javax.swing.JTextField campoMorada;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoTelemovel;
    private javax.swing.JTextField campoUser;
    private javax.swing.JTextField campoUserAltera;
    private javax.swing.JTextField campoUserInclusao;
    private javax.swing.JTextField campodataAltera;
    private javax.swing.JCheckBox checkboxAlteraSenha;
    private javax.swing.JCheckBox checkboxStatus;
    private javax.swing.JComboBox comboboxNivel;
    private javax.swing.JComboBox comboboxTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton radiobotaoFiscal;
    private javax.swing.JRadioButton radiobotaoFuncionario;
    private javax.swing.JRadioButton radiobotaoSupervisor;
    // End of variables declaration//GEN-END:variables

    public void preencheCamposFuncionarios(EntityManagerFactory factory, EntityManager manager,int cod){
        codUpdate=cod;
        funcionariosBean fb=new funcionariosBean();
        manager.getTransaction().begin();
        Funcionarios f = manager.getReference(Funcionarios.class, cod);
        fb.setCodfunc(f.getIdfunc());
        fb.setContribuinte(f.getContribuinte());
        fb.setDataAltera(f.getDataaltera());
        fb.setDataInclusao(f.getDatainclusao());
        fb.setFuncao(f.getFuncao());
        fb.setMorada(f.getMorada());
        fb.setNome(f.getNome());
        fb.setStatus(f.getStatusfunc());
        fb.setTelemovel(f.getTelemovel());
        fb.setTurno(f.getTurno());
        fb.setUserAltera(f.getUseraltera());
        fb.setUserInclusao(f.getUserinclusao());
        fb.setAlteraSenha(f.getAlterasenha());
        fb.setNivel(f.getNivel());
        fb.setUsuario(f.getUsuario());
        fb.setSenha(f.getSenha());
        manager.getTransaction().commit(); 
        preencheCampos(fb);
        manager.close();
        factory.close(); 
    }
   
    public void preencheCampos(funcionariosBean fb){
        campoNome.setText(fb.getNome());
        Object codigo=fb.getCodfunc();
        String codF=""+codigo;
        campoCod.setText(codF);
        campoMorada.setText(fb.getMorada());
        campoTelemovel.setText(fb.getTelemovel());
        campoContribuinte.setText(fb.getContribuinte());
        String turno=fb.getTurno();
        if("Diurno".equals(turno)){
            comboboxTurno.setSelectedItem("Diurno");
        }else
            if("Noturno".equals(turno)){
                comboboxTurno.setSelectedItem("Noturno");
            }
        campoUser.setText(fb.getUsuario());
        campoSenha.setText(fb.getSenha());
        String nivel=fb.getNivel();
        if("admin".equals(nivel)){
            comboboxNivel.setSelectedItem("admin");
        }else
            if("dir".equals(nivel)){
                comboboxNivel.setSelectedItem("dir");
            }else
                if("comum".equals(nivel)){
                    comboboxNivel.setSelectedItem("usuario comum");
                }
        if("s".equals(fb.getAlteraSenha())){
            checkboxAlteraSenha.setSelected(true);
        }else
            if("n".equals(fb.getAlteraSenha())){
                checkboxAlteraSenha.setSelected(false);
            }
        if("Fiscal".equals(fb.getFuncao())){
            radiobotaoFiscal.isSelected();
        }else
            if("Funcionario".equals(fb.getFuncao())){
               radiobotaoFuncionario.isSelected();
            }else
                if("Supervisor".equals(fb.getFuncao())){
                    radiobotaoSupervisor.isSelected();
              }
        if(fb.getStatus()==1){
            checkboxStatus.isSelected();
        }
        campoUserAltera.setText(fb.getUserAltera());
        campoUserInclusao.setText(fb.getUserInclusao());
        campodataAltera.setText(fb.getDataAltera());
        campoDataInclusao.setText(fb.getDataInclusao());
    }
}
