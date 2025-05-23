package escuelaing.cvds.parcial.service;

import escuelaing.cvds.parcial.model.Cita;
import escuelaing.cvds.parcial.repository.CitaRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class CitaService {
    private final CitaRepository repo;
    private final LocalDate fechaParcial = LocalDate.of(2025,5,23);
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");

    public CitaService(CitaRepository repo){
        this.repo = repo;
    }
    public Cita programarCita(Cita cita){
        if(cita.getNombrePaciente().isBlank() || cita.getCorreo().isBlank()){
            cita.setEstado("Rechazada");
            return cita;
        }
        LocalDate fechaCita = LocalDate.parse(cita.getFeacha(), formatter());
        if(fechaCita.isBefore(fechaParcial)){
            cita.setEstado("Rechazada");
        } else {
            cita.setEstado("Confirmada");
            repo.save(cita);
        }
        return cita;
        }
    }

    public List<Cita> citasPorCorreo(String correo){
        return repo.findByCorreo(correo);
    }
}