package com.mballem.curso.boot.demomvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.demomvc.dao.CargoDao;
import com.mballem.curso.boot.demomvc.domain.Cargos;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoDao dao;

    @Override
    public void salvar(Cargos cargo) {
        dao.save(cargo);
    }

    @Override
    public void editar(Cargos cargo) {
        dao.update(cargo);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Cargos buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Cargos> buscarTodos() {
        return dao.findAll();
    }

}
