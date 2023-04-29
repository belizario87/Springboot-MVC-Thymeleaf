package com.mballem.curso.boot.demomvc.dao;

import java.util.List;

import com.mballem.curso.boot.demomvc.domain.Funcionarios;

public interface FuncionarioDao {
    void save(Funcionarios funcionario);

    void update(Funcionarios funcionario);

    void delete(Long id);

    Funcionarios findById(Long id);

    List<Funcionarios> findAll();
}
