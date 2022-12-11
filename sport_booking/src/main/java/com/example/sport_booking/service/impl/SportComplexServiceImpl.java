package com.example.sport_booking.service.impl;

import com.example.sport_booking.DAOs.SportComplexDAO;
import com.example.sport_booking.DTOs.SportComplexDTO;
import com.example.sport_booking.mappers.SportComplexMapper;
import com.example.sport_booking.repositories.SportComplexRepository;
import com.example.sport_booking.service.SportComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportComplexServiceImpl implements SportComplexService {

    @Autowired
    private SportComplexRepository sportComplexRepository;
    @Autowired
    private SportComplexMapper sportComplexMapper;
    @Override
    public List<SportComplexDTO> getSportComplexDto() {
        return sportComplexMapper.toSportComplexDtoList(sportComplexRepository.findAll());
    }

    @Override
    public SportComplexDTO getSportComplexDtoById(Integer id) {
        return sportComplexMapper.toSportComplexDto(sportComplexRepository.getSportComplexDAOByIdSportComplex(id));
    }

    @Override
    public List<SportComplexDTO> getSportComplexDtosByName(String name) {
        return sportComplexMapper.toSportComplexDtoList(sportComplexRepository.getSportComplexDAOByNameSportComplex(name));
    }

    @Override
    public List<SportComplexDTO> getSportComplexDtosByStreet(String street) {
        return sportComplexMapper.toSportComplexDtoList(sportComplexRepository.getSportComplexDAOByStreet(street));
    }

    @Override
    public SportComplexDTO setSportComplexDto(SportComplexDTO sportComplexDTO) {

        SportComplexDAO sportComplexDAO = sportComplexMapper.toSportComplexDao(sportComplexDTO);
        sportComplexRepository.save(sportComplexDAO);
        return sportComplexDTO;
    }
}
