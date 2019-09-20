package es.vermislab.almacen.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import es.vermislab.almacen.entity.Balda;
import es.vermislab.almacen.entity.Elemento;

@Repository
public interface BaldaRepository extends JpaRepository<Balda, Integer> {

}
