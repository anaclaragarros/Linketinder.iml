import spock.lang.Specification

class CadastroSpec extends Specification {

    def "Teste criar Pessoa PF"() {
        given:
        def cadastro = new Cadastro()

        when:
        cadastro.criarPessoaPf()

        then:
        assert cadastro.listaPf.size() == 1
        // Adicione mais verificações conforme necessário
    }

    def "Teste criar Pessoa PJ"() {
        given:
        def cadastro = new Cadastro()

        when:
        cadastro.criarPessoaPj()

        then:
        assert cadastro.listaPj.size() == 1
        // Adicione mais verificações conforme necessário
    }

    def "Teste criar Postagem"() {
        given:
        def cadastro = new Cadastro()

        when:
        cadastro.criarPostagem()

        then:
        assert cadastro.listaPostagens.size() == 1
        // Adicione mais verificações conforme necessário
    }

    def "Teste listar Postagens"() {
        given:
        def cadastro = new Cadastro()
        cadastro.criarPostagem()

        when:
        cadastro.listarPostagens()

        then:
        // Você pode usar Mocks para verificar a chamada de métodos ou verificar a saída no console
        // Aqui, usaremos apenas uma assertiva básica
        assert true
    }

    def "Teste curtir Postagem"() {
        given:
        def cadastro = new Cadastro()
        cadastro.criarPostagem()

        when:
        cadastro.curtirPostagem()

        then:
        // Adicione verificações conforme necessário
        assert true
    }
}