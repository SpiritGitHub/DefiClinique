import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DepLaboratoireComponent } from './dep-laboratoire.component';

describe('DepLaboratoireComponent', () => {
  let component: DepLaboratoireComponent;
  let fixture: ComponentFixture<DepLaboratoireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DepLaboratoireComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DepLaboratoireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
