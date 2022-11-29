package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Exame;

public interface ExameRepository extends JpaRepository<Exame, Long>{

}