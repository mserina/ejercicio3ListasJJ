package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.Meses;
/**
 * Contiene la cabezera de los metodos 
 * msm - 020224
 */
public interface OperacionInterfaz {

	/**
	 * Metodo que pide el mes y el numero del mes y lo añade a la lista
	 * msm - 020224
	 * @param meses
	 */
	public void pedirMesesYNumero(List<Meses> meses);
	
	/**
	 * Metodo que pide al usuario el numero del mes y muestra el mes 
	 * msm - 020224
	 * @param meses
	 * @param sc
	 */
	public void mesDado(List<Meses> meses, Scanner sc);
	
}
