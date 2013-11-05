package logica;

import java.util.Date;

public class Inmueble {

	private int codigo;
	private boolean venta;
	private boolean alquiler;
	private String calle;
	private String localidad;
	private Date fecha;
	private double superficie;
	
	
	
	public Inmueble(int codigo, boolean venta, boolean alquiler, String calle,
			String localidad, Date fecha, double superficie) {
		this.codigo = codigo;
		this.venta = venta;
		this.alquiler = alquiler;
		this.calle = calle;
		this.localidad = localidad;
		this.fecha = fecha;
		this.superficie = superficie;
	}

	
	public boolean isVenta() {
		return venta;
	}


	public void setVenta(boolean venta) {
		this.venta = venta;
	}


	public boolean isAlquiler() {
		return alquiler;
	}


	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



}
