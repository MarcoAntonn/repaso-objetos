package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public static builder builder() {
        return new builder();

    }

    public Alumno(){
    }

    public Alumno(builder builder) {
        this.nombre = builder.getNombre();
        this.clave = builder.getClave();
        this.claveDeCarrera = builder.getClaveDeCarrera();
        this.anioDeIngreso = builder.getAnioDeIngreso();
        this.fechaNacimiento = builder.getFechaNacimiento();
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
