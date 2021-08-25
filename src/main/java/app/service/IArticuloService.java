package app.service;

import java.util.List;
import app.dto.Articulo;

public interface IArticuloService {
	
	// Métodos
	
	public List<Articulo> listarArticulos();
	
	public Articulo guardarArticulo(Articulo articulo);
	
	public Articulo articuloXID(Long id);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public void eliminarArticulo(Long id);
	
	// Extensión de la interfaz básica
	
	// FILTRO EN FUNCIÓN DEL NOMBRE
	
	public List<Articulo> obtenerArticuloPorNombre(String nombre);
	
	// FILTRO POR PRECIO
	
	// FABRICANTE

}
