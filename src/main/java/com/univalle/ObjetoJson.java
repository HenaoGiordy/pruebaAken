package com.univalle;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ObjetoJson {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    @JsonAlias("tipo") // <- acepta tanto "tipo" como "type"
    private String tipo;

    @JsonProperty("text")
    @JsonAlias("texto")
    private String texto;

    @JsonProperty("actor")
    private String actor;

    @JsonProperty("isExpanded")
    private Boolean isExpanded;

    @JsonProperty("team")
    @JsonAlias("equipo")
    private String equipo;

    @JsonProperty("tool")
    @JsonAlias("herramienta")
    private String herramienta;

    @JsonProperty("interactions")
    @JsonAlias("interacciones")
    private List<ObjetoJson> interacciones;

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTexto() {
        return texto;
    }

    public String getActor() {
        return actor;
    }

    public Boolean getIsExpanded() {
        return isExpanded;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public List<ObjetoJson> getInteracciones() {
        return interacciones;
    }

    public void setInteracciones(List<ObjetoJson> interacciones) {
        this.interacciones = interacciones;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setIsExpanded(Boolean expanded) {
        isExpanded = expanded;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ObjetoJson() {}

    public ObjetoJson(String id, List<ObjetoJson> interacciones, String herramienta, String equipo, Boolean isExpanded, String actor, String texto, String tipo) {
        this.id = id;
        this.interacciones = interacciones;
        this.herramienta = herramienta;
        this.equipo = equipo;
        this.isExpanded = isExpanded;
        this.actor = actor;
        this.texto = texto;
        this.tipo = tipo;
    }
}
