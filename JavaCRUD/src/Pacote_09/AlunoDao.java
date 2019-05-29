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
import Pacote_04.Aluno;
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
public class AlunoDao {
    public void update(Aluno_Parametro jobs_ti) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        /**
         * responsável por conectar o BD_CRUD e fazer as alterações realizados 
         * pelo administrador nos cadastros “Professores” e “Alunos”.
         */
        try {
            stmt = con.prepareStatement("UPDATE ALUNO SET NOME = ?, RG = ?, CPF = ? ,ENDERECO = ?,BAIRRO = ?,TELEFONE = ?,SEXO = ?,CURSO = ?,PERIODO = ? WHERE MATRICULA = ?");
            stmt.setString(1, jobs_ti.getNOME());
            stmt.setString(2, jobs_ti.getRG());
            stmt.setString(3, jobs_ti.getCPF());
            stmt.setString(4, jobs_ti.getENDERECO());
            stmt.setString(5, jobs_ti.getBAIRRO());
            stmt.setString(6, jobs_ti.getTELEFONE());
            stmt.setString(7, jobs_ti.getSEXO());
            stmt.setString(8, jobs_ti.getCURSO());
            stmt.setString(9, jobs_ti.getPERIODO());
            stmt.setInt(10, (int) jobs_ti.getMATRICULA());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public List<Aluno_Parametro> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Aluno_Parametro> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM aluno WHERE id LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Aluno aluno = new Aluno();
                aluno.setMATRICULA(rs.getInt("MATRICULA"));
                aluno.setNOME(rs.getString("NOME"));
                aluno.setRG(rs.getString("RG"));
                aluno.setCPF(rs.getString("CPF"));
                aluno.setENDERECO(rs.getString("ENDERECO"));
                aluno.setBAIRRO(rs.getString("BAIRRO"));
                aluno.setTELEFONE(rs.getString("TELEFONE"));
                aluno.setSEXO(rs.getString("SEXO"));
                aluno.setCURSO(rs.getString("CURSO"));
                aluno.setPERIODO(rs.getString("PERIODO"));
                aluno.add(aluno);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alunos;

    }
    
}

/**
 * “Às vezes, o que procuramos a vida toda, sempre esteve ao nosso lado.”
— Guardiões da Galáxia Vol. 2
 */
