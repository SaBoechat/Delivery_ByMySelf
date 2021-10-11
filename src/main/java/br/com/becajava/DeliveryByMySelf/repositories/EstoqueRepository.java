package br.com.becajava.DeliveryByMySelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.becajava.DeliveryByMySelf.entities.estoque;

@Repository
// interface usado para o DAO
public interface EstoqueRepository extends JpaRepository<estoque, Long> {

        }