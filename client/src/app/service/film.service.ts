import { Injectable } from '@angular/core';
import{Http, Response, Headers, RequestOptions} from '@angular/http';
import{Observable}   from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import{Film}  from '../film';

@Injectable({
  providedIn: 'root'
})


export class FilmService {
    private baseUrl:string='http://localhost:8080';
    private headers = new Headers({'Content-Type':'application/json'});
    private options = new RequestOptions({headers:this.headers});
    private film = new Film();
    constructor(private _http:Http) { }

    getFilms(){

      return this._http.get(this.baseUrl+'/movie/get',this.options).map((response:Response)=>response.json())
        .catch(this.errorHandler);
    }
    getFilm(id:Number){

      return this._http.get(this.baseUrl+'/movie/get/'+id,this.options).map((response:Response)=>response.json())
        .catch(this.errorHandler);
    }
    deleteFilm(id:Number){

      return this._http.delete(this.baseUrl+'/film/'+id,this.options).map((response:Response)=>response.json())
        .catch(this.errorHandler);
    }


    createFilm(film:Film){

      return this._http.post(this.baseUrl+'/film',JSON.stringify(film),  this.options).map((response:Response)=>response.json())
        .catch(this.errorHandler);
    }

     updateFilm(film:Film){

      return this._http.put(this.baseUrl+'/film',JSON.stringify(film),  this.options).map((response:Response)=>response.json())
        .catch(this.errorHandler);
    }

    errorHandler(error:Response){

       return Observable.throw(error||"SERVER ERROR");
    }

     setter(film:Film){
       this.film=film;
     }

    getter(){
      return this.film;
    }
  }
