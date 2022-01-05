package com.prueba.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prueba.annotations")
public class EmpleadoConfig {
	
	//Definir el bean para InformeFinancieroCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroCompras() {
		return new InformeFinancieroCompras();
		
	}

	//Dedinir bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleado directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroCompras());
		
	}
}
