package Inmueble;
import java.util.List;

import logica.Inmueble;


public class Inmobiliaria {

	private String nombre;
	private List<Inmueble> inmuebles;
	Inmueble a=null;
	
	public Inmobiliaria(String nombre, List<Inmueble> inmuebles) {
		this.nombre = nombre;
		this.inmuebles = inmuebles;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Inmueble> getInmuebles() {
		return inmuebles;
	}
	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}
	
	public void addInmueble(Inmueble a){
		inmuebles.add(a);
    }
	
	public void borrarInmueble(Inmueble a){
		inmuebles.remove(a);
    }
	
	public Inmueble buscarInmueble(int cod){
		
		
	for( int i = 0 ; i < inmuebles.size() ; i++ ){
		   if ((inmuebles.get( i )).getCodigo()==cod)
			   a= inmuebles.get(i);
	}
	return a;
		}   
	
}
