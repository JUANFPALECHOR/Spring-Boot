package com.bootcamp_2024_1.api_personas.mapper;


import com.bootcamp_2024_1.api_personas.dto.PersonaDto;
import com.bootcamp_2024_1.api_personas.persistencia.entity.PersonaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")


//
public interface PersonaMapper {

    // Este método convierte de DTO a Entidad
    PersonaEntity personaDtoToPersonaEntity(PersonaDto persona);

    // Este método convierte de Entidad a DTO
    PersonaDto personaEntityToPersonaDto(PersonaEntity persona);
}
