import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PourtourDirective } from './pourtour.directive';
import { EmployeRoleColorPipe } from './employe-role-color.pipe';
import { DetailEmployeComponent } from './detail-employe/detail-employe.component';
import { ListEmployeComponent } from './list-employe/list-employe.component';
import { ListEmployeFonctionComponent } from './list-employe-fonction/list-employe-fonction.component';
import { ListFonctionComponent } from './list-fonction/list-fonction.component';
 

@NgModule({
  declarations: [
    AppComponent,
    PourtourDirective,
    EmployeRoleColorPipe,
    DetailEmployeComponent,
    ListEmployeComponent,
    ListEmployeFonctionComponent,
    ListFonctionComponent,
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
