/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * -----------------------------------------------------------
 * MÉTODOS GETSET DO ALUNO
 * -----------------------------------------------------------
 */
package Pacote_02;

/**
 * SISTEMA DE CADASTRO + BANCO DE DADOS JAVA CRUD
 *
 * @author jobs
 */
public class Professor_Parametro {

    /**
     * Usamos get para obter informações. Esse tipo de método sempre retorna um
     * valor. Usamos set para definir valores. Esse tipo de método geralmente
     * não retorna valores.
     * ------------------------------------------------------------------------------------
     * Os campos privados de uma classe só podem ser manipulados pelo métodos de
     * classes. Isto é, qualquer classe que chama os métodos do objeto, chama
     * métodos públicos da classe para manipular os campos privados de um objeto
     * da classe.
     */
    private long MATRICULA;
    private String NOME;
    private String RG;
    private String CPF;
    private String ENDERECO;
    private String BAIRRO;
    private String TELEFONE;
    private String EMAIL;
    private String SEXO;
    private String DISCIPLINA;
    private String ATUACAO;

    //Usamos o get para obter informações.
    public long getMATRICULA() {
        return MATRICULA;
    }
    //Usamos set para definir valores.
    public void setMATRICULA(long MATRICULA) {
        this.MATRICULA = MATRICULA;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getENDERECO() {
        return ENDERECO;
    }

    public void setENDERECO(String ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getTELEFONE() {
        return TELEFONE;
    }

    public void setTELEFONE(String TELEFONE) {
        this.TELEFONE = TELEFONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getDISCIPLINA() {
        return DISCIPLINA;
    }

    public void setDISCIPLINA(String DISCIPLINA) {
        this.DISCIPLINA = DISCIPLINA;
    }

    public String getATUACAO() {
        return ATUACAO;
    }

    public void setATUACAO(String ATUACAO) {
        this.ATUACAO = ATUACAO;
    }

}

/**
 * Se ele me matar, atire nele e apague o histórico do meu navegador web!
 * - Griggs ("Esquadrão Suicida")
 */
