import { Component , OnInit} from '@angular/core';
 import {EMPLOYES } from './mock-employe';
import { Employe  } from './employe';

@Component({
  selector: 'app-root',
  templateUrl: './app.Component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  test?:string;
  
  ngOnInit(): void {
     //this.employes= EMPLOYES;
  }
 
//employes:Employe[]= [   ];
   
     
  /* clickCaptureEvent (event:any ) :void {
    alert("alerte je capture ton click et l'event "+event.target.textContent  );
  }

  selectEmploye (employe: Employe ) :void {  
     alert("alerte je capture ton click et l'employe " +employe.name);
   }*/
}
