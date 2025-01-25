import { Routes } from '@angular/router';
import { StartComponent } from './components/start/start.component';
import { HomeComponent } from './components/home/home.component';
import { ExemplosComponent } from './components/exemplos/exemplos.component';
import { CandidatosComponent } from './components/candidatos/candidatos.component';
import { Erro404Component } from './components/erros/erro404/erro404.component';
import { CandidatoNovoComponent } from './components/candidatos/candidato-novo/candidato-novo.component';
import { CandidatoRemocaoComponent } from './components/candidatos/candidato-remocao/candidato-remocao.component';
import { CandidatoAlteracaoComponent } from './components/candidatos/candidato-alteracao/candidato-alteracao.component';


// Nome do objeto: routes
export const routes: Routes = [

    // Cada objeto representa uma rota
    // Duas propriedades: Path (Se estiver vazio, é a rota padrão do localhost) + component

    { path:  '', redirectTo: 'home', pathMatch: 'full'}, // Página inicial
    { path: 'home', component: HomeComponent},
    { path: 'exemplos', component: ExemplosComponent},
    { path: 'candidatos', component: CandidatosComponent}, 
    { path: 'candidatos/novo', component: CandidatoNovoComponent}, 
    { path: 'candidatos/alteracao/:id', component: CandidatoAlteracaoComponent}, 
    { path: 'candidatos/remocao/:id', component: CandidatoRemocaoComponent}, 


    { path: '**', component: Erro404Component} // Qualquer coisa diferente dos componentes acima é ERRO

];
