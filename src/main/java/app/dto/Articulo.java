package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulos")

public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;
	@Column(name = "fabricante")
	private int fabricante;
	
	// Anotaciones de la relación con Artículo
	
	@ManyToOne
	@JoinColumn(name="codigo")
	private Fabricante Fabricante;
	
	// Constructores
	
	public Articulo() {
		
	}
	
	public Articulo(long id, String nombre, int precio, int fabricante, Fabricante Fabricante) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
		this.Fabricante = Fabricante;
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getFabricante() {
		return fabricante;
	}
	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		return "Articulo: ID-> " + id + " Nombre-> " + nombre + " Precio-> " + precio + " Fabricante-> " + fabricante;
	}

}
