public class Revista implements Produto, Promocional{
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
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
    public Editora getEditora() {
        return editora;
    }


    public boolean aplicarDesconto(double porcentagem){
        if(porcentagem > 0.1){
            return false;
        }

        double desconto = getValor()*porcentagem;
        setValor(getValor()-desconto);
        return true;
    }    
}
