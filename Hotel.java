import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private String ubicacion;
    private String foto;

    private String descripcion;

    ArrayList<Opinion> opiniones;
    ArrayList<Habitacion> habitaciones;

    public Hotel(String nombre, String ubicacion, String foto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
