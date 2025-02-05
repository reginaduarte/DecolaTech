import { Component, EventEmitter, Input, Output } from '@angular/core';
import { RouterLink } from '@angular/router';


@Component({
  selector: 'app-menu',
  imports: [RouterLink],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent {

  @Input() usuario : string = 'Olá';
  @Output() novoEvento = new EventEmitter<string>();

  efetuarLogoff() : void {
    this.novoEvento.emit();
  }

}
