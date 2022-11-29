package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}