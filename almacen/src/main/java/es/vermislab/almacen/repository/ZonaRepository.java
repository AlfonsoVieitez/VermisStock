package es.vermislab.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.vermislab.almacen.entity.Elemento;
import es.vermislab.almacen.entity.Zona;

@Repository
public interface ZonaRepository extends JpaRepository<Zona, Integer> {

}
