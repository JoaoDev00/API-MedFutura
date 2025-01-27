package com.medfutura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medfutura.api.model.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}

