import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/shared/user/user';

import { CreateUser } from 'src/app/shared/user/create-user.service';

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
  constructor(private createUser: CreateUser) { }

 
  ngOnInit() {
    this.createUser.create(null,null,null,null,null,null).subscribe(
      user=> {
        this.User=user;
      }
      
    )
  }

  ShowCreateCustomerForm(): void {
    //window.open('src/app/shared/account-creation/account-creation.component.html')
    //dont load html load component
    console.log('this is show create customer form method')
  }


  
  create(): void {
    this.createUser.create(this.firstName, this.lastName, this.username, this.password, this.phone, this.email).subscribe(
      user=> {
        this.User=user;
      }
    )
  }
}