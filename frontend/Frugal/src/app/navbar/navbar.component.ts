import { Component, OnInit } from '@angular/core';
import { CurrentUser } from 'src/app/shared/user/current-user';
import { UserService } from 'src/app/shared/user/user.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
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
