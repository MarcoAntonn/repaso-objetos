package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas{
    private static SalaDeJuntasA instancia;

    public SalaDeJuntasA() {
    }

    public String getNombre() {
        return "Sala A";
    }

    public static SalaDeJuntasA getInstance() {
        if (instancia == null) {
            instancia = new SalaDeJuntasA();
        }
        return instancia;
    }
}
