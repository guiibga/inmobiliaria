package Inmueble;

public class Transaccion {

	private double precioFinal;
	private boolean compraAlquiler; //True = compra; False = alquiler
	
	public double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public boolean isCompraAlquiler() {
		return compraAlquiler;
	}
	public void setCompraAlquiler(boolean compraAlquiler) {
		this.compraAlquiler = compraAlquiler;
	}
	
}
