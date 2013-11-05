package logica;

import java.util.Date;

public class Piso extends Inmueble{

	private int numhab;

	public Piso(int numhab, int codigo, boolean venta, boolean alquiler, String calle,
			String localidad, Date fecha, double superficie) {
		
		super(codigo, venta, alquiler, calle, localidad, fecha, superficie);
		this.numhab = numhab;
	}

	public int getNumhab() {
		return numhab;
	}

	public void setNumhab(int numhab) {
		this.numhab = numhab;
	}
	
	
	
}
