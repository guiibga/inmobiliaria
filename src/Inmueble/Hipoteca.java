package Inmueble;

public class Hipoteca {
private double cantpendiente;
private String banco;

public Hipoteca(double cantpendiente, String banco) {
	this.cantpendiente = cantpendiente;
	this.banco = banco;
}

public double getCantpendiente() {
	return cantpendiente;
}

public void setCantpendiente(double cantpendiente) {
	this.cantpendiente = cantpendiente;
}

public String getBanco() {
	return banco;
}

public void setBanco(String banco) {
	this.banco = banco;
}

}
