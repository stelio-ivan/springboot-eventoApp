package com.eventoapp.repository;

import com.eventoapp.model.Convidado;
import com.eventoapp.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidaddoRepository extends CrudRepository<Convidado, String> {

    Iterable <Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);

}
