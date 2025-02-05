import { Injectable } from '@angular/core';
import { Usuario } from '../classes/usuario';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private http: HttpClient) { }

  getUsuarios() : Usuario[] {
    return [
      { username: 'admin', password: '123' },
      { username: 'avanade', password: 'decolatech' },
      { username: 'impacta', password: 'impacta' }
    ];
  }

  baseUrl: string = 'http://localhost:8080/usuarios';

  // metodo para criar um novo usuário
  public postSimpleUserApi(usuario: Usuario) : Observable<Usuario> {
    return this.http.post<Usuario>(`${this.baseUrl}/novo`, usuario);
  }

  // metodo para validar um usuário
  public postValidarUsuarioApi(usuario: Usuario): Observable<Usuario> {
    return this.http.post<Usuario>(`${this.baseUrl}/validar`, usuario);
  }
}
