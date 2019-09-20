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
@Table (name = "balda")
public class Balda {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_balda")
	private Integer id_balda;
	
	@ManyToOne
	@JoinColumn(name = "id_zona")
	private Zona zona;
	
	@Column (name = "nb_balda")
	private String nb_balda;	
	
	public Balda() {}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public String getNb_balda() {
		return nb_balda;
	}

	public void setNb_balda(String nb_balda) {
		this.nb_balda = nb_balda;
	}

	public void setId_balda(Integer id_balda) {
		this.id_balda = id_balda;
	}

}
