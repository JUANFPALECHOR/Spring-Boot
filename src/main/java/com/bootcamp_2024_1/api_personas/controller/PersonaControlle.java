package com.bootcamp_2024_1.api_personas.controller;

import com.bootcamp_2024_1.api_personas.dto.PersonaDto;
import com.bootcamp_2024_1.api_personas.persistencia.PersonaRepositorylmpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/*
   Configuración del Controlador REST:
   - @RestController: Marca la clase como un controlador REST, que manejará solicitudes HTTP.
   - @RequestMapping("/personas"): Define la URL base para todas las rutas dentro de esta clase.

    Se encarga únicamente de recibir las peticiones HTTP y de devolver respuestas

*/

@RestController
@RequestMapping("/personas")
@RequiredArgsConstructor // genera el constructor automaticamente para inyectar la clase PersonaRepositorylmpl a PersonaControlle
public class PersonaControlle {

    /*
       Manejo de solicitudes GET:
       - @GetMapping: Indica que el método manejará solicitudes HTTP GET.
       - Método obtenerPersona(): Retorna un objeto PersonaDto con datos de ejemplo.
    */

    private final PersonaRepositorylmpl personaRepository;



    @GetMapping()
    private List<PersonaDto> obtenerPersonas() {

        return personaRepository.obtenerPersonas();
    }

    @PostMapping
    private PersonaDto crearPersona(@RequestBody PersonaDto persona) {
        this.personaRepository.crearPersona(persona);
        return persona;
    }
}

/*
   Resumen:
   La clase PersonaController está diseñada para manejar solicitudes relacionadas
   con "personas". Cuando un cliente realiza una solicitud GET a "/personas",
   se devuelve una instancia de PersonaDto con datos predefinidos. Esta estructura
   permite una fácil extensión para manejar más operaciones como POST, PUT y DELETE.


   @PathVariable: Utiliza el valor directamente en la ruta, como parte de la identificación
    del recurso. Ejemplo: /personas/pablo.
    @RequestParam: Se usa para capturar parámetros adicionales de la URL que no forman parte de la ruta,
     sino que se envían como parámetros de consulta (query parameters). Ejemplo: /personas?pablo&apellido=escobar.
*/
