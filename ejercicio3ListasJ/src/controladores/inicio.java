package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.Meses;
import servicios.OperacionImplementacion;
import servicios.OperacionInterfaz;

public class inicio {

	/**
	 * Clase que contiene el procidimiento de la aplicacion
	 * msm - 020224
	 * @param args
	 */
	public static void main (String[] args) {
		int contador = 0;

	     Scanner sc = new Scanner(System.in);	
	     OperacionInterfaz op = new OperacionImplementacion();
	     
	     
	    //CREACION Y INICIALIZACION LISTA
		List<Meses> listaMeses;
		listaMeses = new ArrayList<Meses>();
		
		do {
			contador ++;
			op.pedirMesesYNumero(listaMeses);
		}while(contador < 12);
		
		System.out.println(" ");
		System.out.println("----------------MESES------------------");
		for (Meses mesNumero : listaMeses) {
			System.out.println(mesNumero);
			System.out.println(" ");
		}
		System.out.println("---------------------------------------");
		op.mesDado(listaMeses, sc);
		
		
	}
}
