  document.getElementById("menuIcon").addEventListener("click", toggleMenu);

    function toggleMenu() {
        var sidebar = document.getElementById("sidebar");
        sidebar.style.height = sidebar.style.height === "0px" ? "100%" : "0";
    }

    function abrirFormulario(tipo) {
        if (tipo === 'Cadastro') {
            window.open('http://localhost:63342/linkhtml.iml/src/main/TelaCadastro.html?_ijt=s0850t9f75rvqp1loudu4i2sil&_ij_reload=RELOAD_ON_SAVE');
        } else if (tipo === 'Login') {
            window.open('http://localhost:63342/linkhtml.iml/src/main/TelaDeLogin.html?_ijt=u5ukaiglgrpb452fmad3d1t0lf&_ij_reload=RELOAD_ON_SAVE');
        } else {
            window.open(`${tipo}.html`);
        }
    }
