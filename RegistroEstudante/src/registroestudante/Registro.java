package registroestudante;

import java.util.ArrayList;
import java.util.Calendar;

public class Registro {
    private String matricula;
    private String nome;
    private String curso;
    private double mensalidade;
    private int qtdaprovada, anoingresso;
    private static final int CREDITOS_DISCIPLINA = 4;
    
    
    public Registro(String mat, String nome,  String curso, int ano, double valor, int qtdaprovada) {
        matricula = mat;
        this.nome = nome;
        this.curso = curso;
        anoingresso = ano;
        mensalidade = valor;
        this.qtdaprovada = qtdaprovada;
    }
    
    public static void main(String[] args) {
       ArrayList<Estudante> estudantes = new ArrayList<Estudante>(); 
       Estudante study = new EstudanteGraduacao("12345", "João", "S.I", 2010, 800.97, 5);
       System.out.println(study.retornaString());
       study = new EstudantePos("23456", "Pedro", "C.C", 2012, 925.14 , 6);
       System.out.println(study.retornaString());
    }
    
    /**
     * <strong>calcularCredito</strong>
     * @return Valor dos créditos do aluno.
     */
    public int calcularCredito() {
       return (qtdaprovada * CREDITOS_DISCIPLINA);
    }
    
    /**
     * <strong>calcularTempo</strong>
     * @return Quantidade de anos que o aluno permaneçeu na faculdade.
     */
    public byte calcularTempo() {
        Calendar agenda = Calendar.getInstance();
        int year = agenda.get(Calendar.YEAR);
        return (byte)(year - anoingresso);
    }
    
}
