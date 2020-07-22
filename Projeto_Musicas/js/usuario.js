function carregarUsuario(){
    var usuarioLogado = localStorage.getItem("user");
    if (!usuarioLogado){                //caso o usuário acesse o link direto, ele não vai estar logado e será direcionado para tela inicial index.html
        window.location="index.html";
    } else {
        var usuarioJson = JSON.parse(usuarioLogado);   //conversão para JSON
        document.getElementById("dados").innerHTML=
        "<h3 id='nomeUsuario'>" + usuarioJson.nome + "</h3>" +
        "<br><h4>" + usuarioJson.email + "<br>" +
        "Código: " + usuarioJson.id + "<br></h4>";
        
        document.getElementById("foto").innerHTML=
        "<img width='40%' alt='Imagem não encontrada' src=images/" + usuarioJson.foto + ">";

    }
}