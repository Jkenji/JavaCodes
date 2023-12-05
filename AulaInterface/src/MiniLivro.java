public class MiniLivro extends Livro {
    public MiniLivro(Autor autor)
    {
        super(autor);
    }


    @Override
    public boolean aplicarDesconto(double porcentagem)
    {
        return false;
    }
}
