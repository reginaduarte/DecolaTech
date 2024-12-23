function Funcionario(nome = 'desconhecido', idade = 18, cargo = 'desconhecido', salario = 2000) {

    if (nome == undefined || idade == undefined || cargo == undefined || salario == undefined ){
        throw new Error('Dados inválidos');
    }
    this.atribuir(nome, idade, cargo, salario);
    
    this.atribuir = function(nome, idade, cargo, salario){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }
    this.mostrarDados = function() {
        return `Nome: ${this.nome}\nIdade: ${this.idade}\n` +
            `Cargo: ${this.cargo}\nSalário: ${this.salario}`;
    }
}

module.exports = Funcionario;