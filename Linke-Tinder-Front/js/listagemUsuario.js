 document.getElementById("menuIcon").addEventListener("click", toggleMenu);

        function toggleMenu() {
            var sidebar = document.getElementById("sidebar");
            sidebar.style.display = sidebar.style.display === "none" ? "block" : "none";
        }

        function alterarTipoCadastro() {
            var cadastroCandidato = document.getElementById('cadastroCandidato');
            var cadastroEmpresa = document.getElementById('cadastroEmpresa');

            if (cadastroCandidato.style.display === 'block') {
                cadastroCandidato.style.display = 'none';
                cadastroEmpresa.style.display = 'block';
            } else {
                cadastroCandidato.style.display = 'block';
                cadastroEmpresa.style.display = 'none';
            }
        }

        function salvarCadastro(tipo) {
            alert('Dados salvos!'); // Aviso simples para demonstração.
        }