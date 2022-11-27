package br.com.etechoracio.ClinicaVeterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.Clinica;
import entity.ClinicaRepository;

@SpringBootApplication
public class ClinicaVeterinariaApplication implements CommandLineRunner {

	@Autowired
	private ClinicaRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ClinicaVeterinariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Clinica cli = new Clinica();
		repo.save(cli);
		
	}

}
