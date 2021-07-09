import java.util.Date;
import java.util.List;

public class Medico extends Persona {
     private String codMedico;
     private List<Servicio> servicios;
     private Hospital hospital;

    //metodo constructor

    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento) {
        super(nombre,primerApellido,segundoApellido,DNI,fechaNacimiento);
        this.servicios = servicios;
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codMedico='" + codMedico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
