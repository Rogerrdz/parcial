package escuelaing.cvds.parcial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "especialidades")
public class Especialidad {
    @Id
    private String Id;
    private String nombre;
    private String descripcion;
    private String doctor;
    private String ubicacionM;

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getId() {
        return Id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacionM() {
        return ubicacionM;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacionM(String ubicacionM) {
        this.ubicacionM = ubicacionM;
    }
}

