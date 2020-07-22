function logar(){
    //window.alert("Teste");
    //var email = document.getElementById("txtEmail").value;
    //var senha = document.getElementById("txtSenha").value;
    //window.alert(email);
    //window.alert(senha);

    var dados={
        email:document.getElementById("txtEmail").value,
        senha:document.getElementById("txtSenha").value
    }

    var pacote={
        method:"POST",
        body:JSON.stringify(dados),
        headers:{
            "Content-type":"application/json"
        }
    }

    // fetch() - manda os dados até o back-end e espera o retorno da resposta
    // res => res.json() - converte o objeto da resposta do back-end em um JSON
    // res => {window.alert(res.nome);} - retorna o nome se der tudo certo
    // catch - se houver erro vai aparecer a mensagem "Erro"
    // localStorage.setItem("user", JSON.stringify(res)) - armazenar no banco de dados local do navegador para ser usado em outras paginas
    fetch("http://localhost:8080/login", pacote)
    .then(res => res.json()).then(res => {
        //window.alert(res.nome);
        localStorage.setItem("user", JSON.stringify(res));
        window.location="usuario.html";       //após armazenar o dado, esse comando vai abrir a pagina usuario.html que po sua vez vai disparar o onload="carregarUsuario() dentor do body
    })
    .catch(err=>{
        window.alert("Erro");
    });


}