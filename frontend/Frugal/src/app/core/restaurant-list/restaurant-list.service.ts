import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, pipe, of } from 'rxjs';
import { map } from 'rxjs/operators';

import { UrlService } from 'src/app/shared/url.service';
import { Restaurant } from '../../shared/user/restaurant';

@Injectable({
  providedIn: 'root'
})
export class RestaurantService {
  private appUrl = this.urlSource.getURL() + '/restaurant';
  private headers = new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'});
  private restaurant: Restaurant;

  constructor(private urlSource: UrlService, private http: HttpClient) { }

  fetch(): Observable<Restaurant[]> {

        return this.http.get(this.appUrl, {withCredentials: true})
        .pipe(map(resp => resp as Restaurant[]
        )); 
    }

}
