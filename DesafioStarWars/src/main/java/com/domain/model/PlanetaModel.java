package com.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="planetas")
public class PlanetaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Integer rotation_period;
    @NotNull
    private Integer orbital_period;
    @NotNull
    private Integer diameter;
    @NotNull
    private String climate;
    @NotNull
    private String gravity;

    @NotNull
    private String terrain;

    @NotNull
    private Integer surface_water;

    @NotNull
    private Double population;
    @NotNull
    private String residents;
    @NotNull
    private String films;

    public PlanetaModel(String name, Integer rotation_period, Integer orbital_period, Integer diameter, String climate, String gravity, String terrain, Integer surface_water, Double population, String residents, String films) {
        this.name = name;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surface_water = surface_water;
        this.population = population;
        this.residents = residents;
        this.films = films;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(Integer rotation_period) {
        this.rotation_period = rotation_period;
    }

    public Integer getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(Integer orbital_period) {
        this.orbital_period = orbital_period;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Integer getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(Integer surface_water) {
        this.surface_water = surface_water;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public String getResidents() {
        return residents;
    }

    public void setResidents(String residents) {
        this.residents = residents;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanetaModel)) return false;
        PlanetaModel that = (PlanetaModel) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
