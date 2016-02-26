package registroestudante;

import java.util.Calendar;

public abstract class Estudante {
    private String matricula;
    private String nome;
    private String curso;
    private double mensalidade;
    private int qtdaprovada, anoingresso;
    private static final int CREDITOS_DISCIPLINA = 4;
    
    
    public Estudante(String mat, String nome,  String curso, int ano, double valor, int qtdaprovada) {
        matricula = mat;
        this.nome = nome;
        this.curso = curso;
        anoingresso = ano;
        mensalidade = valor;
        this.qtdaprovada = qtdaprovada;
    }
    
    
    /**
     * <strong>calcularCredito</strong>
     * @return Valor dos créditos do aluno.
     */
    public abstract int calcularCredito();
    
    /**
     * <strong>calcularTempo</strong>
     * @return Quantidade de anos que o aluno permaneçeu na faculdade.
     */
    public byte calcularTempo() {
        Calendar agenda = Calendar.getInstance();
        int year = agenda.get(Calendar.YEAR);
        return (byte)(year - anoingresso);
    }
    
    public int getQtdDisciplinasAprovadas() {
        return qtdaprovada;
    }
    
    public String retornaString() {
       return "Matricula: " + matricula + "\n"
        + "Nome: " + nome + "\n"
        + "Curso: " + curso + "\n"
        + "Ano de ingresso: " + anoingresso + "\n"
        + "Valor mensalidade: " + mensalidade + "\n"
        + "Qtd disciplinas aprovadas: " + qtdaprovada + "\n"
        + "Tempo de curso: " + calcularTempo() + "\n"
        + "Qtd de créditos: " + calcularCredito() + "\n";
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getQtdaprovada() {
        return qtdaprovada;
    }

    public void setQtdaprovada(int qtdaprovada) {
        this.qtdaprovada = qtdaprovada;
    }

    public int getAnoingresso() {
        return anoingresso;
    }

    public void setAnoingresso(int anoingresso) {
        this.anoingresso = anoingresso;
    }    
    
}
