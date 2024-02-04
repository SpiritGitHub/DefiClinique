import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeAdministrateurComponent } from './home-administrateur.component';

describe('HomeAdministrateurComponent', () => {
  let component: HomeAdministrateurComponent;
  let fixture: ComponentFixture<HomeAdministrateurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HomeAdministrateurComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(HomeAdministrateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
