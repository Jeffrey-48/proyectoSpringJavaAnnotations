package com.prueba.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer el xml
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//leer el class de configuration
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadoConfig.class);
//		// Pedir Bean al contenedor
//		Empleado carlos = contexto.getBean("ComercialExperimentado", Empleado.class);
//		Empleado andres = contexto.getBean("ComercialExperimentado", Empleado.class);
//
//		// Apuntan al mismo espacio de memoria?
//		if (carlos==andres) {
//			System.out.println("Apuntan al mismo espacio de memoria");
//			System.out.println(carlos + "\n" + andres);
//		}else {
//			System.out.println("No apuntan al mismo espacio de memoria");
//			System.out.println(carlos + "\n" + andres);
//		}
		
//		Empleado empleado = contexto.getBean("directorFinanciero", Empleado.class);
//		
//		System.out.println(empleado.getTareas());
//		System.out.println(empleado.getInforme());
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println(empleado.getEmail());
		System.out.println(empleado.getNombreEmpresa());
		// Cerrar contexto
		contexto.close();
	}

}
