public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(2.5);
        retangulo.setBase(5);
        retangulo.calcularArea();

        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        circulo.calcularArea();
    }
}
