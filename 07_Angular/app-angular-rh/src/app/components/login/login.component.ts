import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { UsuarioService } from '../../services/usuario.service';
import { Usuario } from '../../classes/usuario';

import * as bcrypt from "bcryptjs";

@Component({
  selector: 'app-login',
  imports: [FormsModule, CommonModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {

  constructor(
    private router: Router, 
    private usuarioService: UsuarioService) {}

  ngOnInit(): void {
    localStorage.removeItem('nome_usuario');
  }

  user: Usuario = new Usuario();
  erro!: string;

  checkPassword(pwdInfo: string, pwdUser: string) : boolean {
    return bcrypt.compareSync(pwdInfo, pwdUser);
  }

  validar(usuario: Usuario): void {

    this.usuarioService.postValidarUsuarioApi(usuario)
      .subscribe({
        next: res => {
          let u: Usuario = res;
          console.log(u);
          if(this.checkPassword(usuario.password, u.password)){
            localStorage.setItem('nome_usuario', usuario.username);
            this.router.navigate(['/candidatos']);
          } else {
            this.erro = 'Ocorreu um erro na autenticação';
          }
        },
        error: e => this.erro = e.error
      })
    // let resposta = this.usuarioService.getUsuarios()
    //   .find(u => u.username == usuario.username && u.password == usuario.password);

    // if(resposta) {
    //   localStorage.setItem('nome_usuario', usuario.username);
    //   this.router.navigate(['/candidatos']);
    // } else {
    //   this.erro = "Usuário ou senha inválidos";
    // }
  }
}
