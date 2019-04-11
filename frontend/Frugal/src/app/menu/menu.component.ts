import { Component, OnInit } from '@angular/core';
import { MenuService } from './menu.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
  public restId : number;
  constructor(private menuService: MenuService) { }
  ngOnInit() {
  }

  addMenu() {
    this.menuService.addMenu(2);
  }

}
