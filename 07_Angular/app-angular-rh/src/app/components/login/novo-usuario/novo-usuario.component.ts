import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Usuario } from '../../../classes/usuario';
import { UsuarioService } from '../../../services/usuario.service';
import { Router } from '@angular/router';

import * as bcrypt from "bcryptjs";

@Component({
  selector: 'app-novo-usuario',
  imports: [FormsModule, CommonModule],
  templateUrl: './novo-usuario.component.html',
  styleUrl: './novo-usuario.component.css'
})
export class NovoUsuarioComponent implements OnInit{

  constructor(private usuarioService: UsuarioService, private router: Router) {

  }
  ngOnInit(): void {
    this.erro = '';
    this.sucesso = '';
  }
    user: Usuario = new Usuario();
    erro!: string;
    sucesso!: string;

    fechar(): void {
      this.router.navigate(['/home'])
    }

    incluir(usuario: Usuario) : void {
      if(!usuario.username || !usuario.password){
        this.erro = "Dados incompletos. Por favor preencher os dados corretamente";
        return;
      }

      usuario.password = bcrypt.hashSync(usuario.password, 10);

      this.usuarioService.postSimpleUserApi(usuario).subscribe({
        complete: () => this.sucesso = 'Usuário criado com sucesso!',
        error: e => this.erro = e.error
      });
    }
}
