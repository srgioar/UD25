package app.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricantes")

public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nombre")
	private String nombre;
	
	// Anotaciones referentes a Fabricante
	// Articulos referentes al fabricante ->
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Articulo> Articulos;
	
	// Constructores
	
	public Fabricante () {
		
	}
	
	public Fabricante(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}


	public long getCodigo() {
		return id;
	}
	public void setCodigo(int codigo) {
		this.id = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulos(){
		return Articulos;
	}
	
	public void setArticulos(List<Articulo> articulos) {
		Articulos = articulos;
	}
	
	@Override
	public String toString() {
		return "Fabricante: ID->" + id + " Nombre-> " + nombre;
	}

}
