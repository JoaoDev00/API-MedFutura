package com.medfutura.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medfutura.api.model.PessoaModel;
import com.medfutura.api.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Criar uma pessoa
    public PessoaModel criarPessoa(PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Consultar pessoa por ID
    public PessoaModel consultarPessoa(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }

    // Buscar todas as pessoas
    public List<PessoaModel> listarPessoas() {
        return pessoaRepository.findAll();
    }

    // Atualizar uma pessoa
    public PessoaModel atualizarPessoa(Long id, PessoaModel pessoa) {
        if (!pessoaRepository.existsById(id)) {
            throw new RuntimeException("Pessoa não encontrada");
        }
        pessoa.setId(id);
        return pessoaRepository.save(pessoa);
    }

    // Excluir uma pessoa
    public void excluirPessoa(Long id) {
        if (!pessoaRepository.existsById(id)) {
            throw new RuntimeException("Pessoa não encontrada");
        }
        pessoaRepository.deleteById(id);
    }
}
