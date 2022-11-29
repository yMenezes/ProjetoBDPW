package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Tratamento;

public interface TratamentoRepository extends JpaRepository<Tratamento, Long>{

}