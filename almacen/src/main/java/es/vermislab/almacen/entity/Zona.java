package es.vermislab.almacen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="zona")
public class Zona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_zona")
	private Integer id_zona;
	
	@ManyToOne
	@JoinColumn(name = "id_almacen")
	private Almacen almacen;
	
	@Column(name = "nb_zona")
	private String nb_zona;
	
	public Zona() {}
	
	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public String getNb_zona() {
		return nb_zona;
	}

	public void setNb_zona(String nb_zona) {
		this.nb_zona = nb_zona;
	}

	public Integer getId_zona() {
		return id_zona;
	}

	public void setId_zona(Integer id_zona) {
		this.id_zona = id_zona;
	}

}
