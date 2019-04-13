import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, pipe, of } from 'rxjs';
import { map } from 'rxjs/operators';

import { User } from 'src/app/shared/user/user';

import { UrlService } from 'src/app/shared/url.service';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CreateUser {

  private appUrl = this.urlSource.getURL() + '/create';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});
  private user : Customer;

  constructor(private urlSource: UrlService, private http: HttpClient) { }
  create(firstName: string, lastName: string, username: string, password: string, phone: string, email: string): Observable<Customer> {
    if(firstName && lastName && username && password && phone && email)
    {
      let c = new Customer();
      c.firstName=firstName;
      c.lastName=lastName;
      c.email=email;
      c.phone=phone;
      c.username=username;
      c.password=password;
      return this.http.post(this.appUrl, c, {headers: this.headers, withCredentials: true})
        .pipe(map(resp => {
          console.log("whatever")
          const user: Customer = resp as Customer;
          console.log(user);
          return user;

        }));
    }else{
      return this.http.get(this.appUrl, {withCredentials: true})
      .pipe(map(resp => {
        console.log("get works")
        const user: Customer = resp as Customer;
        this.user = user;
        return user;
      }));
    }
  }  }