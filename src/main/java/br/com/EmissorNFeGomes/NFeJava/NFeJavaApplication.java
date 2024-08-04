package br.com.EmissorNFeGomes.NFeJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NFeJavaApplication {

	public static void main(String[] args) {
		System.out.println("iniciando sistema");
		SpringApplication.run(NFeJavaApplication.class, args);
		System.out.println("sistema rodando");

	}

}
