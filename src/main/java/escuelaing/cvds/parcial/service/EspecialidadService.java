package escuelaing.cvds.parcial.service;

import escuelaing.cvds.parcial.model.Especialidad;
import escuelaing.cvds.parcial.repository.EspecialidadRepository;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class EspecialidadService {
    private final EspecialidadRepository repo;

    public EspecialidadService(EspecialidadRepository repo){
        this.repo = repo;
    }

    public List<Especialidad> listar(){
        return repo.findAll();
    }

    public Especialidad obtenerPorId(String id){
        return repo.findById(id).orElse(null);
    }

}