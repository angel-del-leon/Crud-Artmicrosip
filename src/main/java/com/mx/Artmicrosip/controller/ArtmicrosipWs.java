package com.mx.Artmicrosip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Artmicrosip.dominio.Artmicrosip;
import com.mx.Artmicrosip.servicio.ArtmicrosipServicios;


@RestController
@RequestMapping ("ArtmicrosipWs")
@CrossOrigin
public class ArtmicrosipWs {

	@Autowired
	ArtmicrosipServicios artmicrosipServicios;
	
	///http://localhost:9000/ArtmicrosipWs/listar
	
	@GetMapping("listar")
	public List<Artmicrosip> listar() {

		List<Artmicrosip> lista = artmicrosipServicios.listar();

		return lista;

	}

	// http://localhost:9000/ArticulosWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Artmicrosip artmicrosip) {

		artmicrosipServicios.guardar(artmicrosip);
	}

	// http://localhost:9000/ArticulosWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Artmicrosip artmicrosip) {

		artmicrosipServicios.editar(artmicrosip);
	}

	// http://localhost:9000/ArticulosWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Artmicrosip artmicrosip) {

		artmicrosipServicios.eliminar(artmicrosip);
	}
	
	// http://localhost:9000/ArticulosWs/buscar
	@PostMapping("buscar")
	public Artmicrosip buscar(@RequestBody Artmicrosip artmicrosip) {
		artmicrosip = artmicrosipServicios.buscar(artmicrosip);
		System.out.println(artmicrosip);
		return artmicrosip;
	}

	
}
