/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * ----------------------------------------------------------- 
 * PROFESSOR LISTA
 * -----------------------------------------------------------
 */
package Pacote_06;

import Pacote_01.Tela_02;
import Pacote_02.Professor_Parametro;
import Pacote_03.Professor_Cadastro;
import Pacote_04.Professor;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Pacote_09.ProfessorDao;

public final class Professor_Lista extends javax.swing.JFrame {

    int MATRICULA = 0;

    public Professor_Lista() {
        initComponents();
        mostraTable();
        insereDadosTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_DELETE = new javax.swing.JButton();
        BT_VOLTAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_PROFESSOR = new javax.swing.JTable();
        PAINEL_PROFESSOR_CADASTRO = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NOME_MATRICULA = new javax.swing.JLabel();
        CX_MATRICULA = new javax.swing.JTextField();
        NOME_NOME = new javax.swing.JLabel();
        CX_NOME = new javax.swing.JTextField();
        NOME_RG = new javax.swing.JLabel();
        CX_RG = new javax.swing.JFormattedTextField();
        NOME_CPF = new javax.swing.JLabel();
        CX_CPF = new javax.swing.JFormattedTextField();
        NOME_EDERECO = new javax.swing.JLabel();
        CX_ENDERECO = new javax.swing.JTextField();
        NOME_BAIRRO = new javax.swing.JLabel();
        CX_BAIRRO = new javax.swing.JTextField();
        NOME_TELEFONE = new javax.swing.JLabel();
        CX_TELEFONE = new javax.swing.JFormattedTextField();
        BT_SEXO = new javax.swing.JComboBox<>();
        NOME_SEXO = new javax.swing.JLabel();
        CX_EMAIL = new javax.swing.JTextField();
        NOME_EMAIL = new javax.swing.JLabel();
        NOME_DISCIPLINA = new javax.swing.JLabel();
        NOME_ATUACAO = new javax.swing.JLabel();
        CX_DISCIPLINA = new javax.swing.JTextField();
        CX_ATUACAO = new javax.swing.JTextField();
        BT_ATUALIZAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BT_VOLTA_PRINCIPAL = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_DELETE.setText("Remover");
        BT_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(BT_DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 564, 103, -1));

