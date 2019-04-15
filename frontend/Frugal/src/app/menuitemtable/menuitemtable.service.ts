import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from '../shared/url.service';
import { menuItem } from '../core/menuitem/menuitem'
import { Observable, pipe } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class MenuitemtableService {
  private appUrl = this.urlSource.getURL() + '/menuItem';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});
  private menuItem : menuItem;

  constructor(private urlSource: UrlService, private http: HttpClient) { }

  add(mi: menuItem): Observable<menuItem> {
    console.log(mi);
    let mis = new menuItem();
    mis = mi;
    return this.http.post(this.appUrl, mis, {headers: this.headers, withCredentials: true})
    .pipe(map(resp => {
      console.log("Im not getting anything");
      const menuItem :menuItem = resp as menuItem;
      return menuItem;
    }));
  }
}
