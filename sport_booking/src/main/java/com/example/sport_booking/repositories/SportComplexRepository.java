package com.example.sport_booking.repositories;

import com.example.sport_booking.DAOs.SportComplexDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportComplexRepository extends JpaRepository<SportComplexDAO, Integer> {
    public SportComplexDAO getSportComplexDAOByIdSportComplex(Integer id);
    public List<SportComplexDAO> getSportComplexDAOByNameSportComplex(String name);
    public List<SportComplexDAO> getSportComplexDAOByStreet(String street);
}
