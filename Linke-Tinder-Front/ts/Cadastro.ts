class Validação {
    static ValidacaoCandidato(candidato: Candidato): boolean {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        const cpfRegex = /^\d{3}\.\d{3}\.\d{3}-\d{2}$/;
        const phoneRegex = /^\(\d{2}\)\s\d{4,5}-\d{4}$/;
        const linkedinRegex = /^https?:\/\/(www\.)?linkedin\.com\/.*$/;
        
        if (!emailRegex.test(candidato.email)) return false;
        if (!cpfRegex.test(candidato.cpf)) return false;
        if (!phoneRegex.test(candidato.phone)) return false;
        if (!linkedinRegex.test(candidato.linkedin)) return false;
        
        return true;
    }

    static ValidacaoEmpresa(empresa : Empresa): boolean {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        const cnpjRegex = /^\d{2}\.\d{3}\.\d{3}\/\d{4}-\d{2}$/;
        const cepRegex = /^\d{5}-\d{3}$/;
        
        if (!emailRegex.test(empresa.email)) return false;
        if (!cnpjRegex.test(empresa.cnpj)) return false;
        if (!cepRegex.test(empresa.cep)) return false;
        
        return true;
    }
}

interface Candidato {
    name: string;
    email: string;
    cpf: string;
    phone: string;
    linkedin: string;
    tags: string[];
}

interface Empresa {
    name: string;
    email: string;
    cnpj: string;
    cep: string;
    tags: string[];
}

const Candidato: Candidato = {
    name: "joão",
    email: "joao@exampl0.com",
    cpf: "123.456.789-01",
    phone: "(99) 99999-9999",
    linkedin: "https://www.linkedin.com/in/",
    tags: ["tag1", "tag2"]
};

const company: Empresa = {
    name: "Empresa",
    email: "info@examplo.com",
    cnpj: "12.345.678/0001-90",
    cep: "12345-678",
    tags: ["tag1", "tag2"]
};

console.log("Candidate is valid:", Validação.ValidacaoCandidato(Candidato));
console.log("Company is valid:", Validação.ValidacaoEmpresa(Empresa));
