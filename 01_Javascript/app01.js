//declarando variáveis
var curso = 'Javascript Hello'; // var: visibilidade global
let nome = 'João Carlos World'; // let: mais seguro
nome = 'Maria World';
let ch = 186;
let st = true;
let verifica = ch > 100;

let empresa = {
    descricao: "Avanade",
    cidade: "Recife",
    ano: 2024,
    funcionarios: ["Ana", "Miguel", "Jeferson"],
  };
  
let empresaJson = JSON.stringify(empresa);

console.log(curso, '-', typeof (curso));
console.log(nome, '-', typeof (nome));
console.log(ch, '-', typeof (ch));
console.log(st, '-', typeof (st));
console.log(verifica, '-', typeof (verifica));
console.log(lista, '-', typeof (lista));
console.log(empresa, '-', typeof (empresa));
console.log(empresaJson);