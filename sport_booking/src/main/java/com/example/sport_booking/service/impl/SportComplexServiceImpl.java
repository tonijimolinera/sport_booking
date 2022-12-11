package com.example.sport_booking.service.impl;

import com.example.sport_booking.DAOs.SportComplexDAO;
import com.example.sport_booking.DTOs.SportComplexDTO;
import com.example.sport_booking.mappers.SportComplexMapper;
import com.example.sport_booking.repositories.SportComplexRepository;
import com.example.sport_booking.service.SportComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public SportComplexDTO setSportComplexDtoMap(Map<String, String> body) {

        SportComplexDAO sportComplexDAO = sportComplexRepository.findById(Integer.parseInt(body.get("id"))).get();
        sportComplexDAO.setNameSportComplex(body.get("name"));
        sportComplexDAO.setStreet(body.get("street"));
        sportComplexDAO.setNumberAdreess(Integer.parseInt(body.get("number")));
        sportComplexRepository.save(sportComplexDAO);
        return sportComplexMapper.toSportComplexDto(sportComplexDAO);
    }

    @Override
    public List<SportComplexDTO> setSportComplexDtoByName(String name, String street) {

        List<SportComplexDAO> listSportName = sportComplexRepository.getSportComplexDAOByNameSportComplex(name);
        for (SportComplexDAO misDaos : listSportName){
            misDaos.setStreet(street);
            sportComplexRepository.save(misDaos);
        }
        return sportComplexMapper.toSportComplexDtoList(listSportName);
    }
    @Override
    public SportComplexDTO deleteSportComplexById(Integer id) {

        SportComplexDAO deletedLine = sportComplexRepository.findById(id).get();
        sportComplexRepository.delete(deletedLine);
        return sportComplexMapper.toSportComplexDto(deletedLine);
    }

    @Override
    public SportComplexDTO insertSportComplex(SportComplexDTO sportComplexDTO) {
        sportComplexRepository.save(sportComplexMapper.toSportComplexDao(sportComplexDTO));
        return sportComplexDTO;
    }
}
