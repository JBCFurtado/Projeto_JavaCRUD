/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * -----------------------------------------------------------
 * TELA INICIAL DO SISTEMA
 * -----------------------------------------------------------
 */
package Pacote_01;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.image.ImageWatched.Link;

/**
 * SISTEMA DE CADASTRO + BANCO DE DADOS JAVA CRUD
 *
 * @author jobs
 */
public class Tela_01 extends javax.swing.JFrame {

    public Tela_01() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_ACESSO = new javax.swing.JButton();
        BT_SITE = new javax.swing.JButton();
        BT_PROJETO = new javax.swing.JButton();
        BT_DUCUMENTACAO = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LOGO_EMPRESA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        BT_ACESSO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_ACESSO.setText("Acesse o Sistema");
        BT_ACESSO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_ACESSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ACESSOActionPerformed(evt);
            }
        });
        getContentPane().add(BT_ACESSO);
        BT_ACESSO.setBounds(320, 340, 240, 30);

        BT_SITE.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_SITE.setText("Site");
        BT_SITE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_SITE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SITEActionPerformed(evt);
            }
        });
        getContentPane().add(BT_SITE);
        BT_SITE.setBounds(730, 370, 100, 31);

        BT_PROJETO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_PROJETO.setText("Projeto");
        BT_PROJETO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_PROJETO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_PROJETOActionPerformed(evt);
            }
        });
        getContentPane().add(BT_PROJETO);
        BT_PROJETO.setBounds(700, 410, 130, 31);

        BT_DUCUMENTACAO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_DUCUMENTACAO.setText("Documentação");
        BT_DUCUMENTACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DUCUMENTACAOActionPerformed(evt);
            }
        });
        getContentPane().add(BT_DUCUMENTACAO);
        BT_DUCUMENTACAO.setBounds(660, 450, 170, 31);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LOGO_EMPRESA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/LogoEmpresa.png"))); // NOI18N
        jPanel1.add(LOGO_EMPRESA);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 30, 790, 270);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 310, 50, 170);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(190, 400, 50, 80);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(110, 350, 50, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/logo_III.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 480, 160, 30);

        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 430, 330, 20);

        setSize(new java.awt.Dimension(860, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_ACESSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ACESSOActionPerformed
        /**
         * Botão que chama a tela 2 para escolha do cadastro do Professor ou
         * Aluno ou até mesmo Sair do Sistema.
         */
        Tela_02 PuxaTela = new Tela_02();
        PuxaTela.setVisible(true);
        dispose();

    }//GEN-LAST:event_BT_ACESSOActionPerformed

    private void BT_SITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SITEActionPerformed
        /**
         * Código abaixo chama link do Site (jobst.net.br) onde está todo passo
         * a passo de como criar um sistema de cadastro usando o JFrame.
         */
        try {

            Desktop.getDesktop().browse(new URI("http://www.jobsti.net.br"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Link.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BT_SITEActionPerformed

    private void BT_PROJETOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PROJETOActionPerformed
        /**
         * Código abaixo chama link do GitHub (www.github.com/JBCFurtado) onde
         * está todo o projeto realizado nesse Sistema (JAVA CRUD).
         */
        try {

            Desktop.getDesktop().browse(new URI("http://www.github.com/JBCFurtado"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Link.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BT_PROJETOActionPerformed

    private void BT_DUCUMENTACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DUCUMENTACAOActionPerformed
        /**
         * Código abaixo chama link de toda DOCUMENTAÇÃO do Sistema (JAVA CRUD).
         */

        try {

            Desktop.getDesktop().browse(new URI("https://wiki.zoho.com/mywiki.do"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Link.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_DUCUMENTACAOActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Tela_01().setVisible(true);
        });
    }
    //Declaração de variáveis ​​- não modifique.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ACESSO;
    private javax.swing.JButton BT_DUCUMENTACAO;
    private javax.swing.JButton BT_PROJETO;
    private javax.swing.JButton BT_SITE;
    private javax.swing.JLabel LOGO_EMPRESA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

/**
 * "Nós caímos para aprendermos a nos levantar!" - Batman Begins
 */
