public class Ciudad {
    String codCiudad;
    String nombre;

    //metodo constructor


    public Ciudad(String codCiudad, String nombre) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " [" + nombre + " - " + codCiudad + "]";
    }

    //getter and setter

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
