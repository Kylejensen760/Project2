<<<<<<< HEAD
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
import { CreateComponent } from './create/create.component';
import { AccountCreationComponent } from './shared/account-creation/account-creation.component';

@NgModule({
  declarations: [
    AppComponent, 
    NavbarComponent,
    LoginComponent,
    CreateComponent,
    AccountCreationComponent
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
=======
import { BrowserModule } from '@angular/platform-browser';

import { NgModule} from '@angular/core';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CarouselComponent } from './core/carousel/carousel.component';
import { UrlService } from './shared/url.service';
import { UserService } from './shared/user/user.service';

@NgModule({
  declarations: [
    AppComponent, 
    NavbarComponent, CarouselComponent
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
>>>>>>> 9ade7b050fd6b18dd916aae08c76b8617713fa8d
