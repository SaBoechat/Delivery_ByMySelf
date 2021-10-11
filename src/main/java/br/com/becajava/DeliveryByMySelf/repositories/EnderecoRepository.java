package br.com.becajava.DeliveryByMySelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.becajava.DeliveryByMySelf.entities.Enderecos;

public interface EnderecoRepository extends JpaRepository<Enderecos, Integer>{
}
