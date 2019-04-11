import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuitemtableComponent } from './menuitemtable.component';

describe('MenuitemtableComponent', () => {
  let component: MenuitemtableComponent;
  let fixture: ComponentFixture<MenuitemtableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuitemtableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuitemtableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
