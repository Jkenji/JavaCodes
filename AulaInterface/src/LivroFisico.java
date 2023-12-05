public class LivroFisico extends Livro implements Promocional{
    public LivroFisico(Autor autor){
        super(autor);
    }


    @Override
    public boolean aplicarDesconto(double porcentagem){
        if(porcentagem > 0.30)
        {
            return false;
        }

        System.out.println("Desconto LivroFisico");
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }


    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }
}
