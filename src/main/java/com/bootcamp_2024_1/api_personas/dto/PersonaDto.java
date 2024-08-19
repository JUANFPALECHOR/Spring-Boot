package com.bootcamp_2024_1.api_personas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
   Anotaciones de Lombok utilizadas:
   - @Getter: Genera automáticamente los métodos "getter" para todos los campos.
   - @Setter: Genera automáticamente los métodos "setter" para todos los campos.
   - @NoArgsConstructor: Genera automáticamente un constructor sin argumentos.
   - @AllArgsConstructor: Genera automáticamente un constructor con argumentos para todos los campos.
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDto{

    // Campos de la clase:
    private String nombre;
    private String apellido;
    private Long edad;
}

/*
   Resumen:
   La clase PersonaDto actúa como un contenedor de datos (DTO) que se utiliza para transferir
   información de una persona entre las capas de la aplicación. Gracias a Lombok,
   se evitan los métodos repetitivos al generar automáticamente los getters, setters,
   y constructores necesarios.
*/
