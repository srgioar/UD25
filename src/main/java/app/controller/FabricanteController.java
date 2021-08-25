package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.Fabricante;
import app.service.FabricanteServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
		//
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricanteXID(@PathVariable(name="id") Long id) {
		
		Fabricante fabricante_xid = new Fabricante();
		
		fabricante_xid = fabricanteServiceImpl.fabricanteXID(id);
		
		System.out.println("Fabricante XID: " + fabricante_xid);
		
		return fabricante_xid;
		
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id")Long id, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado = new Fabricante();
		
		fabricante_seleccionado = fabricanteServiceImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		Fabricante f = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		return f;
		
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name="id")Long id){
		fabricanteServiceImpl.eliminarFabricante(id);
	}

}
