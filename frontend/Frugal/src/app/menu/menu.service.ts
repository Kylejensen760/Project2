import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, pipe, of, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { map } from 'rxjs/operators';
import { UrlService } from '../shared/url.service';
import { Menu } from './menu';


@Injectable({
  providedIn: 'root'
})
export class MenuService {
  private appUrl = this.urlSource.getURL() + '/menu';
  private headers = new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'});


  constructor(private urlSource: UrlService, private http: HttpClient) { }
  
  addMenu(restId: number) {
    const body = `rid=${restId}`;
    console.log("You are in addmenu");
    return this.http.post(this.appUrl, body, {headers: this.headers, withCredentials: true})
    .subscribe(
      data => {
        console.log("post was a success", data);
      }
      
    );
  }
}
