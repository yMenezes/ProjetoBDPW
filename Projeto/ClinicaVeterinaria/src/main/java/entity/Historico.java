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
@Table (name = "Historico")
public class Historico {
	
	@Id
	@Column (name = "cod_his")
	private String cod;
	
	@JoinColumn (name = "n_consulta")
	@OneToMany
	private Consulta cod_cons;
	
	@Column (name = "horario_his")
	private String horario;
	
	
}
