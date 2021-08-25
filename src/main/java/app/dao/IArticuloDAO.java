package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Articulo;
import app.dto.Fabricante;

public interface IArticuloDAO extends JpaRepository<Articulo, Long> {
	
	public List<Articulo> findByNombre(String nombre);

}
