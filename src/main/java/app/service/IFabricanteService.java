package app.service;

import java.util.List;

import app.dto.Fabricante;

public interface IFabricanteService {
	
	// Métodos
	
	public List<Fabricante> listarFabricantes();
	
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public Fabricante fabricanteXID(Long id);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void eliminarFabricante(Long id);
	
	// Extensión de la interfaz básica
	
	// FILTRO EN FUNCIÓN DEL NOMBRE
	
	public List<Fabricante> obtenerFabricantePorNombre(String nombre);
	
	// FILTRO POR PRECIO
	
	// FABRICANTE

}
