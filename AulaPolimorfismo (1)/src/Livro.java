public abstract class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
   

    public Livro(Autor autor) {
        this.autor = autor;
    }


    public abstract boolean aplicarDesconto(double porcentagem);


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public String getIsbn() {
        return isbn;
    }
    public Autor getAutor() {
        return autor;
    }


    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Autor: " + this.autor.getNome());
    }
}
