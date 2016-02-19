package registroestudante;

public class EstudanteGraduacao extends Estudante {
    private static final int CREDITOS_DISCIPLINA = 4;
    
    public EstudanteGraduacao(String mat, String nome, String curso, int ano, double valor, int qtdaprovada) {
        super(mat, nome, curso, ano, valor, qtdaprovada);
    }

    @Override
    public int calcularCredito() {
        return (CREDITOS_DISCIPLINA * super.getQtdDisciplinasAprovadas());
    }
    
}
