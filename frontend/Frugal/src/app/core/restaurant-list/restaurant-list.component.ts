import { Component, OnInit, Input } from '@angular/core';
import { CollapseModule, WavesModule } from 'angular-bootstrap-md'
import { RestaurantService } from './restaurant-list.service'
import { Restaurant } from '../../shared/user/restaurant'
import { menuItem } from '../menuItem/menuItem';
import {MenuItemService} from '../menuItem/menuItem.service'
import { AddReviewService } from 'src/app/shared/review/add-review.service';
import { RouterModule, Routes } from '@angular/router';


@Component({
  selector: 'app-restaurant-list',
  templateUrl: './restaurant-list.component.html',
  styleUrls: ['./restaurant-list.component.scss']
})
export class RestaurantListComponent implements OnInit {

  private favorite : boolean;
  constructor(private RestaurantService: RestaurantService, private AddReviewService: AddReviewService) { }
  @Input() lists: Restaurant[]=[];
  slides: any = [[]];
  chunk(arr, chunkSize) {
    let R = [];
    for (let i = 0, len = arr.length; i < len; i += chunkSize) {
      R.push(arr.slice(i, i + chunkSize));
    }
    return R;
  }
  ngOnInit() {
    this.favorite = false;
    this.RestaurantService.fetch().subscribe(
      RestaurantList=> {
        this.lists = RestaurantList;
        console.log(this.lists);
        
        this.slides = this.chunk(this.lists,1);
      }
    )
  }

}
