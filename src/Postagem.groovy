class Postagem {

    private static int contadorPostagens = 0

    private int id
    private String conteudo

    Postagem(String conteudo) {
        this.id = ++contadorPostagens
        this.conteudo = conteudo
    }

    int getId() {
        return id
    }

    String getConteudo() {
        return conteudo
    }

    @Override
    String toString() {
        return "ID: $id, Conteúdo: $conteudo"
    }
}
