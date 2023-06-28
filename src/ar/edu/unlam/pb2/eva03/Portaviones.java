package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico {

	private double profundidad;

	public Portaviones(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
