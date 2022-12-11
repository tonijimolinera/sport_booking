package com.example.sport_booking.service;

import com.example.sport_booking.DAOs.SportComplexDAO;
import com.example.sport_booking.DTOs.SportComplexDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface SportComplexService {

    public List<SportComplexDTO> getSportComplexDto();
    public SportComplexDTO getSportComplexDtoById(Integer id);
    public List<SportComplexDTO> getSportComplexDtosByName(String name);
    public List<SportComplexDTO> getSportComplexDtosByStreet(String street);
    public SportComplexDTO setSportComplexDto(SportComplexDTO sportComplexDTO);
    public SportComplexDTO setSportComplexDtoMap(Map<String, String> body);
    public List<SportComplexDTO> setSportComplexDtoByName(String name, String street);
    public SportComplexDTO deleteSportComplexById(Integer id);
    public SportComplexDTO insertSportComplex(SportComplexDTO sportComplexDTO);
}
