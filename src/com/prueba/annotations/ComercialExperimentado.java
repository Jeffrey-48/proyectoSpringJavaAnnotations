package com.prueba.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleado {

	@Autowired
	@Qualifier("informeFinancieroTrim4") //bean id que debe usar
	private CreacionInformeFinanciero nuevoInforme;
	
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		super();
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender productos";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
	
}
