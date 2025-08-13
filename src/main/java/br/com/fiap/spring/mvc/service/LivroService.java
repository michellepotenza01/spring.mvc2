package br.com.fiap.spring.mvc.service;

import br.com.fiap.spring.mvc.entity.Livro;
import br.com.fiap.spring.mvc.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository, LivroRepository livroRepository1) {
        this.livroRepository = livroRepository;
    }

    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }
    public Livro readLivro(Livro livro) {
        return livroRepository.findById(id).orElse(null);
    }
    public List<Livro> readLivros() {
        return livroRepository.findAll();
    }
    public Livro updateLivro(Livro livro) {
        return livroRepository.save(livro);
    }
    public void deleteLivro(Long id){
        livroRepository.deleteById(id);
    }
}
