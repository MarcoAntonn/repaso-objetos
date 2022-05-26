package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        if (base == 0.0D) {
            throw new BaseNoProvistaException();
        } else if (altura == 0.0D) {
            throw new AlturaNoProvistaException();
        } else {
            return (base * altura) / 2;
        }
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getDescription() {
        return "Cualquier triangulo";
    }

    public String getName() {
        return "Cualquier triangulo";
    }
}
