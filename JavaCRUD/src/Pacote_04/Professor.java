/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * ----------------------------------------------------------- 
 * TELA PROFESSOR
 * -----------------------------------------------------------
 */
package Pacote_04;


import Pacote_02.Professor_Parametro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Pacote_07.BD_ConexaoCRUD;

public class Professor {

    public void insereProfessor(Professor_Parametro jobs_ti) {
        BD_ConexaoCRUD.Conectar();
        String sql = "INSERT INTO PROFESSOR(NOME, RG, CPF, ENDERECO, BAIRRO, TELEFONE, EMAIL, SEXO, DISCIPLINA, ATUACAO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        /**
         * O Pacote_04 traz todos os “SET’s” que utilizamos para obtermos 
         * todas as informações dos “Professores” e “Alunos” cadastrados 
         * no sistemas através do BD.A linha 37 invoca o método Connection 
         * createStatement para obter um objeto que implementa a interface 
         * Statement (pacote java.sql ). O programa utiliza o objeto Statement 
         * para enviar instruções de SQL ao banco de dados.
         */
        try {
            PreparedStatement statement = BD_ConexaoCRUD.con.prepareStatement(sql);
            statement.setString(1, jobs_ti.getNOME());
            statement.setString(2, jobs_ti.getRG());
            statement.setString(3, jobs_ti.getCPF());
            statement.setString(4, jobs_ti.getENDERECO());
            statement.setString(5, jobs_ti.getBAIRRO());
            statement.setString(6, jobs_ti.getTELEFONE());
            statement.setString(7, jobs_ti.getEMAIL());
            statement.setString(8, jobs_ti.getSEXO());
            statement.setString(9, jobs_ti.getDISCIPLINA());
            statement.setString(10, jobs_ti.getATUACAO());
            
            

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("CADASTRO REALIZADO COM SUCESSO!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void selectProfessor(Professor_Parametro jobs_ti) {

        BD_ConexaoCRUD.Conectar();
        String sql = "SELECT * FROM PROFESSOR";

        try {
            Statement statement = BD_ConexaoCRUD.con.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                jobs_ti.setNOME(result.getString("NOME"));
                jobs_ti.setRG(result.getString("RG"));
                jobs_ti.setCPF(result.getString("CPF"));
                String ENDERECO = result.getString("ENDERECO");
                String BAIRRO = result.getString("BAIRRO");
                String TELEFONE = result.getString("TELEFONE");
                String EMAIL = result.getString("EMAIL");
                String SEXO = result.getString("SEXO");
                String DISCIPLINA = result.getString("DISCIPLINA");
                String ATUACAO = result.getString("ATUACAO");
               

            }

        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectIdProfessor(Professor_Parametro jobs_ti) {
        BD_ConexaoCRUD.Conectar();
        String sql = "SELECT MAX(MATRICULA) FROM PROFESSOR";

        try {
            Statement statement = BD_ConexaoCRUD.con.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                jobs_ti.setMATRICULA(Long.parseLong(result.getString(1)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Professor_Parametro> puxaDados() {

        BD_ConexaoCRUD.Conectar();
        @SuppressWarnings("UnusedAssignment")
        ResultSet ResultaEm = null;
        @SuppressWarnings("UnusedAssignment")
        Statement statement = null;

        List<Professor_Parametro> ProfessorParametro = new ArrayList();

        try {
            statement = BD_ConexaoCRUD.con.prepareStatement("SELECT * FROM PROFESSOR");
            ResultaEm = statement.executeQuery("SELECT * FROM PROFESSOR");

            while (ResultaEm.next()) {
                Professor_Parametro jobs_ti = new Professor_Parametro();
                
                jobs_ti.setNOME(ResultaEm.getString("NOME"));
                jobs_ti.setRG(ResultaEm.getString("RG"));
                jobs_ti.setCPF(ResultaEm.getString("CPF"));
                jobs_ti.setENDERECO(ResultaEm.getString("ENDERECO"));
                jobs_ti.setBAIRRO(ResultaEm.getString("BAIRRO"));
                jobs_ti.setTELEFONE(ResultaEm.getString("TELEFONE"));
                jobs_ti.setEMAIL(ResultaEm.getString("EMAIL"));
                jobs_ti.setSEXO(ResultaEm.getString("SEXO"));
                jobs_ti.setDISCIPLINA(ResultaEm.getString("DISCIPLINA"));
                jobs_ti.setATUACAO(ResultaEm.getString("ATUACAO"));
                jobs_ti.setMATRICULA(ResultaEm.getLong("MATRICULA"));
                ProfessorParametro.add(jobs_ti);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ProfessorParametro;

    }

    public void DeleteProfessor(int MATRICULA) {
        BD_ConexaoCRUD.Conectar();
        @SuppressWarnings("UnusedAssignment")
        Statement statement = null;
        ResultSet NOOB = null;
        String sql = "DELETE FROM PROFESSOR WHERE MATRICULA = " + MATRICULA + " ;";

        try {
            statement = BD_ConexaoCRUD.con.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

/**
 * Dizem que no inferno existe um lugar onde seus piores pesadelos se repetem sem parar, mas muitos não precisam morrer para chegar lá
 * - Wolverine
 */