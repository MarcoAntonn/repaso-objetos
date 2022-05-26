package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas{
    private static SalaDeJuntasB instancia;

    public SalaDeJuntasB() {
    }

    public String getNombre() {
        return "Sala B";
    }

    public static SalaDeJuntasB getInstance() {
        if (instancia == null) {
            instancia = new SalaDeJuntasB();
        }
        return instancia;
    }
}
