package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre {

	private Double velocidad;
	private Double profundidad;


	public Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad = 0.0;
		this.profundidad = 0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
