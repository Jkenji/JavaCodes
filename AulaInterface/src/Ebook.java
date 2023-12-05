public class Ebook extends Livro implements Promocional{
    private String waterMark;

    
    public Ebook(Autor autor){
        super(autor);
    }


    @Override
    public boolean aplicarDesconto(double porcentagem){
        if(porcentagem > 0.15)
        {
            return false;
        }

        System.out.println("Desconto Ebook");
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }


    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }


    public String getWaterMark() {
        return waterMark;
    }
}
