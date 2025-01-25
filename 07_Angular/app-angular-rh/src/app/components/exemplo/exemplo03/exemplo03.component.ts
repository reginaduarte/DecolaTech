import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../../../services/pessoa.service';
import { Pessoa } from '../../../classes/pessoa';
import { CommonModule, NgFor } from '@angular/common';
import { TamanhoPipe } from '../../../pipes/tamanho.pipe';
import { FiltroPipe } from '../../../pipes/filtro.pipe';

@Component({
  selector: 'app-exemplo03',
  imports: [CommonModule, TamanhoPipe, FiltroPipe],
  templateUrl: './exemplo03.component.html',
  styleUrl: './exemplo03.component.css'
})
export class Exemplo03Component implements OnInit{

  constructor(private service: PessoaService) {  }
  ngOnInit(): void {
   this.listar();
  }

  pessoas : Pessoa[] = [];
  listar() : void {
    this.pessoas = this.service.listarPessoas();
  }

//     filtrar(input: string) : void {
//     this.listar();
//     this.pessoas = this.pessoas.filter(p => p.nome.includes);
//  }
 
}
