package com.example.sport_booking.DTOs;

import lombok.Builder;
import lombok.Data;

public class SportComplexDTO {

    private Integer id;
    private String nombreComplejo;
    private String calle;
    private Integer numeroDireccion;

    public SportComplexDTO(){}

    public SportComplexDTO(Integer id, String nombreComplejo, String calle, Integer numeroDireccion) {
        this.id = id;
        this.nombreComplejo = nombreComplejo;
        this.calle = calle;
        this.numeroDireccion = numeroDireccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreComplejo() {
        return nombreComplejo;
    }

    public void setNombreComplejo(String nombreComplejo) {
        this.nombreComplejo = nombreComplejo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(Integer numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }
}
