package ar.edu.unlam.tallerweb.cuentabancariatest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unlam.tallerweb.cuentabancaria.CuentaBancaria;


public class CuentaBancariaTest {
	
	CuentaBancaria cuentaB;
	
	@Before
	public void setUp(){
		cuentaB = new CuentaBancaria(5500.0);
	}
	
	@Test
	public void testQueExtraeDinero(){
		cuentaB.extraerDinero(50.99);
		Assert.assertEquals(50.99, cuentaB.getTotalDineroCuenta(), 0.0);
	}
	
}
