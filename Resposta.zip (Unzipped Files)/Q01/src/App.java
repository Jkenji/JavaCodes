public class App {
    public static void main(String[] args) throws Exception {
        // Polimorfismo Função        
        Veiculo veiculo = new Veiculo();
        veiculo.mover();

        Carro carro = new Carro();
        carro.mover();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.mover();

        // Polimorfismo Objeto
        Veiculo novoCarro = new Carro();
        novoCarro.mover();
    }
}
