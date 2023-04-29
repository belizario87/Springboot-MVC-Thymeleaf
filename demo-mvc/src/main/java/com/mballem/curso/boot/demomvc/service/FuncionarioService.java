package com.mballem.curso.boot.demomvc.service;

import java.util.List;

import com.mballem.curso.boot.demomvc.domain.Funcionarios;

public interface FuncionarioService {
    public void salvar(Funcionarios funcionario);

    public void editar(Funcionarios funcionario);

    public void excluir(Long id);

    public Funcionarios buscarPorId(Long id);

    public List<Funcionarios> buscarTodos();

}
