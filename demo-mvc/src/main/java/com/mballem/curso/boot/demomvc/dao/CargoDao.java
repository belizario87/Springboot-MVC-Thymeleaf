package com.mballem.curso.boot.demomvc.dao;

import java.util.List;

import com.mballem.curso.boot.demomvc.domain.Cargos;

public interface CargoDao {
    void save(Cargos cargo);

    void update(Cargos cargo);

    void delete(Long id);

    Cargos findById(Long id);

    List<Cargos> findAll();
}
