package dw.editorsecauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dw.editorsecauth.model.Artigo;

import java.util.List;

@Repository
public interface ArtigoRepository extends JpaRepository<Artigo, Long>{

    List<Artigo> findByPublicado(boolean publicado);

    List<Artigo> findByTituloContaining(String titulo);
    
}