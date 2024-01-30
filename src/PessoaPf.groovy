class PessoaPf  { private String nome;
        private String email;
        private String CPF;
        private int idade;
        private String Estado;
        private String CEP;
        private String DescricaoPessoal;

        public PessoaPf() {
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;

        }
        public String getEmail() {
            return email;
        }

        public void setEmail() {
            this.email = email;
        }
        public String getCPF() {
            return CPF;
        }

        public void setCPF(String cpf) {
            this.CPF = CPF;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
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
        public void setCEP (String CEP) {
            this.CEP = CEP;
        }

        public String getDescricaoPessoale() {
            return DescricaoPessoal;
        }

        public void setDescricaoPessoal(String DescricaoPessoal) {
            this.DescricaoPessoal = DescricaoPessoal;
        }
        @Override
        public String toString() {
            return "CadastroPf{" +
                    "nome='" + nome + '\'' +
                    ", email='" + email + '\'' +
                    ", CPF=" + CPF +
                    ", Idade=" + idade +
                    ", Estado='" + Estado + '\'' +
                    ", CEP=" + CEP +
                    ", Descrição Pessoal =" + getDescricaoPessoale() +
                    '}';
        }
}