/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * -----------------------------------------------------------
 * TELA CADASTRO ALUNO
 * -----------------------------------------------------------
 */
package Pacote_03;

import Pacote_06.Aluno_Lista;
import Pacote_01.Tela_02;
import Pacote_02.Aluno_Parametro;
import Pacote_04.Aluno;
import javax.swing.JOptionPane;

public final class Aluno_Cadastro extends javax.swing.JFrame {

    Aluno_Parametro jobs_ti = new Aluno_Parametro();
    Aluno Pacote_04 = new Aluno();

    public Aluno_Cadastro() {
        initComponents();
        iniciaBD_CRUD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        NOME_MATRICULA = new javax.swing.JLabel();
        NOME_NOME = new javax.swing.JLabel();
        BT_PERIODO = new javax.swing.JComboBox<>();
        NOME_SEXO = new javax.swing.JLabel();
        CX_NOME = new javax.swing.JTextField();
        NOME_BAIRRO = new javax.swing.JLabel();
        NOME_EDERECO = new javax.swing.JLabel();
        NOME_CPF = new javax.swing.JLabel();
        CX_ENDERECO = new javax.swing.JTextField();
        BT_SEXO = new javax.swing.JComboBox<>();
        BT_INSERIR = new javax.swing.JButton();
        NOME_PERIODO = new javax.swing.JLabel();
        NOME_RG = new javax.swing.JLabel();
        NOME_CURSO = new javax.swing.JLabel();
        NOME_TELEFONE = new javax.swing.JLabel();
        CX_CURSO = new javax.swing.JTextField();
        CX_TELEFONE = new javax.swing.JFormattedTextField();
        CX_CPF = new javax.swing.JFormattedTextField();
        BT_ANTERIOR = new javax.swing.JButton();
        BT_LISTA = new javax.swing.JButton();
        CX_RG = new javax.swing.JFormattedTextField();
        CX_MATRICULA = new javax.swing.JTextField();
        PAINEL_CADASTRO_ALUNO = new javax.swing.JPanel();
        CX_BAIRRO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        NOME_MATRICULA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_MATRICULA.setText("Matrícula");
        getContentPane().add(NOME_MATRICULA);
        NOME_MATRICULA.setBounds(20, 110, 80, 21);

        NOME_NOME.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_NOME.setText("Nome");
        getContentPane().add(NOME_NOME);
        NOME_NOME.setBounds(40, 160, 70, 21);

        BT_PERIODO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_PERIODO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Semestre", "2º Semestre", "3º Semestre", "4º Semestre", "5º Semestre", "6º Semestre", "7º Semestre", "8º Semestre" }));
        BT_PERIODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_PERIODOActionPerformed(evt);
            }
        });
        getContentPane().add(BT_PERIODO);
        BT_PERIODO.setBounds(500, 310, 140, 30);

        NOME_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_SEXO.setText("Sexo");
        getContentPane().add(NOME_SEXO);
        NOME_SEXO.setBounds(620, 150, 70, 50);

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
        getContentPane().add(CX_NOME);
        CX_NOME.setBounds(110, 160, 440, 30);

        NOME_BAIRRO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_BAIRRO.setText("Bairro");
        getContentPane().add(NOME_BAIRRO);
        NOME_BAIRRO.setBounds(30, 360, 70, 21);

        NOME_EDERECO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_EDERECO.setText("Endereço");
        getContentPane().add(NOME_EDERECO);
        NOME_EDERECO.setBounds(20, 310, 110, 20);

        NOME_CPF.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_CPF.setText("CPF");
        getContentPane().add(NOME_CPF);
        NOME_CPF.setBounds(60, 270, 40, 21);

        CX_ENDERECO.setToolTipText("As disciplinas são separadas por vígula.");
        CX_ENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_ENDERECOActionPerformed(evt);
            }
        });
        getContentPane().add(CX_ENDERECO);
        CX_ENDERECO.setBounds(110, 310, 280, 30);

        BT_SEXO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        BT_SEXO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SEXOActionPerformed(evt);
            }
        });
        getContentPane().add(BT_SEXO);
        BT_SEXO.setBounds(670, 160, 140, 30);

        BT_INSERIR.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_INSERIR.setText("Salvar");
        BT_INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_INSERIRActionPerformed(evt);
            }
        });
        getContentPane().add(BT_INSERIR);
        BT_INSERIR.setBounds(20, 500, 120, 30);

        NOME_PERIODO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_PERIODO.setText("Período");
        getContentPane().add(NOME_PERIODO);
        NOME_PERIODO.setBounds(430, 310, 70, 30);

        NOME_RG.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_RG.setText("RG");
        getContentPane().add(NOME_RG);
        NOME_RG.setBounds(60, 210, 40, 30);

        NOME_CURSO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_CURSO.setText("Curso");
        getContentPane().add(NOME_CURSO);
        NOME_CURSO.setBounds(40, 450, 110, 40);

        NOME_TELEFONE.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NOME_TELEFONE.setText("Telefone");
        getContentPane().add(NOME_TELEFONE);
        NOME_TELEFONE.setBounds(20, 410, 100, 30);

        CX_CURSO.setToolTipText("As disciplinas são separadas por vígula.");
        CX_CURSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_CURSOActionPerformed(evt);
            }
        });
        getContentPane().add(CX_CURSO);
        CX_CURSO.setBounds(110, 460, 280, 30);

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
        getContentPane().add(CX_TELEFONE);
        CX_TELEFONE.setBounds(110, 410, 190, 30);

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
        getContentPane().add(CX_CPF);
        CX_CPF.setBounds(110, 260, 190, 30);

        BT_ANTERIOR.setText("Voltar");
        BT_ANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ANTERIORActionPerformed(evt);
            }
        });
        getContentPane().add(BT_ANTERIOR);
        BT_ANTERIOR.setBounds(340, 500, 100, 30);

        BT_LISTA.setText("Alunos Cadastrados");
        BT_LISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LISTAActionPerformed(evt);
            }
        });
        getContentPane().add(BT_LISTA);
        BT_LISTA.setBounds(160, 500, 160, 30);

        CX_RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        CX_RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_RGActionPerformed(evt);
            }
        });
        getContentPane().add(CX_RG);
        CX_RG.setBounds(110, 210, 190, 30);

        CX_MATRICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_MATRICULAActionPerformed(evt);
            }
        });
        getContentPane().add(CX_MATRICULA);
        CX_MATRICULA.setBounds(110, 110, 280, 30);

        PAINEL_CADASTRO_ALUNO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO ALUNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 24))); // NOI18N
        PAINEL_CADASTRO_ALUNO.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        getContentPane().add(PAINEL_CADASTRO_ALUNO);
        PAINEL_CADASTRO_ALUNO.setBounds(10, 10, 830, 80);

        CX_BAIRRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CX_BAIRROActionPerformed(evt);
            }
        });
        getContentPane().add(CX_BAIRRO);
        CX_BAIRRO.setBounds(110, 360, 280, 34);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("*");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 170, 49, 17);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("*");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 70, 10, 60);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("*");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 210, 20, 30);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("*");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 410, 40, 40);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("*");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(300, 260, 20, 30);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("*");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 310, 20, 30);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setText("Campos Obrigatórios");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(700, 90, 140, 20);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("*");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 111, 10, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 540, 520, 10);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(780, 360, 50, 190);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(710, 420, 50, 130);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(640, 470, 50, 80);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/logo_III.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, 420, 160, 40);

        setSize(new java.awt.Dimension(860, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_INSERIRActionPerformed
           /**
            * Códigos abaixos fazem todos os campos obrigatórios na tela de cadatro do 
            * aluno.
            */
        if ((CX_NOME.getText().isEmpty()) || (CX_RG.getText().trim().length() < 3)
                || (CX_CPF.getText().trim().length() < 14) || (CX_ENDERECO.getText().isEmpty())
                || (CX_TELEFONE.getText().trim().length() < 13)) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        } else {
            /**
             * Usamos get para obter informações. Esse tipo de método sempre retorna um
             * valor. Usamos set para definir valores. Esse tipo de método geralmente
             * não retorna valores.
             */
            jobs_ti.setNOME(CX_NOME.getText());
            jobs_ti.setRG(CX_RG.getText());
            jobs_ti.setCPF(CX_CPF.getText());
            jobs_ti.setENDERECO(CX_ENDERECO.getText());
            jobs_ti.setBAIRRO(CX_BAIRRO.getText());
            jobs_ti.setTELEFONE(CX_TELEFONE.getText());
            jobs_ti.setSEXO(BT_SEXO.getSelectedItem().toString());
            jobs_ti.setCURSO(CX_CURSO.getText());
            jobs_ti.setPERIODO(BT_PERIODO.getSelectedItem().toString());

            Pacote_04.insereAluno(jobs_ti);
            iniciaBD_CRUD();
            apagaDados();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!.");
        }
    }//GEN-LAST:event_BT_INSERIRActionPerformed

    private void CX_ENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_ENDERECOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_ENDERECOActionPerformed

    private void CX_CURSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_CURSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_CURSOActionPerformed

    private void BT_PERIODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PERIODOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_PERIODOActionPerformed

    private void BT_LISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LISTAActionPerformed
        /**
         * Botão que chama a tela que traz a lista de alunos cadastrados
         * no banco de dado.
         */
        Aluno_Lista PuxaTela = new Aluno_Lista();
        PuxaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_LISTAActionPerformed

    private void CX_NOMEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CX_NOMEFocusGained

    }//GEN-LAST:event_CX_NOMEFocusGained

    private void BT_ANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ANTERIORActionPerformed
       /**
        * Volta a tela anterior
        */
        Tela_02 PuxaTela = new Tela_02();
        PuxaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_ANTERIORActionPerformed

    private void CX_MATRICULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_MATRICULAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_MATRICULAActionPerformed

    private void CX_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_NOMEActionPerformed

    private void CX_RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_RGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_RGActionPerformed

    private void CX_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_CPFActionPerformed

    private void CX_TELEFONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_TELEFONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_TELEFONEActionPerformed

    private void BT_SEXOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SEXOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_SEXOActionPerformed

    private void CX_BAIRROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CX_BAIRROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CX_BAIRROActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Aluno_Cadastro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ANTERIOR;
    private javax.swing.JButton BT_INSERIR;
    private javax.swing.JButton BT_LISTA;
    private javax.swing.JComboBox<String> BT_PERIODO;
    private javax.swing.JComboBox<String> BT_SEXO;
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
    private javax.swing.JPanel PAINEL_CADASTRO_ALUNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void apagaDados() {
        
        /**
         * class public - Apaga todos os campos abaixos
         */
        CX_NOME.setText("");
        CX_RG.setText("");
        CX_CPF.setText("");
        CX_ENDERECO.setText("");
        CX_BAIRRO.setText("");
        CX_TELEFONE.setText("");
        BT_SEXO.setToolTipText("");
        CX_CURSO.setText("");
        BT_PERIODO.setToolTipText("");

    }

    public void iniciaBD_CRUD() {
        /**
         * Inicia BD com usuário padrão (Root)
         */
        Pacote_04.selectAluno(jobs_ti);
        System.out.println(jobs_ti.getNOME());
        if (jobs_ti.getNOME() == null) {

            jobs_ti.setNOME("Root");
            Pacote_04.insereAluno(jobs_ti);
            iniciaBD_CRUD();

        } else {
            Pacote_04.selectIdAluno(jobs_ti);
            long identity_MATRICULA = jobs_ti.getMATRICULA();
            if (identity_MATRICULA >= 0 && identity_MATRICULA <= 9) {
                identity_MATRICULA = identity_MATRICULA + 1;
                CX_MATRICULA.setText(String.valueOf("000" + identity_MATRICULA));
                /**
                 * 000 número de casa que antecedem o número da matrícula
                 */
            } else {
                identity_MATRICULA = identity_MATRICULA + 1;
                /**
                 * Quando receber + 1 diminui o numero de casas de 000 para 00.
                 */
                CX_MATRICULA.setText(String.valueOf("00" + identity_MATRICULA));
            }

        }

    }

}
