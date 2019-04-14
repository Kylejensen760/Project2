import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
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
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
