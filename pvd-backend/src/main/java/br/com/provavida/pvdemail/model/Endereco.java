package br.com.provavida.pvdemail.model;

import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
      @Id
    @Column(name = "idpessoa")
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idpessoa")
    private Pessoa pessoa;

    @Column(name = "email")
    private String email;

    @Column(name = "dddcel")
    private String dddCelular;

    @Column(name = "celular")
    private String celular;

    @Column(name = "dddtel1")
    private String dddTel1;

    @Column(name = "telefone1")
    private String telefone1;

    @Column(name = "dddtel2")
    private String dddTel2;

    @Column(name = "telefone2")
    private String telefone2;

    @Column(name = "enderecorua")
    private String rua;

    @Column(name = "endereconumero")
    private String numero;

    @Column(name = "enderecocomplemento")
    private String complemento;

    @Column(name = "endercobairro")
    private String bairro;

    @Column(name = "cep")
    private String cep;

    // getters e setters
}
