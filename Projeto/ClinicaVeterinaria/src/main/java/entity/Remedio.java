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
@Table (name = "Remedio")
public class Remedio {
	
	@Id
	@Column (name = "cod_rem")
	private int codigo;
	
	@Column (name = "nome_rem")
	private String nome;
	
	@Column (name = "preco_rem")
	private int preco;
	
	
}
