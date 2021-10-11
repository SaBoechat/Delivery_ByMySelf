package br.com.becajava.DeliveryByMySelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.becajava.DeliveryByMySelf.entities.produtos;

@Repository
// interface usado para o DAO
public interface ProdutosRepository extends JpaRepository<produtos, Long> {

        }