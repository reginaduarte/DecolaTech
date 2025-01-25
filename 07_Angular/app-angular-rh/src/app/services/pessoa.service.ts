import { Injectable } from '@angular/core';
import { Pessoa } from '../classes/pessoa';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {

  constructor() { }

                          // Importação
  public listarPessoas(): Pessoa[]{
    return [
      { nome: 'Rafael', idade: 23},
      { nome: 'Joana', idade: 55},
      { nome: 'Maria', idade: 40},
      { nome: 'Tiago', idade: 27}
    ];

  }

}
