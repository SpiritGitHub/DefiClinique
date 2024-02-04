import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UrgencesComponent } from './urgences.component';

describe('UrgencesComponent', () => {
  let component: UrgencesComponent;
  let fixture: ComponentFixture<UrgencesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UrgencesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UrgencesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
