let promise = new Promise( (resolve, reject) => {

    let x = Math.random();// Gera um número entre 0 e 1

    if(x > 0.5){
        resolve('Valor calculado:' + x);
    } else{
        reject('Valor inválido' + x);
    }
});

console.log('------- ANTES DO PROMISE ------');
promise
    .then( s => s.toUpperCase())
    .then( s => s.substring(6))
    .then( s => console.log(s))
    .catch( erro => console.error(erro));
    console.log('------- DEPOIS DO PROMISE ------');
