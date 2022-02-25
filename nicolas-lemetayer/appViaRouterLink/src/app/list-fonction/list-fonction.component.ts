import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-fonction',
  templateUrl: './list-fonction.component.html',
  styleUrls: ['./list-fonction.component.css']
})
export class ListFonctionComponent implements OnInit {
    listFonctions:string[]= ["testeur","dev","business_analyst", "alternant", "chef_de_projet"];
  constructor(private router: Router) { }
  

  ngOnInit(): void {
  }

}
