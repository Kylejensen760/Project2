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
  private user : User;

  constructor(private urlSource: UrlService, private http: HttpClient) { }
  create(firstName: string, lastName: string, username: string, password: string, phone: string, email: string): Observable<User> {
    if(firstName && lastName && username && password && phone && email)
    {
    const body = `first=${firstName}&last=${lastName}user=${username}&pass=${password}&phone=${phone}&email=${email}`;
      console.log(body);
      console.log("testing my create user service")
      console.log(body);
      return this.http.post(this.appUrl, body, {headers: this.headers, withCredentials: true})
        .pipe(map(resp => {
          const user: User = resp as User;
          console.log(user);
          return user;

        }));
    }else{
      return this.http.get(this.appUrl, {withCredentials: true})
      .pipe(map(resp => {
        const user: User = resp as User;
        this.user = user;
        return user;
      }));
    }
  }  }
