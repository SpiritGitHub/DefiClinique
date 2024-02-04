import { TestBed } from '@angular/core/testing';

import { ClinicServicesService } from './clinic-services.service';

describe('ClinicServicesService', () => {
  let service: ClinicServicesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ClinicServicesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
