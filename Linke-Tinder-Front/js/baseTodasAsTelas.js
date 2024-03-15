document.getElementById("menuIcon").addEventListener("click", toggleMenu);

        function toggleMenu() {
            var sidebar = document.getElementById("sidebar");
            sidebar.style.display = sidebar.style.display === "none" ? "block" : "none";
        }

        function abrirFormulario(tipo) {
            if (tipo === 'candidato') {
                window.open('candidato.html', '_blank');
            } else if (tipo === 'empresa') {
                window.open('empresa.html', '_blank');
            } else {
                window.open(`${tipo}.html`, '_blank');
            }
        }