package escuelaing.cvds.parcial.controller;

import escuelaing.cvds.parcial.model.Especialidad;
import escuelaing.cvds.parcial.service.EspecialidadService;
import org.springframework.web.dind.anotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadController {
    private final EspecialidadService service;

    public EspecialidadController(EspecialidadService service) {
        this.service = service;
    }

    @GetMapping
    public List<Especialidad> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Especialidad obtener(@Pathvariable String id){
        return service.obtenerPorId(id);
    }
}
