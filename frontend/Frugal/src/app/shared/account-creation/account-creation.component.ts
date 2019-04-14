import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/shared/user/user';
import { CreateUser } from 'src/app/shared/user/create-user.service';
import { NavbarComponent } from 'src/app/navbar/navbar.component';
import { UserService } from '../user/user.service';

@Component({
  selector: 'app-account-create',
  templateUrl: './account-creation.component.html',
  styleUrls: ['./account-creation.component.scss']
})
export class AccountCreationComponent implements OnInit {
  public User: User;
  public id: number;
  public firstName: string;
  public lastName: string
  public username: string;
  public password: string; 
  public phone: string;
  public email: string;
  public isRestaurant: boolean;
  public name: string;
  public lineOne: string;
  public lineTwo: string;
  public city: string;
  public state: string;
  public zip: string;
  public websiteUrl: string;
  public openingTime: string;
  public closingTime: string;

  constructor(private createCustomer: CreateUser, private createRestaurant: CreateUser, private userService: UserService) { }


  ngOnInit() {
    this.isRestaurant = this.userService.getCreatingRestaurant();
    if(this.isRestaurant){
      this.createRestaurant.createRestaurant(null,null,null,null,null,null,null,null,null,null,null,null,null).subscribe(
        user=> {
          this.User=user;
        }
        
      )
    }
    else {
      this.createCustomer.createCustomer(null,null,null,null,null,null).subscribe(
        user=> {
          this.User=user;
        }
        
      )
    }
    
    
  }

  ShowCreateCustomerForm(): void {
    //window.open('src/app/shared/account-creation/account-creation.component.html')
    //dont load html load component
    console.log('this is show create customer form method')
  }



  create(): void {
    if(this.isRestaurant) {
      
      this.createCustomer.createRestaurant(this.name, this.username, this.password, this.phone, this.email, this.lineOne, this.lineTwo,
         this.city, this.state, this.zip, this.websiteUrl, this.openingTime, this.closingTime).subscribe(
        user=> {
          this.User=user;
        }
      )
    }
    else {
      this.createCustomer.createCustomer(this.firstName, this.lastName, this.username, this.password, this.phone, this.email).subscribe(
        user=> {
          this.User=user;
        }
      )
    }
  }
}