public class CarrinhoDeCompra {
    private double total;

    public void adicionar(Produto produto)
    {
        System.out.println("Adicionado: " + produto);
        this.total += produto.getValor();
    }

    public double getTotal()
    {
        return this.total;
    }
}