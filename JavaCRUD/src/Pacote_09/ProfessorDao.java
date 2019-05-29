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
package Pacote_09;

import Pacote_02.Aluno_Parametro;
import Pacote_02.Professor_Parametro;
import Pacote_08.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jobs
 */
public class ProfessorDao {
    public void update(Professor_Parametro jobs_ti) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        /**
         * Responsável por conectar o BD_CRUD e fazer as alterações 
         * realizados pelo administrador nos cadastros “Professores” e “Alunos”.
         */
        try {
            stmt = con.prepareStatement("UPDATE PROFESSOR SET NOME = ?, RG = ? ,CPF = ? ,ENDERECO = ?,BAIRRO = ?,TELEFONE = ?,EMAIL = ?,SEXO = ?,DISCIPLINA = ?,ATUACAO = ? WHERE MATRICULA = ?");
            stmt.setString(1, jobs_ti.getNOME());
            stmt.setString(2, jobs_ti.getRG());
            stmt.setString(3, jobs_ti.getCPF());
            stmt.setString(4, jobs_ti.getENDERECO());
            stmt.setString(5, jobs_ti.getBAIRRO());
            stmt.setString(6, jobs_ti.getTELEFONE());
            stmt.setString(7, jobs_ti.getEMAIL());
            stmt.setString(8, jobs_ti.getSEXO());
            stmt.setString(9, jobs_ti.getDISCIPLINA());
            stmt.setString(10, jobs_ti.getATUACAO());
            stmt.setInt(11, (int) jobs_ti.getMATRICULA());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public List<Professor_Parametro> buscaPorMatricula(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Professor_Parametro> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PROFESSOR WHERE id LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Professor_Parametro professor = new Professor_Parametro();

                
                professor.setNOME(rs.getString("NOME"));
                professor.setRG(rs.getString("RG"));
                professor.setCPF(rs.getString("CPF"));
                professor.setENDERECO(rs.getString("ENDERECO"));
                professor.setBAIRRO(rs.getString("BAIRRO"));
                professor.setTELEFONE(rs.getString("TELEFONE"));
                professor.setEMAIL(rs.getString("EMAIL"));
                professor.setSEXO(rs.getString("SEXO"));
                professor.setDISCIPLINA(rs.getString("DISCIPLINA"));
                professor.setATUACAO(rs.getString("ATUACAO"));
                professor.setMATRICULA(rs.getInt("MATRICULA"));
                professores.add(professor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    
}

/**
 * Às vezes temos que correr antes de andar.
 * — Homem de Ferro
 */
