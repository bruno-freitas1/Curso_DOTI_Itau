function exibir(){
    window.alert("Hello World");
}

function verificar(){
    var numero = window.prompt("Digite um número");
    var resto = parseInt(numero)%2;
    if (resto == 0){
        window.alert("O Numero é par");
    } else {
        window.alert("O Numero é impar");
    }
}

function somar(valor1, valor2){
    var resultado = parseInt(valor1) + parseInt(valor2);
    return resultado;
}

function calcular(){
    var operacoes = document.getElementsByName("operacao");
    if (operacoes[0].checked){
        document.getElementById("txtResultado").value = 
            parseInt(document.getElementById("txtNumero1").value) + parseInt(document.getElementById("txtNumero2").value);
    } else if (operacoes[1].checked){
        document.getElementById("txtResultado").value = 
            parseInt(document.getElementById("txtNumero1").value) - parseInt(document.getElementById("txtNumero2").value);
    } else if (operacoes[2].checked){
        document.getElementById("txtResultado").value = 
            parseInt(document.getElementById("txtNumero1").value) * parseInt(document.getElementById("txtNumero2").value);
    } else {
        document.getElementById("txtResultado").value = 
            parseInt(document.getElementById("txtNumero1").value) / parseInt(document.getElementById("txtNumero2").value);
    }
    
}