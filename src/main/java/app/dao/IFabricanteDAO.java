package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long> {
	
	public List<Fabricante> findByNombre(String nombre);

}
