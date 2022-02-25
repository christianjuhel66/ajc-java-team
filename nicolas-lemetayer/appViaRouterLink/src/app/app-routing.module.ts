import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetailEmployeComponent } from './detail-employe/detail-employe.component';
import { ListEmployeFonctionComponent } from './list-employe-fonction/list-employe-fonction.component';
import { ListEmployeComponent } from './list-employe/list-employe.component';
import { ListFonctionComponent } from './list-fonction/list-fonction.component';

const routes: Routes = [{ path: 'employes', component: ListEmployeComponent},
{ path: 'employe/:id', component: DetailEmployeComponent},
{ path: 'fonctions', component: ListFonctionComponent},
{ path: 'fonctionemploye/:fonction', component: ListEmployeFonctionComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
