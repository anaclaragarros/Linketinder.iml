class PessoaPj {
    private nome: string;
    private emailCorporativo: string;
    private CNPJ: string;
    private pais: string;
    private estado: string;
    private CEP: string;
    private descricaoDaEmpresa: string;

    constructor() {}

    setNome(nome: string) {
        this.nome = nome;
    }

    setEmailCorporativo(emailCorporativo: string) {
        this.emailCorporativo = emailCorporativo;
    }

    setCNPJ(cnpj: string) {
        this.CNPJ = cnpj;
    }

    setPais(pais: string) {
        this.pais = pais;
    }

    setEstado(estado: string) {
        this.estado = estado;
    }

    setCEP(cep: string) {
        this.CEP = cep;
    }

    setDescricaoDaEmpresa(descricaoDaEmpresa: string) {
        this.descricaoDaEmpresa = descricaoDaEmpresa;
    }

    validarCNPJ(cnpj: string): boolean {
        const cnpjRegex = /^\d{2}\.\d{3}\.\d{3}\/\d{4}-\d{2}$/;
        return cnpjRegex.test(cnpj);
    }

    validarCEP(cep: string): boolean {
        const cepRegex = /^\d{5}-\d{3}$/;
        return cepRegex.test(cep);
    }

    toString(): string {
        return `PessoaPj {
            nome: ${this.nome},
            emailCorporativo: ${this.emailCorporativo},
            CNPJ: ${this.CNPJ},
            pais: ${this.pais},
            estado: ${this.estado},
            CEP: ${this.CEP},
            descricaoDaEmpresa: ${this.descricaoDaEmpresa}
        }`;
    }
}

const pessoaPj = new PessoaPj();
pessoaPj.setNome("Nome Empresa");
pessoaPj.setEmailCorporativo("empresa@examplo.com");
pessoaPj.setCNPJ("12.345.678/0001-90");
pessoaPj.setPais("Brasil");
pessoaPj.setEstado("São Paulo");
pessoaPj.setCEP("12345-678");
pessoaPj.setDescricaoDaEmpresa("Descrição da empresa...");

console.log("CNPJ válido:", pessoaPj.validarCNPJ(pessoaPj.getCNPJ()));
console.log("CEP válido:", pessoaPj.validarCEP(pessoaPj.getCEP()));
console.log(pessoaPj.toString());
