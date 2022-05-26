package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{
    private double lado;
    private double area;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados) {
        if (numeroDeLados < 5) {
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        } else {
            this.numeroDeLados = numeroDeLados;
        }
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        double perimetro = (double)this.numeroDeLados * this.lado;
        double anguloCentral = (double)(360 / this.numeroDeLados);
        double apotema = this.lado / (2.0D * Math.tan(Math.toRadians(anguloCentral / 2.0D)));
        this.area = perimetro * apotema / 2.0D;
        return this.area;
    }

    public String getName() {
        return "Poligono Regular";
    }
}
