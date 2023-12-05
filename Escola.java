import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Curso> cursos;
    private String diretor;

    public Escola(String nome){
        this.nome = nome;
        cursos = new ArrayList<>();
    }
}