package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.TipoDeBatalla;
//import ar.edu.unlam.pb2.eva03.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.Acuatico;
import ar.edu.unlam.pb2.eva03.Terrestre;
import ar.edu.unlam.pb2.eva03.Volador;

public class Batalla {
	
	private String nombre;
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	
	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}

	
	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}


	public void setVehiculosEnLaBatalla(Vehiculo nuevoVehiculo) {
		vehiculosEnLaBatalla.add(nuevoVehiculo);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getLatitud() {
		return latitud;
	}


	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}


	public Double getLongitud() {
		return longitud;
	}


	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public TipoDeBatalla getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
}
