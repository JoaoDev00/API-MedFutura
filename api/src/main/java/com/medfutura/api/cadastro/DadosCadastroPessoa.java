package com.medfutura.api.cadastro;

import com.medfutura.api.model.TipoPessoa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosCadastroPessoa {

    private String apelido;  
    private String nome;
    private String email;
    private String telefone;
    private TipoPessoa tipoPessoa;

    public DadosCadastroPessoa(String apelido, String nome, String email, String telefone, TipoPessoa tipoPessoa) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipoPessoa = tipoPessoa;
    }
}
