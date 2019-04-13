import { Component, OnInit } from '@angular/core';
import { CurrentUser } from 'src/app/shared/user/current-user';
import { UserService } from 'src/app/shared/user/user.service';
import { MenuItemService} from 'src/app/core/menuItem/menuItem.service';
import {AccountCreationComponent} from 'src/app/shared/account-creation/account-creation.component'
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {
  public loggedUser: CurrentUser;
  public username: string;
  public password: string;
  constructor(private userService: UserService, private menuItemService: MenuItemService) { }

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
  logout(): void {
    this.userService.logout().subscribe();
    this.loggedUser=null;
    this.username=null;
    this.password=null;
  }


}
