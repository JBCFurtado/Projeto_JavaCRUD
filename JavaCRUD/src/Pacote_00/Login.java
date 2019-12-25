/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * ----------------------------------------------------------- 
 * TELA DE LOGIN DO SISTEMA
 * -----------------------------------------------------------
 */
package Pacote_00;
import Pacote_01.Tela_01;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * SISTEMA DE CADASTRO + BANCO DE DADOS JAVA CRUD
 * @author jobs
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();

    }

    /**
     * Esse método é chamado de dentro do construtor para inicializar o
     * formulário. AVISO: NÃO modifique este código. O conteúdo deste método é
     * sempre regenerado pelo Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PAINAL_FUNDO = new javax.swing.JPanel();
        NOME_LOGIN = new javax.swing.JLabel();
        SENHA_LOGIN = new javax.swing.JLabel();
        CX_SENHA = new javax.swing.JPasswordField();
        CX_LOGIN = new javax.swing.JTextField();
        BT_ENTER = new javax.swing.JButton();
        IMAGEM_LOGIN = new javax.swing.JLabel();
        BT_CANCELAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(663, 600));
        setPreferredSize(new java.awt.Dimension(663, 563));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PAINAL_FUNDO.setBackground(java.awt.Color.white);
        PAINAL_FUNDO.setPreferredSize(new java.awt.Dimension(640, 525));
        PAINAL_FUNDO.setLayout(null);

        NOME_LOGIN.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        NOME_LOGIN.setText("Login");
        PAINAL_FUNDO.add(NOME_LOGIN);
        NOME_LOGIN.setBounds(177, 358, 48, 21);

        SENHA_LOGIN.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        SENHA_LOGIN.setText("Senha");
        PAINAL_FUNDO.add(SENHA_LOGIN);
        SENHA_LOGIN.setBounds(178, 410, 53, 21);

        CX_SENHA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CX_SENHAKeyPressed(evt);
            }
        });
        PAINAL_FUNDO.add(CX_SENHA);
        CX_SENHA.setBounds(243, 405, 226, 30);
        PAINAL_FUNDO.add(CX_LOGIN);
        CX_LOGIN.setBounds(243, 353, 226, 30);

        BT_ENTER.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BT_ENTER.setText("Entrar");
        BT_ENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ENTERActionPerformed(evt);
            }
        });
        PAINAL_FUNDO.add(BT_ENTER);
        BT_ENTER.setBounds(379, 466, 90, 30);

        IMAGEM_LOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/JamesGosling.jpg"))); // NOI18N
        PAINAL_FUNDO.add(IMAGEM_LOGIN);
        IMAGEM_LOGIN.setBounds(20, 30, 600, 287);

        BT_CANCELAR.setText("Cancelar");
        BT_CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CANCELARActionPerformed(evt);
            }
        });
        PAINAL_FUNDO.add(BT_CANCELAR);
        BT_CANCELAR.setBounds(520, 467, 90, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PAINAL_FUNDO.add(jPanel1);
        jPanel1.setBounds(130, 450, 40, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PAINAL_FUNDO.add(jPanel2);
        jPanel2.setBounds(20, 360, 40, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PAINAL_FUNDO.add(jPanel3);
        jPanel3.setBounds(70, 420, 40, 80);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        jLabel1.setText("James Gosling - Pai da linguagem Java");
        PAINAL_FUNDO.add(jLabel1);
        jLabel1.setBounds(430, 320, 220, 20);

        jLabel2.setText("jLabel2");
        PAINAL_FUNDO.add(jLabel2);
        jLabel2.setBounds(50, 270, 49, 18);

        getContentPane().add(PAINAL_FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 638, 520));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_05/logo_III.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 530, 150, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_ENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ENTERActionPerformed
        /**
         * O código abaixo tem a função de chamar a tela Principal se a condição
         * for satisfeita. Nesse caso se o login e senha forem "root". Obs. toda
         * função com um traço como por exemplo o (getText) abaixo, significa
         * que existe que já existe uma atualização para a mesma, nesse caso
         * usarei ela mesma.
         */
        if (CX_LOGIN.getText().equals("root") && CX_SENHA.getText().equals("root")) {
            Tela_01 TelaPrincipal = new Tela_01();
            TelaPrincipal.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha incorretos!");
            /**
             * O setText abaixo é para que quando o usuário errar o login ou a
             * senha ele chame novamente a tela login com o campo Login e Senha
             * vazios para que o usuário tente novamente.
             */
            CX_LOGIN.setText("");
            CX_SENHA.setText("");
        }

    }//GEN-LAST:event_BT_ENTERActionPerformed

    private void CX_SENHAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CX_SENHAKeyPressed
        /**
         * Código abaixo (if(evt.getKeyCode() == KeyEvent.VK_ENTER)) tem a
         * função de acessar o sistema sem precisar clicar no Botão Enter,
         * bastando assim apenas a tecla Enter do teclado.
         */

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (CX_LOGIN.getText().equals("root") && CX_SENHA.getText().equals("root")) {
                Tela_01 TelaPrincipal = new Tela_01();
                TelaPrincipal.show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Login ou Senha incorretos!");
                /**
                 * O setText abaixo é para que quando o usuário errar o login ou
                 * a senha ele chame novamente a tela login com o campo Login e
                 * Senha vazios para que o usuário tente novamente.
                 */
                CX_LOGIN.setText("");
                CX_SENHA.setText("");
            }
    }//GEN-LAST:event_CX_SENHAKeyPressed
    }
    private void BT_CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CANCELARActionPerformed
        // Comando para cencelar com o login.
        System.exit(0);
    }//GEN-LAST:event_BT_CANCELARActionPerformed


  
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Crie e exiba o formulário */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    //Declaração de variáveis ​​- não modifique.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CANCELAR;
    private javax.swing.JButton BT_ENTER;
    private javax.swing.JTextField CX_LOGIN;
    private javax.swing.JPasswordField CX_SENHA;
    private javax.swing.JLabel IMAGEM_LOGIN;
    private javax.swing.JLabel NOME_LOGIN;
    private javax.swing.JPanel PAINAL_FUNDO;
    private javax.swing.JLabel SENHA_LOGIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

/**
 * "Com grandes poderes vêm grandes responsabilidades." - Ben Parker (Tio do
 * Homem Aranha)
 */
