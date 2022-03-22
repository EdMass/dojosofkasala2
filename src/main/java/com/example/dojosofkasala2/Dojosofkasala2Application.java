package com.example.dojosofkasala2;

import com.example.dojosofkasala2.controller.ManejoCorreos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dojosofkasala2Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Dojosofkasala2Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Dojosofkasala2Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		ManejoCorreos app = new ManejoCorreos();
		//app.eliminarRepetidos();
		//app.filtrarPorDominio("gmail");
		//app.contarCorreos();
		//app.contarCorreosPorDominio("gmail");
		app.cambiarEstadoDeEnvioA(true);
	}
}
