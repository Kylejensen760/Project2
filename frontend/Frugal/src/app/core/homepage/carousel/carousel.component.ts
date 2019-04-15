import { Component, OnInit, Input } from '@angular/core';
import { MdbInputDirective } from 'angular-bootstrap-md';
import { MenuItemService } from '../../menuItem/menuItem.service';
import { RestaurantService } from '../../restaurant-list/restaurant-list.service'
import { menuItem } from '../../menuItem/menuItem';
import { Restaurant } from 'src/app/shared/user/restaurant';
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';

@Component({
  selector: 'app-carousel',
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.scss']
})
export class CarouselComponent implements OnInit {

  constructor(private menuItemService: MenuItemService, private restaurantService: RestaurantService) { }
  

  @Input() cards: menuItem[]=[];
  slides: any = [[]];
  chunk(arr, chunkSize) {
    let R = [];
    for (let i = 0, len = arr.length; i < len; i += chunkSize) {
      R.push(arr.slice(i, i + chunkSize));
    }
    return R;
  }

  @Input() lists: Restaurant[]=[];
  slide: any = [[]];
  chunks(arr, chunkSize) {
    let R = [];
    for (let i = 0, len = arr.length; i < len; i += chunkSize) {
      R.push(arr.slice(i, i + chunkSize));
    }
    return R;
  }

  ngOnInit() {
    console.log(menuItem)
    // let menuItemListJson = JSON.parse(menuItem)

    this.menuItemService.fetch().subscribe(

      menuItemList=> {
        this.cards = menuItemList;
        console.log(this.cards);
        
        this.slides = this.chunk(this.cards, 3);
      }
    )

    this.restaurantService.fetch().subscribe(
      RestaurantList=> {
        this.lists = RestaurantList;
        console.log(this.lists);
        
        this.slide = this.chunks(this.lists,1);
      }
    )
  }

}
