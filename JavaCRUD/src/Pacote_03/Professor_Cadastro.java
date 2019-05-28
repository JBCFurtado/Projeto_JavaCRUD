/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * -----------------------------------------------------------
 * TELA CADASTRO PROFESSOR
 * -----------------------------------------------------------
 */
package Pacote_03;

import Pacote_06.Professor_Lista;
import Pacote_01.Tela_02;
import Pacote_02.Professor_Parametro;
import Pacote_04.Professor;
import javax.swing.JOptionPane;

public final class Professor_Cadastro extends javax.swing.JFrame {

    Professor_Parametro jobs_ti = new Professor_Parametro();
    Professor Pacote_04 = new Professor();

    public Professor_Cadastro() {
        initComponents();
        iniciaBD_CRUD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NOME_MATRICULA = new javax.swing.JLabel();
        BT_PROFESSORES_CADASTRADOS = new javax.swing.JButton();
        CX_NOME = new javax.swing.JTextField();
        NOME_NOME = new javax.swing.JLabel();
        CX_SEXO = new javax.swing.JLabel();
        BT_SEXO = new javax.swing.JComboBox<>();
        NOME_DISCIPLINA = new javax.swing.JLabel();
        CX_DISCIPLINA = new javax.swing.JTextField();
        BT_INSERIR = new javax.swing.JButton();
        NOME_CPF = new javax.swing.JLabel();
        CX_CPF = new javax.swing.JFormattedTextField();
        NOME_RG = new javax.swing.JLabel();
        CX_RG = new javax.swing.JFormattedTextField();
        NOME_TELEFONE = new javax.swing.JLabel();
        CX_TELEFONE = new javax.swing.JFormattedTextField();
        NOME_ENDERECO = new javax.swing.JLabel();
        BT_TELA_ANTERIOR = new javax.swing.JButton();
        CX_MATRICULA = new javax.swing.JTextField();
        NOME_ATUACAO = new javax.swing.JLabel();
        CX_ATUACAO = new javax.swing.JTextField();
        NOME_BAIRRO = new javax.swing.JLabel();
        CX_BAIRRO = new javax.swing.JTextField();
        PAINEL_CADASTRO_PROFESSOR = new javax.swing.JPanel();
        NOME_EMAIL = new javax.swing.JLabel();
        CX_EMAIL = new javax.swing.JTextField();
        CX_ENDERECO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NOME_MATRICULA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_MATRICULA.setText("Matrícula");
        getContentPane().add(NOME_MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

        BT_PROFESSORES_CADASTRADOS.setText("Professores Cadastrados");
        BT_PROFESSORES_CADASTRADOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_PROFESSORES_CADASTRADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_PROFESSORES_CADASTRADOSActionPerformed(evt);
            }
        });
        getContentPane().add(BT_PROFESSORES_CADASTRADOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 190, 30));

        CX_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_NOMEActionPerformed(evt);
            }
        });
        getContentPane().add(CX_NOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 420, 30));

        NOME_NOME.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_NOME.setText("Nome");
        getContentPane().add(NOME_NOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 30));

        CX_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CX_SEXO.setText("Sexo");
        getContentPane().add(CX_SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 70, 30));

        BT_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(BT_SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 140, 30));

        NOME_DISCIPLINA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_DISCIPLINA.setText("Disciplina");
        getContentPane().add(NOME_DISCIPLINA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 80, 30));

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
        getContentPane().add(CX_DISCIPLINA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 412, 230, 30));

        BT_INSERIR.setText("Salvar");
        BT_INSERIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_INSERIRActionPerformed(evt);
            }
        });
        getContentPane().add(BT_INSERIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 100, 30));

        NOME_CPF.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_CPF.setText("CPF");
        getContentPane().add(NOME_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 40, 30));

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
        getContentPane().add(CX_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 212, 230, 30));

        NOME_RG.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_RG.setText("RG");
        getContentPane().add(NOME_RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 170, 30, 30));

        CX_RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        CX_RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_RGActionPerformed(evt);
            }
        });
        getContentPane().add(CX_RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 172, 230, 30));

        NOME_TELEFONE.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_TELEFONE.setText("Telefone");
        getContentPane().add(NOME_TELEFONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 332, 100, 30));

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
        getContentPane().add(CX_TELEFONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 332, 230, 30));

        NOME_ENDERECO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_ENDERECO.setText("Endereço");
        getContentPane().add(NOME_ENDERECO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 252, 90, 30));

        BT_TELA_ANTERIOR.setText("Voltar");
        BT_TELA_ANTERIOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_TELA_ANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_TELA_ANTERIORActionPerformed(evt);
            }
        });
        getContentPane().add(BT_TELA_ANTERIOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 110, 30));

        CX_MATRICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_MATRICULAActionPerformed(evt);
            }
        });
        getContentPane().add(CX_MATRICULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, 30));

        NOME_ATUACAO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_ATUACAO.setText("Atuação");
        getContentPane().add(NOME_ATUACAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 450, 70, 30));

        CX_ATUACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_ATUACAOActionPerformed(evt);
            }
        });
        getContentPane().add(CX_ATUACAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 452, 230, 30));

        NOME_BAIRRO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_BAIRRO.setText("Bairro");
        getContentPane().add(NOME_BAIRRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 292, 60, 30));

        CX_BAIRRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_BAIRROActionPerformed(evt);
            }
        });
        getContentPane().add(CX_BAIRRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 292, 230, 30));

        PAINEL_CADASTRO_PROFESSOR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO PROFESSOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 24))); // NOI18N
        getContentPane().add(PAINEL_CADASTRO_PROFESSOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 60));

        NOME_EMAIL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_EMAIL.setText("Email");
        getContentPane().add(NOME_EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 370, 50, 30));

        CX_EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_EMAILActionPerformed(evt);
            }
        });
        getContentPane().add(CX_EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 372, 230, 30));
        getContentPane().add(CX_ENDERECO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 252, 420, 30));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 252, 20, 30));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setText("*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 20, 20));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.red);
        jLabel15.setText("*");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 30, 40));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 40, 40));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 40, 40));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel10.setText("Campos Obrigatórios");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, 20));

        jLabel16.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.red);
        jLabel16.setText("*");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 30, 30));

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setText("*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 40, 40));

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel17.setForeground(java.awt.Color.red);
        jLabel17.setText("*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 382, 30, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 40, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 40, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 40, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 540, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/logo_III.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 160, 40));

        setSize(new java.awt.Dimension(860, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_INSERIRActionPerformed

        if ((CX_NOME.getText().isEmpty()) || (CX_RG.getText().trim().length() < 3)
                || (CX_CPF.getText().trim().length() < 14) || (CX_ENDERECO.getText().isEmpty())
                || (CX_TELEFONE.getText().trim().length() < 13)
                || (CX_EMAIL.getText().isEmpty())) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        } 
        
        else {
            jobs_ti.setNOME(CX_NOME.getText());
            jobs_ti.setRG(CX_RG.getText());
            jobs_ti.setCPF(CX_CPF.getText());
            jobs_ti.setENDERECO(CX_ENDERECO.getText());
            jobs_ti.setBAIRRO(CX_BAIRRO.getText());
            jobs_ti.setTELEFONE(CX_TELEFONE.getText());
            jobs_ti.setEMAIL(CX_EMAIL.getText());
            jobs_ti.setSEXO(BT_SEXO.getSelectedItem().toString());
            jobs_ti.setDISCIPLINA(CX_DISCIPLINA.getText());
            jobs_ti.setATUACAO(CX_ATUACAO.getText());

            Pacote_04.insereProfessor(jobs_ti);
            iniciaBD_CRUD();
            apagaDados();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        }


    }//GEN-LAST:event_BT_INSERIRActionPerformed


    private void BT_TELA_ANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_TELA_ANTERIORActionPerformed
        
        Tela_02 PuxaTela = new Tela_02();
        PuxaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_TELA_ANTERIORActionPerformed

    private void BT_PROFESSORES_CADASTRADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PROFESSORES_CADASTRADOSActionPerformed
        //Adicione seu código de manipulação aqui:
        Professor_Lista PuxaTela = new Professor_Lista();
        PuxaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_PROFESSORES_CADASTRADOSActionPerformed

    private void CX_DISCIPLINAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CX_DISCIPLINAFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_DISCIPLINAFocusGained

    private void CX_MATRICULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_MATRICULAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_MATRICULAActionPerformed

    private void CX_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_NOMEActionPerformed

    private void CX_DISCIPLINAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_DISCIPLINAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_DISCIPLINAActionPerformed

    private void CX_RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_RGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_RGActionPerformed

    private void CX_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_CPFActionPerformed

    private void CX_TELEFONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_TELEFONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_TELEFONEActionPerformed

    private void CX_ATUACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_ATUACAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_ATUACAOActionPerformed

    private void CX_BAIRROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_BAIRROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_BAIRROActionPerformed

    private void CX_EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_EMAILActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Professor_Cadastro().setVisible(true);
        });
    }

    //Declaração de variáveis ​​- não modifique.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_INSERIR;
    private javax.swing.JButton BT_PROFESSORES_CADASTRADOS;
    private javax.swing.JComboBox<String> BT_SEXO;
    private javax.swing.JButton BT_TELA_ANTERIOR;
    private javax.swing.JTextField CX_ATUACAO;
    private javax.swing.JTextField CX_BAIRRO;
    private javax.swing.JFormattedTextField CX_CPF;
    private javax.swing.JTextField CX_DISCIPLINA;
    private javax.swing.JTextField CX_EMAIL;
    private javax.swing.JTextField CX_ENDERECO;
    private javax.swing.JTextField CX_MATRICULA;
    private javax.swing.JTextField CX_NOME;
    private javax.swing.JFormattedTextField CX_RG;
    private javax.swing.JLabel CX_SEXO;
    private javax.swing.JFormattedTextField CX_TELEFONE;
    private javax.swing.JLabel NOME_ATUACAO;
    private javax.swing.JLabel NOME_BAIRRO;
    private javax.swing.JLabel NOME_CPF;
    private javax.swing.JLabel NOME_DISCIPLINA;
    private javax.swing.JLabel NOME_EMAIL;
    private javax.swing.JLabel NOME_ENDERECO;
    private javax.swing.JLabel NOME_MATRICULA;
    private javax.swing.JLabel NOME_NOME;
    private javax.swing.JLabel NOME_RG;
    private javax.swing.JLabel NOME_TELEFONE;
    private javax.swing.JPanel PAINEL_CADASTRO_PROFESSOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void apagaDados() {
        CX_NOME.setText("");
        CX_RG.setText("");
        CX_CPF.setText("");
        CX_ENDERECO.setText("");
        CX_BAIRRO.setText("");
        CX_TELEFONE.setText("");
        CX_EMAIL.setText("");
        CX_SEXO.setText("");
        CX_DISCIPLINA.setText("");
        CX_ATUACAO.setText("");

    }

    public void iniciaBD_CRUD() {

        Pacote_04.selectProfessor(jobs_ti);
        System.out.println(jobs_ti.getNOME());
        if (jobs_ti.getNOME() == null) {

            jobs_ti.setNOME("Root");
            Pacote_04.insereProfessor(jobs_ti);
            iniciaBD_CRUD();

        } else {
            Pacote_04.selectIdProfessor(jobs_ti);
            long identityMATRICULA = jobs_ti.getMATRICULA();
            if (identityMATRICULA >= 0 && identityMATRICULA <= 9) {
                identityMATRICULA = identityMATRICULA + 1;
                CX_MATRICULA.setText(String.valueOf("000" + identityMATRICULA));
            } else {
                identityMATRICULA = identityMATRICULA + 1;
                CX_MATRICULA.setText(String.valueOf("00" + identityMATRICULA));
            }
        }
    }
}

/**
 * Não vivas um dia na vida,
 * vive a vida num dia.
 * - Thor
 */
