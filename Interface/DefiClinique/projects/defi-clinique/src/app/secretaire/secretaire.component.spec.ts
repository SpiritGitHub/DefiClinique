import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecretaireComponent } from './secretaire.component';

describe('SecretaireComponent', () => {
  let component: SecretaireComponent;
  let fixture: ComponentFixture<SecretaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SecretaireComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SecretaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
