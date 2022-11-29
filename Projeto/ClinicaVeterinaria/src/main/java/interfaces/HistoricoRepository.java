package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Long>{

}