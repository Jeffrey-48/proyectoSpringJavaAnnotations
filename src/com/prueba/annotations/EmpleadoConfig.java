package com.prueba.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.prueba.annotations")
@PropertySource("classpath:datosEmpresas.propiedades")
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
