package br.com.provavida.pvdemail.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {
     @Id
    @Column(name = "idpessoa")
    private Long id;

    @Column(name = "cpfpessoa")
    private String cpf;

    @Column(name = "nomecpessoa")
    private String nome;

    @Column(name = "nip")
    private String nip;

    @Column(name = "dtnascimento")
    private LocalDate dataNascimento;

    @Column(name = "dtproxrecadastramento")
    private LocalDate proximoRecadastramento;

    // getters e setters
}
