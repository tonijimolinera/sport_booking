package com.example.sport_booking.mappers;

import com.example.sport_booking.DAOs.SportComplexDAO;
import com.example.sport_booking.DTOs.SportComplexDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SportComplexMapper {


    @Mappings({
            @Mapping(source = "idSportComplex", target = "id"),
            @Mapping(source = "nameSportComplex", target = "nombreComplejo"),
            @Mapping(source = "street", target = "calle"),
            @Mapping(source = "numberAdreess", target = "numeroDireccion")
    })
    SportComplexDTO toSportComplexDto(SportComplexDAO sportComplexDAO);

    List<SportComplexDTO> toSportComplexDtoList(List<SportComplexDAO> sportComplexDAOList);
    @Mappings({
            @Mapping(source = "id", target = "idSportComplex"),
            @Mapping(source = "nombreComplejo", target = "nameSportComplex"),
            @Mapping(source = "calle", target = "street"),
            @Mapping(source = "numeroDireccion", target = "numberAdreess")
    })
    SportComplexDAO toSportComplexDao(SportComplexDTO sportComplexDTO);
}
