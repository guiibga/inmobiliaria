package logica;

public class Piso extends Inmueble{
	
	private String Num_Habitaciones;

	public Piso(String cod_id, String venta_alquiler, String calle,
			String localidad, String fecha_alta, String superficie_total,String Num_Habitaciones) {
		
		super(cod_id, venta_alquiler, calle, localidad, fecha_alta, superficie_total);
		this.Num_Habitaciones = Num_Habitaciones;
	}

	public String getNum_Habitaciones() {
		return Num_Habitaciones;
	}

	public void setNum_Habitaciones(String Num_Habitaciones) {
		this.Num_Habitaciones = Num_Habitaciones;
	}
	
	
	
}
