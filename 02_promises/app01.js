const getPromise = require('./promises2');

async function testPromise() {
    try {
        const valor = await getPromise();
        console.log(valor);
    } catch(erro) {
        console.error(erro);
    }
}

testPromise();