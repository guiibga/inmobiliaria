package logica;

public class NaveIndustrial extends Inmueble {
	String numPuertas,calificacion;
	
	public NaveIndustrial(String cod_id, String venta_alquiler, String calle,
			String localidad, String fecha_alta, String superficie_total, String superficie,String numPuertas,String calificacion) {
		super(cod_id, venta_alquiler, calle, localidad, fecha_alta, superficie_total);
		this.numPuertas = numPuertas;
		this.calificacion = calificacion;
	}


	public String getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(String numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

}
