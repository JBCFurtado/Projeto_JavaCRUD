/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * -----------------------------------------------------------
 * SEGUNDA TELA INICIAL DO SISTEMA
 * -----------------------------------------------------------
 */
package Pacote_01;

import Pacote_03.Aluno_Cadastro;
import Pacote_03.Professor_Cadastro;
import javax.swing.JOptionPane;

/**
 * SISTEMA DE CADASTRO + BANCO DE DADOS JAVA CRUD
 *
 * @author jobs
 */
public class Tela_02 extends javax.swing.JFrame {

    public Tela_02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_PROFESSOR = new javax.swing.JButton();
        BT_ALUNO = new javax.swing.JButton();
        BT_SAIR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PNG_LOGO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        BT_PROFESSOR.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_PROFESSOR.setText("Professor");
        BT_PROFESSOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_PROFESSOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_PROFESSORActionPerformed(evt);
            }
        });
        getContentPane().add(BT_PROFESSOR);
        BT_PROFESSOR.setBounds(640, 350, 190, 30);

        BT_ALUNO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_ALUNO.setText("Aluno");
        BT_ALUNO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_ALUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ALUNOActionPerformed(evt);
            }
        });
        getContentPane().add(BT_ALUNO);
        BT_ALUNO.setBounds(680, 390, 150, 30);

        BT_SAIR.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_SAIR.setText("SAIR");
        BT_SAIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SAIRActionPerformed(evt);
            }
        });
        getContentPane().add(BT_SAIR);
        BT_SAIR.setBounds(730, 430, 100, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PNG_LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/LogoEmpresa.png"))); // NOI18N
        jPanel1.add(PNG_LOGO);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 810, 280);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 390, 50, 90);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 320, 50, 160);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(100, 360, 50, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/logo_III.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 480, 150, 30);

        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 410, 280, 20);

        setSize(new java.awt.Dimension(860, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_PROFESSORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PROFESSORActionPerformed
        try {

            /**
             * Tratamento responsável em avisar para o usuário se o banco de
             * dados estiver offline.
             */
            Professor_Cadastro PuxaTela = new Professor_Cadastro();
            PuxaTela.setVisible(true);
            dispose();
        } catch (Exception ti) {
            JOptionPane.showMessageDialog(null, "Banco de Dado OFFLINE, verifique sua conexão!");
        }
    }//GEN-LAST:event_BT_PROFESSORActionPerformed

    private void BT_ALUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ALUNOActionPerformed

        try {

            /**
             * Tratamento responsável em avisar para o usuário se o banco de
             * dados estiver offline.
             */
            Aluno_Cadastro PuxaTela = new Aluno_Cadastro();
            PuxaTela.setVisible(true);
            dispose();
        } catch (Exception i) {
            JOptionPane.showMessageDialog(null, "Banco de Dado OFFLINE, verifique sua conexão!");
        }
    }//GEN-LAST:event_BT_ALUNOActionPerformed

    private void BT_SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BT_SAIRActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Tela_02().setVisible(true);
        });
    }
    //Declaração de variáveis ​​- não modifique.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ALUNO;
    private javax.swing.JButton BT_PROFESSOR;
    private javax.swing.JButton BT_SAIR;
    private javax.swing.JLabel PNG_LOGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

/**
 * Eu sei tudo. Não consigo evitar.
 * - Homem de Ferro
 */
