package uaslp.objetos.figuras;

public class Cuadrado implements Figura{
    private double lado;
    private double area;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado=lado;
    }

    public double getArea() {
        if (lado == 0.00){
            throw new LadoNoProvistoException();
        }else {
            return lado * lado;
        }
    }

    public double getLado() {
        return lado;
    }

    public String getName() {
        return "Cuadrado";
    }
}
