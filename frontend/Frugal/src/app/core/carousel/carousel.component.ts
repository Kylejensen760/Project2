import { Component, OnInit, Input } from '@angular/core';
import { MdbInputDirective } from 'angular-bootstrap-md';
import { MenuItemService } from '../menuItem/menuItem.service';
import { menuItem } from '../menuItem/menuItem';

@Component({
  selector: 'app-carousel',
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.scss']
})
export class CarouselComponent implements OnInit {

  constructor(private menuItemService: MenuItemService) { }
  @Input() cards: menuItem[]=[];
  slides: any = [[]];
  chunk(arr, chunkSize) {
    let R = [];
    for (let i = 0, len = arr.length; i < len; i += chunkSize) {
      R.push(arr.slice(i, i + chunkSize));
    }
    return R;
  }
  ngOnInit() {
    this.menuItemService.fetch().subscribe(
      menuItemList=> {
        this.cards = menuItemList;
        console.log(this.cards);
        
        this.slides = this.chunk(this.cards, 3);
      }
    )
  }

}
