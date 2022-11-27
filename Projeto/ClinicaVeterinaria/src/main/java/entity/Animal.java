package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "Animal")
public class Animal {

	
	@Id
	@Column (name = "RGA")
	private int RGA;
	
	@JoinColumn (name = "cpf")
	@ManyToOne
	private Cliente cpf;
	
	@Column (name = "tipo")
	private String tipoAnim;
	
	@Column (name = "peso")
	private String peso;
	
	@Column (name = "idade")
	private String idade;
	
}
