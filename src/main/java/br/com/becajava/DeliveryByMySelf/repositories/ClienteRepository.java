package br.com.becajava.DeliveryByMySelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.becajava.DeliveryByMySelf.entities.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Integer>{
}

