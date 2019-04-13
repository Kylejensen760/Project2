import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, pipe, of } from 'rxjs';
import { map } from 'rxjs/operators';

import { Customer } from './customer';
import { Restaurant } from './restaurant';
import { CurrentUser } from './current-user';
import { UrlService } from '../url.service';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  private appUrl = this.urlSource.getURL() + '/login';
  private headers = new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'});
  private restaurant: Restaurant;
  private customer: Customer;

  constructor(private urlSource: UrlService, private http: HttpClient) { }

  login(username: string, password: string): Observable<CurrentUser> {
    console.log(username+' '+password);
    if(username&&password) {
      // we need to login.
      const body = `user=${username}&pass=${password}`;
      console.log(body);
      return this.http.post(this.appUrl, body, {headers: this.headers, withCredentials: true})
        .pipe(map(resp => {
          const user: CurrentUser = resp as CurrentUser;
          if (user) {
            this.restaurant = user.restaurant;
            this.customer = user.customer;
          }
          return user;
        }));
    } else {
      // we need to check if we're logged in.
      return this.http.get(this.appUrl, {withCredentials: true})
        .pipe(map(resp => {
          const user: CurrentUser = resp as CurrentUser;
          if (user) {
            this.restaurant = user.restaurant;
            this.customer = user.customer;
          }
          return user;
        }));
    }
  }
  logout(): Observable<Object> {
    return this.http.delete(this.appUrl, { withCredentials: true }).pipe(
      map(success=> {
        this.restaurant = null;
        this.customer = null;
        return success;
      })
    );
  }
  getCustomer(): Customer {
    return this.customer;
  }
  getRestaurant(): Restaurant {
    return this.restaurant;
  }
  isCustomer(): boolean {
    return (this.customer!==undefined && this.customer!==null);
  }
  isRestaurant(): boolean {
    return (this.restaurant!== undefined && this.restaurant!== null);
  }
}
