import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenuitemtableComponent } from './menuitemtable/menuitemtable.component';
import { MenuComponent } from './menu/menu.component';
import { CarouselComponent } from './core/carousel/carousel.component';
import { RestaurantComponent } from './restaurant/restaurant.component';

const routes: Routes = [
  {
    path: 'menuitems',
    component: MenuitemtableComponent
  },
  {
    path: 'menu',
    component: MenuComponent
  },
  {path: 'restaurant',
  component: RestaurantComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
