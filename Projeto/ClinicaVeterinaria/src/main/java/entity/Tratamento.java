package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@Entity
@Table (name = "Tratamento")
public class Tratamento {
	
	@Id
	@Column (name = "cod_tratamento")
	private int codigo;
	
	@JoinColumn (name = "n_consulta")
	@OneToMany
	private Consulta codconsul;
	
	@JoinColumn (name = "cod_rem")
	private Remedio codrem;
	
	@Column (name = "qualidade")
	private int nota;
	
	@Column (name = "descricao")
	private String desc;
	
}
