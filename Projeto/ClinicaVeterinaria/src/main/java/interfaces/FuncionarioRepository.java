package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}