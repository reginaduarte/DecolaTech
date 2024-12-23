let dados = require('./dados/listaDados');

let lista1 = dados.nomes.filter(s => s.endsWith('a'));
console.log(lista1);

let lista2 = dados.nomes.filter(s => s.length <= 4);
console.log(lista2);

let lista3 = dados.nomes.filter(s => s.toUpperCase().includes('R'));
console.log(lista3);

console.log('----------------------------------------------------------');
console.log(dados.nomes);

let map1 = dados.nomes.map( (elemento, indice) => indice + ' - ' + elemento );
console.log(map1);