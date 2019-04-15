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

  add(mi: menuItem){
    console.log(mi);
    return this.http.post(this.appUrl, mi, {headers: this.headers, withCredentials: true})
    .subscribe(
      data => {
        console.log("post was a success", data);
      }
    );
  }

  update(mi: menuItem){
    const url = this.appUrl + `/${mi.id}`;
    const options = {headers: new HttpHeaders({'Content-Type': 'application/json'}), body:{mi}}
    console.log(mi);
    return this.http.put(url, mi, options)
    .subscribe(
      data => {
        console.log("post was a success", data);
      }
    );
  }



  remove(mi: menuItem): Observable<{}> {
    console.log(mi)
    const url = this.appUrl + `/${mi.id}`;
    const options = {headers: new HttpHeaders({'Content-Type': 'application/json'}), body:{mi}} ;
    return this.http.delete(url, options)
  }
}
