package com.bootcamp_2024_1.api_personas.persistencia;


import com.bootcamp_2024_1.api_personas.dto.PersonaDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository

/*

    Es el responsable de manejar el almacenamiento de datos, es decir, cómo se acceden, almacenan o modifican los datos.

 */

public class PersonaRepositorylmpl {

    private ArrayList<PersonaDto> Basededatos;

    public PersonaRepositorylmpl() {
        this.Basededatos = new ArrayList<>();
        this.Basededatos.add(
                new PersonaDto("andres","juan")
        );
    }
    // Método para obtener todas las personas almacenadas
    public List<PersonaDto> obtenerPersonas() {

        return this.Basededatos;
    }
    // Método para agregar una nueva persona
    public PersonaDto crearPersona(PersonaDto persona) {
        this.Basededatos.add(persona);
        return persona;
    }





}
