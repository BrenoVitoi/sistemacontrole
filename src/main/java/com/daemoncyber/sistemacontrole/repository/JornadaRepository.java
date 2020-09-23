package com.daemoncyber.sistemacontrole.repository;

import com.daemoncyber.sistemacontrole.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}

