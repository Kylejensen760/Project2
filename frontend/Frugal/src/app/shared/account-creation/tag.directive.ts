import { Directive, HostListener, ElementRef } from '@angular/core';
import { TagService } from './tag.service';
import { Tag } from 'src/app/restaurantView/tag';

@Directive({
  selector: '[appTag]'
})
export class TagDirective {
  private tags: Tag[];
  private setTags : Tag[];
  constructor(private el: ElementRef, private tagService: TagService) { }

  @HostListener('click')
  select() {
    if(this.el.nativeElement.style.backgroundColor === 'black') {
      this.el.nativeElement.style.backgroundColor='lightgray';
      this.el.nativeElement.style.color='black';
      console.log("removing");
      
    } else {
      this.el.nativeElement.style.backgroundColor='black';
      this.el.nativeElement.style.color='white';
      console.log("adding");
      // this.setTags.push(this.tags);
      // this.tagService.setTags(this.setTags);
    }
  }
}
