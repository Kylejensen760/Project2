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
import { CarouselComponent } from './core/homepage/carousel/carousel.component';
import { RestaurantListComponent } from './core/restaurant-list/restaurant-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RestaurantViewComponent } from './restaurantView/restaurant-view/restaurant-view.component';
import { AccountCreationComponent } from './shared/account-creation/account-creation.component';
import { TagDirective } from './shared/account-creation/tag.directive';
import { HomepageComponent} from './core/homepage/homepage.component'
import { ReviewComponent } from './shared/review/review.component';
import { Review } from './shared/review/review';

@NgModule({
  declarations: [
    AppComponent, 
    NavbarComponent,
    LoginComponent,
    MenuitemtableComponent,
    MenuComponent,
    CarouselComponent,
    RestaurantListComponent,
    RestaurantViewComponent,,
    TagDirective,
    AccountCreationComponent, 
    HomepageComponent,
    ReviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MDBBootstrapModule.forRoot(),
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],

  providers: [UrlService, UserService, Review, ReviewComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }