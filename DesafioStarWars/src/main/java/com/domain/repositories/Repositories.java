package com.domain.repositories;

import com.domain.model.PlanetaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repositories extends JpaRepository<PlanetaModel, Long> {

    List<PlanetaModel>FindByNome(String nome);


}
