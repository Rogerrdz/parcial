package escuelaing.cvds.parcial.repository;

import escuelaing.cvds.parcial.model.Especialidad;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;

public interface EspecialidadRepository extends MongoRepository<Especialidad , String>{ }