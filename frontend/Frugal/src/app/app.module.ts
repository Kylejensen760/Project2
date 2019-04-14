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
<<<<<<< HEAD
import { RestaurantComponent } from './restaurant/restaurant.component';
=======
import { RestaurantViewComponent } from './restaurantView/restaurant-view/restaurant-view.component';
import { AccountCreationComponent } from './shared/account-creation/account-creation.component';
>>>>>>> 16787d186775f8b64df4dd94c9eeb417fb237fb5

@NgModule({
  declarations: [
    AppComponent, 
    NavbarComponent,
    LoginComponent,
    MenuitemtableComponent,
    MenuComponent,
    CarouselComponent,
<<<<<<< HEAD
    RestaurantComponent
=======
    RestaurantViewComponent,
    AccountCreationComponent
>>>>>>> 16787d186775f8b64df4dd94c9eeb417fb237fb5
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
