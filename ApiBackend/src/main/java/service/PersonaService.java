
package service;

import model.persona;
import repository.PersonaRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    // GET: Consultar todas las personas
    public List<persona> consultarPersona() {
        return personaRepository.findAll();
    }

    // GET: Consultar persona por ID
    public Optional<persona> consultarPersonaPorId(Integer idpersona) {
        return personaRepository.findById(idpersona);
    }

    // POST: Crear persona
    public persona crearPersona(persona datosPersona) {

        datosPersona.setIdpersona(null);

        return personaRepository.save(datosPersona);
    }

    // DELETE: Eliminar persona
    public boolean eliminarPersona(Integer idpersona) {

        if (!personaRepository.existsById(idpersona)) {
            return false;
        }

        personaRepository.deleteById(idpersona);

        return true;
    }

    // PUT: Actualizar persona
    public Optional<persona> actualizarPersona(
            Integer idpersona,
            persona datosPersona) {

        return personaRepository.findById(idpersona)
                .map(personaActual -> {

                    personaActual.setNombre(
                            datosPersona.getNombre()
                    );

                    personaActual.setApellido(
                            datosPersona.getApellido()
                    );

                    personaActual.setEmail(
                            datosPersona.getEmail()
                    );

                    return personaRepository.save(personaActual);
                });
    }
}
