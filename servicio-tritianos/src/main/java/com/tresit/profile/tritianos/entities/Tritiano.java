package com.tresit.profile.tritianos.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tritianos")
public class Tritiano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private String correoElectronico;

    private String telefono;

    private String estado;

    private String enlaceBizneo;

    private String enlaceHubspot;

    private String enlaceJira;

    @Column(name = "created_at")
    private LocalDate createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnlaceBizneo() {
        return enlaceBizneo;
    }

    public void setEnlaceBizneo(String enlaceBizneo) {
        this.enlaceBizneo = enlaceBizneo;
    }

    public String getEnlaceHubspot() {
        return enlaceHubspot;
    }

    public void setEnlaceHubspot(String enlaceHubspot) {
        this.enlaceHubspot = enlaceHubspot;
    }

    public String getEnlaceJira() {
        return enlaceJira;
    }

    public void setEnlaceJira(String enlaceJira) {
        this.enlaceJira = enlaceJira;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

}
