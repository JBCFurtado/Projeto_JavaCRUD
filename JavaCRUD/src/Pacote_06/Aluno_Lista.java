/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * ----------------------------------------------------------- 
 * ALUNO LISTA
 * -----------------------------------------------------------
 */
package Pacote_06;

import Pacote_01.Tela_02;
import Pacote_02.Aluno_Parametro;
import Pacote_03.Aluno_Cadastro;
import Pacote_04.Aluno;
import Pacote_08.ConnectionFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Pacote_09.AlunoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Aluno_Lista extends javax.swing.JFrame {

    int MATRICULA = 0;

    public Aluno_Lista() {
        initComponents();
        mostraTable();
        insereDadosTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TB_ALUNO = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
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
        NOME_CURSO = new javax.swing.JLabel();
        CX_CURSO = new javax.swing.JTextField();
        BT_SEXO = new javax.swing.JComboBox<>();
        NOME_SEXO = new javax.swing.JLabel();
        NOME_PERIODO = new javax.swing.JLabel();
        BT_PERIODO = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        BT_ATUALIZAR = new javax.swing.JButton();
        BT_DELETE = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        BT_VOLTAR_PRINCIPAL = new javax.swing.JButton();
        BT_VOLTAR = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TB_ALUNO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOME", "RG", "CPF", "ENDERECO", "BAIRRO", "TELEFONE", "SEXO", "CURSO", "PERÍODO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_ALUNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ALUNOMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_ALUNO);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1260, 170));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALUNOS CADASTRADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 24))); // NOI18N
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1260, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar Casdastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NOME_MATRICULA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_MATRICULA.setText("Matrícula");
        jPanel2.add(NOME_MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 37, -1, -1));

        CX_MATRICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_MATRICULAActionPerformed(evt);
            }
        });
        jPanel2.add(CX_MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 33, 280, -1));

        NOME_NOME.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_NOME.setText("Nome");
        jPanel2.add(NOME_NOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 91, -1, -1));

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
        jPanel2.add(CX_NOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 86, 278, -1));

        NOME_RG.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_RG.setText("RG");
        jPanel2.add(NOME_RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 145, -1, -1));

        CX_RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        CX_RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_RGActionPerformed(evt);
            }
        });
        jPanel2.add(CX_RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 140, 278, -1));

        NOME_CPF.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_CPF.setText("CPF");
        jPanel2.add(NOME_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 197, -1, -1));

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
        jPanel2.add(CX_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 192, 278, -1));

        NOME_EDERECO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_EDERECO.setText("Endereço");
        jPanel2.add(NOME_EDERECO, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 39, -1, 20));

        CX_ENDERECO.setToolTipText("As disciplinas são separadas por vígula.");
        CX_ENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_ENDERECOActionPerformed(evt);
            }
        });
        jPanel2.add(CX_ENDERECO, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 33, 280, -1));

        NOME_BAIRRO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_BAIRRO.setText("Bairro");
        jPanel2.add(NOME_BAIRRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 87, -1, -1));

        CX_BAIRRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_BAIRROActionPerformed(evt);
            }
        });
        jPanel2.add(CX_BAIRRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 87, 280, -1));

        NOME_TELEFONE.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_TELEFONE.setText("Telefone");
        jPanel2.add(NOME_TELEFONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 140, -1, 30));

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
        jPanel2.add(CX_TELEFONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 140, 280, -1));

        NOME_CURSO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_CURSO.setText("Curso");
        jPanel2.add(NOME_CURSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 29, -1, 40));

        CX_CURSO.setToolTipText("As disciplinas são separadas por vígula.");
        CX_CURSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_CURSOActionPerformed(evt);
            }
        });
        jPanel2.add(CX_CURSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 34, 279, -1));

        BT_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        BT_SEXO.setToolTipText("");
        BT_SEXO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SEXOActionPerformed(evt);
            }
        });
        jPanel2.add(BT_SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 192, 159, 30));

        NOME_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_SEXO.setText("Sexo");
        jPanel2.add(NOME_SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 196, -1, -1));

        NOME_PERIODO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_PERIODO.setText("Período");
        jPanel2.add(NOME_PERIODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 91, -1, -1));

        BT_PERIODO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_PERIODO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Semestre", "2º Semestre", "3º Semestre", "4º Semestre", "5º Semestre", "6º Semestre", "7º Semestre", "8º Semestre" }));
        BT_PERIODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_PERIODOActionPerformed(evt);
            }
        });
        jPanel2.add(BT_PERIODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 87, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1260, 240));

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 50, 60));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, 500, 60));

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 50, 100));

        BT_ATUALIZAR.setText("Atualizar");
        BT_ATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ATUALIZARActionPerformed(evt);
            }
        });
        getContentPane().add(BT_ATUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 100, -1));

        BT_DELETE.setText("Remover");
        BT_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(BT_DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 100, -1));

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 50, 140));

        BT_VOLTAR_PRINCIPAL.setText("Início");
        BT_VOLTAR_PRINCIPAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VOLTAR_PRINCIPALActionPerformed(evt);
            }
        });
        getContentPane().add(BT_VOLTAR_PRINCIPAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, 100, -1));

        BT_VOLTAR.setText("Voltar");
        BT_VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VOLTARActionPerformed(evt);
            }
        });
        getContentPane().add(BT_VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, 100, -1));

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 500, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/logo_III.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 160, 40));

        setSize(new java.awt.Dimension(1291, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_VOLTAR_PRINCIPALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VOLTAR_PRINCIPALActionPerformed
        // TODO add your handling code here:
        Tela_02 chamaTela = new Tela_02();
        chamaTela.setVisible(true);
        dispose();

    }//GEN-LAST:event_BT_VOLTAR_PRINCIPALActionPerformed

    private void BT_VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VOLTARActionPerformed
        // TODO add your handling code here:
        Aluno_Cadastro chamaTela = new Aluno_Cadastro();
        chamaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_VOLTARActionPerformed

    private void TB_ALUNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ALUNOMouseClicked
        CX_MATRICULA.setText("" + TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 0).toString());
        CX_NOME.setText(TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 1).toString());
        CX_RG.setText((String) TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 2));
        CX_CPF.setText(TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 3).toString());
        CX_ENDERECO.setText(TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 4).toString());
        CX_BAIRRO.setText(TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 5).toString());
        CX_TELEFONE.setText(TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 6).toString());
        BT_SEXO.setToolTipText((String) TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 7));
        CX_CURSO.setText(TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 8).toString());
        BT_PERIODO.setToolTipText((String) TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 9));
        if (evt.getClickCount() == 1) {
            Object obj = (TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 0));
            String Id = obj.toString();
            MATRICULA = Integer.parseInt(Id);
            System.out.println(MATRICULA);

        }
    }//GEN-LAST:event_TB_ALUNOMouseClicked

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

    private void CX_CURSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_CURSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_CURSOActionPerformed

    private void BT_SEXOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SEXOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_SEXOActionPerformed

    private void BT_PERIODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PERIODOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_PERIODOActionPerformed

    private void BT_ATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ATUALIZARActionPerformed
        // TODO add your handling code here:
        if (TB_ALUNO.getSelectedRow() != -1) {
            String Sexo = (String) BT_SEXO.getSelectedItem();
            String Periodo = (String) BT_PERIODO.getSelectedItem();

            Aluno_Parametro jobs_ti = new Aluno_Parametro();
            AlunoDao work = new AlunoDao();

            jobs_ti.setNOME(CX_NOME.getText());
            jobs_ti.setRG(CX_RG.getText());
            jobs_ti.setCPF(CX_CPF.getText());
            jobs_ti.setENDERECO(CX_ENDERECO.getText());
            jobs_ti.setBAIRRO(CX_BAIRRO.getText());
            jobs_ti.setTELEFONE(CX_TELEFONE.getText());
            jobs_ti.setSEXO(Sexo);
            jobs_ti.setCURSO(CX_CURSO.getText());
            jobs_ti.setPERIODO(Periodo);
            jobs_ti.setMATRICULA((long) TB_ALUNO.getValueAt(TB_ALUNO.getSelectedRow(), 0));
            work.update(jobs_ti);

            new Aluno_Lista().setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_BT_ATUALIZARActionPerformed

    private void BT_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DELETEActionPerformed

        if (MATRICULA == 0) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, SELECIONE! ");
        } else {
            removeAluno();
            insereDadosTable();
        }

    }//GEN-LAST:event_BT_DELETEActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Aluno_Lista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ATUALIZAR;
    private javax.swing.JButton BT_DELETE;
    private javax.swing.JComboBox<String> BT_PERIODO;
    private javax.swing.JComboBox<String> BT_SEXO;
    private javax.swing.JButton BT_VOLTAR;
    private javax.swing.JButton BT_VOLTAR_PRINCIPAL;
    private javax.swing.JTextField CX_BAIRRO;
    private javax.swing.JFormattedTextField CX_CPF;
    private javax.swing.JTextField CX_CURSO;
    private javax.swing.JTextField CX_ENDERECO;
    private javax.swing.JTextField CX_MATRICULA;
    private javax.swing.JTextField CX_NOME;
    private javax.swing.JFormattedTextField CX_RG;
    private javax.swing.JFormattedTextField CX_TELEFONE;
    private javax.swing.JLabel NOME_BAIRRO;
    private javax.swing.JLabel NOME_CPF;
    private javax.swing.JLabel NOME_CURSO;
    private javax.swing.JLabel NOME_EDERECO;
    private javax.swing.JLabel NOME_MATRICULA;
    private javax.swing.JLabel NOME_NOME;
    private javax.swing.JLabel NOME_PERIODO;
    private javax.swing.JLabel NOME_RG;
    private javax.swing.JLabel NOME_SEXO;
    private javax.swing.JLabel NOME_TELEFONE;
    private javax.swing.JTable TB_ALUNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void mostraTable() {
        DefaultTableModel modelo = (DefaultTableModel) TB_ALUNO.getModel();
        TB_ALUNO.setRowSorter(new TableRowSorter(modelo));
    }

    public void insereDadosTable() {
        DefaultTableModel modelo = (DefaultTableModel) TB_ALUNO.getModel();

        Aluno Pacote_04 = new Aluno();

        for (Aluno_Parametro jobs_ti : Pacote_04.puxaDados()) {

            modelo.addRow(new Object[]{
                jobs_ti.getMATRICULA(),
                jobs_ti.getNOME(),
                jobs_ti.getRG(),
                jobs_ti.getCPF(),
                jobs_ti.getENDERECO(),
                jobs_ti.getBAIRRO(),
                jobs_ti.getTELEFONE(),
                jobs_ti.getSEXO(),
                jobs_ti.getCURSO(),
                jobs_ti.getPERIODO()
            });
        }

    }

    public void removeAluno() {

        Aluno Pacote_04 = new Aluno();
        Pacote_04.DeleteAluno(MATRICULA);
        JOptionPane.showMessageDialog(null, "REMOVIDO COM SUCESSO!");
        Aluno_Lista A = new Aluno_Lista();
        dispose();
        A.setVisible(true);

    }

}
