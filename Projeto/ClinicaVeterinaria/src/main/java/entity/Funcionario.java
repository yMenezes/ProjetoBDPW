package entity;

import enums.EspecializacaoFuncionario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@Entity
@Table (name = "Funcionario")
public class Funcionario {

	@Id
	@Column (name = "matricula")
	private int matricula;
	
	@JoinColumn (name = "cod_laboratorio")
	@ManyToOne
	private Clinica cod;
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "cpf")
	private String cpf;
	
	@Column (name = "contato")
	private int contato;
	
	@Column (name = "endereco")
	private String endereco;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "esp_fun")
	private EspecializacaoFuncionario esp;
	
	
}
