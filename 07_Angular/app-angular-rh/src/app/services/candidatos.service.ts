import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Candidato } from '../classes/candidato';

@Injectable({
  providedIn: 'root'
})
export class CandidatosService {

  constructor(private http: HttpClient) { }

  baseUrl: string = "http://localhost:8080/candidatos";

// Método para listar todos os candidatos
public getCandidatosApi() : Observable<Candidato[]>{
  const url: string = "lista";
  return this.http.get<Candidato[]>(`${this.baseUrl}/${url}`);
}

// Métodos para buscar um candidato
public getCandidatoApi(cpf: string) : Observable<Candidato> {
  const url = `buscar/{cpf}`;
  return this.http.get<Candidato>(`${this.baseUrl}/${url}`);
}

// Método para incluir novos candidatos
public postCandidatoApi(candidato: Candidato) : Observable<Candidato>{
  const url : string = "novo";
   return this.http.post<Candidato>(`${this.baseUrl}/${url}`, candidato);
}

// Método para alterar um candidato
public putCandidatoApi(candidato: Candidato, cpf: string) : Observable<Candidato>{
  const url : string = `alterar/${cpf}`;
  return this.http.put<Candidato>(`${this.baseUrl}/${url}`, candidato);
}

// Método para remover um candidato
public deleteCandidatoApi(cpf: string) : Observable<string>{
  const url : string = `remover/${cpf}`;
  return this.http.delete<string>(`${this.baseUrl}/${url}`);
}

}
