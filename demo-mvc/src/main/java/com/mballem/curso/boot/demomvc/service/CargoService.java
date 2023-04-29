package com.mballem.curso.boot.demomvc.service;

import java.util.List;

import com.mballem.curso.boot.demomvc.domain.Cargos;

public interface CargoService {
    void salvar(Cargos cargo);

    void editar(Cargos cargo);

    void excluir(Long id);

    Cargos buscarPorId(Long id);

    List<Cargos> buscarTodos();
}
