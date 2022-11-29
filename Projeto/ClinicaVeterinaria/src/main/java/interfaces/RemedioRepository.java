package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Remedio;

public interface RemedioRepository extends JpaRepository<Remedio, Long>{

}