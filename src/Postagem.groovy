public class Postagem {

    private static int contadorPostagens = 0;

    private int id;
    private String conteudo;

    public Postagem(String conteudo) {
        this.id = ++contadorPostagens;
        this.conteudo = conteudo;
    }

    public int getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Conteúdo: " + conteudo;
    }
}