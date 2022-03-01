import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employe } from '../employe';
import { EMPLOYES } from '../mock-employe';

@Component({
  selector: 'app-list-employe',
  templateUrl: './list-employe.component.html',
  styleUrls: ['./list-employe.component.css']
})
export class ListEmployeComponent implements OnInit {
  employes:Employe[]= [   ];

  constructor(private router: Router){}

  ngOnInit(): void {
    this.employes= EMPLOYES;
 }
}
