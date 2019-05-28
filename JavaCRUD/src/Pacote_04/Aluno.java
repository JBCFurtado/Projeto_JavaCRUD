/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * ----------------------------------------------------------- 
 * TELA DE ALUNO
 * -----------------------------------------------------------
 */
package Pacote_04;


import Pacote_02.Aluno_Parametro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Pacote_07.BD_ConexaoCRUD;

public class Aluno {

    public void insereAluno(Aluno_Parametro jobs_ti) {
        BD_ConexaoCRUD.Conectar();
        String sql = "INSERT INTO ALUNO(NOME, RG, CPF, ENDERECO, BAIRRO, TELEFONE, SEXO, CURSO, PERIODO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = BD_ConexaoCRUD.con.prepareStatement(sql);
            statement.setString(1, jobs_ti.getNOME());
            statement.setString(2, jobs_ti.getRG());
            statement.setString(3, jobs_ti.getCPF());
            statement.setString(4, jobs_ti.getENDERECO());
            statement.setString(5, jobs_ti.getBAIRRO());
            statement.setString(6, jobs_ti.getTELEFONE());
            statement.setString(7, jobs_ti.getSEXO());
            statement.setString(8, jobs_ti.getCURSO());
            statement.setString(9, jobs_ti.getPERIODO());
          
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Cadastro Realizado com Sucesso!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void selectAluno(Aluno_Parametro jobs_ti) {

        BD_ConexaoCRUD.Conectar();
        String sql = "SELECT * FROM ALUNO";

        try {
            Statement statement = BD_ConexaoCRUD.con.createStatement();
            ResultSet ResultaEm = statement.executeQuery(sql);

            while (ResultaEm.next()) {
                jobs_ti.setNOME(ResultaEm.getString("NOME"));
                jobs_ti.setRG(ResultaEm.getString("RG"));
                jobs_ti.setCPF(ResultaEm.getString("CPF"));
                String ENDERECO = ResultaEm.getString("ENDERECO");
                String BAIRRO = ResultaEm.getString("BAIRRO");
                String TELEFONE = ResultaEm.getString("TELEFONE");
                String SEXO = ResultaEm.getString("SEXO");
                String CURSO = ResultaEm.getString("CURSO");
                String PERIODO = ResultaEm.getString("PERIODO");
                

            }

        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectIdAluno(Aluno_Parametro jobs_ti) {
        BD_ConexaoCRUD.Conectar();
        String sql = "SELECT MAX(MATRICULA) FROM ALUNO";

        try {
            Statement statement = BD_ConexaoCRUD.con.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int countador = 0;

            while (result.next()) {
                jobs_ti.setMATRICULA(Long.parseLong(result.getString(1)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Aluno_Parametro> puxaDados() {

        BD_ConexaoCRUD.Conectar();
        @SuppressWarnings("UnusedAssignment")
        ResultSet lammer = null;
        @SuppressWarnings("UnusedAssignment")
        Statement statement = null;

        List<Aluno_Parametro> AlunoParametro = new ArrayList();

        try {
            statement = BD_ConexaoCRUD.con.prepareStatement("SELECT * FROM ALUNO");
            lammer = statement.executeQuery("SELECT * FROM ALUNO");

            while (lammer.next()) {
                Aluno_Parametro jobs_ti = new Aluno_Parametro();
                jobs_ti.setMATRICULA(lammer.getLong("MATRICULA"));
                jobs_ti.setNOME(lammer.getString("NOME"));
                jobs_ti.setRG(lammer.getString("RG"));
                jobs_ti.setCPF(lammer.getString("CPF"));
                jobs_ti.setENDERECO(lammer.getString("ENDERECO"));
                jobs_ti.setBAIRRO(lammer.getString("BAIRRO"));
                jobs_ti.setTELEFONE(lammer.getString("TELEFONE"));
                jobs_ti.setSEXO(lammer.getString("SEXO"));
                jobs_ti.setCURSO(lammer.getString("CURSO"));
                jobs_ti.setPERIODO(lammer.getString("PERIODO"));
                AlunoParametro.add (jobs_ti);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AlunoParametro;

    }

    public void DeleteAluno(int MATRICULA) {
        BD_ConexaoCRUD.Conectar();
        @SuppressWarnings("UnusedAssignment")
        Statement statement = null;
        ResultSet lammer = null;
        String sql = "DELETE FROM ALUNO WHERE MATRICULA = " + MATRICULA + " ;";

        try {
            statement = BD_ConexaoCRUD.con.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setMATRICULA(int aInt) {
        throw new UnsupportedOperationException("");
    }

    public void setNOME(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setRG(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setCPF(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setENDERECO(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setBAIRRO(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setTELEFONE(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setSEXO(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setCURSO(String string) {
        throw new UnsupportedOperationException("");
    }

    public void setPERIODO(String string) {
        throw new UnsupportedOperationException("");
    }

    public void add(Aluno aluno) {
        throw new UnsupportedOperationException("");
    }

 
}
