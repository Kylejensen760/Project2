import { Component, OnInit, Input } from '@angular/core';
import { menuItem } from '../core/menuitem/menuitem'
import { CurrentUser } from 'src/app/shared/user/current-user';
import { MenuitemtableService } from './menuitemtable.service';
import { UserService } from 'src/app/shared/user/user.service';
import { MenuItemService } from '../core/menuItem/menuItem.service';
import { Restaurant } from '../shared/user/restaurant';

@Component({
  selector: 'app-menuitemtable',
  templateUrl: './menuitemtable.component.html',
  styleUrls: ['./menuitemtable.component.scss']
})
export class MenuitemtableComponent implements OnInit {
  public user : CurrentUser;
  public id: number;
  public itemName: string;
  public itemPrice: number;
  public specialPrice: number;
  public specialStart: number;
  public specialEnd: number;
  public mon: number;
  public tue: number; 
  public wed: number;
  public thu: number;
  public fri: number;
  public sat: number;
  public sun: number;
  public xyz: number;
  public restaurants: Restaurant;
  constructor(private menuService: MenuitemtableService, private userService : UserService,private menuItemService: MenuItemService) { }

  @Input() menu: menuItem[]=[];
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
        this.menu = menuItemList;
        console.log(this.menu);
        this.slides = this.chunk(this.menu, 1);
      }
    )
  }
  
  editField: string;
  
    show() {
      this.xyz = this.userService.getRestaurant().restaurant_id;
      this.menuItemService.fetch().subscribe(
        menuItemList=> {
          this.menu = menuItemList;
          console.log(this.menu);
          this.slides = this.chunk(this.menu, 1);
        }
      )
    }
    updateList(id: number, property: string, event: any) {

    }

    remove(menu: any) {
      let mi = new menuItem();
      mi.id = menu.id;
      mi.itemName = menu.itemName;
      mi.itemPrice = menu.itemPrice;
      mi.specialPrice = menu.specialPrice;
      mi.specialPrice = menu.specialPrice;
      mi.specialStart = menu.specialStart;
      mi.specialEnd = menu.specialEnd;
      mi.mon = menu.mon;
      mi.tue = menu.tue;
      mi.wed = menu.wed;
      mi.thu = menu.thu;
      mi.fri = menu.fri;
      mi.sat = menu.sat;
      mi.sun = menu.sun;
      mi.restaurant_id = this.userService.getRestaurant().restaurant_id;
      console.log(mi);
      this.menuService.remove(mi).subscribe();
    }

  

    add() {
            let mi = new menuItem();
            mi.id = 11;
            mi.itemName = this.itemName;
            mi.itemPrice = this.itemPrice;
            mi.specialPrice = this.specialPrice;
            mi.specialPrice = this.specialPrice;
            mi.specialStart = this.specialStart;
            mi.specialEnd = this.specialEnd;
            mi.mon = this.mon;
            mi.tue = this.tue;
            mi.wed = this.wed;
            mi.thu = this.thu;
            mi.fri = this.fri;
            mi.sat = this.sat;
            mi.sun = this.sun;
            mi.restaurant_id = this.userService.getRestaurant().restaurant_id;
            console.log(mi);
            this.menuService.add(mi);
    }

    changeValue(id: number, property: string, event: any) {
      this.editField = event.target.textContent;
    }
}


