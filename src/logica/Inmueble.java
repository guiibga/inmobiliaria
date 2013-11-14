package logica;

public class Inmueble {

	private String Cod_Id;
	private String Venta_Alquiler;
	private String Calle;
	private String Localidad;
	private String Fecha_Alta;
	private String Superficie_Total;
	
	
	public Inmueble(String cod_id, String venta_alquiler, String calle,
			String localidad, String fecha_alta, String superficie_total) {
		this.Cod_Id = cod_id;
		this.Venta_Alquiler = fecha_alta;
		this.Calle = calle;
		this.Localidad = localidad;
		this.Fecha_Alta = fecha_alta;
		this.Superficie_Total = superficie_total;
	}

	public String getCod_Id() {
		return Cod_Id;
	}

	public void setCod_Id(String cod_Id) {
		Cod_Id = cod_Id;
	}

	public String getVenta_Alquiler() {
		return Venta_Alquiler;
	}

	public void setVenta_Alquiler(String venta_Alquiler) {
		Venta_Alquiler = venta_Alquiler;
	}

	public String getCalle() {
		return Calle;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	public String getFecha_Alta() {
		return Fecha_Alta;
	}

	public void setFecha_Alta(String fecha_Alta) {
		Fecha_Alta = fecha_Alta;
	}

	public String getSuperficie_Total() {
		return Superficie_Total;
	}

	public void setSuperficie_Total(String superficie_Total) {
		Superficie_Total = superficie_Total;
	}
}
