import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employe } from '../employe';
import { EMPLOYES } from '../mock-employe';

@Component({
  selector: 'app-detail-employe',
  templateUrl: './detail-employe.component.html',
  styleUrls: ['./detail-employe.component.css']
})
export class DetailEmployeComponent implements OnInit {
  idEmploye?:number;
  employes?: Employe[]  ;
  employe?: Employe ;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.idEmploye = Number(this.route.snapshot.paramMap.get('id')!);
    this.employes = EMPLOYES;
    for (let i = 0; i < this.employes.length; i++) {
      if (this.employes[i].id == this.idEmploye) { 
        this.employe = this.employes[i]; }
      } 
  }

}
