package registroestudante;

/**
 *
 * @author 141052976
 */
public class EstudantePos extends Estudante {
     private static final int CREDITOS_DISCIPLINA = 2;
    
    public EstudantePos(String mat, String nome, String curso, int ano, double valor, int qtdaprovada) {
        super(mat, nome, curso, ano, valor, qtdaprovada);
    }

    @Override
    public int calcularCredito() {
        return (CREDITOS_DISCIPLINA * super.getQtdDisciplinasAprovadas());
    }
}
