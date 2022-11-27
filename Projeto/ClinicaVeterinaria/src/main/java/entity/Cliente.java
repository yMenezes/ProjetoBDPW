package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "Cliente")
public class Cliente {

	@Id
	@Column (name = "cpf_cli")
	private String cpf;
	
	@Column (name = "nome_cli")
	private String nome_cli;
	
	@Column (name = "endereco_cli")
	private String endereco_cli;
	
	@Column (name = "contato_cli")
	private int numero;
	
	
}
