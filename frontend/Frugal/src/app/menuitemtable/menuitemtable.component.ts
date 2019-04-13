import { Component, OnInit } from '@angular/core';
import { MenuItemComponent } from '../core/menuitem/menuitem'

@Component({
  selector: 'app-menuitemtable',
  templateUrl: './menuitemtable.component.html',
  styleUrls: ['./menuitemtable.component.scss']
})
export class MenuitemtableComponent implements OnInit {

  constructor() { }

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

     /* if (this.awaitingPersonList.length > 0) {
       const person = this.awaitingPersonList[0];
        this.personList.push(person);
        this.awaitingPersonList.splice(0, 1);
      }*/
    }

    changeValue(id: number, property: string, event: any) {
      this.editField = event.target.textContent;
    }
}


