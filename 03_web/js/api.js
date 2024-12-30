async function buscarCEP(cep) {
    let url = `https://viacep.com.br/ws/${cep}/json/`;
    const resposta = await fetch(url)
    const json = await resposta.json();

    return{
        logradouro: json.logradouro,
        bairro: json.bairro,
        cidade: json.localidade
    }
}

function executar() {
    document.getElementById('btn_enviar').addEventListener('click', async function() {
        let cep = document.getElementById('cep').value;
        let resposta = await buscarCEP(cep);

        document.getElementById('logradouro').value = resposta.logradouro;
        document.getElementById('bairro').value = resposta.bairro;
        document.getElementById('cidade').value = resposta.cidade;
    });
}

executar();