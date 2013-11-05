package persistencia;
import excepciones.*;
import logica.Inmueble;

public interface IInmuebleDAO {

	public Inmueble encontrarInmueblePorCod(String cod)throws DAOExcepcion;
	public void crearInmueble (Inmueble i)throws DAOExcepcion;


}
