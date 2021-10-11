package br.com.becajava.DeliveryByMySelf.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idestoque;
    private String item;
    private float preco;
    private int quantidade;
}