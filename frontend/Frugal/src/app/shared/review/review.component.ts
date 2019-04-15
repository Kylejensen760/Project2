import { Component, OnInit, Input } from '@angular/core';
import { CollapseModule, WavesModule } from 'angular-bootstrap-md';
import { AddReviewService } from './add-review.service';
import { Review } from '../../shared/review/review';
import { Customer } from '../user/customer';
//import { UserService } from '../user/create-user.service';
import { Restaurant } from '../user/restaurant';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.scss']
})
@Injectable({
  providedIn: 'root'
})

export class ReviewComponent implements OnInit {

  public rating : number;
  public reviewDate : string;
  public review : string;
  public customerId : number;
  public restaurantId : number;
  


  constructor(private AddReviewService: AddReviewService, private Review: Review) { }
  @Input() lists: Review[]=[];

  slides: any = [[]];
  chunk(arr, chunkSize) {
    let R = [];
    for (let i = 0, len = arr.length; i < len; i += chunkSize) {
      R.push(arr.slice(i, i + chunkSize));
    }
    return R;
  }
  ngOnInit() {
    this.AddReviewService.fetch().subscribe(
      ReviewList=> {
        this.lists = ReviewList;
        
        this.slides = this.chunk(this.lists,1);
      }
    )

    // this.UserService.GetCustomer().subscribe(
    //   ReviewList=> {
    //     this.
        
    //   }
    // )


  }
 
  create(): void {
   {
      
      this.AddReviewService.createReview(this.rating, this.reviewDate, this.review).subscribe(
        review=> {
          this.Review=review;
        }
      )
    }

  }

}
