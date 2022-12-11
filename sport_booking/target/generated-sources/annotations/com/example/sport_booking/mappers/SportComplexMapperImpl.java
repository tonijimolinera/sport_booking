package com.example.sport_booking.mappers;

import com.example.sport_booking.DAOs.SportComplexDAO;
import com.example.sport_booking.DTOs.SportComplexDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-10T14:01:07+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class SportComplexMapperImpl implements SportComplexMapper {

    @Override
    public SportComplexDTO toSportComplexDto(SportComplexDAO sportComplexDAO) {
        if ( sportComplexDAO == null ) {
            return null;
        }

        SportComplexDTO sportComplexDTO = new SportComplexDTO();

        sportComplexDTO.setNumeroDireccion( sportComplexDAO.getNumberAdreess() );
        sportComplexDTO.setId( sportComplexDAO.getIdSportComplex() );
        sportComplexDTO.setNombreComplejo( sportComplexDAO.getNameSportComplex() );
        sportComplexDTO.setCalle( sportComplexDAO.getStreet() );

        return sportComplexDTO;
    }

    @Override
    public List<SportComplexDTO> toSportComplexDtoList(List<SportComplexDAO> sportComplexDAOList) {
        if ( sportComplexDAOList == null ) {
            return null;
        }

        List<SportComplexDTO> list = new ArrayList<SportComplexDTO>( sportComplexDAOList.size() );
        for ( SportComplexDAO sportComplexDAO : sportComplexDAOList ) {
            list.add( toSportComplexDto( sportComplexDAO ) );
        }

        return list;
    }

    @Override
    public SportComplexDAO toSportComplexDao(SportComplexDTO sportComplexDTO) {
        if ( sportComplexDTO == null ) {
            return null;
        }

        SportComplexDAO sportComplexDAO = new SportComplexDAO();

        sportComplexDAO.setIdSportComplex( sportComplexDTO.getId() );
        sportComplexDAO.setNameSportComplex( sportComplexDTO.getNombreComplejo() );
        sportComplexDAO.setStreet( sportComplexDTO.getCalle() );
        sportComplexDAO.setNumberAdreess( sportComplexDTO.getNumeroDireccion() );

        return sportComplexDAO;
    }
}
