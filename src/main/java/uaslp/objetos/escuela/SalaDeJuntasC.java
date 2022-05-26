package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas{
    private static SalaDeJuntasC instancia;

    public SalaDeJuntasC() {
    }

    public String getNombre() {
        return "Sala C";
    }

    public static SalaDeJuntasC getInstance() {
        if (instancia == null) {
            instancia = new SalaDeJuntasC();
        }
        return instancia;
    }
}
