import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cargo } from '../classes/cargo';

@Injectable({
  providedIn: 'root'
})
export class CargosService {

  constructor(private http: HttpClient) { }

  url: string = 'http://localhost:8080/cargos/lista';

  public getCargosApi() : Observable<Cargo[]> {
    return this.http.get<Cargo[]>(this.url);
  }
}
