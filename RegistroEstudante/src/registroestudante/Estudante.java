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
    
}
