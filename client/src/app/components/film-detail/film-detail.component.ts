import { Component, OnInit } from '@angular/core';
import{Router}  from '@angular/router';
import { Film } from '../../film';

@Component({
  selector: 'app-film-detail',
  templateUrl: './film-detail.component.html',
  styleUrls: ['./film-detail.component.css']
})
export class FilmDetailComponent implements OnInit {

  constructor(private _rotuer:Router) { }

   film: Film = {
     movieID: number;
     movieTitle: string;
     movieGenre: string;
     movieClassification: string;
  }


  ngOnInit() {
  }

}
