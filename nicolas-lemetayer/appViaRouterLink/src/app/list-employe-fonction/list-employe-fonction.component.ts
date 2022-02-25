import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-list-employe-fonction',
  templateUrl: './list-employe-fonction.component.html',
  styleUrls: ['./list-employe-fonction.component.css']
})
export class ListEmployeFonctionComponent implements OnInit {
  fonction?:string;
  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.fonction = (this.route.snapshot.paramMap.get('fonction')!);
  }

}
