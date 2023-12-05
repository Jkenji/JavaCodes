public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor();
        autor.setNome("NomeAutor");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setValor(35.7);

        Ebook ebook = new Ebook(autor);
        ebook.setValor(16.65);
        
        Livro livro = new LivroFisico(autor);

        MiniLivro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(100);
        miniLivro.aplicarDesconto(0.10);
        System.out.println("MiniLivro desconto: " + miniLivro.getValor());

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionar(livroFisico, 0.25);
        carrinho.adicionar(ebook, .10);
        carrinho.adicionar(miniLivro, 0.15);
        System.out.println("Total: " + carrinho.getTotal());

    }
}
