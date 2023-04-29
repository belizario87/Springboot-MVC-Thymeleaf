package com.mballem.curso.boot.demomvc.dao;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.demomvc.domain.Cargos;

@Repository
public class CagoDaoImpl extends AbstractDao<Cargos, Long> implements CargoDao {

}
