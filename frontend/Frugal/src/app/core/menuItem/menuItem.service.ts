import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, pipe, of } from 'rxjs';
import { map } from 'rxjs/operators';

import { UrlService } from 'src/app/shared/url.service';
import { menuItem } from './menuItem';

@Injectable({
  providedIn: 'root'
})
export class MenuItemService {
  private appUrl = this.urlSource.getURL() + '/menuItem';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});
  private menuItem: menuItem;
  constructor(private urlSource: UrlService, private http: HttpClient) { }
  // let menuItemListJson = JSON.parse(menuItem)
  fetch(): Observable<menuItem[]> {
         console.log(menuItem)

        return this.http.get(this.appUrl, {withCredentials: true})
        .pipe(map(resp => resp as menuItem[]
        )); 
    }


}

