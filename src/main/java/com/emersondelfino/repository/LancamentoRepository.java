package com.emersondelfino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emersondelfino.entities.Lancamento;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
