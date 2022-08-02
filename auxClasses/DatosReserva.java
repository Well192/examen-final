package auxClasses;

import java.util.Date;

public class DatosReserva {
    private String nombre;
    private String apellido;
    private Date fecha;

    public DatosReserva(String nombre, String apellido, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", fecha:" + fecha;
    }
}
