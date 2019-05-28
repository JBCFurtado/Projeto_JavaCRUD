/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * ----------------------------------------------------------- 
 * CONEXÃO
 * -----------------------------------------------------------
 */
package Pacote_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD_ConexaoCRUD {

    public BD_ConexaoCRUD() {

    }

    public static Connection con = null;

    public static void Conectar() {

        System.out.println("CARREGANDO BD_ConexaoCRUD");

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/CRUD", "root", "");

            System.out.println("100 CONECTADO!");

        } catch (ClassNotFoundException ex) {
            System.out.println("POR FAVOR, ADICIONE O DRIVER DE CONEÇÃO.");
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }

}
