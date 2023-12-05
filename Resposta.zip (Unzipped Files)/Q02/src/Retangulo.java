public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public void calcularArea()
    {
        System.out.println(base*altura);
    }

    public void setBase(double base)
    {
        this.base = base;
    }
    public double getBase()
    {
        return this.base;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public double getAltura()
    {
        return this.altura;
    }
}
