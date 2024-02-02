package dtos;

/**
 * Clase dto, de meses
 * msm - 020224
 */
public class Meses {

//CAMPOS
	int numeroMes = 0;
	String mes = "AAAA"; 
	
//GETTERS Y SETTERS
	public int getNumeroMes() {
		return numeroMes;
	}
	public void setNumeroMes(int numeroMes) {
		this.numeroMes = numeroMes;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}

//CONTROLADORES
	public Meses() {
		super();
	}
	
	
	public Meses(int numeroMes, String mes) {
		super();
		this.numeroMes = numeroMes;
		this.mes = mes;
	}
	
	
	//TO STRING
	@Override
	public String toString() {
		return "[" +"Mes: " + numeroMes + ", NumeroMes: " + mes + "]";
	}


	
}
