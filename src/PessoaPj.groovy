class PessoaPj {
    private String nome;
    private String emailCorporativo;
    private String CNPJ;
    private String pais;
    private String Estado;
    private String CEP;
    private String DescricaoDaEmpresa;

    public PessoaPj() {
    }

    public void setEmailCorporativo(String emailCorporativo) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }
    public String getemailCorporativo() {
        return emailCorporativo;
    }

    public void setemailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = Estado;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getDescricaoDaEmpresa() {
        return DescricaoDaEmpresa;
    }

    public void setDescricaoDaEmpresa(String DescricaoDaEmpresa) {
        this.DescricaoDaEmpresa = DescricaoDaEmpresa;
    }
    @Override
    public String toString() {
        return "CadastroPj{" +
                "nome='" + nome + '\'' +
                ", email Corporativo ='" + emailCorporativo + '\'' +
                ", CNPJ=" + CNPJ +
                ", País=" + pais +
                ", Estado='" + Estado + '\'' +
                ", CEP=" + CEP +
                ", Descrição da Empresa =" + getDescricaoDaEmpresa() +
                '}';
    }
}
