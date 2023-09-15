public class contactos {
    private String nombre;
    private String movil;
    private String correo;

    public contactos(String nombre, String movil, String correo) {

        this.nombre = nombre;
        this.movil = movil;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getMovil() {
        return movil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
