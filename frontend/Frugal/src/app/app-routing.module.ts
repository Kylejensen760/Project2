import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD
import { MenuitemtableComponent } from './menuitemtable/menuitemtable.component';
import { MenuComponent } from './menu/menu.component';

const routes: Routes = [
  {
    path: 'menuitems',
    component: MenuitemtableComponent
  },
  {
    path: 'menu',
    component: MenuComponent
  }
=======
import { CarouselComponent } from './core/carousel/carousel.component';

const routes: Routes = [

>>>>>>> 9ade7b050fd6b18dd916aae08c76b8617713fa8d
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
