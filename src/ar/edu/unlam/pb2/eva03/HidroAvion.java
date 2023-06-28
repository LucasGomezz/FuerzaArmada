package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{

	private Double profundidad;
	private Double altura;


	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.altura = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}
	
}
