import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';
import { MenuComponent } from './components/menu/menu.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, MenuComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  constructor(private router: Router) { }

  nome!: string;  // nome do usuário a ser repassado para o componente menu (filho)

  ngOnInit(): void {
    this.atribuirUsuario();
  }

  atribuirUsuario() : void {
    if(localStorage.getItem('nome_usuario')){
      this.nome = `Olá, ${localStorage.getItem('nome_usuario')}`;
    } else {
      this.nome = "Efetuar Login";      
    }
  }
  
  desconectar() : void {
    localStorage.removeItem('nome_usuario');    
    this.atribuirUsuario();
    this.router.navigate(['/']);
  }

  onActivate() : void {
    this.atribuirUsuario();
  }

}
