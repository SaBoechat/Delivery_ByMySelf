package br.com.becajava.DeliveryByMySelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.becajava.DeliveryByMySelf.entities.login;

@Repository
// interface usado para o DAO
public interface LoginRepository extends JpaRepository<login, Long> {

        }