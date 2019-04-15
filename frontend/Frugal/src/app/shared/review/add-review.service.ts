import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, pipe, of } from 'rxjs';
import { map } from 'rxjs/operators';

import { UrlService } from 'src/app/shared/url.service';
import { Review } from '../../shared/review/review';
import { Customer } from '../user/customer';
import { Restaurant } from '../user/restaurant';

@Injectable({
  providedIn: 'root'
})
export class AddReviewService {
  private appUrl = this.urlSource.getURL() + '/review';
  private headers = new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'});
  private review: Review;

  constructor(private urlSource: UrlService, private http: HttpClient) { }

  fetch(): Observable<Review[]> {

        return this.http.get(this.appUrl, {withCredentials: true})
        .pipe(map(resp => resp as Review[]
        )); 
    }

    
    createReview(rating : number, reviewDate : string, review : string): Observable<Review> {    
      
            
        let r = new Review();
        r.rating=rating;
        r.reviewDate=reviewDate;
        r.review=review;
        // r.customerId = ;
        // r.restaurantId = ;
        
       console.log(r);
        return this.http.post(this.appUrl, r, {headers: this.headers, withCredentials: true})
          .pipe(map(resp => {
            console.log("whatever")
            const review: Review = resp as Review;
            console.log(review);
            return review;
  
          }));
      
        }
}
