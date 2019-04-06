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

@NgModule({
  declarations: [
    AppComponent, 
    NavbarComponent,
    LoginComponent
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