package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.Articulo;
import app.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
		@Autowired
		ArticuloServiceImpl articuloServiceImpl;
		
		@GetMapping("/articulos")
		public List<Articulo> listarFabricantes(){
			return articuloServiceImpl.listarArticulos();
			//
		}
		
		@PostMapping("/articulos")
		public Articulo guardarFabricante(@RequestBody Articulo articulo) {
			
			return articuloServiceImpl.guardarArticulo(articulo);
		}
		
		@GetMapping("/articulos/{id}")
		public Articulo fabricanteXID(@PathVariable(name="id") Long id) {
			
			Articulo articulo_xid = new Articulo();
			
			articulo_xid = articuloServiceImpl.articuloXID(id);
			
			System.out.println("Fabricante XID: " + articulo_xid);
			
			return articulo_xid;
			
		}
		
		@PutMapping("/articulos/{id}")
		public Articulo actualizarArticulo(@PathVariable(name="id")Long id, @RequestBody Articulo articulo) {
			
			Articulo art_seleccionado = new Articulo();
			
			art_seleccionado = articuloServiceImpl.actualizarArticulo(articulo);
			
			art_seleccionado.setNombre(articulo.getNombre());
			
			Articulo a = articuloServiceImpl.actualizarArticulo(art_seleccionado);
			
			return a;
			
		}
		
		@DeleteMapping("/articulos/{id}")
		public void eliminarFabricante(@PathVariable(name="id")Long id){
			articuloServiceImpl.eliminarArticulo(id);
		}

}
