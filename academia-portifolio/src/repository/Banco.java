package repository;
import model.aluno;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    //criei lista de array para salvar cadastro
    private List<aluno> bancoDeDados = new ArrayList<>();

    //forma de usar a lista para salvar o aluno cadastrado
    public void salvar(aluno Aluno) {
        bancoDeDados.add(Aluno);
        System.out.println("[Repository] Aluno salvo com sucesso!");
    }
    //buscando alunos salvos
    public List<aluno> buscarTodos() {
        return bancoDeDados;
    }
}
