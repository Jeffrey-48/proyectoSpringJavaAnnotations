package com.prueba.annotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleado {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender productos";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial";
	}

}
