package controller;


import jakarta.servlet.ServletRequest;
import model.persona;
import org.hibernate.engine.spi.Resolution;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.PersonaRepository;
import service.PersonaService;

import java.net.URI;
import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin(origins = "*")
public class personaController {
    private final PersonaService personaService;

    personaController(PersonaService personaService) {
        this.personaService = personaService;
    }


    //Get consultarPersona
    @GetMapping
    public List<persona> consultarPersona() {
        return personaService.consultarPersona();
    }

    //Get por Id
    @GetMapping("/{id}")
    public ResponseEntity<persona> consultarPersonaPorId(@PathVariable Integer id) {
        return personaService.consultarPersonaPorId(id).map(ResponseEntity::ok).
                orElseGet(()->ResponseEntity.notFound().build());
    }


    //Post
    @PostMapping
    public ResponseEntity<persona> crearPersona(@RequestBody persona datosPersona) {
        persona nuevaPersona = personaService.crearPersona(datosPersona);


        return ResponseEntity.created(URI.create(
                "/api/personas"+nuevaPersona.getIdpersona()
        )).body(nuevaPersona);
    }

    @PutMapping("/{id}")
    public ResponseEntity<persona>  actualizarPersona(@PathVariable Integer id, @RequestBody persona datosPersona) {

        return personaService.actualizarPersona(id, datosPersona).map(
                ResponseEntity::ok
        ).orElseGet(()->ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable Integer id, ServletRequest servletRequest) {

        if (personaService.eliminarPersona(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();

    }


}
