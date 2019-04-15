import { Injectable } from '@angular/core';
import { Tag } from 'src/app/restaurantView/tag';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { UrlService } from 'src/app/shared/url.service';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class TagService {

  private appUrl = this.urlSource.getURL() + '/tag';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});
  private tags : Tag;

  constructor(private urlSource: UrlService, private http: HttpClient) { }

  getTags() :Observable<Tag[]> {
    return this.http.get(this.appUrl, {withCredentials: true})
        .pipe(map(resp => {
          const tags: Tag[] = resp as Tag[];
          
          return tags;
        }));
  }
}
