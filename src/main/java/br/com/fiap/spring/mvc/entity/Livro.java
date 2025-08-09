package br.com.fiap.spring.mvc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O título é obrigatório")
    private String título;
    @NotBlank(message = "O autor é obrigatório")
    private String autor;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "A categoria é obrigatória")
    private Categoria categooria;
    private String editora;
    @DecimalMin(value = "0.99", message = "O preço deve ser no mínimo 0.99")
    private BigDecimal preco;
    @Pattern(regexp = "^970\\d{7}$|^970\\d{10}$",
            message = "isbn fora do padrão")
    private String isbn;
    private LocalDate dataPublicacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Categoria getCategooria() {
        return categooria;
    }

    public void setCategooria(Categoria categooria) {
        this.categooria = categooria;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
