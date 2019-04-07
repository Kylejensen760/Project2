import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Frugal';
  public now: Date = new Date();

  constructor() {
    setInterval(() => {
      this.now = new Date();
    }, 5000);
  }
}
