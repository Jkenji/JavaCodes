public class Circulo extends FormaGeometrica{
    private double raio;

    public void calcularArea()
    {
        System.out.println(3.1415*raio*raio);
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }
    public double getRaio()
    {
        return this.raio;
    }
}
