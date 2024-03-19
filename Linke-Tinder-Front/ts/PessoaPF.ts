class PessoaPf {
    private nome: string;
    private email: string;
    private CPF: string;
    private idade: number;
    private estado: string;
    private CEP: string;
    private descricaoPessoal: string;

    constructor() {}

    setNome(nome: string) {
        this.nome = nome;
    }

    setEmail(email: string) {
        this.email = email;
    }

    setCPF(cpf: string) {
        this.CPF = cpf;
    }

    setIdade(idade: number) {
        this.idade = idade;
    }

    setEstado(estado: string) {
        this.estado = estado;
    }

    setCEP(cep: string) {
        this.CEP = cep;
    }

    setDescricaoPessoal(descricaoPessoal: string) {
        this.descricaoPessoal = descricaoPessoal;
    }

    validarCPF(cpf: string): boolean {
        const cpfRegex = /^\d{3}\.\d{3}\.\d{3}-\d{2}$/;
        return cpfRegex.test(cpf);
    }

    validarEmail(email: string): boolean {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }

    validarCEP(cep: string): boolean {
        const cepRegex = /^\d{5}-\d{3}$/;
        return cepRegex.test(cep);
    }

    toString(): string {
        return `PessoaPf {
            nome: ${this.nome},
            email: ${this.email},
            CPF: ${this.CPF},
            idade: ${this.idade},
            estado: ${this.estado},
            CEP: ${this.CEP},
            descricaoPessoal: ${this.descricaoPessoal}
        }`;
    }
}

const pessoa = new PessoaPf();
pessoa.setNome("Joãoe");
pessoa.setEmail("joao@exampl0.com");
pessoa.setCPF("123.456.789-01");
pessoa.setIdade(30);
pessoa.setEstado("São Paulo");
pessoa.setCEP("12345-678");
pessoa.setDescricaoPessoal("Descrição pessoal...");

console.log("CPF válido:", pessoa.validarCPF(pessoa.CPF()));
console.log("E-mail válido:", pessoa.validarEmail(pessoa.getEmail()));
console.log("CEP válido:", pessoa.validarCEP(pessoa.getCEP()));
console.log(pessoa.toString());
