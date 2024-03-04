class CadastroTest {

    def "testCriarPessoaPF"() {
        def cadastro = new Cadastro()
        cadastro.criarPessoaPf()
        assert cadastro.listaPf.size() == 1
    }

    def "testCriarPessoaPJ"() {
        def cadastro = new Cadastro()
        cadastro.criarPessoaPj()
        assert cadastro.listaPj.size() == 1
    }

    def "testCriarPostagem"() {
        def cadastro = new Cadastro()
        cadastro.criarPostagem()
        assert cadastro.listaPostagens.size() == 1
    }

    def "testListarPostagens"() {
        def cadastro = new Cadastro()
        cadastro.criarPostagem()
    }

    def "testCurtirPostagem"() {
        def cadastro = new Cadastro()
        cadastro.criarPostagem()
        cadastro.curtirPostagem()
    }
}
