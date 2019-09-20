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
@Table(name="elemento")

public class Elemento {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_elemento")
	private Integer id_elemento;
	
	@ManyToOne
	@JoinColumn(name = "id_balda")
	private Balda balda;
	
	@Column(name = "nb_elemento")
	private String nb_elemento;
	
	@Column(name = "unidades_Vermislab")
	private int unidades_Vermislab;
	
	@Column(name = "unidades_disponibles")
	private int unidades_disponibles;
	
	@Column(name = "comentarios_elemento")
	private String comentarios_elemento;
	
	public Elemento() {}

	public int getId_elemento() {
		return id_elemento;
	}

	public void setId_elemento(int id_elemento) {
		this.id_elemento = id_elemento;
	}

	public Balda getBalda() {
		return balda;
	}

	public void setBalda(Balda balda) {
		this.balda = balda;
	}

	public String getNb_elemento() {
		return nb_elemento;
	}

	public void setNb_elemento(String nb_elemento) {
		this.nb_elemento = nb_elemento;
	}

	public int getUnidades_Vermislab() {
		return unidades_Vermislab;
	}

	public void setUnidades_Vermislab(int unidades_Vermislab) {
		this.unidades_Vermislab = unidades_Vermislab;
	}

	public int getUnidades_disponibles() {
		return unidades_disponibles;
	}

	public void setUnidades_disponibles(int unidades_disponibles) {
		this.unidades_disponibles = unidades_disponibles;
	}

	public String getComentarios_elemento() {
		return comentarios_elemento;
	}

	public void setComentarios_elemento(String comentarios_elemento) {
		this.comentarios_elemento = comentarios_elemento;
	}

}
