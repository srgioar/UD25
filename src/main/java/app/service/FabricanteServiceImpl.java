package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import app.dao.IFabricanteDAO;
import app.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {
	
	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public java.util.List<Fabricante> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Long id) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		// TODO Auto-generated method stub
		iFabricanteDAO.deleteById(id);
		
	}

	@Override
	public List<Fabricante> obtenerFabricantePorNombre(String nombre) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findByNombre(nombre);
	}

	

}
