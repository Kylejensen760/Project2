import { TestBed } from '@angular/core/testing';

import { CreateUser } from './create-user.service';

describe('CreateUserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CreateUser = TestBed.get(CreateUser);
    expect(service).toBeTruthy();
  });
});
