package repository;


import model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository
    extends JpaRepository<persona, Integer>{
    //Esto nos crea el buscar, el save, el delete y el updaate crud
}
