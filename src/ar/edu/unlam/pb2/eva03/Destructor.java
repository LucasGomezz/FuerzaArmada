package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico {

	private Double velocidad;

	public Destructor(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad = 0.0;
	}


	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return null;
	}

}
