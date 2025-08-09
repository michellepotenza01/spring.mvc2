package br.com.fiap.spring.mvc.repository;


import br.com.fiap.spring.mvc.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
