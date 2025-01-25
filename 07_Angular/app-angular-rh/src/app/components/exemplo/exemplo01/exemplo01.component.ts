import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exemplo01',
  imports: [],
  templateUrl: './exemplo01.component.html',
  styleUrl: './exemplo01.component.css'
})
export class Exemplo01Component implements OnInit{

ngOnInit(): void {
  this.gerarNumero();
}

/*
  Binding Unidirecional (também chamado de Vínculo)
    Property Binding: classe -> view (propriedade da classe renderizada na view)
    Event Binding: view -> classe
*/
rnd!: number;

gerarNumero() : void {
  this.rnd = Math.random();
}

}
