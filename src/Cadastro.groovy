
public class Cadastro {

    ArrayList<PessoaPj> listaPj = new ArrayList<>();
    ArrayList<PessoaPf> listaPf = new ArrayList<>();
    ArrayList<Postagem> listaPostagens = new ArrayList<>();
    SistemaCurtidas sistemaCurtidas = new SistemaCurtidas();

    public void criarCadastro() {
        System.out.println("Selecione uma ação.");
        System.out.println("1 - Criar Cadastro PJ");
        System.out.println("2 - Criar Cadastro PF");
        System.out.println("3 - Criar Postagem");
        System.out.println("4 - Listar Postagens");
        System.out.println("5 - Curtir Postagem");
        System.out.println("6 - Finalizar\n");

        Scanner entrada = new Scanner(System.in);
        String opcaoSelecionada = entrada.nextLine();

        switch (opcaoSelecionada) {
            case "1":
                criarPessoaPj();
                break;
            case "2":
                criarPessoaPf();
                break;
            case "3":
                criarPostagem();
                break;
            case "4":
                listarPostagens();
                break;
            case "5":
                curtirPostagem();
                break;
            case "6":
                return;
            default:
                System.out.println("Opção inválida.");
        }

        criarCadastro();
    }

        public PessoaPf criarPessoaPf(){

            PessoaPf pessoaPf = new PessoaPf();
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite seu nome completo");
            var nome = entrada.nextLine();
            pessoaPf.setNome(nome);

            System.out.println("Informe o seu e-mail:");
            var email = entrada.nextLine();
            pessoaPf.setEmail();

            System.out.println("Informe o seu CPF:");
            var CPF = entrada.nextLine();
            pessoaPf.setCPF(CPF);

            System.out.println("Informe seu Estado:");
            var Estado = entrada.nextLine();
            pessoaPf.setEstado(Estado);

            System.out.println("Informe sua data de nascimento:");
            var idade = entrada.nextLine();
            pessoaPf.setIdade(Integer.parseInt(idade));

            System.out.println("Informe seu CEP:");
            var CEP = entrada.nextLine();
            pessoaPf.setCEP(CEP);

            System.out.println("Descrição Pessoal:");
            var DescricaoPessoal = entrada.nextLine();
            pessoaPf.setDescricaoPessoal(DescricaoPessoal);
            listaPf.add(pessoaPf);
            return pessoaPf;

            listaPf.add(pessoaPf);
        }


    public PessoaPj criarPessoaPj() {

        PessoaPj pessoaPj = new PessoaPj();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        var nome = entrada.nextLine();
        pessoaPj.setNome(nome);

        System.out.println("Informe o seu e-mail corporativo:");
        var emailCorporativo = entrada.nextLine();
        pessoaPj.setemailCorporativo(emailCorporativo);

        System.out.println("Informe o seu CNPJ:");
        var CNPJ = entrada.nextLine();
        pessoaPj.setCNPJ(CNPJ);

        System.out.println("Informe seu País:");
        var pais = entrada.nextLine();
        pessoaPj.setPais(pais);

        System.out.println("Informe seu Estado:");
        var estado = entrada.nextLine();
        pessoaPj.setEstado(estado);

        System.out.println("Informe seu CEP:");
        var CEP = entrada.nextLine();
        pessoaPj.setCEP(CEP);

        System.out.println("Descrição da Empresa:");
        var DescricaoDaEmpresa = entrada.nextLine();
        pessoaPj.setDescricaoDaEmpresa(DescricaoDaEmpresa);
        listaPj.add(pessoaPj);
        return pessoaPj;

        listaPj.add(pessoaPj);
    }

        public void criarPostagem() {
        System.out.println("Digite sua postagem:");
        Scanner entrada = new Scanner(System.in);
        String conteudo = entrada.nextLine();
        Postagem postagem = new Postagem(conteudo);
        listaPostagens.add(postagem);
        System.out.println("Postagem criada com sucesso!");
    }

    public void listarPostagens() {
        System.out.println("Listagem de Postagens:");
        for (Postagem postagem : listaPostagens) {
            System.out.println(postagem);
        }
    }

    public void curtirPostagem() {
        System.out.println("Digite o ID da postagem que você deseja curtir:");
        Scanner entrada = new Scanner(System.in);
        int idPostagem = entrada.nextInt();

        if (existePostagem(idPostagem)) {
            sistemaCurtidas.curtirPostagem(idPostagem);
            System.out.println("Curtida adicionada à postagem com sucesso!");
        } else {
            System.out.println("Postagem não encontrada.");
        }
    }
    private boolean existePostagem(int idPostagem) {
        for (Postagem postagem : listaPostagens) {
            if (postagem.getId() == idPostagem) {
                return true;
            }
        }
        return false;
    }
}