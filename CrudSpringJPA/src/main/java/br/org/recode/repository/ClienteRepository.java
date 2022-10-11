package br.org.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.recode.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
