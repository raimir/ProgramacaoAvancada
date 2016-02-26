package registroestudante;

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
       Estudante reg = new EstudanteGraduacao("123", "abc", "S.I", 2010, 800.97, 5);
       System.out.println(reg.retornaString());
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
