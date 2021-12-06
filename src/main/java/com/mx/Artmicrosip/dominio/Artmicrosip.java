package com.mx.Artmicrosip.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "ARTMICROSIP")
public class Artmicrosip {
	
	@Id
	int id;
	String nombre;
	String medida;
	String clave;
	float precio;

}
