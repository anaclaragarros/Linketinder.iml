     document.getElementById("menuIcon").addEventListener("click", toggleMenu);

        function toggleMenu() {
            var sidebar = document.getElementById("sidebar");
            sidebar.style.display = sidebar.style.display === "none" ? "block" : "none";
        }

      function alterarTipoLogin() {
            var loginCandidato = document.getElementById('Logincandidato');
            var loginEmpresa = document.getElementById('LoginEmpresa');

            if (loginCandidato.style.display === 'block') {
                loginCandidato.style.display = 'none';
                loginEmpresa.style.display = 'block';
            } else {
                loginCandidato.style.display = 'block';
                loginEmpresa.style.display = 'none';
            }
        }

        function salvarLogin(tipo) {
        window.location.href = 'http://localhost:63342/linkhtml.iml/src/main/ListagemUsuarios.html?_ijt=iothnkcolvatn095dl8ui92iic&_ij_reload=RELOAD_ON_SAVE';

      }