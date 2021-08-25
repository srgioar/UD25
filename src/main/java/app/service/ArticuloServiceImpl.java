package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.dao.IArticuloDAO;
import app.dto.Articulo;

public class ArticuloServiceImpl implements IArticuloService {
	
	@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public java.util.List<Articulo> listarArticulos() {
		// TODO Auto-generated method stub
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long id) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		iArticuloDAO.deleteById(id);
		
	}

	@Override
	public List<Articulo> obtenerArticuloPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findByNombre(nombre);
	}


}
