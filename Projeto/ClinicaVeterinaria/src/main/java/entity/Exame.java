package entity;

import enums.TiposDeExame;
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
@Table (name = "Exame")
public class Exame {
	
	@Id
	@Column (name = "cod_exa")
	private int codigo;
	
	@JoinColumn (name = "n_consulta")
	@ManyToOne
	private Consulta codconsu;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "tipo")
	private TiposDeExame tipoexa;
	
	
}
