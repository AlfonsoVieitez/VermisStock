package es.vermislab.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.vermislab.almacen.entity.Almacen;
import es.vermislab.almacen.entity.Elemento;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Integer> {

}
	