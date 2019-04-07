import { Component, OnInit } from '@angular/core';
import { CurrentUser } from 'src/app/shared/user/current-user';
import { UserService } from 'src/app/shared/user/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  public loggedUser: CurrentUser;
  public username: string;
  public password: string;
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.userService.login(null,null).subscribe(
      user=> {
        this.loggedUser=user;
      }
    )
  }
  login(): void {
    this.userService.login(this.username, this.password).subscribe(
      user=> {
        this.loggedUser=user;
      }
    )
  }

}
