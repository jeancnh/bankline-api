package com.dio.santander.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklineapi.model.Movimentação;

public interface MovimentacaoRepository extends JpaRepository<Movimentação, Integer> {

}
