package com.medfutura.api.model;

import com.medfutura.api.cadastro.DadosCadastroPessoa;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "pessoas")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa; // Enum que pode categorizar, como "FÍSICA" ou "JURÍDICA"

    public PessoaModel(DadosCadastroPessoa dados) {
        this.nome = dados.getNome();
        this.email = dados.getEmail();
        this.telefone = dados.getTelefone();
        this.tipoPessoa = dados.getTipoPessoa();
    }
}
