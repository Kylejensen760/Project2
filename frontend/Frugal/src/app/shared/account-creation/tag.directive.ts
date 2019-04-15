import { Directive, HostListener, ElementRef } from '@angular/core';

@Directive({
  selector: '[appTag]'
})
export class TagDirective {
  constructor(private el: ElementRef) { }

  @HostListener('click')
  select() {
    if(this.el.nativeElement.style.backgroundColor === 'black') {
      this.el.nativeElement.style.backgroundColor='lightgray';
      this.el.nativeElement.style.color='black';
    } else {
      this.el.nativeElement.style.backgroundColor='black';
      this.el.nativeElement.style.color='white';
    }
  }
}
