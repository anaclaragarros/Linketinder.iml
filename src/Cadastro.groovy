import java.util.Scanner

class Cadastro {

    def listaPj = []
    def listaPf = []
    def listaPostagens = []
    def sistemaCurtidas = new SistemaCurtidas()

    static void main(String[] args) {
        Cadastro cadastro = new Cadastro()
        cadastro.criarCadastro()
    }

    void criarCadastro() {
        println("Selecione uma ação.")
        println("1 - Criar Cadastro PJ")
        println("2 - Criar Cadastro PF")
        println("3 - Criar Postagem")
        println("4 - Listar Postagens")
        println("5 - Curtir Postagem")
        println("6 - Finalizar\n")

        Scanner entrada = new Scanner(System.in)
        String opcaoSelecionada = entrada.nextLine()

        switch (opcaoSelecionada) {
            case "1":
                criarPessoaPj()
                break
            case "2":
                criarPessoaPf()
                break
            case "3":
                criarPostagem()
                break
            case "4":
                listarPostagens()
                break
            case "5":
                curtirPostagem()
                break
            case "6":
                return
            default:
                println("Opção inválida.")
        }

        criarCadastro()
    }

    PessoaPf criarPessoaPf() {
        PessoaPf pessoaPf = new PessoaPf()
        Scanner entrada = new Scanner(System.in)

        println("Digite seu nome completo")
        def nome = entrada.nextLine()
        pessoaPf.setNome(nome)

        println("Informe o seu e-mail:")
        def email = entrada.nextLine()
        pessoaPf.setEmail(email)

        println("Informe o seu CPF:")
        def CPF = entrada.nextLine()
        pessoaPf.setCPF(CPF)

        println("Informe seu Estado:")
        def Estado = entrada.nextLine()
        pessoaPf.setEstado(Estado)

        println("Informe sua data de nascimento:")
        def idade = entrada.nextLine()
        pessoaPf.setIdade(Integer.parseInt(idade))

        println("Informe seu CEP:")
        def CEP = entrada.nextLine()
        pessoaPf.setCEP(CEP)

        println("Descrição Pessoal:")
        def descricaoPessoal = entrada.nextLine()
        pessoaPf.setDescricaoPessoal(descricaoPessoal)
        listaPf.add(pessoaPf)
        return pessoaPf
    }

    PessoaPj criarPessoaPj() {
        PessoaPj pessoaPj = new PessoaPj()
        Scanner entrada = new Scanner(System.in)

        println("Digite seu nome completo")
        def nome = entrada.nextLine()
        pessoaPj.setNome(nome)

        println("Informe o seu e-mail corporativo:")
        def emailCorporativo = entrada.nextLine()
        pessoaPj.setemailCorporativo(emailCorporativo)

        println("Informe o seu CNPJ:")
        def CNPJ = entrada.nextLine()
        pessoaPj.setCNPJ(CNPJ)

        println("Informe seu País:")
        def pais = entrada.nextLine()
        pessoaPj.setPais(pais)

        println("Informe seu Estado:")
        def estado = entrada.nextLine()
        pessoaPj.setEstado(estado)

        println("Informe seu CEP:")
        def CEP = entrada.nextLine()
        pessoaPj.setCEP(CEP)

        println("Descrição da Empresa:")
        def descricaoDaEmpresa = entrada.nextLine()
        pessoaPj.setDescricaoDaEmpresa(descricaoDaEmpresa)
        listaPj.add(pessoaPj)
        return pessoaPj
    }

    void criarPostagem() {
        println("Digite sua postagem:")
        Scanner entrada = new Scanner(System.in)
        String conteudo = entrada.nextLine()
        Postagem postagem = new Postagem(conteudo)
        listaPostagens.add(postagem)
        println("Postagem criada com sucesso!")
    }

    void listarPostagens() {
        println("Listagem de Postagens:")
        for (Postagem postagem : listaPostagens) {
            println(postagem)
        }
    }

    void curtirPostagem() {
        println("Digite o ID da postagem que você deseja curtir:")
        Scanner entrada = new Scanner(System.in)
        def idPostagem = entrada.nextInt()

        if (existePostagem(idPostagem)) {
            sistemaCurtidas.curtirPostagem(idPostagem)
            println("Curtida adicionada à postagem com sucesso!")
        } else {
            println("Postagem não encontrada.")
        }
    }

    private boolean existePostagem(int idPostagem) {
        for (Postagem postagem : listaPostagens) {
            if (postagem.getId() == idPostagem) {
                return true
            }
        }
        return false
    }
}