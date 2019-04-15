import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, pipe, of } from 'rxjs';
import { map } from 'rxjs/operators';

import { User } from 'src/app/shared/user/user';

import { UrlService } from 'src/app/shared/url.service';
import { Customer } from './customer';
import { Restaurant } from './restaurant';
import { UserService } from './user.service';
import { Tag } from 'src/app/restaurantView/tag';

@Injectable({
  providedIn: 'root'
})
export class CreateUser {

  private appUrl = this.urlSource.getURL() + '/create';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});
  private customerUser : Customer;
  private restaurantUser : Restaurant;
  private isRestaurant : boolean;

  constructor(private urlSource: UrlService, private http: HttpClient, private userService: UserService) { }
  createCustomer(firstName: string, lastName: string, username: string, password: string, phone: string, email: string): Observable<Customer> {
    this.isRestaurant = this.userService.getCreatingRestaurant();
    if(this.isRestaurant) {
      this.appUrl = this.urlSource.getURL() + '/restaurant';
    }
    console.log(this.appUrl);
    
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
        this.customerUser = user;
        return user;
      }));
    }
  }  

  createRestaurant(name: string, tags: Tag[], username: string, password: string, phone: string, email: string, lineOne: string, 
    lineTwo: string, city: string, state: string, zip: string, websiteUrl: string, openingTime: string, closingTime: string): Observable<Restaurant> {
    
    this.isRestaurant = this.userService.getCreatingRestaurant();
    if(this.isRestaurant) {
      this.appUrl = this.urlSource.getURL() + '/restaurant';
    }
    console.log(this.appUrl)

    if(name && username && password && phone && email)
    {
      let r = new Restaurant();
      r.name=name;
      r.email=email;
      r.phone=phone;
      r.username=username;
      r.password=password;
      r.lineOne=lineOne;
      r.lineTwo=lineTwo;
      r.city=city;
      r.state=state;
      r.zip=zip;
      r.websiteUrl=websiteUrl;
      r.openingTime=openingTime;
      r.closingTime=closingTime;
      return this.http.post(this.appUrl, r, {headers: this.headers, withCredentials: true})
        .pipe(map(resp => {
          console.log("whatever")
          const user: Restaurant = resp as Restaurant;
          console.log(user);
          return user;

        }));
    }else{
      return this.http.get(this.appUrl, {withCredentials: true})
      .pipe(map(resp => {
        console.log("get works restaurant")
        const user: Restaurant = resp as Restaurant;
        this.restaurantUser = user;
        return user;
      }));
    }
  } 
}