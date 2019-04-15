import { BrowserModule } from '@angular/platform-browser';

import { NgModule} from '@angular/core';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UrlService } from './shared/url.service';
import { UserService } from './shared/user/user.service';
import { LoginComponent } from './core/login/login.component';
import { MenuitemtableComponent } from './menuitemtable/menuitemtable.component';
import { MenuComponent } from './menu/menu.component';
import { CarouselComponent } from './core/carousel/carousel.component';
import { RestaurantViewComponent } from './restaurantView/restaurant-view/restaurant-view.component';
import { AccountCreationComponent } from './shared/account-creation/account-creation.component';
import { TagDirective } from './shared/account-creation/tag.directive';

@NgModule({
  declarations: [
    AppComponent, 
    NavbarComponent,
    LoginComponent,
    MenuitemtableComponent,
    MenuComponent,
    CarouselComponent,
    RestaurantViewComponent,
    AccountCreationComponent,
    TagDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MDBBootstrapModule.forRoot(),
    FormsModule,
    HttpClientModule

  ],

  providers: [UrlService, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
