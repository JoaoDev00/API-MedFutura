package com.medfutura.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.medfutura.api.cadastro.DadosCadastroPessoa;
import com.medfutura.api.model.PessoaModel;
import com.medfutura.api.service.PessoaService;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public PessoaModel cadastrar(@RequestBody DadosCadastroPessoa dados) {
        // Verificando se os dados estão chegando corretamente e criando o modelo Pessoa
        PessoaModel pessoa = new PessoaModel(dados);
        
        // Salvando a pessoa no banco de dados e retornando a resposta
        return pessoaService.criarPessoa(pessoa);
    }

    @GetMapping
    public List<PessoaModel> listar() {
        return pessoaService.listarPessoas();
    }

    @GetMapping("/{id}")
    public PessoaModel buscarPorId(@PathVariable Long id) {
        return pessoaService.consultarPessoa(id);
    }

    @PutMapping("/{id}")
    public PessoaModel atualizar(@PathVariable Long id, @RequestBody DadosCadastroPessoa dados) {
        return pessoaService.atualizarPessoa(id, new PessoaModel(dados));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pessoaService.excluirPessoa(id);
    }
}
