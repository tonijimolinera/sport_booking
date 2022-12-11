package com.example.sport_booking.controllers;

import com.example.sport_booking.DAOs.SportComplexDAO;
import com.example.sport_booking.DTOs.SportComplexDTO;
import com.example.sport_booking.service.SportComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.example.sport_booking.DTOs.SportComplexDTO.*;

@RestController
@RequestMapping("/sportComplex")
public class SportComplexController {

    @Autowired
    private SportComplexService sportComplexService;
    @GetMapping(path = "/listAll")
    public List<SportComplexDTO> getAllSportComplex(){
        return sportComplexService.getSportComplexDto();
    }
    @GetMapping(path = "/getById")
    public SportComplexDTO getSportComplexDTOById(@RequestParam ("id") Integer id){
        return sportComplexService.getSportComplexDtoById(id);
    }

    @GetMapping(path = "/getByNameComplex")
    public List<SportComplexDTO> getSportComplexDTOsByName(@RequestParam ("name") String name){
        return sportComplexService.getSportComplexDtosByName(name);
    }

    @GetMapping(path = "/getByStreet")
    public List<SportComplexDTO> getSportComplexDTOsByStreet(@RequestParam ("street") String street){
        return sportComplexService.getSportComplexDtosByStreet(street);
    }

    @PutMapping(path = "/setSportComplex")
    public SportComplexDTO setSportComplexDTO(@RequestBody SportComplexDTO sportComplexDTO){
        // test initial v2 git
        return sportComplexService.setSportComplexDto(sportComplexDTO);
    }

}
