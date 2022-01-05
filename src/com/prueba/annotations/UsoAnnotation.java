package com.prueba.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer el xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Pedir Bean al contenedor 
		Empleado carlos = contexto.getBean("ComercialExperimentado", Empleado.class);
		
		//Usar Bean 
		System.out.println(carlos.getInforme());
		System.out.println(carlos.getTareas());
		
		//Cerrar contexto
		contexto.close();
	}

}
