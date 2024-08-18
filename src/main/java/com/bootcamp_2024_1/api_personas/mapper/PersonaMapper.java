package com.bootcamp_2024_1.api_personas.mapper;


import com.bootcamp_2024_1.api_personas.dto.PersonaDto;
import com.bootcamp_2024_1.api_personas.persistencia.entity.PersonaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")


//
public interface PersonaMapper {

    PersonaDto personaDtoPersonaEntity(PersonaEntity persona);

    PersonaEntity personaEntityToPersonaDto(PersonaDto persona);
}
