package com.mx.Artmicrosip.servicio;

import java.util.List;

import com.mx.Artmicrosip.dominio.Artmicrosip;

public interface ArtmicrosipServicios {
	
	public void guardar (Artmicrosip artmicrosip);
	public void editar (Artmicrosip artmicrosip);
	public void eliminar (Artmicrosip artmicrosip);
	
	public Artmicrosip buscar (Artmicrosip artmicrosip);
	public List<Artmicrosip>listar();

}
