package com.mballem.curso.boot.demomvc.service;

import java.util.List;

import com.mballem.curso.boot.demomvc.domain.Departamento;

public interface DepartamentoService {

    void salvar(Departamento departamentos);

    void editar(Departamento departamentos);

    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();

}
