package es.vermislab.almacen.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.vermislab.almacen.entity.Elemento;

@Repository
public interface ElementoRepository extends JpaRepository<Elemento, Integer> {
	
	
@Query ("SELECT e FROM Elemento e WHERE e.nb_elemento LIKE %?1%")
public Optional<List<Elemento>> findByNbElemento (String nbElemento);

	
}
