import { TestBed } from '@angular/core/testing';

import { MenuitemtableService } from './menuitemtable.service';

describe('MenuitemtableService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MenuitemtableService = TestBed.get(MenuitemtableService);
    expect(service).toBeTruthy();
  });
});
