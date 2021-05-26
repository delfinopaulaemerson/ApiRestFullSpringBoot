package com.emersondelfino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emersondelfino.entities.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
