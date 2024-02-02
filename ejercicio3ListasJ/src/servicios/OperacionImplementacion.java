package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.Meses;

/**
 * Clase que contiene la logica de los metodos
 * msm - 020224
 */
public class OperacionImplementacion implements OperacionInterfaz {

	public void pedirMesesYNumero(List<Meses> meses) {
		Scanner sc = new Scanner(System.in);
		int numeroMes = 0;
		String mes;

		System.out.println(" ");
		System.out.println("Inserte mes");
		System.out.println("--------------");
		mes = sc.next();
		System.out.println(" ");
		System.out.println("Inserte numero mes");
		System.out.println("--------------------");
		numeroMes = sc.nextInt();

		Meses mesAñadido = new Meses(numeroMes, mes);
		meses.add(mesAñadido);

	}

	public void mesDado(List<Meses> meses, Scanner sc) {
		boolean cerrarBucle = false;
		
		while (!cerrarBucle) {
			System.out.println(" ");
			System.out.println("Inserte el numero del mes que quiera mostrar");
			System.out.println("---------------------------------------------");

			int numeroMesSeleccionado = sc.nextInt();
			
			if (numeroMesSeleccionado <= 12) 
			{
				for (Meses mesLetra : meses) 
				{
					
					if (mesLetra.getNumeroMes() == numeroMesSeleccionado)
					{
						System.out.println(" ");
						System.out.println("--------------------------");
						System.out.println("EL MES SERIA: " + mesLetra.getMes());
						System.out.println("--------------------------");
						
						System.out.println("Quiere seguir insertando numeros:");
						String respuesta = sc.next();
						if(respuesta.equals("n")) 
						{
							cerrarBucle = true;
						}
						
					}
				}
			} 
			
			else 
			{		
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("!! HA SELECCIONADO UN NUMERO FUERA DEL RANGO, POR FAVOR VUELVA A INTRODUCIRLO ¡¡");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println(" ");

			}
			

		}

	}
}
