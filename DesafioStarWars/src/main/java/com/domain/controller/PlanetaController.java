package com.domain.controller;

import com.domain.model.PlanetaModel;
import com.domain.repositories.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class PlanetaController {

    @Autowired
    Repositories rp;

    //Adicionar um planeta (com nome, clima e terreno)
    @PostMapping(value = "/gravar")
    public void gravar(PlanetaModel planeta){
        rp.save(planeta);
    }

    //Listar planetas do banco de dados
    @GetMapping(value="buscar/{id}")
    public List<PlanetaModel> getById(@PathVariable long id) {
        return rp.findAll();
    }

    //Listar planetas da API do Star Wars
    @GetMapping(value="/listar")
    public String  getByItensPlanetaModel() {
        List<Object> obj = new ArrayList<>();
        if (obj instanceof PlanetaModel) {
            return obj.toString();
        }
        return null;
    }

    //Buscar por nome no banco de dados
    @GetMapping(value="buscar/{nome}")
    public List<PlanetaModel> getByNome(@PathVariable String nome) {
        return rp.FindByNome(nome);
    }


    //Buscar por ID no banco de dados
    @GetMapping(value="buscar/{id}")
    public Optional<PlanetaModel> getByIdBanco(@PathVariable Long id) {
        return rp.findById(id);
    }

    //Remover planeta
@DeleteMapping(value = "/apagar")
    public void getApagarPlaneta(@PathVariable Long id){
       rp.deleteById(id);
    }


}
