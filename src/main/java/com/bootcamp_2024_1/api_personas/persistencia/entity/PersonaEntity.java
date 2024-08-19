package com.bootcamp_2024_1.api_personas.persistencia.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*

    la funcion de esta clase es convertir la clase a una tabla en la base de datos

    @Entity = Marca la clase PersonaEntity como una entidad JPA. Esto significa que esta clase se mapeará a una tabla en la base de datos.
     Cada instancia de esta clase representará una fila en la tabla.

    @Data = biblioteca que se usa para evitar escribir código repetitivo, como getters, setters, constructores,
     y otros métodos comunes en las clases.

    IDENTITY, le estás diciendo a JPA que deje que la base de datos se encargue de generar el valor de id automáticamente




 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Long Edad;

    //ESTO LO HACE AUTOMATICAMENTE @NoArgsConstructor

    // Constructor sin argumentos (obligatorio para JPA)
    //public PersonaEntity() {
    //}

    //ESTO LO HACE AUTOMATICAMENTE @AllArgsConstructor

    // Constructor con todos los campos (opcional para facilitar la creación de objetos)
    //public PersonaEntity(Long id, String nombre, String apellido) {
    //    this.id = id;
    //    this.nombre = nombre;
    //    this.apellido = apellido;
    //}


    // ESTO LO HACE AUT @DATA

    /*

        // Getters y Setters para todos los campos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }









     */





}
