function cadastrar(){
    //window.alert(new Date());
    var data = new Date();
    var dia = data.getDate();           //coleta somente o dia
    var mes = data.getMonth()+1;        //coleta do mes - somado 1 porque esse get traz um vetor que começa com 0
    var ano = data.getFullYear();
    data = dia + "/" + mes + "/" + ano;
    //window.alert(data);

    var dados = {
        nomeArtistico : document.getElementById("txtNomeArtistico").value,
        nacionalidade : document.getElementById("txtNacionalidade").value,
        cadastro : data
    }

    //window.alert(JSON.stringify(dados));

    var pacote={
        method:"POST",
        body:JSON.stringify(dados),
        headers:{
            "Content-type":"application/json"
        }
    }


    fetch("http://localhost:8080/novoartista", pacote)
        .then(res => res.json())
        .then(res => {
            window.alert("Cadastrado com sucesso");
            window.location="artista.html";
    })
    .catch(err=>{
        window.alert("Não foi possível cadastrar");
    });

}

function popularTabela(lista){
    var strArtistas = 
        "<div class='row'> <div class='col-12'>" + 
        "<table border='1' cellpadding='15' width='80%' align='center'>" + 
        "<tr>" + 
            "<td>Artista</td>" + 
            "<td>Nacionalidade</td>"+
            "<td>Cadastro</td>" +
        "</tr>";
 
        for (cont=0; cont<lista.length;cont++){
            strArtistas+=
            "<tr>"+
            "<td>" + lista[cont].nomeArtistico + "</td>" + 
            "<td>" + lista[cont].nacionalidade + "</td>" +
            "<td>" + lista[cont].cadastro + "</td>" +
            "</tr>";  
        }
        strArtistas+="</table></div></div>";
        document.getElementById("artistas").innerHTML = strArtistas;
}

function carregarArtistas(){
    var usuario = localStorage.getItem("user");
    if (!usuario){
        window.location="index.html";
    }else{
        fetch("http://localhost:8080/artistas").then(res=> res.json()).then(res => popularTabela(res));
    }
}