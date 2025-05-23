package escuelaing.cvds.parcial.repository;

import escuelaing.cvds.parcial.model.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;

public interface CitaRepository extends MongoRepository<Cita , String>{
    List<Cita> findByCorreo(String correo);
    List<Cita> findByCorreoAndEstado (String correo , String estado);

}