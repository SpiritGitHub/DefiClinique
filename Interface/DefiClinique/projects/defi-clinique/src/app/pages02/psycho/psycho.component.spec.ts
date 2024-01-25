import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PsychoComponent } from './psycho.component';

describe('PsychoComponent', () => {
  let component: PsychoComponent;
  let fixture: ComponentFixture<PsychoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PsychoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PsychoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
