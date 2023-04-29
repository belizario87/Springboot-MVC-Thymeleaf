package com.mballem.curso.boot.demomvc.dao;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.demomvc.domain.Funcionarios;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionarios, Long> implements FuncionarioDao {

}
