package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new TreeMap<String, Batalla>();
	}

	public void agregarVehiculo(Vehiculo nuevoVehiculo) {
		convoy.add(nuevoVehiculo);
	}

	public Integer getCapacidadDeDefensa() {

		return (Integer) this.convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		Batalla nueva = new Batalla(nombre, tipo, latitud, longitud);
		batallas.put(nombre, nueva);
	}

	public Batalla getBatalla(String nombre) {
		Batalla buscada = null;
		for (Map.Entry<String, Batalla> batalla : batallas.entrySet()) {
			String key = batalla.getKey();
			Batalla val = batalla.getValue();
			if (key == nombre) {
				buscada = val;
			}
		}
		return buscada;
	}

	public Boolean enviarALaBatalla(String nombre, Integer codigoVehiculo)
			throws VehiculoIncompatible, VehiculoInexistente {

		Batalla batallaBuscada = batallas.get(nombre);
		Vehiculo vehiculoBuscado = null;

		for (Vehiculo vehiculo : convoy) {
			if (vehiculo.getCodigo() == codigoVehiculo) {
				vehiculoBuscado = vehiculo;
				batallaBuscada.setVehiculosEnLaBatalla(vehiculoBuscado);
			}
		}

		if (vehiculoBuscado == null) {
			throw new VehiculoInexistente();
		}

		switch (batallaBuscada.getTipo()) {
		case TERRESTRE:
			if (!(vehiculoBuscado instanceof Terrestre)) {
				throw new VehiculoIncompatible();
			}
			return true;
		case NAVAL:
			if (!(vehiculoBuscado instanceof Acuatico)) {
				throw new VehiculoIncompatible();
			}
			return true;
		case AEREAS:
			if (!(vehiculoBuscado instanceof Volador)) {
				throw new VehiculoIncompatible();
			}
			return true;
		default:
			return false;
		}
	}
}
