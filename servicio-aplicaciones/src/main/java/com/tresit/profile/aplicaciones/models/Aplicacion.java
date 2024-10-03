package com.tresit.profile.aplicaciones.models;

public class Aplicacion {

    private Long id;
    private Tritiano tritiano;
    private String detalle;
    private String nivel;

    public Aplicacion(Long id, Tritiano tritiano, String detalle, String nivel) {
        this.id = id;
        this.tritiano = tritiano;
        this.detalle = detalle;
        this.nivel = nivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tritiano getTritiano() {
        return tritiano;
    }

    public void setTritiano(Tritiano tritiano) {
        this.tritiano = tritiano;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
}
