public class CarrinhoDeCompra {
    private double total;

    public void adicionar(Livro livro, double porcentagem)
    {
        System.out.println(livro);
        livro.aplicarDesconto(porcentagem);
        this.total += livro.getValor();
    }

    public double getTotal()
    {
        return total;
    }
}
