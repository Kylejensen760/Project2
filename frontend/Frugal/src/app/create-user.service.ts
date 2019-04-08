import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, pipe, of } from 'rxjs';
import { map } from 'rxjs/operators';

import { User } from 'src/app/shared/user/user';

import { UrlService } from 'src/app/shared/url.service';

@Injectable({
  providedIn: 'root'
})
export class CreateUser {

  private appUrl = this.urlSource.getURL() + '/create';
  private headers = new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'});
  

  constructor(private urlSource: UrlService, private http: HttpClient) { }
  create(firstName: string, lastName: string, username: string, password: string, phone: string, email: string): Observable<User> {

    const body = `first=${firstName}&last=${lastName}user=${username}&pass=${password}&phone=${phone}&email=${email}`;
      console.log(body);
      return this.http.post(this.appUrl, body, {headers: this.headers, withCredentials: true})
        .pipe(map(resp => {
          const user: User = resp as User;
         
          return user;
        }));
  }  }
