package br.com.etechoracio.ClinicaVeterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.Animal;
import entity.Cliente;
import entity.Clinica;
import entity.Consulta;
import entity.Exame;
import entity.Funcionario;
import entity.Historico;
import entity.Remedio;
import entity.Tratamento;
import interfaces.AnimalRepository;
import interfaces.ClienteRepository;
import interfaces.ClinicaRepository;
import interfaces.ConsultaRepository;
import interfaces.ExameRepository;
import interfaces.FuncionarioRepository;
import interfaces.HistoricoRepository;
import interfaces.RemedioRepository;
import interfaces.TratamentoRepository;

@SpringBootApplication
public class ClinicaVeterinariaApplication implements CommandLineRunner {

	@Autowired
	private ClinicaRepository cr;
	@Autowired
	private ClienteRepository clr;
	@Autowired
	private AnimalRepository ar;
	@Autowired
	private ConsultaRepository cor;
	@Autowired
	private ExameRepository exr;
	@Autowired
	private FuncionarioRepository fur;
	@Autowired
	private HistoricoRepository hir;
	@Autowired
	private RemedioRepository rer;
	@Autowired
	private TratamentoRepository trr;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ClinicaVeterinariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Clinica cn = new Clinica();
		Cliente cli = new Cliente();
		Animal anm = new Animal();
		Consulta con = new Consulta();
		Exame exa = new Exame();
		Funcionario fun = new Funcionario();
		Historico his = new Historico();
		Remedio rem = new Remedio();
		Tratamento tra = new Tratamento();
		
		cr.save(cn);
		clr.save(cli);
		ar.save(anm);
		cor.save(con);
		exr.save(exa);
		fur.save(fun);
		hir.save(his);
		rer.save(rem);
		trr.save(tra);
		
	}

}
