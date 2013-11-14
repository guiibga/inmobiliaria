package persistencia;
import java.sql.*;
import logica.Inmueble;
import excepciones.DAOExcepcion;

public class InmuebleDAOImp implements IInmuebleDAO { 
	protected ConnectionManager connManager;
	
	   public InmuebleDAOImp() throws DAOExcepcion {
			super();
			// TODO Auto-generated constructor stub
			try{
			connManager= new ConnectionManager("practica4");
			}catch (ClassNotFoundException e){
				throw new DAOExcepcion(e);
			}
		}

	  public void crearInmueble(Inmueble in) throws DAOExcepcion {
			// TODO Auto-generated method stub
					
	  try{
		connManager.connect();

		connManager.updateDB("insert into INMUEBLE (COD_ID, CALLE, LOCALIDAD, FECHA_ALTA, SUPERFICIE_TOTAL, VENTA_ALQUILER) values ('"+in.getCod_Id()+"','"+in.getCalle()+"','"+in.getLocalidad()+"', '"+in.getFecha_Alta()+"', '"+in.getSuperficie_Total()+"', '"+in.getVenta_Alquiler()+"')");

		connManager.close();
		} catch (Exception e){
				throw new DAOExcepcion(e);
			}
		}

	 public Inmueble encontrarInmueblePorCod(String cod)throws DAOExcepcion{
			// TODO Auto-generated method stub
	  try{
		connManager.connect();

	ResultSet rs=connManager.queryDB("select CALLE, LOCALIDAD, FECHA_ALTA, SUPERFICIE_TOTAL, VENTA_ALQUILER from INMUEBLE where COD_ID= '"+cod+"'");
		connManager.close();
		if (rs.next())
		  return new Inmueble(cod,rs.getString("CALLE"),rs.getString("LOCALIDAD"), rs.getString("FECHA_ALTA"),rs.getString("SUPERFICIE_TOTAL"),rs.getString("VENTA_ALQUILER"));
		 else
			return null;
				
		}catch (SQLException e){
					throw new DAOExcepcion(e);
				}
			
		}


}
