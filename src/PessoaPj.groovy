class PessoaPj {
    private String nome
    private String emailCorporativo
    private String CNPJ
    private String pais
    private String Estado
    private String CEP
    private String DescricaoDaEmpresa

    PessoaPj() {
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getemailCorporativo() {
        return emailCorporativo
    }

    void setemailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo
    }

    String getCNPJ() {
        return CNPJ
    }

    void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ
    }

    String getPais() {
        return pais
    }

    void setPais(String pais) {
        this.pais = pais
    }

    String getEstado() {
        return Estado
    }

    void setEstado(String estado) {
        this.Estado = Estado
    }

    String getCEP() {
        return CEP
    }

    void setCEP(String CEP) {
        this.CEP = CEP
    }

    String getDescricaoDaEmpresa() {
        return DescricaoDaEmpresa
    }

    void setDescricaoDaEmpresa(String DescricaoDaEmpresa) {
        this.DescricaoDaEmpresa = DescricaoDaEmpresa
    }

    @Override
    String toString() {
        return "CadastroPj{" +
                "nome='" + nome + '\'' +
                ", email Corporativo ='" + emailCorporativo + '\'' +
                ", CNPJ=" + CNPJ +
                ", País=" + pais +
                ", Estado='" + Estado + '\'' +
                ", CEP=" + CEP +
                ", Descrição da Empresa =" + getDescricaoDaEmpresa() +
                '}'
    }
}