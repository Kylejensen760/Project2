import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenuitemtableComponent } from './menuitemtable/menuitemtable.component';
import { MenuComponent } from './menu/menu.component';
import { CarouselComponent } from './core/homepage/carousel/carousel.component';
import { AccountCreationComponent } from './shared/account-creation/account-creation.component';
import { HomepageComponent } from './core/homepage/homepage.component';

const routes: Routes = [
  {
    path: 'menuItems',
    component: MenuitemtableComponent
  },
  {
    path: 'menu',
    component: MenuComponent
  },
  {
    path: 'create',
    component: AccountCreationComponent
  },
  {
    path: '',
    component: HomepageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
