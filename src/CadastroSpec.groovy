import spock.lang.Specification

class CadastroSpec extends Specification {

    def "Teste criar Pessoa PF"() {
        given:
        def cadastro = new Cadastro()

        when:
        cadastro.criarPessoaPf()

        then:
        assert cadastro.listaPf.size() == 1
    }

    def "Teste criar Pessoa PJ"() {
        given:
        def cadastro = new Cadastro()

        when:
        cadastro.criarPessoaPj()

        then:
        assert cadastro.listaPj.size() == 1
    }

    def "Teste criar Postagem"() {
        given:
        def cadastro = new Cadastro()

        when:
        cadastro.criarPostagem()

        then:
        assert cadastro.listaPostagens.size() == 1
    }

    def "Teste listar Postagens"() {
        given:
        def cadastro = new Cadastro()
        cadastro.criarPostagem()

        when:
        cadastro.listarPostagens()

        then:

        assert true
    }

    def "Teste curtir Postagem"() {
        given:
        def cadastro = new Cadastro()
        cadastro.criarPostagem()

        when:
        cadastro.curtirPostagem()

        then:
        assert true
    }
}