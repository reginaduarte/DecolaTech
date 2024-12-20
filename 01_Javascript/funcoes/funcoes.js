//forma tradicional
function calcularSoma (x,y){
    if(typeof(x) != "number"){
        throw new Error("O parâmetro x deve ser numérico");
    }
    if(typeof(y) != "number"){
        throw new Error("O parâmetro y deve ser numérico"); 
    }
    //x = parseFloat(x);
    //y = parseFloat(y);
    return x + y;
}

//função anônima
let maiorValor = function (x, y){
    if(x, y) {
        return x;
    } else {
        return y;
    }
}

//arrow function
let calcularSubtracao = (x, y) => x - y;

let menorValor = function (x, y) {
    //if ternário
    return (x < y) ? x : y;
}

module.exports = { calcularSoma, maiorValor, calcularSubtracao, menorValor};