package com.bootcamp_2024_1.api_personas.persistencia.repository;


import com.bootcamp_2024_1.api_personas.persistencia.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//indica que esta clase se encargará de las operaciones con la base de datos.



public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}



/*

    Al extender JpaRepository, obtienes acceso a un conjunto de métodos predefinidos para trabajar con tu entidad PersonaEntity.
     Estos métodos se implementan automáticamente y no necesitas escribir el código para ellos. Algunos de los métodos más útiles incluyen:

    save(T entity): Guarda (inserta o actualiza) una entidad en la base de datos.
    findById(ID id): Busca una entidad por su clave primaria (id).
    findAll(): Devuelve una lista de todas las entidades en la tabla correspondiente.
    deleteById(ID id): Elimina una entidad por su clave primaria.
    existsById(ID id): Verifica si existe una entidad con el id dado.
    count(): Devuelve el número de entidades en la tabla.


 */