        BT_VOLTAR.setText("Voltar");
        BT_VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VOLTARActionPerformed(evt);
            }
        });
        getContentPane().add(BT_VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 564, 99, -1));

        TB_PROFESSOR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOME", "RG", "CPF", "ENDEREÇO", "BAIRRO", "TELEFONE", "EMAIL", "SEXO", "DISCIPLINA", "ATUAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_PROFESSOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_PROFESSORMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_PROFESSOR);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1260, 190));

        PAINEL_PROFESSOR_CADASTRO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROFESSORES CADASTRADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 24))); // NOI18N
        getContentPane().add(PAINEL_PROFESSOR_CADASTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1260, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14))); // NOI18N

        NOME_MATRICULA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_MATRICULA.setText("Matrícula");

        CX_MATRICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_MATRICULAActionPerformed(evt);
            }
        });

        NOME_NOME.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_NOME.setText("Nome");

        CX_NOME.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CX_NOMEFocusGained(evt);
            }
        });
        CX_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_NOMEActionPerformed(evt);
            }
        });

        NOME_RG.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_RG.setText("RG");

        CX_RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        CX_RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_RGActionPerformed(evt);
            }
        });

        NOME_CPF.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_CPF.setText("CPF");

        try {
            CX_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CX_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_CPFActionPerformed(evt);
            }
        });

        NOME_EDERECO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_EDERECO.setText("Endereço");

        CX_ENDERECO.setToolTipText("As disciplinas são separadas por vígula.");
        CX_ENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_ENDERECOActionPerformed(evt);
            }
        });

        NOME_BAIRRO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_BAIRRO.setText("Bairro");

        CX_BAIRRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_BAIRROActionPerformed(evt);
            }
        });

        NOME_TELEFONE.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_TELEFONE.setText("Telefone");

        try {
            CX_TELEFONE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CX_TELEFONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_TELEFONEActionPerformed(evt);
            }
        });

        BT_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        BT_SEXO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SEXOActionPerformed(evt);
            }
        });

        NOME_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_SEXO.setText("Sexo");

        CX_EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_EMAILActionPerformed(evt);
            }
        });

        NOME_EMAIL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_EMAIL.setText("Email");

        NOME_DISCIPLINA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_DISCIPLINA.setText("Disciplina");

        NOME_ATUACAO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_ATUACAO.setText("Atuação");

        CX_DISCIPLINA.setToolTipText("As disciplinas são separadas por vígula.");
        CX_DISCIPLINA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CX_DISCIPLINAFocusGained(evt);
            }
        });
        CX_DISCIPLINA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_DISCIPLINAActionPerformed(evt);
            }
        });

        CX_ATUACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_ATUACAOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NOME_CPF)
                    .addComponent(NOME_RG)
                    .addComponent(NOME_MATRICULA)
                    .addComponent(NOME_NOME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CX_MATRICULA)
                    .addComponent(CX_NOME)
                    .addComponent(CX_RG)
                    .addComponent(CX_CPF))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NOME_BAIRRO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NOME_EDERECO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NOME_TELEFONE, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NOME_EMAIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CX_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CX_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CX_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NOME_ATUACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NOME_DISCIPLINA)
                                    .addComponent(NOME_SEXO)))
                            .addComponent(CX_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CX_ATUACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CX_DISCIPLINA, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CX_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOME_EDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CX_MATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOME_MATRICULA))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NOME_SEXO)
                            .addComponent(BT_SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NOME_ATUACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CX_ATUACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NOME_BAIRRO)
                        .addComponent(NOME_NOME)
                        .addComponent(CX_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CX_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CX_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NOME_RG))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CX_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CX_DISCIPLINA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NOME_DISCIPLINA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NOME_CPF))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CX_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NOME_EMAIL)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CX_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(NOME_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 1260, -1));

        BT_ATUALIZAR.setText("Atualizar");
        BT_ATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ATUALIZARActionPerformed(evt);
            }
        });
        getContentPane().add(BT_ATUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 564, 101, -1));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 599, -1, -1));

        BT_VOLTA_PRINCIPAL.setText("Início");
        BT_VOLTA_PRINCIPAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VOLTA_PRINCIPALActionPerformed(evt);
            }
        });
        getContentPane().add(BT_VOLTA_PRINCIPAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 564, 100, -1));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 639, -1, -1));

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 564, -1, -1));

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 618, -1, 60));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 618, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/logo_III.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 148, 60));

        setSize(new java.awt.Dimension(1290, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_VOLTA_PRINCIPALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VOLTA_PRINCIPALActionPerformed
        // TODO add your handling code here:
        Tela_02 PuxaTela = new Tela_02();
        PuxaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_VOLTA_PRINCIPALActionPerformed

    private void BT_VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VOLTARActionPerformed
        // TODO add your handling code here:
        Professor_Cadastro PuxaTela = new Professor_Cadastro();
        PuxaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_VOLTARActionPerformed

    private void BT_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DELETEActionPerformed

        if (MATRICULA == 0) {
            JOptionPane.showMessageDialog(null, "SELECIONE PRIMEIRO");
        } else {
            removeProfessor();
            insereDadosTable();
        }

    }//GEN-LAST:event_BT_DELETEActionPerformed
    /**
     * Mostra em tela todos os cadastros quando selecionados com as opções 
     * dos botões remover ou atualizar o cadastro “Professor” ou “Aluno”, 
     * além do botão voltar a tela anterior ou a tela de início do sistema.
     * @param evt 
     */
    private void TB_PROFESSORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_PROFESSORMouseClicked
        CX_MATRICULA.setText("" + TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 0).toString());
        CX_NOME.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 1).toString());
        CX_RG.setText((String) TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 2));
        CX_CPF.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 3).toString());
        CX_ENDERECO.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 4).toString());
        CX_BAIRRO.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 5).toString());
        CX_TELEFONE.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 6).toString());
        CX_EMAIL.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 7).toString());
        BT_SEXO.setToolTipText((String) TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 8));
        CX_DISCIPLINA.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 9).toString());
        CX_ATUACAO.setText(TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 10).toString());
        if (evt.getClickCount() == 1) {
            Object obj = (TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 0));
            String Id = obj.toString();
            MATRICULA = Integer.parseInt(Id);
            System.out.println(MATRICULA);

        }
    }//GEN-LAST:event_TB_PROFESSORMouseClicked

    private void CX_MATRICULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_MATRICULAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_MATRICULAActionPerformed

    private void CX_NOMEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CX_NOMEFocusGained

    }//GEN-LAST:event_CX_NOMEFocusGained

    private void CX_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_NOMEActionPerformed

    private void CX_RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_RGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_RGActionPerformed

    private void CX_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_CPFActionPerformed

    private void CX_ENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_ENDERECOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_ENDERECOActionPerformed

    private void CX_BAIRROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_BAIRROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_BAIRROActionPerformed

    private void CX_TELEFONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_TELEFONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_TELEFONEActionPerformed

    private void BT_SEXOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SEXOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_SEXOActionPerformed

    private void CX_EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_EMAILActionPerformed

    private void CX_DISCIPLINAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CX_DISCIPLINAFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_DISCIPLINAFocusGained

    private void CX_DISCIPLINAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_DISCIPLINAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_DISCIPLINAActionPerformed

    private void CX_ATUACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_ATUACAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_ATUACAOActionPerformed

    private void BT_ATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ATUALIZARActionPerformed
        // TODO add your handling code here:
        if (TB_PROFESSOR.getSelectedRow() != -1) {
            String Sexo = (String) BT_SEXO.getSelectedItem();

            Professor_Parametro jobs_ti = new Professor_Parametro();
            ProfessorDao work = new ProfessorDao();

            jobs_ti.setNOME(CX_NOME.getText());
            jobs_ti.setRG(CX_RG.getText());
            jobs_ti.setCPF(CX_CPF.getText());
            jobs_ti.setENDERECO(CX_ENDERECO.getText());
            jobs_ti.setBAIRRO(CX_BAIRRO.getText());
            jobs_ti.setTELEFONE(CX_TELEFONE.getText());
            jobs_ti.setEMAIL(CX_EMAIL.getText());
            jobs_ti.setSEXO(Sexo);
            jobs_ti.setDISCIPLINA(CX_DISCIPLINA.getText());
            jobs_ti.setATUACAO(CX_ATUACAO.getText());
            jobs_ti.setMATRICULA((long) TB_PROFESSOR.getValueAt(TB_PROFESSOR.getSelectedRow(), 0));
            work.update(jobs_ti);

            new Professor_Lista().setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_BT_ATUALIZARActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Professor_Lista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ATUALIZAR;
    private javax.swing.JButton BT_DELETE;
    private javax.swing.JComboBox<String> BT_SEXO;
    private javax.swing.JButton BT_VOLTAR;
    private javax.swing.JButton BT_VOLTA_PRINCIPAL;
    private javax.swing.JTextField CX_ATUACAO;
    private javax.swing.JTextField CX_BAIRRO;
    private javax.swing.JFormattedTextField CX_CPF;
    private javax.swing.JTextField CX_DISCIPLINA;
    private javax.swing.JTextField CX_EMAIL;
    private javax.swing.JTextField CX_ENDERECO;
    private javax.swing.JTextField CX_MATRICULA;
    private javax.swing.JTextField CX_NOME;
    private javax.swing.JFormattedTextField CX_RG;
    private javax.swing.JFormattedTextField CX_TELEFONE;
    private javax.swing.JLabel NOME_ATUACAO;
    private javax.swing.JLabel NOME_BAIRRO;
    private javax.swing.JLabel NOME_CPF;
    private javax.swing.JLabel NOME_DISCIPLINA;
    private javax.swing.JLabel NOME_EDERECO;
    private javax.swing.JLabel NOME_EMAIL;
    private javax.swing.JLabel NOME_MATRICULA;
    private javax.swing.JLabel NOME_NOME;
    private javax.swing.JLabel NOME_RG;
    private javax.swing.JLabel NOME_SEXO;
    private javax.swing.JLabel NOME_TELEFONE;
    private javax.swing.JPanel PAINEL_PROFESSOR_CADASTRO;
    private javax.swing.JTable TB_PROFESSOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void mostraTable() {
        DefaultTableModel modelo = (DefaultTableModel) TB_PROFESSOR.getModel();
        TB_PROFESSOR.setRowSorter(new TableRowSorter(modelo));
    }

    public void insereDadosTable() {
        DefaultTableModel modelo = (DefaultTableModel) TB_PROFESSOR.getModel();

        Professor Pacote_04 = new Professor();
        /**
         * Puxa todos os dados inseridos e gravados na tela de lista do Professor.
         */
        Pacote_04.puxaDados().forEach((jobs_ti) -> {
            modelo.addRow(new Object[]{
                jobs_ti.getMATRICULA(),
                jobs_ti.getNOME(),
                jobs_ti.getRG(),
                jobs_ti.getCPF(),
                jobs_ti.getENDERECO(),
                jobs_ti.getBAIRRO(),
                jobs_ti.getTELEFONE(),
                jobs_ti.getEMAIL(),
                jobs_ti.getSEXO(),
                jobs_ti.getDISCIPLINA(),
                jobs_ti.getATUACAO()

            });
        });

    }

    public void removeProfessor() {

        Professor Pacote_04 = new Professor();
        Pacote_04.DeleteProfessor(MATRICULA);
        System.out.println("Removido com sucesso!");
        Professor_Lista TI = new Professor_Lista();
        dispose();
        TI.setVisible(true);
    }

}

/**
 * Apontam uma arma para todo o planeta e chamam de proteção.
 *— Capitão América 2: O Soldado Invernal
 */