import { Component, OnInit } from '@angular/core';
import { CarouselComponent } from './carousel/carousel.component';
import { RestaurantListComponent } from '../restaurant-list/restaurant-list.component';

@Component({
    selector: 'app-homepage',
    templateUrl: './homepage.component.html',
  })

export class HomepageComponent {
 
    Carousel: CarouselComponent;
    RestaurantListComponent: RestaurantListComponent
}

