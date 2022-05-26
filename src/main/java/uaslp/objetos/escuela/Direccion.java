package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion instacia;

    private Direccion() {
    }

    public static Direccion getInstance() {
        if (instacia == null) {
            instacia = new Direccion();
        }
        return instacia;
    }

}
