package es.vermislab.almacen.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="almacen")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_almacen")
	private Integer id_almacen;

	@Column(name = "nb_almacen")
	private String nb_almacen;

	public Almacen() {}
	
	public Integer getId_almacen() {
		return id_almacen;
	}

	public void setId_almacen(Integer id_almacen) {
		this.id_almacen = id_almacen;
	}

	public String getNb_almacen() {
		return nb_almacen;
	}

	public void setNb_almacen(String nb_almacen) {
		this.nb_almacen = nb_almacen;
	}

}
