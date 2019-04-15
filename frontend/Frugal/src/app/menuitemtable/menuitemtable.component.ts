import { Component, OnInit } from '@angular/core';
import { menuItem } from '../core/menuitem/menuitem'
import { User } from '../shared/user/user';
import { MenuitemtableService } from './menuitemtable.service';

@Component({
  selector: 'app-menuitemtable',
  templateUrl: './menuitemtable.component.html',
  styleUrls: ['./menuitemtable.component.scss']
})
export class MenuitemtableComponent implements OnInit {
  public User : User;
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
  constructor(private menuService: MenuitemtableService) { }

  ngOnInit() {
  }
  
  editField: string;
    personList: Array<any> = [
      { id: 1, name: 'Aurelia Vega', age: 30, companyName: 'Deepends', country: '1', city: '1' },

    ];

    awaitingPersonList: Array<any> = [
      { id: 6, name: 'George Vega', age: 28, companyName: 'Classical', country: 'Russia', city: 'Moscow' },

    ];

    updateList(id: number, property: string, event: any) {
      const editField = event.target.textContent;
      this.personList[id][property] = editField;
    }

    remove(id: any) {
      this.awaitingPersonList.push(this.personList[id]);
      this.personList.splice(id, 1);
    }

    add() {
             console.log("We outchea");
            let mi = new menuItem();
            mi.id = 7;
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
            console.log(mi);
            this.menuService.add(mi);
    }

    changeValue(id: number, property: string, event: any) {
      this.editField = event.target.textContent;
    }
}


