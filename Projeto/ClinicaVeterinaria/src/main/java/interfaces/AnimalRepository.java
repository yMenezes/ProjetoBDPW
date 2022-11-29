package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long>{

}