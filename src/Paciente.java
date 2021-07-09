import java.util.Date;

public class Paciente extends Persona{
    String codPaciente;
    String numeroSeguridadSocial;

    //metodo constructor

    public Paciente(String codPaciente, String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String numeroSeguridadSocial) {
        super(nombre, primerApellido,segundoApellido,DNI, fechaNacimiento);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }


    //getter and setter


    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
