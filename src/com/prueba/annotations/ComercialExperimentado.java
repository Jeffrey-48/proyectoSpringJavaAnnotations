package com.prueba.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
//definir el patron
//@Scope("prototype")
public class ComercialExperimentado implements Empleado,  InitializingBean, DisposableBean{

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
	
	//ejecución de código después de la creación del bean
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("codigo ejecutado tras creacion de bean");
	}
	
	//ejecucion de código después de apagado el contenedor
	public void destroy() {
		System.out.println("ejecutando antes de la destruccion");
	}

	
}
