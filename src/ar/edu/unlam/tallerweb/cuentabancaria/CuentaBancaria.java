package ar.edu.unlam.tallerweb.cuentabancaria;

public class CuentaBancaria {
	
	private Double totalDineroCuenta;

	private String cliente;
	
	
	public CuentaBancaria(Double totalDineroCuenta) {
		this.totalDineroCuenta = totalDineroCuenta;
	}

	public Double getTotalDineroCuenta() {
		return totalDineroCuenta;
	}

	public void setTotalDineroCuenta(Double totalDineroCuenta) {
		this.totalDineroCuenta = totalDineroCuenta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void extraerDinero (Double montoAExtraer){
		if (montoAExtraer <= this.totalDineroCuenta && montoAExtraer > 0) {
			this.totalDineroCuenta = this.totalDineroCuenta - montoAExtraer;
		}
	}
	
	public void depositarDinero (Double montoADepositar){
		if (montoADepositar > 0) {
			this.totalDineroCuenta = this.totalDineroCuenta + montoADepositar;
		}	
	}
	
}
