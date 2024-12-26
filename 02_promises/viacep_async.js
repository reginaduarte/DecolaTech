async function buscarCEP(cep) {
    let url = `https://viacep.com.br/ws/${cep}/json/`;
    
    const resposta = await fetch(url);
    const json = await resposta.json();

    return json;
}

async function executar(params) {
    console.log('----- ANTES -----');
    let resultado = await buscarCEP('0131100');
    console.log(resultado);
    console.log('----- DEPOIS -----');
}
executar();