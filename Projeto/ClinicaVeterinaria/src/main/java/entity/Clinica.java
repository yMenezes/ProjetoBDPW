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
@Table (name = "Clinica")
public class Clinica {
	
	@Id
	@Column (name = "cod_laboratorio")
	private int cod_cli;
	
	@Column (name = "nome_lab")
	private String nome_cli;
	
	@Column (name = "equipamentos")
	private String equip;
	
	
}
