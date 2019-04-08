import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/shared/user/user';
import { CreateUser } from 'src/app/create-user.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.scss']
})
export class CreateComponent implements OnInit {
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
  create(): void {
    this.createUser.create(this.firstName, this.lastName, this.username, this.password, this.phone, this.email).subscribe(
      user=> {
        this.User=user;
      }
    )
  }
}
