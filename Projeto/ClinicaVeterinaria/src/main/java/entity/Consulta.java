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
@Table (name = "Consulta")
public class Consulta {

	@Id
	@Column (name = "n_consulta")
	private int cod_consu;
	
	@Column (name = "data")
	private String data;
	
	@Column (name = "horario")
	private String horario;
	
	@Column (name = "preco")
	private int preco;
	
	
}
