package br.com.fiap.spring.mvc.entity;

public enum Categoria {
    TERROR("Terror"),
    ROMANCE("Romance"),
    COMEDIA("Comedia"),
    FICCAO("Ficcao"),
    SUSPENSE("Suspense"),
    FANTASIA("Fantasia"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA("Tecnologia");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return  descricao;

    }
}
