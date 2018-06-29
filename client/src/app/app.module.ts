import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes}   from '@angular/router';
import {HttpModule}   from '@angular/http';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { AboutPageComponent } from './components/about-page/about-page.component';
import { FilmPageComponent } from './components/film-page/film-page.component';
import { FilmDetailComponent } from './components/film-detail/film-detail.component';
import {FilmService}   from './service/film.service';


const appRoutes:Routes=[
{path: '', redirectTo: '/home', pathMatch: 'full' },
{path: 'home', component:HomePageComponent },
{path: 'about', component:AboutPageComponent },
{path: 'film', component:FilmPageComponent },
{path: 'film/:id', component: FilmDetailComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    AboutPageComponent,
    HomePageComponent,
    FilmPageComponent,
    FilmDetailComponent
  ],

  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)

  ],
  providers: [FilmService],
  bootstrap: [AppComponent]
})
export class AppModule { }
