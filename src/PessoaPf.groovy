class PessoaPf {
    private String nome
    private String email
    private String CPF
    private int idade
    private String Estado
    private String CEP
    private String DescricaoPessoal

    PessoaPf() {
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getCPF() {
        return CPF
    }

    void setCPF(String cpf) {
        this.CPF = CPF
    }

    int getIdade() {
        return idade
    }

    void setIdade(int idade) {
        this.idade = idade
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

    String getDescricaoPessoale() {
        return DescricaoPessoal
    }

    void setDescricaoPessoal(String DescricaoPessoal) {
        this.DescricaoPessoal = DescricaoPessoal
    }

    @Override
    String toString() {
        return "CadastroPf{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", CPF=" + CPF +
                ", Idade=" + idade +
                ", Estado='" + Estado + '\'' +
                ", CEP=" + CEP +
                ", Descrição Pessoal =" + getDescricaoPessoale() +
                '}'
    }
}