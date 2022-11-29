package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}