/*
 * INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 * CAMPUS ALTAMIRA
 * TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * PROGRAMAÇÃO ORIENTADO A OBJETO
 * PROFESSOR: PAULO CESAR DE ALMEIDA JUNIOR
 * ALUNO: JOSUÉ BATISTA CAMARÃO FURTADO
 * -----------------------------------------------------------
 * MÉTODO GET's & SET's DO PROFESSOR
 * -----------------------------------------------------------
 */
package Pacote_02;

/**
 * PROJETO JAVA CRUD
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
    
    //Usamos o get para obter informações.
    public String getNOME() {
        return NOME;
    }

      //Usamos set para definir valores.
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    //Usamos o get para obter informações.
    public String getRG() {
        return RG;
    }

      //Usamos set para definir valores.
    public void setRG(String RG) {
        this.RG = RG;
    }

    //Usamos o get para obter informações.
    public String getCPF() {
        return CPF;
    }

      //Usamos set para definir valores.
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    //Usamos o get para obter informações.
    public String getENDERECO() {
        return ENDERECO;
    }

      //Usamos set para definir valores.
    public void setENDERECO(String ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    //Usamos o get para obter informações.
    public String getBAIRRO() {
        return BAIRRO;
    }
    
    //Usamos set para definir valores.
    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    //Usamos o get para obter informações.
    public String getTELEFONE() {
        return TELEFONE;
    }

     //Usamos set para definir valores.
    public void setTELEFONE(String TELEFONE) {
        this.TELEFONE = TELEFONE;
    }

    //Usamos o get para obter informações.
    public String getEMAIL() {
        return EMAIL;
    }

     //Usamos set para definir valores.
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    //Usamos o get para obter informações.
    public String getSEXO() {
        return SEXO;
    }

      //Usamos set para definir valores.
    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    //Usamos o get para obter informações.
    public String getDISCIPLINA() {
        return DISCIPLINA;
    }

      //Usamos set para definir valores.
    public void setDISCIPLINA(String DISCIPLINA) {
        this.DISCIPLINA = DISCIPLINA;
    }

    //Usamos o get para obter informações.
    public String getATUACAO() {
        return ATUACAO;
    }

      //Usamos set para definir valores.
    public void setATUACAO(String ATUACAO) {
        this.ATUACAO = ATUACAO;
    }

}

/**
 * Se ele me matar, atire nele e apague o histórico do meu navegador web!
 * - Griggs ("Esquadrão Suicida")
 */
