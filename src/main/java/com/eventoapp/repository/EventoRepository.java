package com.eventoapp.repository;

import com.eventoapp.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EventoRepository extends CrudRepository<Evento, String> {

    Evento findByCodigo(long codigo);


}
