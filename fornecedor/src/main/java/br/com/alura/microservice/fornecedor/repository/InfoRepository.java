package br.com.alura.microservice.fornecedor.repository;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sound.sampled.Line;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);
}
