package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    public SalaDeJuntasFactory() {
    }

    public static SalaDeJuntas get(String sala) {
        if (sala == "Sala A") {
            return SalaDeJuntasA.getInstance();
        } else if (sala == "Sala B") {
            return SalaDeJuntasB.getInstance();
        } else {
            return sala == "Sala C" ? SalaDeJuntasC.getInstance() : null;
        }
    }

}
