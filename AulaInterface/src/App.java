public class App {
    public static void main(String[] args) throws Exception {
        Autor autor =  new Autor();
        autor.setNome("Autor");

        Ebook ebook = new Ebook(autor);
        ebook.setValor(35.5);

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setValor(75.33);

        MiniLivro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(15);

        Revista revista = new Revista();
        revista.setValor(10.5);

        CarrinhoDeCompra compras = new CarrinhoDeCompra();
        compras.adicionar(ebook);
        compras.adicionar(livroFisico);
        compras.adicionar(miniLivro);
        compras.adicionar(revista);
        System.out.println("Total: " + compras.getTotal());

    }
}
