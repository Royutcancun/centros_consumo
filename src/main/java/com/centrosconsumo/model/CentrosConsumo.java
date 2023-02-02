package com.centrosconsumo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name="centros_consumo")
public class CentrosConsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Field required")
    private String nombre;
    private String concepto_es;
    private String concepto_en;
    private String logo;
    private String img_portada;
    private String categoria_id;


    public CentrosConsumo(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConcepto_es() {
        return concepto_es;
    }

    public void setConcepto_es(String concepto_es) {
        this.concepto_es = concepto_es;
    }

    public String getConcepto_en() {
        return concepto_en;
    }

    public void setConcepto_en(String concepto_en) {
        this.concepto_en = concepto_en;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getImg_portada() {
        return img_portada;
    }

    public void setImg_portada(String img_portada) {
        this.img_portada = img_portada;
    }

    public String getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }

}
