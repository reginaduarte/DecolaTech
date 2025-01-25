export class Pessoa {

    nome: string;
    idade?: number;         // Símbolo ? indica que a propriedade é opcional

    constructor(){
        this.nome = '';
        this.idade = 0;
    }

}
