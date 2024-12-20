let calcularImposto = require("./funcoes/imposto");

let irpf = calcularImposto(5000);
console.log(irpf.toFixed(2) + " valor a ser pago no imposto de renda.");