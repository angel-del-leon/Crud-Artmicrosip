package com.mx.Artmicrosip.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Artmicrosip.dao.ArtmicrosipDao;
import com.mx.Artmicrosip.dominio.Artmicrosip;

@Service
public class ArtmicrosipServImp implements ArtmicrosipServicios{

	@Autowired
	ArtmicrosipDao artmicrosipDao;
	
	@Override
	public void guardar(Artmicrosip artmicrosip) {
		artmicrosipDao.save(artmicrosip);
	}

	@Override
	public void editar(Artmicrosip artmicrosip) {
		artmicrosipDao.save(artmicrosip);		
	}

	@Override
	public void eliminar(Artmicrosip artmicrosip) {
		artmicrosipDao.delete(artmicrosip);
	}

	@Override
	public Artmicrosip buscar(Artmicrosip artmicrosip) {
		
		return  artmicrosipDao.findById(artmicrosip.getId()).orElse(null);
	}

	@Override
	public List<Artmicrosip> listar() {
		return (List<Artmicrosip>)artmicrosipDao.findAll();
	}

}
