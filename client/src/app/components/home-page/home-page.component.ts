import { Component, OnInit } from '@angular/core';
import{Router}  from '@angular/router';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  myLogo:string="http://www.cinemamuseum.org.uk/wordpress/wp-content/uploads/2010/07/CinemaForAllLogo_XtraLarge1-488x256.jpg";

  img1:string="https://www.foxmovies.com/s3/dev-temp/en-US/__5afdb4c667023.jpg"

  img2:string="https://img.youtube.com/vi/20bpjtCbCz0/0.jpg"

  img3:string="https://m.odeon.co.uk/_uploads/asset_management/960x410_17541d8a7c18d04399551bdb1ed8b290.jpg"
  
  constructor(private _rotuer:Router) { }

  ngOnInit() {
  }

}
