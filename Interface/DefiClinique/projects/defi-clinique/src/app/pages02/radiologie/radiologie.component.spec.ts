import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RadiologieComponent } from './radiologie.component';

describe('RadiologieComponent', () => {
  let component: RadiologieComponent;
  let fixture: ComponentFixture<RadiologieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RadiologieComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RadiologieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
