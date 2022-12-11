package com.example.sport_booking.DAOs;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "tbl_sport_complex")
@AllArgsConstructor
@NoArgsConstructor
public class SportComplexDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sport_complex")
    private Integer idSportComplex;

    @Column(name = "name_sport_complex")
    @NonNull
    private String nameSportComplex;

    @Column(name = "street")
    private String street;

    @Column(name = "number_address")
    private Integer numberAdreess;

    public SportComplexDAO(){}
    public SportComplexDAO(Integer idSportComplex, @NonNull String nameSportComplex, String street, Integer numberAdreess) {
        this.idSportComplex = idSportComplex;
        this.nameSportComplex = nameSportComplex;
        this.street = street;
        this.numberAdreess = numberAdreess;
    }
    public Integer getIdSportComplex() {
        return idSportComplex;
    }

    public void setIdSportComplex(Integer idSportComplex) {
        this.idSportComplex = idSportComplex;
    }

    public String getNameSportComplex() {
        return nameSportComplex;
    }

    public void setNameSportComplex(String nameSportComplex) {
        this.nameSportComplex = nameSportComplex;
    }

    public String getStreet() { return street;}

    public void setStreet(String street) { this.street = street; }

    public Integer getNumberAdreess() {
        return numberAdreess;
    }

    public void setNumberAdreess(Integer numberAdreess) {
        this.numberAdreess = numberAdreess;
    }
}
