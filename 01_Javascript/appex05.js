const Funcionario = require('./classes/funcionario');

// Instanciando a classe
let p = new Funcionario('Gabriela', 30, 'Analista', 5000); // construtor executado

//p.atribuir('Antonio Carlos', 40, 'Motoboy', 3000);
console.log(p.mostrarDados());